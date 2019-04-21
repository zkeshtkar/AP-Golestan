package model;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static FileWriter fileWriter;
    public static FileReader fileReader;
    private  String UserName="zahra";
    private  String PassWord="97243057";
    private boolean isWoman=true;
    public static ArrayList<Book> ArreyB= new ArrayList<Book>();
    public Admin(String U,String P,boolean chum)
    {
        PassWord=P;
        UserName=U;
        isWoman=chum;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public  void setPassWord(String passWord) throws IOException  {
        PassWord = passWord;
    }
    public  void setUserName(String userName) {
        UserName = userName;
    }

    public  String getPassWord() {
        return PassWord;
    }

    public  String getUserName() {
        return UserName;
    }
}
