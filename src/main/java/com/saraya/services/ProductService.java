package com.saraya.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.saraya.model.Product;

@Service
public class ProductService {
	
	private static List<Product> products = new ArrayList<>();
	
	static {
		products.add(new Product("bamba", 1, "name product 1", "400", true, "description product 1", "China", "", "https://cdn.pixabay.com/photo/2014/05/02/21/47/laptop-336369__340.jpg"));
		products.add(new Product("bamba", 2, "name product 2", "285", true, "description product 2", "Chine", "", "https://cdn.pixabay.com/photo/2016/02/19/10/00/laptop-1209008__340.jpg"));
		products.add(new Product("bamba", 3, "name product 3", "154", false, "description product 3", "French", "", "https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336377__340.jpg"));
		products.add(new Product("bamba", 4, "name product 4", "10047", true, "description product 4", "USA", "", "https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg"));
		products.add(new Product("bamba", 5, "name product 5", "451", false, "description product 5", "Italiano", "", "https://cdn.pixabay.com/photo/2014/12/15/14/05/home-office-569153__340.jpg"));
		products.add(new Product("codeurPro", 6, "name product 6", "450", false, "description product 6", "China", "", "https://cdn.pixabay.com/photo/2017/01/22/12/07/imac-1999636__480.png"));
		products.add(new Product("codeurPro", 7, "name product 7", "1500", true, "description product 7", "Berlin", "", "https://cdn.pixabay.com/photo/2014/05/02/21/50/blogging-336376__340.jpg"));
		products.add(new Product("codeurPro", 8, "name product 8", "350", false, "description product 8", "Dakar", "", "https://cdn.pixabay.com/photo/2016/03/09/09/59/laptop-computer-1245981__340.jpg"));
		products.add(new Product("codeurPro", 9, "name product 9", "180", true, "description product 9", "Las vegas", "", "https://cdn.pixabay.com/photo/2015/09/05/22/33/office-925806__340.jpg"));
		products.add(new Product("vsoumare", 10, "name product 10", "50", false, "description product 10", "USA", "", "https://cdn.pixabay.com/photo/2017/10/10/21/47/laptop-2838921__340.jpg"));
		products.add(new Product("vsoumare", 11, "name product 11", "845", true, "description product 11", "USA", "", "https://cdn.pixabay.com/photo/2017/06/20/23/15/coffee-2425303__340.jpg"));
		products.add(new Product("vsoumare", 12, "name product 12", "1000", true, "description product 12", "Hong Kong", "", "https://cdn.pixabay.com/photo/2016/03/27/07/12/apple-1282241__340.jpg"));
	}
	
	//private static int count = 13;
	
	// GET ALL PRODUCTS SERVICE FROM THE LIST
	public List<Product> getAllProducts(){
		return products;
	}
	
	
    List<Product> productList = new ArrayList<Product>();
	
	// GET A SINGLE USER DETAIL SERVICE
	public List<Product> retrieveAll(String username){
		for(Product product : products) {
			if(product.getUsername().equalsIgnoreCase(username)) {
				productList.add(product);
			}
		}
		  
		return productList;
	}
	
	// FIND PRODUCT SERVICE BY ID FROM THE ARRAY LIST
	public Product findById(int id) {
		for(Product product : products) {
			if(product.getId()==id) {
				return product;
			}
		}
		return null;
	}
	
	

}
