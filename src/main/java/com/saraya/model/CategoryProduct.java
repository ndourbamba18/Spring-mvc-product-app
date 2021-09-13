package com.saraya.model;

public class CategoryProduct {
	
	private int id;
	private String name;
	private String imageUrl;
	private String description;
	
	public CategoryProduct() {}

	public CategoryProduct(int id, String name, String imageUrl, String description) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.description = description;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryProduct [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", description="
				+ description + "]";
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
		CategoryProduct other = (CategoryProduct) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
