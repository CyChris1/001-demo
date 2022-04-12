package com.bjpowernode.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("书本实体类")
public class Book {
    @ApiModelProperty("书本id")
    private Integer bookid;
    @ApiModelProperty("书名")
    private String bookname;
    @ApiModelProperty("作者名")
    private String author;
    @ApiModelProperty("出版社")
    private String publish;
    @ApiModelProperty("书籍类别")
    private Integer categoryid;
    @ApiModelProperty("书籍链接")
    private String booklink;
    @ApiModelProperty("书籍价格")
    private Integer price;
    @ApiModelProperty("书籍到期日")
    private Long deadline;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getBooklink() {
        return booklink;
    }

    public void setBooklink(String booklink) {
        this.booklink = booklink;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", categoryid=" + categoryid +
                ", booklink='" + booklink + '\'' +
                ", price=" + price +
                ", deadline=" + deadline +
                '}';
    }
}
