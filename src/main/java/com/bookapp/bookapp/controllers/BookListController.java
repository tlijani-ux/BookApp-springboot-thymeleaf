package com.bookapp.bookapp.controllers;


import com.bookapp.bookapp.services.BookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {

    @Autowired
    private BookListService bookListService;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        bookListService.deleteById(id);
        return "redirect:/books";
    }


}
