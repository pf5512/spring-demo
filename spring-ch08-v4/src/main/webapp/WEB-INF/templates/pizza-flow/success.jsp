<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>Spring Flow Demo</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/reset.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css"/>
</head>
<body>
  <div id="header">
    <h1>Spring Flow Demo</h1>
  </div>
  
  <div id="main">
    <div class="info">
      <h2>Order Details</h2>
    </div>
    
    <div class="orderDetails">
      <span class="label">Customer name: </span><span>${order.customerName}</span><br/>
      <span class="label">Mobile No: </span><span>${order.mobileNumber}</span><br/>
      <span class="label">City: </span><span>${order.city}</span><br/>
      <span class="label">Pizza Name: </span><span>${order.pizzaName}</span>
    </div>
    
    <div class="options">
      Go to <a href="${pageContext.request.contextPath}">Home</a>
    </div>
  </div>
  
  <div id="footer">
    &copy; 2013, Chirper Inc. All rights reserved.
  </div>
</body>
</html>
