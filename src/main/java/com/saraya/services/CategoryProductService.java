package com.saraya.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.CategoryProduct;

@Service
public class CategoryProductService {
	
	private static List<CategoryProduct> categories = new ArrayList<>();
	
	static {
		categories.add(new CategoryProduct(1, "name product 1", "https://cdn.pixabay.com/photo/2015/01/20/12/51/mobile-605422__340.jpg", "description product 1"));
		categories.add(new CategoryProduct(2, "name product 2", "https://cdn.pixabay.com/photo/2014/05/02/21/48/blogger-336371__340.jpg", "description product 2"));
		categories.add(new CategoryProduct(3, "name product 3", "https://cdn.pixabay.com/photo/2015/01/09/02/45/laptop-593673__340.jpg", "description product 3"));
		categories.add(new CategoryProduct(4, "name product 4", "https://cdn.pixabay.com/photo/2018/01/15/07/51/woman-3083379__340.jpg", "description product 4"));
		categories.add(new CategoryProduct(5, "name product 5", "https://cdn.pixabay.com/photo/2016/06/03/12/37/internet-search-engine-1433323__340.jpg", "description product 5"));
		categories.add(new CategoryProduct(6, "name product 6", "https://media.istockphoto.com/photos/woman-hand-holding-cellphone-with-empty-screen-on-white-background-picture-id1294325966?b=1&k=6&m=1294325966&s=170667a&w=0&h=eUdiRi7sCDwLQhhNeyb6LafDfH641UOIIS-V_6v1FmM=", "description product 6"));
		categories.add(new CategoryProduct(7, "name product 7", "https://media.istockphoto.com/photos/portrait-of-a-cheerful-man-using-smart-phone-at-home-office-picture-id1270030214?b=1&k=6&m=1270030214&s=170667a&w=0&h=IHQol5Tb9VpwEpyf6r0VbraIZ-_0d9sfvTYxufvxdU0=", "description product 7"));
		categories.add(new CategoryProduct(8, "name product 8", "https://media.istockphoto.com/photos/beautiful-woman-standing-in-front-of-blue-background-with-smart-phone-picture-id1268184706?b=1&k=6&m=1268184706&s=170667a&w=0&h=Kv8ZA-Snt3f0Sr0a_3Rse7luTjscY2AUi9AVFc46D4s=", "description product 8"));
		categories.add(new CategoryProduct(9, "name product 9", "https://cdn.pixabay.com/photo/2016/03/27/07/12/apple-1282241__340.jpg", "description product 9"));
		categories.add(new CategoryProduct(10, "name product 10", "https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770__340.png", "description product 10"));
		categories.add(new CategoryProduct(11, "name product 11", "https://cdn.pixabay.com/photo/2016/11/19/22/53/apple-1841553__340.jpg", "description product 11"));
		categories.add(new CategoryProduct(12, "name product 12", "https://cdn.pixabay.com/photo/2016/06/03/12/37/internet-search-engine-1433323__340.jpg", "description product 12"));
	}
	
	private static int count = 13;
	
	//Show all categories products service from the List
	public List<CategoryProduct> getAllCategoriesProducts(){
		return categories;
	}
	
	// Create a new category product service from the List
    public void saveCategoryProduct(CategoryProduct product) {
		CategoryProduct category = new CategoryProduct(count++, product.getName(), product.getImageUrl(), product.getDescription());
		categories.add(category);
	}
    
    // FIND PRODUCT SERVICE BY ID FROM THE ARRAY LIST
 	public CategoryProduct findById(int id) {
 		for(CategoryProduct category : categories) {
 			if(category.getId()==id) {
 				return category;
 			}
 		}
 		return null;
 	}
 	
 // UPDATE A SINGLE CATEGORY PRODUCT SERVICE BY ID FROM THE LIST
 	public void updateCategoryProduct(CategoryProduct category) {
 		categories.remove(category);
 		categories.add(category);
 		
 	}
 	
 	//DELETE SERVICE A SINGLE PRODUCT BY ID FROM THE ARRAY LIST
 	public void deleteCategoryProductById(int id) {
 		Iterator<CategoryProduct> categoryIterator = categories.iterator();
 		while(categoryIterator.hasNext()) {
 			CategoryProduct category = categoryIterator.next();
 			if(category.getId()==id) {
 				categoryIterator.remove();
 			}
 		}
 	}

}
