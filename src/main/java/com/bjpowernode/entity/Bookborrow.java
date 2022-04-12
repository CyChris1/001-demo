package com.bjpowernode.entity;


import io.swagger.models.auth.In;

public class Bookborrow {

 private Integer id;
 private Integer u_id;
 private Integer b_id;
 private String bookname;
 private String booklink;
 private Long borrowtime;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooklink() {
        return booklink;
    }

    public void setBooklink(String booklink) {
        this.booklink = booklink;
    }

    public Long getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Long borrowtime) {
        this.borrowtime = borrowtime;
    }

    @Override
    public String toString() {
        return "Bookborrow{" +
                "id=" + id +
                ", u_id=" + u_id +
                ", b_id=" + b_id +
                ", bookname='" + bookname + '\'' +
                ", booklink='" + booklink + '\'' +
                ", borrowtime=" + borrowtime +
                '}';
    }



}
