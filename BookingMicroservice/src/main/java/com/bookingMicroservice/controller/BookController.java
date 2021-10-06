package com.bookingMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookingMicroservice.model.Book;
import com.bookingMicroservice.repository.BookRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookrepository;
	
	
	@PostMapping("/bookTicket")
	public String saveFlight(@RequestBody Book ticket) {
		bookrepository.save(ticket);
		return "Flight booked Successfully";
	}
	
	@GetMapping("/getDetails")
	public List<Book> getDetails() {
		return bookrepository.findAll();
		
	}
	
}
