package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.pojo.Book;
import com.blog.service.BookService;
import com.blog.utils.TTResult;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
    @RequestMapping(value="/item/save",method=RequestMethod.POST)
    @ResponseBody
    private TTResult createBook(Book book){
    	TTResult result=bookService.createBook(book);
        return result;
    }
    //http://localhost:8080/Blog/query?id=2
    @RequestMapping(value="/query",method=RequestMethod.GET)
    @ResponseBody
    private TTResult queryBook(Integer id){
    	TTResult result=bookService.queryBook(id);
        return result;
    }
    
}
