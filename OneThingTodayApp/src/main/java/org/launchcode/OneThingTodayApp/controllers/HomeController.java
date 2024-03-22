package org.launchcode.OneThingTodayApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
	
	@GetMapping
    public String displayIndexPage() {
		return "Display index page";
	}

}
