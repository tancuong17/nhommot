package com.oneteam.config;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@EnableWebMvc
@EnableTransactionManagement
@Configuration
@ComponentScan({"com.oneteam"})
public class AppConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public DataSource getDataSource() throws SQLException, PropertyVetoException
	{
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		comboPooledDataSource.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=oneteamdata");
		comboPooledDataSource.setUser("sa");
		comboPooledDataSource.setPassword("01678279549");
		comboPooledDataSource.setMinPoolSize(5);
		comboPooledDataSource.setMaxPoolSize(20);
		comboPooledDataSource.setMaxIdleTime(30000);
		return comboPooledDataSource;
	}
	@Bean
	public LocalSessionFactoryBean getSessionFactory() throws SQLException, PropertyVetoException
	{
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setPackagesToScan(new String[] {"com.oneteam.model"});
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.SQLServer2008Dialect");
		properties.put("hibernate.show_sql", "true");
		bean.setHibernateProperties(properties);
		return bean;
	}
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager() throws SQLException, PropertyVetoException
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartFile ()
	{
		CommonsMultipartResolver commonsMultipartFile = new CommonsMultipartResolver();
		return commonsMultipartFile;
	}
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/images/*").addResourceLocations("/images/");
		registry.addResourceHandler("/js/*").addResourceLocations("/js/");
	}
}
