<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kmwpc
  Date: 2022-12-03
  Time: 오후 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@page import="com.example.MVCBoardDAO, com.example.MVCBoardVO,java.util.*"%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/com.example/resources/css/style.css">
    <style>
    #list {
      font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }
    #list td, #list th {
      border: 1px solid #ddd;
      padding: 8px;
      text-align:center;
    }
    #list tr:nth-child(even){background-color: #f2f2f2;}
    #list tr:hover {background-color: #ddd;}
    #list th {
      padding-top: 12px;
      padding-bottom: 12px;
      text-align: center;
      background-color: #006bb3;
      color: white;
    }
    </style>
</head>
<body>
<h1>자유게시판</h1>
<table id="list" width="90%">
<tr>
  <th>ID</th>
  <th>Category</th>
  <th>Title</th>
  <th>Writer</th>
  <th>RC</th>
  <th>Team</th>
  <th>Content</th>
  <th>Response</th>
  <th>Regdate</th>
  <th>Edit</th>
  <th>Delete</th>
</tr>

<c:forEach items="${list}" var="u">
  <tr>
    <td>${u.getSeq()}</td>
    <td>${u.getCategory()}</td>
    <td>${u.getTitle()}</td>
    <td>${u.getWriter()}</td>
    <td>${u.getRc()}</td>
    <td>${u.getTeam()}</td>
    <td>${u.getContent()}</td>
    <td>${u.getResponse()}</td>
    <td>${u.getRegdate()}</td>
    <td><a href="editform/${u.getSeq()}">Edit</a></td>
    <td><a href="deleteok/${u.getSeq()}">Delete</a></td>
  </tr>
</c:forEach>
</table>

<br/><a href="add">Add New Post</a>
</body>
</html>
