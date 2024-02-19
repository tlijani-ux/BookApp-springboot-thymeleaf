package com.bookapp.bookapp.services;


import com.bookapp.bookapp.entities.Book;
import com.bookapp.bookapp.repository.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {


    @Autowired
    private BookListRepository bookListRepository;

    public  void saveBooks(Book book){
        bookListRepository.save(book);
    }

    public List<Book> getAllMyBooks(){
        return bookListRepository.findAll();
    }

    public void deleteById(int id) {
        bookListRepository.deleteById((long) id);
    }





}
