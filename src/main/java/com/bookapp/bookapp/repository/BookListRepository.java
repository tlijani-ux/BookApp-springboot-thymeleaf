package com.bookapp.bookapp.repository;

import com.bookapp.bookapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookListRepository extends JpaRepository<Book , Long> {
}
