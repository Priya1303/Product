package com.webapp.demo.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.webapp.demo.dao.BookRepo;
import com.webapp.demo.model.Book;
@RestController
public class ProductController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	BookRepo repo;
		@PostMapping("/book")
		public Book addBook( Book book)
		{
			
			repo.save(book);
			logger.info("entered  saveusers method");
			return book;
		}
		
		@GetMapping("/book")
		
		public List<Book> getBook()
		{
			
		return repo.findAll();
		
		}
		@PutMapping("/book")
		public Book saveOrUpdateBook( Book book)
		{
			repo.save(book);
			return book;
		}
	}
/*
package com.seller.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.LogFactory;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seller.dao.Products;
import com.seller.repo.Productrepo;


@RestController
public class Controller {
	
	private Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	Productrepo productrepo;
	
	
	
	
	@Autowired
	Products products;
	

	
	@RequestMapping("/test")
	public String test()
	{
		
		return "done";
	}

	@RequestMapping(method=RequestMethod.POST,path="/addproduct")

	public String  add(@Validated @RequestBody   Products products) {
	
				
		productrepo.save(products);
		return "Success";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/showall")

	
	
	public List<Products>  show() {
	logger.info("Enterd into Show all method");
				
		List<Products> products = new ArrayList<Products>();
		
		products=productrepo.findAll();
		logger.info("Exited from Show all method");
		
		return products;
		
	}
	
	

	@RequestMapping(method=RequestMethod.GET,path="/show/{id}")

	public Optional<Products> showone(@PathVariable int id) 
	{
	
		if(id==0)
			throw  new RuntimeException("Something went wrong");
		
		
		
		
		return productrepo.findById(id)	;	
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/updateproduct/{id}")
	
	public String  updateproduct(@PathVariable int id, @RequestBody   Products p)
	{

		Products productToUpdate = productrepo.getOne(id);
		productToUpdate.setDescription(p.getDescription());
		productToUpdate.setName(p.getName());
		productrepo.save(productToUpdate);
												
				return "Success";
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/delete/{id}")
	
	public Void  delete(@PathVariable int id)
	{
		
		productrepo.deleteById(id);
				return null;
	
	
}
	
}
*/