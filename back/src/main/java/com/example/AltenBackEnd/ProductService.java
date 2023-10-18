package com.example.AltenBackEnd;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Iterable<Product> list(){
		return productRepository.findAll();
	}
	
	public Iterable<Product> save(List<Product> products) {
		return productRepository.saveAll(products);
	}
	
}
