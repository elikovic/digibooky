package com.switchfully.www.repository;

import com.switchfully.www.domain.Book;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class BookRepository {

    private final Map<String, Book> booksById;

    public BookRepository(){
        this.booksById = new HashMap<>();
    }

    public Optional<Book> getById(String Id){
        return null;
    }

    public Optional<List<Book>> getByAuthor(String author) {
        return Optional.of(booksById.values().stream().filter(book -> book.getAuthor().getLastname().equals(author)).collect(Collectors.toList()));
    }

    
    public Collection<Book> getAllBooks(){
        return booksById.values();
    }


}
