package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.BookMapper;
import com.blog.pojo.Book;
import com.blog.utils.TTResult;
@Service
public class BookServiceImpl implements BookService {
    
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public TTResult createBook(Book book) {

		bookMapper.insert(book);
		return TTResult.ok();
	}

	@Override
	public TTResult queryBook(Integer id) {
		TTResult t=TTResult.ok(bookMapper.selectByPrimaryKey(id));
		return t;
	}

}
