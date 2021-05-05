package com.practice.bookcatalogue;

import java.util.HashSet;
import java.util.Set;

public class BookMock {

    private static Set<Book> books = new HashSet<>();
    public static Set<Book> getBooks(){
        return books;
    }

}
