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
<li>user_name:  <s:property value="user_name"/></li>
<li>pass:  <s:property value="pass"/></li>
<li>credit_number:  <s:property value="credit_number"/></li>
<li>address:  <s:property value="address"/></li>
</ul>
<table>
<s:form action="GoEditAction"><s:submit value="情報編集" type="button"/></s:form>
</table>
</body>
</html>