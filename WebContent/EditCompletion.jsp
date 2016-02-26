<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<li>更新する名前：<s:property value="#session.updateUser_name"/></li>
<li>更新するパスワード：<s:property value="#session.updatePass"/></li>
<li>更新する住所：<s:property value="#session.updateAddress"/></li>
</ul>
<s:form action=""><s:submit type="button"/></s:form>
</body>
</html>