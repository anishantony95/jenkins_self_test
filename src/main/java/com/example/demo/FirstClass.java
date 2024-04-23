package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstClass {
	@GetMapping("/get")
	public String num() {
		return "Anish Antony";

}
	@GetMapping("/getadd")
	public int add() {
		return 12+12;
	}
	@GetMapping("/Getadd/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	@PutMapping("/putString")
	public String name(String a) {
		return a;
	}
	@PostMapping("/Post")
	public String name1(String a) {
		return a;
	}
	@GetMapping("/getArray/{num1}/{num2}")
	public List<Integer> getArray(@PathVariable("num1") int a ,@PathVariable("num2") int b){
		List<Integer> d = new ArrayList<>();
		List<Integer> s =Arrays.asList(1,3,4,45,34,2,3,4,5,66,90,12);
		for(Integer x: s) {
			if(x>a&&x<b) {
				d.add(x);
			}
		}
		return d;
	}
}
