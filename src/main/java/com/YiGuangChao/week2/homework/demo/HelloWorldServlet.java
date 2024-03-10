package com.YiGuangChao.week2.homework.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name:YiGuangChao");
        writer.println("ID:2022211001000126");
        writer.println("Date and Time Sun March 12:20:15 CST 2024");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
