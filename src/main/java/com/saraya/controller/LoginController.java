package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.model.CategoryProduct;
import com.saraya.model.Product;
import com.saraya.services.CategoryProductService;
import com.saraya.services.UserValidation;

// CLASS LOGINCONTEROLLER
@Controller
@SessionAttributes("username")
public class LoginController {
	
	@Autowired
	UserValidation userValidation;
	
	@Autowired
	CategoryProductService categoryService;
	
	// USER LOGIN
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginApp() {
		return "loginForm";
	}
	 
	// USER LOGIN AND REDIRECT
	@RequestMapping(path="/save-login", method=RequestMethod.POST)
	public String saveLogin(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		if(!userValidation.isValid(username, password)) {
			model.addAttribute("errorMessage", "make sure you enter the correct values!");
			return "loginForm";
		}
		
		model.addAttribute("username", username);
		model.addAttribute("messageSuccess", "Your has been logged successfully!");
		return "loginSuccess";
	}
	
	// HOME PAGE
	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String homePage(ModelMap model) {
		
		model.addAttribute("categories", categoryService.getAllCategoriesProducts());
		return "home";
	}
	
	// ABOUT PAGE
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String aboutPage() {
		return "about";
	}
	
	//CONTACT PAGE
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String contactPage() {
		return "contact";
	}
	
	// CRAETE A NEW CATEGORY PRODUCT 
	@RequestMapping(path = "/new-category", method = RequestMethod.GET)
	public String categoryProduct(ModelMap model) {
		model.addAttribute("category", new CategoryProduct());
		return "categoryForm";
	}
	
	// SAVE A NEW CATEGORY PRODUCT
	@RequestMapping(path = "/save-category", method = RequestMethod.POST)
	public String saveCategoryProduct(ModelMap model, @ModelAttribute("category") CategoryProduct category, BindingResult bindingResult) {
		/*if(bindingResult.hasErrors()) {
			return "categoryForm";
		}*/
		
		//Validation code start
		 boolean error = false;
		System.out.println(category);
		    
		if(category.getName().isEmpty()){
		       bindingResult.rejectValue("Category Name", "error.name");
		       error = true;
		 }
		     
		 if(category.getDescription().isEmpty()){
		       bindingResult.rejectValue("Category description", "error.description");
		       error = true;
		  }
		    
		  if(category.getImageUrl().isEmpty()){
		       bindingResult.rejectValue("Category Image Url", "error.imageUrl");
		       error = true; 
		  }
		     
		  if(error) {
		        return "categoryForm";
		  }
		    
		  //validation code ends
		    
		categoryService.saveCategoryProduct(category);
		model.addAttribute("successMessage", " Product has been added successfully.");
		return "redirect:/home";
	}

	// GET A SINGLE PRODUCT BY ID FROM THE LIST
	@RequestMapping(path = "/detail-category", method = RequestMethod.GET)
	public String showDetailCategoryProduct(@RequestParam("id") int id, ModelMap model) {	
		CategoryProduct category = categoryService.findById(id);
		model.addAttribute("category", category);
		return "detailCategoryProduct";
	}
	
	//UPDATE CATEGORY PRODUCT BY ID FROM THE LIST
	@RequestMapping(path = "/update-category", method = RequestMethod.GET)
	public String updateCategoryProduct(ModelMap model, @RequestParam("id") int id) {
		CategoryProduct category = categoryService.findById(id);
		model.addAttribute("category", category);
		model.addAttribute("id", id);
		return "updateCategoryForm";
	}
	
	//SAVE UPDATE METHOD
	@RequestMapping(path = "/save-update-category", method = RequestMethod.POST)
	public String saveUpdateCategoryProduct(@RequestParam("id") int id, @ModelAttribute("category") CategoryProduct category,
			                                                 BindingResult  bindingResult, ModelMap model) {
		
		if(bindingResult.hasErrors()) {
			return "updateCategoryForm";
		}
		
		CategoryProduct categoryData = categoryService.findById(id);
		model.addAttribute("id", id);
	    categoryData.setName(category.getName());
		categoryData.setImageUrl(category.getImageUrl());
		categoryData.setDescription(category.getDescription());
		categoryService.updateCategoryProduct(categoryData);
		
		//categoryService.saveCategoryProduct(new_category);
		return "redirect:/home";
	}

	//DELETE CATEGORY PRODUCT BY ID FROM THE LIST
	@RequestMapping(path = "/dalete-category", method = RequestMethod.GET)
	public String daleteCategoryProduct(@RequestParam("id") int id, ModelMap model) {
		categoryService.deleteCategoryProductById(id);
		model.clear();
		return "redirect:/home";
	}
	
}
