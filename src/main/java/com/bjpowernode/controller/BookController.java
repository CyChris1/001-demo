package com.bjpowernode.controller;

import com.bjpowernode.entity.Book;
import com.bjpowernode.entity.User;
import com.bjpowernode.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "书籍管理类")
@RestController
@Slf4j
public class BookController {

    @Resource
    private BookService bookService;

    @ApiOperation("增加书籍")
    @RequestMapping(value="/book/add",method={ RequestMethod.GET })
    @ResponseBody
    public int addBook(
            @ApiParam(name = "bookid", value = "图书编号", required = false) @RequestParam(value = "bookid", required = false) Integer bookid,
            @ApiParam(name = "bookname", value = "书名", required = false) @RequestParam(value = "bookname", required = false) String bookname,
            @ApiParam(name = "author", value = "作者", required = false) @RequestParam(value = "author", required = false) String author,
            @ApiParam(name = "publish", value = "出版社", required = false) @RequestParam(value = "publish", required = false) String publish,
            @ApiParam(name = "categoryid", value = "书籍类别", required = false) @RequestParam(value = "categoryid", required = false) Integer categoryid,
            @ApiParam(name = "booklink", value = "书籍链接", required = false) @RequestParam(value = "booklink", required = false) String booklink,
            @ApiParam(name = "price", value = "书籍价格", required = false) @RequestParam(value = "price", required = false) Integer price,
            @ApiParam(name = "deadline", value = "书籍到期日", required = false) @RequestParam(value = "deadline", required = false) Long deadline)
    {
        return bookService.insertBook(bookid, bookname, author, publish, categoryid, booklink, price, deadline);
    }


    @ApiOperation("根据Id查询课本")
    @GetMapping("/book/select")
    @ResponseBody
    public List<Book> selsetBookById(
            @ApiParam(name = "bookid", value = "书本ID", required = false) @RequestParam(value = "bookid", required = false) Integer bookid
    ){

        return  bookService.queryBook(bookid);

    }

    @ApiOperation("根据Id删除书本")
    @GetMapping("book/delete")
    @ResponseBody
    public int deleteUserById(
            @ApiParam(name = "bookid", value = "书本ID", required = false) @RequestParam(value = "bookid", required = false) Integer bookid
    ){

        return  bookService.deleteBook(bookid);

    }

    @ApiOperation("修改书本信息")
    @RequestMapping(value="/book/update",method={ RequestMethod.GET })
    @ResponseBody
    public int updateUser(
            @ApiParam(name = "bookid", value = "图书编号", required = false) @RequestParam(value = "bookid", required = false) Integer bookid,
            @ApiParam(name = "bookname", value = "书名", required = false) @RequestParam(value = "bookname", required = false) String bookname,
            @ApiParam(name = "author", value = "作者", required = false) @RequestParam(value = "author", required = false) String author,
            @ApiParam(name = "publish", value = "出版社", required = false) @RequestParam(value = "publish", required = false) String publish,
            @ApiParam(name = "categoryid", value = "书籍类别", required = false) @RequestParam(value = "categoryid", required = false) Integer categoryid,
            @ApiParam(name = "booklink", value = "书籍链接", required = false) @RequestParam(value = "booklink", required = false) String booklink,
            @ApiParam(name = "price", value = "书籍价格", required = false) @RequestParam(value = "price", required = false) Integer price,
            @ApiParam(name = "deadline", value = "书籍到期日", required = false) @RequestParam(value = "deadline", required = false) Long deadline)

    {
        return  bookService.updateBookById(bookid, bookname, author, publish, categoryid, booklink, price, deadline);
    }

    @PostMapping("/book")
    public Book book(){

        return new Book();
    }


}
