package com.ttw.BasicSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {
	// http://localhost:8080/basic?id=123

		// @GetMapping("/basic")
		@GetMapping
		public String m1(@RequestParam int id) {
			// call service class for get any data
			System.out.println("m1 calling");
			return "success " + id;
		}

	// http://localhost:8080/basic/123
		// @GetMapping("/basic/{id}") // /basic/2
		@GetMapping("/{id}")
		public int m2(@PathVariable int id) {
			int sum = id + 25;
			return sum;
		}

		@GetMapping("/getdetails")
		public String display() {
			// call service class for get any data
			System.out.println("after deployment1");
			return "success after deployment1";
		}

}
