package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PathValiableController {
	
	@GetMapping("show2")
	public String showView() {
		return "show";
	}
	
	@GetMapping("/function/{no}")
	public String selectFunction(@PathVariable Integer no) {
		String view = null;
		if (no == 1) {
			return "pathvaliable/function1";
		}

		if (no == 2) {
			return "pathvaliable/function2";
		}
		
		if (no == 3) {
			return "pathvaliable/function3";
		}
		
		return view;
	}
	
	@PostMapping(value="send", params="a")
	public String showAview() {
		return "/submit/a";
	}
	
	@PostMapping(value="send", params="b")
	public String showBview() {
		return "/submit/b";
	}
	
	@PostMapping(value="send", params="c")
	public String showCview() {
		return "/submit/c";
	}

}
