package com.saraya.model;


public class Product {
	
	private String username;
	private int id;
	private String name;
	private String price;
	private boolean isStock;
	private String description;
	private String madeIn;
	private String brand;
	private String imageUrl;
	
	public Product() {}

	public Product(String username, int id, String name, String price, boolean isStock, String description,
			String madeIn, String brand, String imageUrl) {
		super();
		this.username = username;
		this.id = id;
		this.name = name;
		this.price = price;
		this.isStock = isStock;
		this.description = description;
		this.madeIn = madeIn;
		this.brand = brand;
		this.imageUrl = imageUrl;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isStock() {
		return isStock;
	}

	public void setStock(boolean isStock) {
		this.isStock = isStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	

	@Override
	public String toString() {
		return "Product [username=" + username + ", id=" + id + ", name=" + name + ", price=" + price + ", isStock="
				+ isStock + ", description=" + description + ", madeIn=" + madeIn + ", brand=" + brand + ", imageUrl="
				+ imageUrl + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
