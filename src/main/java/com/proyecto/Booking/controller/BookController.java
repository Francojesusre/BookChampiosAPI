package com.proyecto.Booking.controller;

import com.proyecto.Booking.persistence.entities.Book;
import com.proyecto.Booking.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public ResponseEntity<Book> Create(@RequestBody Book book){
        return new ResponseEntity<>(bookService.Create(book), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> GetAll(){

        return ResponseEntity.ok(bookService.GetAll());
    }


}
