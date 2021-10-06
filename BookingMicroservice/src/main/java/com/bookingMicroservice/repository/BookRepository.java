package com.bookingMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookingMicroservice.model.Book;



public interface BookRepository extends MongoRepository<Book,Integer> { 

}
