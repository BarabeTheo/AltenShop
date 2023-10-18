package com.example.AltenBackEnd;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private final ProductRepository repository;
	
	private final ProductService productService;
	
	ProductController(ProductRepository repository, ProductService productService){
		this.repository = repository;
		this.productService = productService;
	}
	
	
	@GetMapping("/products")
	List<Product> all(){
		return repository.findAll();
		
	}
	
	@PostMapping("/products")
	Product newProduct(@RequestBody Product newProduct) {
		return repository.save(newProduct);
	}
	
	
	@GetMapping("/products/{id}")
	Product one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException());
	}
	
	@PatchMapping("/products/{id}")
	Product updateProduct(@RequestBody Product newProduct, @PathVariable Long id) {
		return repository.findById(id).map(product -> {
			//TODO
			
			return repository.save(product);
		}).orElseGet(() -> {
			newProduct.setId(id);
			return repository.save(newProduct);
		});
	}
	
	@DeleteMapping("/products/{id}")
	void deleteProduct(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

	
	
	
}
