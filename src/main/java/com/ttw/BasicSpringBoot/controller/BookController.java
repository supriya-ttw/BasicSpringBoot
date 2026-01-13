package com.ttw.BasicSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {
	//http://localhost:8080/api
@GetMapping
private String m1() {
	return "Hi. hello";
}
//http://localhost:8080/api/m2?id=42
@GetMapping("/m2")
public int m2(@RequestParam int id) {
	// TODO Auto-generated method stub
return id;
}
//http://localhost:8080/api/m3/145
@GetMapping("/m3/{id}")
public int m3(@PathVariable int id) {
	// TODO Auto-generated method stub
return id;
}
}