package com.company.homework5.task5;

import java.util.Scanner;

public class Book {
    private String title;
    private String authorName;
    private int publicationYear;
    private String publisher;
    private String genre;
    private int pageCount;

    // Конструктор класса
    public Book(String title, String authorName, int publicationYear, String publisher, String genre, int pageCount) {
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    // Перегруженный конструктор для создания книги с минимальными данными
    public Book(String title, String authorName, int publicationYear) {
        this(title, authorName, publicationYear, "", "", 0);
    }

    // Метод для ввода данных о книге
    public void inputBookData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги:");
        title = scanner.nextLine();

        System.out.println("Введите ФИО автора:");
        authorName = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        publicationYear = scanner.nextInt();
        scanner.nextLine(); // Поглощаем символ новой строки

        System.out.println("Введите название издательства:");
        publisher = scanner.nextLine();

        System.out.println("Введите жанр книги:");
        genre = scanner.nextLine();

        System.out.println("Введите количество страниц:");
        pageCount = scanner.nextInt();
    }

    // Метод для вывода данных о книге
    public void displayBookData() {
        System.out.println("Название книги: " + title);
        System.out.println("ФИО автора: " + authorName);
        System.out.println("Год выпуска: " + publicationYear);
        System.out.println("Издательство: " + publisher);
        System.out.println("Жанр книги: " + genre);
        System.out.println("Количество страниц: " + pageCount);
    }

    // Перегруженный метод для вывода минимальных данных о книге (без издательства, жанра и количества страниц)
    public void displayBookDataMin() {
        System.out.println("Название книги: " + title);
        System.out.println("ФИО автора: " + authorName);
        System.out.println("Год выпуска: " + publicationYear);
    }


    public static void main(String[] args) {
        // Пример использования класса
        Book book = new Book("", "", 0, "", "", 0);
        book.inputBookData();
        System.out.println("Введенные данные о книге:");
        book.displayBookData();

        Book minimalBook = new Book("Моя книга", "Автор", 2023);
        System.out.println("Минимальные данные о книге:");
        minimalBook.displayBookDataMin();
    }
}
