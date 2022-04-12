package com.bjpowernode.service;

import com.bjpowernode.entity.Book;
import com.bjpowernode.entity.User;

import java.util.List;

public interface BookService {
    List<Book> queryBook(Integer bookid);
    int deleteBook(Integer bookid);
    int updateBookById(Integer bookid, String bookname, String author, String publish,
                     Integer categoryid, String booklink, Integer price, Long deadline);
    int insertBook(Integer bookid, String bookname, String author, String publish,
                   Integer categoryid, String booklink, Integer price, Long deadline);
}
