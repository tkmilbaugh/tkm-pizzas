package com.milbaugh.pizza;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class PizzaController {
	@RequestMapping(value = "/pizzas", method = RequestMethod.GET)
	@ResponseBody
	public String getPizzasBySimplePath() {
	    return "Get some Pizzas!";
	}

}
