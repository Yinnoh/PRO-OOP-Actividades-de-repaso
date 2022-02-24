package com.oopex.basicClass;

import java.util.ArrayList;

public class BookInstanceMain {
    public static void main(String[] args) {
        Book myBook = new Book();
        Book completeBook = new Book("Gestion de muestras Biologicas","Pedro picapiedras","Cientifico","9788490773703", 12345678);
        Book recognizableBook = new Book("Don Quijote de la Mancha", "9788423708192");

        ArrayList<Book> bookList  = new ArrayList<>();

        bookList.add( myBook);
        bookList.add( completeBook );
        bookList.add( recognizableBook  );


        for (Book book : bookList){
            System.out.println("IMPRIMIENDO LIBRO..........");
            System.out.println("---------------------------------");
            System.out.println("1.- el nombre es: " + book.getName());
            System.out.println("2.- el author es: " + book.getAuthor());
            System.out.println("3.- la categoria es: "+ book.getCategory());
            System.out.println("4.- el ISBN es:" + book.getISBN());
            System.out.println("5.- las ventas son : " + book.getSales());

            System.out.println();
            System.out.println();
        }

    }
}
