package com.example.demo.service;


public interface setService {
    boolean setalias(String new_alias,int userID);
    boolean setname(String new_name,String old_name,int userID);
    boolean setgender(String gender,int userID);
    boolean setprofile(String profiledata,int userID);
    void setregion(String regioin,int userID);
    boolean setdateofbirth(String date, int userID);
}
