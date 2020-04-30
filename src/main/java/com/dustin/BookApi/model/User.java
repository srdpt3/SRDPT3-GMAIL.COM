package com.dustin.BookApi.model;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String[] addr;
//
//    public User(int i, String user, String[] strings) {
////    }
//////
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddr() {
        return addr;
    }

    public void setAddr(String[] addr) {
        this.addr = addr;
    }


}
