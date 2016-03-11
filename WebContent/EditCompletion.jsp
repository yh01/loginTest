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
<li>セッションに保持された：<s:property value="#session.sessionUserId"/></li>
<li>セッションに保持された：<s:property value="sessionUserId"/></li>
<li>作成する名前：<s:property value="newUserName"/></li>
<li>作成するパスワード：<s:property value="newPass"/></li>
</ul>
<s:form action="EditCompletionAction"><s:submit type="button"/></s:form>
</body>
</html>