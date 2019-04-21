package model;

import java.nio.file.Paths;
import java.util.ArrayList;

public class Profosser {
    private String UserName;
    private String PassWord;
   private boolean isMan=true;
    public   ArrayList<Class> ArreyClass= new ArrayList<Class>();
    //age chizi lazem dashti benevis mn yadam rafte shayad....
 public Profosser(String U,String P,char a)
    {
        UserName=U;
        PassWord=P;
        if(a=='f')
        {
            isMan=false;
        }
        else
        {
            isMan=true;
        }
    }

    public boolean isMan() {
        return isMan;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
