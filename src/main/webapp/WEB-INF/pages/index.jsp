<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/book.svg">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;600;700&display=swap');
  *{margin: 0;padding: 0;box-sizing: border-box;}
  body{font-family: "Lato", sans-serif;}
  #logo{color:var(--black);font-size: 2rem;font-weight: bolder;color: rgb(7, 1, 20);text-decoration: none;}
  .tab{float: left;position: fixed;border: 1px solid #ccc;background-color: #f1f1f1;width: 20%;height: 100vh;}
  .tab button{display: block;background-color: inherit;color: black;padding: 1rem 1rem;width: 100%;border: none;outline: none;text-align: left;cursor: pointer;transition: 0.3s;font-size: 17px;padding-left: 2rem;}
  .tab button img{margin-right: 0.5rem;}
  .tab button:hover{background-color: #ddd;border-left: 1rem solid rgb(7, 1, 20);}
  .tab button.active{background-color: #ccc;border-left: 1rem solid rgb(7, 1, 20);}
  .tabcontent {float: left;margin-left: 20%;padding: 0px 12px;width: 80%;border-left: none;height: 92vh;}
   #header{width: 80%;margin-left:20%;z-index: 100;}
  @media (max-width:600px){.tab {display: none;}.tabcontent{width: 100%;margin-left: 0;}#header{width: 100%;margin-left: 0''}}
</style>
<body>
	<div class="tab">
    	<div class="container-fluid">
      		<div class="row d-flex justify-content-center align-items-center">
        		<div class="col-9">
          			<a href="#" id="logo"><i class="fa fa-book"></i>oneteam</a>
        		</div>
      		</div>
    	</div>
    	<button class="tablinks" onclick="openCity(event, 'ThongKe')" id="defaultOpen"><img class="img-fluid" src="${pageContext.request.contextPath}/images/trending-up.svg" alt="">Thống kê</button>
    	<button class="tablinks" onclick="openCity(event, 'SanPham')"><img class="img-fluid" src="${pageContext.request.contextPath}/images/book.svg" alt="">Sản phẩm</button>
    	<button class="tablinks" onclick="openCity(event, 'KhachHang')"><img class="img-fluid" src="${pageContext.request.contextPath}/images/users.svg" alt="">Khách hàng</button>
    	<button class="tablinks" onclick="openCity(event, 'HoaDon')"><img class="img-fluid" src="${pageContext.request.contextPath}/images/check-circle.svg" alt="">Hoá đơn</button>
    	<button class="tablinks" onclick="openCity(event, 'DonHang')"><img class="img-fluid" src="${pageContext.request.contextPath}/images/clipboard.svg" alt="">Đơn hàng</button>
  	</div>
  	<div class="container-fluid bg-light position-fixed" id="header">
    	<div class="row">
      		<div class="col-12 pt-2 pb-3">
        		<a href="#" class="float-right text-decoration-none pl-1"><img class="img-fluid" src="${pageContext.request.contextPath}/images/log-out.svg" alt=""></a>
        		<a href="#" class="float-right text-decoration-none"><img class="img-fluid" src="${pageContext.request.contextPath}/images/user.svg" alt=""></a>
        		<span class="float-right pt-1 pr-1">Lương Xuân Trường</span>
      		</div>
    	</div>
  	</div>
  	<div id="KhachHang" class="tabcontent" style="margin-top: 5rem;">
    	<div class="container-fluid">
      		<div class="row">
        		<div class="col-12 shadow bg-white">
          			<div class="row">
            			<div class="col-7">
              				<h5 class="pt-3">Khách hàng</h5>
            			</div>
            			<div class="col-4 p-0">
              				<input class="form-control mt-2 mb-2" type="text" name="" placeholder="Bạn muốn tìm...">
            			</div>
            			<div class="col-1">
              				<button class="btn btn-primary mt-2 mb-2" type="button">Tìm</button>
            			</div>
          			</div>
          			<div class="row">
            			<div class="col-12">
              				<div class="container-fluid">
                				<div class="row">
                					<c:forEach items="${listCustomer}" var="customer">
                  					<div class="col-sm-4 pl-4 pr-4 pt-2 pb-2">
                    					<div class="row">
                        					<div class="col-sm-12 border rounded shadow p-0">
                          						<div class="row">
                            						<div class="col-4">
                                						<img class="img-fluid" src="${pageContext.request.contextPath}/images/bg.jpg" alt="" style="width: 6rem;height: 6rem;">
                            						</div>
                            						<div class="col-8 p-0 mt-2">
                            							<h6 class="text-dark ml-2" style="display:none">${customer[0]}</h6>
                                						<h6 class="text-dark ml-2">${customer[1]}</h6>
						                                <h6 class="text-dark ml-2">Số điện thoại: ${customer[2]}</h6>
						                                <h6 class="text-dark ml-2">Đã mua: ${customer[3]} sản phẩm</h6>
                            						</div>
                          						</div>
                        					</div>
                      					</div>
                    				</div>
                    				</c:forEach>
                  				</div>
                			</div>
              			</div>
            		</div>
          		</div>
        	</div>
      	</div>
  	</div>
  	<div id="HoaDon" class="tabcontent" style="margin-top: 5rem;">
    	<div class="container-fluid">
      		<div class="row">
        		<div class="col-12 shadow bg-white">
          			<div class="row">
            			<div class="col-7">
              				<h5 class="pt-3">Hóa đơn</h5>
            			</div>
            			<div class="col-4 p-0">
              				<input class="form-control mt-2 mb-2" type="text" name="" placeholder="Bạn muốn tìm...">
            			</div>
            			<div class="col-1">
              				<button class="btn btn-primary mt-2 mb-2" type="button">Tìm</button>
            			</div>
          			</div>
          			<div class="row">
            			<div class="col-12">
              				<div class="container-fluid">
                				<div class="row">
                				<c:forEach items="${listBill}" var="bill">
                  					<div class="col-sm-4 pl-4 pr-4 pt-2 pb-2">
                    					<div class="row">
                        					<div class="col-sm-12 border rounded shadow p-0">
                          						<div class="row">
                            						<div class="col-4">
                                						<img class="img-fluid" src="${pageContext.request.contextPath}/images/bg3.jpg" alt="" style="width: 5rem;height: 5rem;">
                            						</div>
                            						<div class="col-8 p-0 mt-3">
						                                <h6 class="text-dark">Mã hóa đơn: ${bill.maDonHang}</h6>
						                                <a href="#" class="p-2 bg-light text-decoration-none rounded"><img class="img-fluid pr-1" src="${pageContext.request.contextPath}/images/gitlab.svg" alt="">Xem</a>
						                                <a href="#" class="ml-1 p-2 bg-light text-decoration-none rounded"><img class="img-fluid pr-1" src="${pageContext.request.contextPath}/images/trash-2.svg" alt="">Xóa</a>
                            						</div>
                          						</div>
                        					</div>
                      					</div>
                    				</div>
                    				</c:forEach>
                  				</div>
                			</div>
              			</div>
            		</div>
          		</div>
        	</div>
      	</div>
  	</div>
  	<div id="DonHang" class="tabcontent" style="margin-top: 5rem;">
    	<div class="container-fluid">
      		<div class="row">
        		<div class="col-12 shadow bg-white">
          			<div class="row">
            			<div class="col-7">
              				<h5 class="pt-3">Đơn hàng</h5>
            			</div>
            			<div class="col-4 p-0">
            				<input class="form-control mt-2 mb-2" type="text" name="" placeholder="Bạn muốn tìm...">
            			</div>
            			<div class="col-1">
              				<button class="btn btn-primary mt-2 mb-2" type="button">Tìm</button>
            			</div>
          			</div>
          			<div class="row">
            			<div class="col-12">
              				<div class="container-fluid">
                				<div class="row">
                				<c:forEach items="${listOrder}" var="order">
                  					<div class="col-sm-4 pl-4 pr-4 pt-2 pb-2">
                    					<div class="row">
                        					<div class="col-sm-12 border rounded shadow p-0">
                          						<div class="row">
                            						<div class="col-4">                             							
                                						<img class="img-fluid" src="${pageContext.request.contextPath}/images/bg3.jpg" alt="" style="width: 5rem;height: 5rem;">
                            						</div>
                            						<div class="col-8 p-0 mt-3">                              
						                                <h6 class="text-dark">Mã đơn hàng:${order.maDonHang}</h6>
						                                <a href="#" class="p-2 bg-light text-decoration-none rounded" id="xem"><img class="img-fluid pr-1" src="${pageContext.request.contextPath}/images/gitlab.svg" alt="">Xem</a>
						                                <a href="#" class="ml-1 p-2 bg-light text-decoration-none rounded"><img class="img-fluid pr-1" src="${pageContext.request.contextPath}/images/trash-2.svg" alt="">Xóa</a>                            
                            						</div>
                          						</div>
                        					</div>
                      					</div>
                    				</div>
                    				</c:forEach>
                  				</div>
                			</div>
            			</div>
            		</div>
          		</div>
        	</div>
      	</div>
  	</div>
  	<div id="ThongKe" class="tabcontent" style="margin-top: 5rem;">
    	<div class="container-fluid">
      		<div class="row">
        		<div class="col-sm-3 pl-4 pr-4 pt-2 pb-2">
            		<div class="row">
                		<div class="col-sm-12 border p-0 rounded shadow" style="background: url('${pageContext.request.contextPath}/images/bg.jpg');height: 10rem;">
                        	<h1 class="m-0 pl-2">${countOrder}</h1>
                        	<p class="m-0 pl-2">Đơn hàng</p>
                        	<img class="img-fluid float-right" src="${pageContext.request.contextPath}/images/unnamed-removebg-preview.png" alt="" style="width: 5rem; height: 5rem;">
                		</div>
            		</div>
        		</div>
        		<div class="col-sm-3 pl-4 pr-4 pt-2 pb-2">
	          		<div class="row">
	              		<div class="col-sm-12 border p-0 rounded shadow" style="background: url('${pageContext.request.contextPath}/images/bg2.jpg');height: 10rem;">            
	                      	<h1 class="m-0 pl-2 text-danger">${countCustomer}</h1>
	                      	<p class="m-0 pl-2 text-danger">Khách hàng</p>
	                      	<img class="img-fluid float-right" src="${pageContext.request.contextPath}/images/customer.png" alt="" style="width: 5rem; height: 5rem;">         
	              		</div>
	          		</div>
	        	</div>
	        	<div class="col-sm-3 pl-4 pr-4 pt-2 pb-2">
	          		<div class="row">
	            		<div class="col-sm-12 border p-0 rounded shadow" style="background: url('${pageContext.request.contextPath}/images/bg3.jpg');height: 10rem;">
		                    <h1 class="m-0 pl-2 text-warning">${countProduct}</h1>
		                    <p class="m-0 pl-2 text-warning">Sản phẩm</p>
		                    <img class="img-fluid float-right" src="${pageContext.request.contextPath}/images/kho.png" alt="" style="width: 5rem; height: 5rem;">
	            		</div>
	          		</div>
	        	</div>
	        	<div class="col-sm-3 pl-4 pr-4 pt-2 pb-2">
	          		<div class="row">
	            		<div class="col-sm-12 border p-0 rounded shadow" style="background: url('${pageContext.request.contextPath}/images/bg4.jpg');height: 10rem;">
	                  		<h1 class="m-0 pl-2 text-primary">${countBill}</h1>
	                  		<p class="m-0 pl-2 text-primary">Hóa đơn</p>
	                  		<img class="img-fluid float-right" src="${pageContext.request.contextPath}/images/app-icon-sales-order.png" alt="" style="width: 5rem; height: 5rem;">
	            		</div>
	          		</div>
	        	</div>
	      	</div>
	    </div>
    	<div class="container-fluid pt-5 pb-5">
    		<div class="row">
        		<div class="col-12 shadow bg-white">
        			<div id="chart_div" style="width: 100%; height: 500px;"></div>
        		</div>
      		</div>
    	</div>
	</div>
  	<div id="SanPham" class="tabcontent" style="margin-top: 5rem;">
    	<div class="container-fluid">
        	<div class="row">
          		<div class="col-12 shadow bg-white">
            		<div class="row">
              			<div class="col-3">
                			<h5 class="pt-3">Sản phẩm</h5>
              			</div>
              			<div class="col-2 p-0">
                			<button class="btn btn-primary mt-2 mb-2" type="button" id="addTypeBtn">Thêm loại</button>
              			</div>
              			<div class="col-2 p-0">
                			<button class="btn btn-primary mt-2 mb-2" type="button" id="addBtn">Thêm sản phẩm</button>
              			</div>
              			<div class="col-4 p-0">
                			<input class="form-control mt-2 mb-2" type="text" name="" placeholder="Bạn muốn tìm...">
              			</div>
              			<div class="col-1">
                			<button class="btn btn-primary mt-2 mb-2" type="button">Tìm</button>
              			</div>
            		</div>
            		<div class="row">
              			<div class="col-12">
                			<div class="container-fluid">
                  				<div class="row">
                  				<c:forEach items="${listProduct}" var="product">
                    				<div class="col-sm-3 pl-4 pr-4 pt-2 pb-2">
                      					<div class="row">
                          					<div class="col-sm-12 border rounded shadow pl-0 pr-0 pb-3">
	                                  			<img class="img-fluid pt-2 pb-2" src="${pageContext.request.contextPath}/images/${product.hinhAnh}" alt="" style="width: 15rem;height: 15rem;">
	                                  			<h6 class="text-dark ml-2">${product.ten}</h6>
	                                  			<h6 class="text-dark ml-2">${product.gia}</h6>
	                                  			<a href="#" class="ml-2 p-2 bg-light text-decoration-none rounded"><img class="img-fluid" src="${pageContext.request.contextPath}/images/edit-2.svg" alt="">Cập nhật</a>
	                                  			<a href="#" class="ml-2 p-2 bg-light text-decoration-none rounded"><img class="img-fluid" src="${pageContext.request.contextPath}/images/trash-2.svg" alt="">Xóa</a>
                          					</div>
                        				</div>
                      				</div>
                      			</c:forEach>
                    			</div>
                  			</div>
                		</div>
              		</div>
            	</div>
          	</div>
        </div>
     </div>
     <div id="my-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="my-modal-title" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="my-modal-title">Thông tin hóa đơn</h5>
              <button class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="row">
                <div class="col-12">
                  <h6>Mã hóa đơn: HD01</h6>
                  <h6>Khách hàng: Nguyễn Công Phượng</h6>
                  <h6>Địa chỉ nhận hàng: 04 Nguyễn Văn Bảo, phường 4, quận Gò Vấp</h6>
                  <h6>Ngày đặt hàng: 14/01/2022 15:25:00</h6>
                  <h6>Trang thái: Chưa thanh toán</h6>
                  <h6>Phương thức thanh toán: Tiền mặt</h6>
                </div>
              </div>
            </div>
            <div class="modal-footer">
              <button class="btn btn-danger" aria-label="Close" data-dismiss="modal" type="button">Đóng</button>
            </div>
          </div>
        </div>
      </div>
      <div id="my-modal-addProduct" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="my-modal-title" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="my-modal-title">Thêm sản phẩm</h5>
              <button class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <form:form method="POST" action="${pageContext.request.contextPath}/addProduct" enctype="multipart/form-data">
	            <div class="modal-body">
	              <div class="row">
	                <div class="col-4">
	                  <p>Tên sản phẩm:</p>
	                </div>
	                <div class="col-8">
	                    <input class="form-control mb-1" type="text" name="ten">
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Loại sảm phẩm:</p>
	                </div>
	                <div class="col-8">
	                    <select class="form-control" name="maLoai">  
        					<c:forEach items="${listTypeProduct}" var="typeProduct">
        						<option value="${typeProduct.maLoai}" label="${typeProduct.tenLoai}"/>  
        					</c:forEach>
       					</select>  
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Giá sản phẩm:</p>
	                </div>
	                <div class="col-8">
	                    <input class="form-control mb-1" type="text" name="gia">
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Số lượng:</p>
	                </div>
	                <div class="col-8">
	                    <input class="form-control mb-1" type="text" name="soLuong">
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Ảnh:</p>
	                </div>
	                <div class="col-8">
	                    <input class="form-control mb-1" type="file" name="file">
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Mô tả:</p>
	                </div>
	                <div class="col-8">
	                    <textarea name="moTa" cols="35" rows="5"></textarea>
	                </div>
	              </div>
	              <div class="row">
	                <div class="col-4">
	                  <p>Khuyến mãi:</p>
	                </div>
	                <div class="col-8">
	                    <textarea name="khuyenMai" cols="35" rows="5"></textarea>
	                </div>
	              </div>
	            </div>
	            <div class="modal-footer">
	              <button class="btn btn-primary" type="submit">Thêm</button>
	            </div>
          </form:form>
          </div>
        </div>
      </div>
      <div id="my-modal-addTypeProduct" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="my-modal-title" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="my-modal-title">Thêm loại sản phẩm</h5>
              <button class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <form:form method="POST" action="${pageContext.request.contextPath}/addTypeProduct" enctype="multipart/form-data">
	            <div class="modal-body">
	              <div class="row">
	                <div class="col-4">
	                  <p>Tên loại:</p>
	                </div>
	                <div class="col-8">
	                    <input class="form-control mb-1" type="text" name="tenLoai">
	                </div>
	              </div>
	            </div>
	            <div class="modal-footer">
	              <button class="btn btn-primary" type="submit">Thêm</button>
	            </div>
          </form:form>
          </div>
        </div>
      </div>
<script>
  function openCity(evt, cityName) 
  {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) 
    {
      tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) 
    {
      tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
  }
  document.getElementById("defaultOpen").click();
</script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
  google.charts.load('current', {'packages':['corechart']});
  google.charts.setOnLoadCallback(drawChart);

  function drawChart() {
    var data = google.visualization.arrayToDataTable([
      ['Tháng', 'Doanh thu'],
      ['2013',  1000],
      ['2014',  1170],
      ['2015',  660],
      ['2016',  1030]
    ]);

    var options = {
      hAxis: {title: 'Thống kê doanh thu cửa hàng',  titleTextStyle: {color: '#333'}},
      vAxis: {minValue: 0}
    };

    var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
</script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script>
  $(document).ready(function () {
      $("#xem").click(function (e) { 
          $("#my-modal").modal();
      });
      $("#addBtn").click(function (e) { 
          $("#my-modal-addProduct").modal();
      });
      $("#addTypeBtn").click(function (e) { 
          $("#my-modal-addTypeProduct").modal();
      });
  });
</script>
</body>
</html>