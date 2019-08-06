package com.webapp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.webapp.demo.model.Book;

public interface BookRepo extends JpaRepository <Book, Integer>
{

}
