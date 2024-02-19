package com.bookapp.bookapp.controllers;

import com.bookapp.bookapp.entities.Book;
import com.bookapp.bookapp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String Regsiter(){
		return "register";
	}

	@GetMapping("/books")
	public String books(){
		return "books";

	}

	@GetMapping("available_books")
	public ModelAndView getAllBook(){
		List<Book> bookList=bookService.getAllBooks();
		return new ModelAndView("booksList" , "book", bookList);
	}

	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		bookService.save(b);
		return "redirect:/available_books";
	}

	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b=bookService.getBookById(id);
		Book book=new Book(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		bookService.save(book);
		return "redirect:/books";
	}

	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id , Model model)
	{
		Book b= bookService.getBookById(id);
		model.addAttribute("book", b);
		return "bookedit";



	}




















}
