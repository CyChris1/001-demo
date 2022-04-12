package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.BookDao;
import com.bjpowernode.entity.Book;
import com.bjpowernode.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Transactional
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;


    @Override
    public List<Book> queryBook(Integer bookid) {
      List<Book> books = bookDao.selectBookById(bookid);
      return books;
    }

    @Override
    public int deleteBook(Integer bookid) {

        int book= bookDao.deleteBookById(bookid);
        return book;
    }

    @Override
    public int updateBookById(Integer bookid, String bookname, String author, String publish,
                              Integer categoryid, String booklink, Integer price, Long deadline) {
      int nums =  bookDao.updateBook(bookid,bookname,author,publish,categoryid,booklink,price,deadline);
      return nums;
    }


    @Override
    public int insertBook(Integer bookid, String bookname, String author, String publish,
                          Integer categoryid, String booklink, Integer price, Long deadline) {
      int nums = bookDao.insertBook(bookid, bookname, author, publish, categoryid, booklink, price, deadline);
        return nums;
    }

}
