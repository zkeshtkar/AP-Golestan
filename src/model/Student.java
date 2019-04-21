package model;

import java.util.ArrayList;

public class Student {
    private boolean F=false;
    private boolean M=true;
private String UserName;
    private String Name;
private String PassWord;
private String Credit;
private String NumCard;
private int passwordCard;
private int vahed=0;
private double mooadel=20;
public ArrayList<Double> ArreyScore= new ArrayList<Double>();
public ArrayList<String> ArreyNameClass= new ArrayList<String>();
public ArrayList<Integer>ArreyNameClassVahed= new ArrayList<Integer>();
public ArrayList<Integer>ArreyTime=new ArrayList<Integer>();
public ArrayList<Boolean>ArreyDay=new ArrayList<Boolean>();
public ArrayList<Book> ArreyB= new ArrayList<Book>();


public Student(String pas,String user,String name,String credit,char a)
{
    setCredit(credit);
    setPassWord(pas);
    setUserName(user);
    setName(name);
    if(a=='F' || a=='f')
    {
        F=true;
        M=false;
    }
    if(a=='M' || a=='m')
    {
        M=true;
        F=false;
    }
    //// warning bezaaaaaaaaaaaaaaaaaaaaaaaaaaaar
}
    public Student(String pas,String user,String name,char a)
    {
        setCredit("0");
        setPassWord(pas);
        setUserName(user);
        setName(name);
        if(a=='F' || a=='f')
        {
            F=true;
            M=false;
        }
        if(a=='M' || a=='m')
        {
            M=true;
            F=false;
        }
        //// warning bezaaaaaaaaaaaaaaaaaaaaaaaaaaaar
    }

    public boolean isF() {
        return F;
    }

    public boolean isM() {
        return M;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setVahed(int vahed) {
        this.vahed = vahed;
    }

    public int getVahed() {
        return vahed;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public void setUserName(String usreName) {
        UserName = usreName;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }

    public void setNumCard(String numCard) {
        NumCard = numCard;
    }

    public void setPasswordCard(int passwordCard) {
        this.passwordCard = passwordCard;
    }

    public String getUserName() {
        return UserName;
    }

    public int getPasswordCard() {
        return passwordCard;
    }

    public String getCredit() {
        return Credit;
    }

    public String getNumCard() {
        return NumCard;
    }

    public String getPassWord() {
        return PassWord;
    }
    public void increase(long money)
    {
        Credit+=money;
    }

    public double getMooadel() {
        return mooadel;
    }

    public void setMooadel(double mooadel) {
        this.mooadel = mooadel;
    }


}
