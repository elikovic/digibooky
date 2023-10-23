package com.switchfully.www.domain.dto;

import com.switchfully.www.domain.book.Author;
import com.switchfully.www.domain.book.BookStatus;
import com.switchfully.www.domain.book.Isbn;

import java.time.LocalDate;

public class BookDto {
    private String id;
    private Isbn isbn;
    private String title;
    private String summary;
    private Author author;
    private BookStatus bookStatus;
    private String rentedPerson;
    private LocalDate dateOfReturn;

    public BookDto() {
    }

    public BookDto setId(String id) {
        this.id = id;
        return this;
    }

    public BookDto setIsbn(Isbn isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookDto setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public BookDto setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public BookDto setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
        if (bookStatus.equals(BookStatus.BORROWED)) {

        }
        return this;
    }

    public String getId() {
        return id;
    }

    public String getIsbn() {
        return isbn.getIsbn();
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public Author getAuthor() {
        return author;
    }

    public String getRentedPerson() {
        return rentedPerson;
    }

    public BookDto setRentedPerson(String rentedPerson) {
        this.rentedPerson = rentedPerson;
        return this;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public BookDto setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
        return this;
    }
}
