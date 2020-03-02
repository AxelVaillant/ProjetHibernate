<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>New Product</title>
</head>
<body>
<form action="/ProjetHibernate/add" method="post">
<div>
<label>Product name</label>
<input type="text" name="name" placeholder="introduce the product name">
</div>
<div>
<label>Description</label>
<textarea name="description" placeholder="introduce the product description"></textarea>
</div>
<div>
<input type="submit" value="Save Product">
</div>
</form>

</body>
</html>