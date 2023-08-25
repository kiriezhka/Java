package com.company.draw;

public class LineDrawer {
    public static void drawLine(int length, String direction, char symbol) {
        if (direction.equalsIgnoreCase("горизонтальная")) {
            String horizontalLine = new String(new char[length]).replace('\0', symbol);
            System.out.println(horizontalLine);
        } else if (direction.equalsIgnoreCase("вертикальная")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Неправильное направление. Допустимые значения: 'горизонтальная' или 'вертикальная'");
        }
    }
}
