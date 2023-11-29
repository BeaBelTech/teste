package com.example.servletoperacoes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OperacoesServlet", value = "/operacoes-matematicas")
public class OperacoesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1Str = request.getParameter("numero1");
        String num2Str = request.getParameter("numero2");

        //Converter os valores para números inteiros
        double numero1 = Double.parseDouble(num1Str);
        double numero2 = Double.parseDouble(num2Str);

        //Calculando
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        //Configurar o tipo de conteúdo da resposta como HTML
        response.setContentType("text/html");

        //Escrever resposta HTML
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Resultado das quatro operações matemáticas básicas</h1>");
        out.println("<h2>Soma:</h2>");
        out.println("<p>"+numero1+" + "+numero2+" = "+soma+"</p>");
        out.println("<h2>Subtração:</h2>");
        out.println("<p>" + numero1 + " - " + numero2 + " = " + subtracao + "</p>");
        out.println("<h2>Multiplicação:</h2>");
        out.println("<p>" + numero1 + " * " + numero2 + " = " + multiplicacao + "</p>");
        out.println("<h2>Divisão:</h2>");
        out.println("<p>" + numero1 + " / " + numero2 + " = " + divisao + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
