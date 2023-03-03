package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Books;
import com.example.demo.Repository.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo repository;
	public Optional<Books> getStudent(int id){
		return repository.findById(id);
	}

	public String updateDetails(Books stu) {
		repository.save(stu);
		return "updated";
	}

	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "Id deleted";

	}
}