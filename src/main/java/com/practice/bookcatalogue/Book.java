package com.practice.bookcatalogue;

import java.util.Date;

public class Book {

    private String title;
    private String author;
    private Integer isbn;
    private Date publicationDate;

    public Book() {
    }
    public Book(String title,String author,Integer isbn,Date publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.isbn.equals(((Book) obj).isbn));
    }

    @Override
    public int hashCode(){
        return this.isbn.hashCode();
    }
}
