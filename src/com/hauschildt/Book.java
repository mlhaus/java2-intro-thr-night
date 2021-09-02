package com.hauschildt;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private boolean read;
    private int numPages;
    private int bookId;
    private static int count = 0;

    public Book() {
        this("Unknown", "Unknown", false, 0);
    }

    public Book(String title, String author, boolean read, int numPages) {
        bookId = ++count;
        this.title = title;
        this.author = author;
        this.read = read;
        setNumPages(numPages);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRead() {
        return read;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setNumPages(int numPages) {
        if (numPages >= 0) {
            this.numPages = numPages;
        } else {
            this.numPages = 0;
        }
    }

    @Override
    public String toString() {
        String result = "Book Id: " + bookId;
        result += "\n\tTitle: " + title;
        result += "\n\tAuthor: " + author;
        result += "\n\tRead: " + read;
        result += "\n\tPages: " + numPages;
        return result;
    }

    @Override
    public int compareTo(Book o) {
        if (this.author.compareToIgnoreCase(o.author) == 0) {
            return this.title.compareToIgnoreCase(o.title);
        }
        return this.author.compareToIgnoreCase(o.author);
    }
}
