<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>
        <select>
<option>ปี</option>
<% for (int i=2566; i>=2490; i--) { %>
<option><%= i %></option>
<% } %>
</select>
    </body>

    </html>