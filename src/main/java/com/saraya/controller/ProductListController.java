package com.saraya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.model.Product;
import com.saraya.services.ProductService;

@Controller
@SessionAttributes("username")
public class ProductListController {
	
	@Autowired
	ProductService productService;
	
	// GET ALL PRODUCTS FROM THE LIST
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String productListOfUser(ModelMap model) {
		String username=(String) model.get("username");
		List<Product> products = productService.retrieveAll(username);
		model.addAttribute("products", products);
		return "listProduct";
	}
	
	// GET A SINGLE PRODUCT BY ID
	@RequestMapping(path = "/detail-product", method = RequestMethod.GET)
	public String showDetailProduct(@RequestParam("id") int id, ModelMap model) {	
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "detailProduct";
	}
	
	
}
