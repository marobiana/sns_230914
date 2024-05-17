package com.sns.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lesson01Controller {

	@GetMapping("/lesson01/ex01")
	public String ex01() {
		return "lesson01/ex01";
	}
}
