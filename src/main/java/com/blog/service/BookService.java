package com.blog.service;

import com.blog.pojo.Book;
import com.blog.utils.TTResult;

public interface BookService {

	TTResult createBook(Book book);
	
	TTResult queryBook(Integer id);
}
