package com.switchfully.www.domain.dto;

import com.switchfully.www.domain.Author;
import com.switchfully.www.domain.ISBN;

public class CreateBookDto {
    private ISBN isbn;
    private String title;
    private String summary;
    private Author author;

    public CreateBookDto(){
        //JACKSON
    }
    public ISBN getIsbn() {
        return isbn;
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

    public CreateBookDto setIsbn(ISBN isbn) {
        this.isbn = isbn;
        return this;
    }

    public CreateBookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public CreateBookDto setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public CreateBookDto setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
