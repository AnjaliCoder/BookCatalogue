package com.practice.bookcatalogue;

import javax.inject.Named;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Named
public class SearchBook {
    public Set<Book> getBooksByTitle(String title){
        Set<Book> books = BookMock.getBooks();
        Set<Book> searchedBooks = new HashSet<>();
        searchedBooks = books.stream().filter(b-> b.getTitle().equalsIgnoreCase(title)).collect(Collectors.toSet());
        return searchedBooks;

    }

    public Set<Book> getBooksByAuthor(String author){
        Set<Book> books = BookMock.getBooks();
        Set<Book> searchedBooks = new HashSet<>();
        searchedBooks = books.stream().filter(b-> b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toSet());
        return searchedBooks;

    }

    public Set<Book> getBooksByIsbn(Integer isbn){
        Set<Book> books = BookMock.getBooks();
        Set<Book> searchedBooks = new HashSet<>();
        searchedBooks = books.stream().filter(b-> b.getIsbn().intValue() == isbn.intValue()).collect(Collectors.toSet());
        return searchedBooks;

    }
}
