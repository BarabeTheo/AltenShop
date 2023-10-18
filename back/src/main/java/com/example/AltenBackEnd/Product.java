package com.example.AltenBackEnd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
/*
	  id: number;
	  code: string;
	  name: string;
	  description: string;
	  price: number;
	  quantity: number;
	  inventoryStatus: string;
	  category: string;
	  image?: string;
	  rating?: number;
	  */
	
	@Id 
	@GeneratedValue
	private Long id;
	private String code;
	private String name;
	private String description;
	private Long price;
	private Long quantity;
	private String inventoryStatus;
	private String category;
	private String image;
	private Long rating;
	
	
	
	
	Product(){}


	public Product(String code, String name, String description, Long price, Long quantity, String inventoryStatus,
			String category, String image, Long rating) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.inventoryStatus = inventoryStatus;
		this.category = category;
		this.image = image;
		this.rating = rating;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public String getInventoryStatus() {
		return inventoryStatus;
	}


	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Long getRating() {
		return rating;
	}


	public void setRating(Long rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantity=" + quantity + ", inventoryStatus=" + inventoryStatus + ", category=" + category
				+ ", image=" + image + ", rating=" + rating + "]";
	};
	
	
	
	
	
	
}
