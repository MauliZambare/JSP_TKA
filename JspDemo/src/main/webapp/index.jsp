<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Prime Numbers</title>
</head>
<body style="display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f0f0f0;">
    <div style="text-align: center; color: red;">
        <h1>Prime Numbers from 0 to 100</h1>
        <% 
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
        %>
                <p><%= "prime numbers :- "+ i %></p>
        <% 
                }
            }
        %>
    </div>
</body>
</html>
