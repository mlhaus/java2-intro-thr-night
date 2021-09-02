package com.hauschildt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Book[] bookshelf = new Book[4];
        bookshelf[0] = new Book("Python", "Marc Hauschildt", false, 800);
        bookshelf[1] = new Book("Java", "Marc Hauschildt", false, 1000);
        bookshelf[2] = new Book("Java", "Ada Lovelace", false, 750);
        bookshelf[3] = new Book();
        System.out.println("There are " + Book.getCount() + " books on the bookshelf.");
        Arrays.sort(bookshelf);
        for(Book b: bookshelf){
            System.out.println(b);
        }

    }
}
