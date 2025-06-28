<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PR_24</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<form action="index.jsp" method="post">
    Введите n: <input type="text" name="n" />
    Введите x: <input type="text" name="x" />
    <button type="submit">Вычислить</button>
</form>
<div>
<%
    String nS = request.getParameter("n");
    String xS = request.getParameter("x");
    if (!nS.trim().isEmpty() && !xS.trim().isEmpty()) {
        try {
            double n = Double.parseDouble(nS);
            double x = Double.parseDouble(xS);
            double sum = 0;
            if (x > 0.5) {
                for (double i = 1; i <= n; i++) {
                    double w = Math.pow(x - 1, i + 1) / ((i + 1) * Math.pow(x + 1, i + 1));
                    sum += w;
                }
                out.print("ln x = " + sum);
            } else {
                out.println("x не входит в одз (x > 0.5).");
            }
        } catch (NumberFormatException e) {
            out.println("Введите корректные значения n и x");
        }
    }
    else
        out.println("Заполните поля");
%>
</div>
</body>
</html>

