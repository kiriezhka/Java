package com.company.draw;

public class Main extends LineDrawer{
    public static void main(String[] args) {
        drawLine(10, "горизонтальная", '-');
        System.out.println();
        drawLine(5, "вертикальная", '*');
    }
}
