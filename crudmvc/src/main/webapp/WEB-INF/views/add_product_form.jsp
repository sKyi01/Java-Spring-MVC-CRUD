<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<title>Insert title here</title>
</head>
<body>
	

<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3"> Fill the product details</h1>

	<form  action="handle-product" method="post">
		<div class="form-group">
			<label for="exampleProductName">Product Name</label> <input
				type="text" name="name" class="form-control" id="exampleProductName"
				aria-describedby="productNameHelp" placeholder="Enter product name"> 
		</div>
		<div class="form-group">
			<label for="exampleDescription">Product Description</label><textarea rows="5" cols=""
			
				 name="description" class="form-control" id="exampleDescription"
				 placeholder="Enter product Description "></textarea>
		</div>
		<div class="form-group">
			<label for="examplePrice">Product Price</label> <input
				type="text" name="price" class="form-control" id="examplePrice"
				aria-describedby="priceHelp" placeholder="Enter product price "> 
		</div>
		<div class="container text-center ">
		<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
		
		<button type="submit" class="btn btn-primary">Add</button>
		</div>
	</form>
	</div>
	</div>
	</div>
</body>
</html>