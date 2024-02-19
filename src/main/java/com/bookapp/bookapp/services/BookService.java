package com.bookapp.bookapp.services;


import com.bookapp.bookapp.entities.Book;
import com.bookapp.bookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
       return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.findById((long) id).get();
    }

    public void deleteBookById(int id){

        bookRepository.deleteById((long) id);

    }





}
