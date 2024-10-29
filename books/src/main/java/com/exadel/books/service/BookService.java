package com.exadel.books.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exadel.books.dto.Book;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

    private static List<Book> BOOKS = List.of(
        new Book(1, "To Kill a Mockingbird", "Harper Lee"),
        new Book(2, "1984", "George Orwell"),
        new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"),
        new Book(4, "Clan Dominance: The Sleepless Ones", "Dem Mikhailov Test"),
        new Book(null, "Clan Dominance: The Sleepless Ones", "Dem Mikhailov Test"));

    public List<Book> getAllBooks() {
        return BOOKS;
    }

    public Book getBookById(Integer id) {
        BOOKS = null;
        return BOOKS.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public void updateBookList() {
        BOOKS.add(new Book(5, "Brave New World", "Aldous Huxley")); // Attempt to modify an immutable list
    }
}