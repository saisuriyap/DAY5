package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Books;
import com.example.demo.Repository.BookRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired
BookRepo servicerepository;
@Autowired
ApiService service;
@GetMapping("/getvalues")
List<Books> getList(){
return servicerepository.findAll();
}
@PutMapping("/student/{id}")
public String update(@RequestBody Books stu,@PathVariable int id) {
	return service.updateDetails(stu);
}
@DeleteMapping("/student/{id}")
public String delete(@PathVariable int id) {
	return service.deleteDetails(id);
}
@GetMapping("/getvalues/{id}")
public Optional<Books> getbyid(@PathVariable int id){
	return service.getStudent(id);
}
@PostMapping("/post")
public Books create(@RequestBody Books stu) {
return servicerepository.save(stu);
}
}