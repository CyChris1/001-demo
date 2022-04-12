package com.bjpowernode.mapper;

import com.bjpowernode.entity.Book;
import com.bjpowernode.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookDao {
    List<Book> selectBookById(@Param("stusId") Integer bookid);

    int deleteBookById(@Param("stuId") Integer bookid);

    int updateBook(@Param("bbookid") Integer bookid,
                   @Param("bbookname") String bookname,
                   @Param("bauthor") String author,
                   @Param("bpublish") String publish,
                   @Param("bcategoryid") Integer categoryid,
                   @Param("bbooklink") String booklink,
                   @Param("bprice") Integer price,
                   @Param("bdeadline") Long deadline
    );

    int insertBook(Integer bookid, String bookname, String author, String publish,
                   Integer categoryid, String booklink, Integer price, Long deadline);
}
