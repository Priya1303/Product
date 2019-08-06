package com.webapp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Book {
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		private int id;
	@Size (min=3,max=15)
		private String name;
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
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + "]";
		}
		
	
}
