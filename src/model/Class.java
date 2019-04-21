package model;

import java.util.ArrayList;

public class Class {
    private String NameLesson;
    private int Vahed;
    public   boolean [] ArrayDay=new boolean[5];
    private String Time;
    private int Sanse;
    private int Zarfiyat;
    public String []PishNiyaz=new String[3];
    public Class(String nameLesson,int vahed,int zarfiyat,int sanse,String one,String two,String three,boolean [] arrayDay)
    {
        NameLesson=nameLesson;
        Vahed=vahed;
        Zarfiyat=zarfiyat;
        Sanse=sanse;
        PishNiyaz[0]=one;
        PishNiyaz[1]=two;
        PishNiyaz[2]=three;
        for(int i=0;i<5;i++)
        {
            ArrayDay[i]=arrayDay[i];
        }

    }


    public int getSanse() {
        return Sanse;
    }

    public void setSanse(int sanse) {
        Sanse = sanse;
    }

    public int getVahed() {
        return Vahed;
    }

    public int getZarfiyat() {
        return Zarfiyat;
    }



    public String getTime() {
        return Time;
    }

    public String getNameLesson() {
        return NameLesson;
    }
    public void setNameLesson(String nameLesson) {
        NameLesson = nameLesson;
    }
    public void setTime(String time) {
        Time = time;
    }

    public void setVahed(int vahed) {
        Vahed = vahed;
    }

    public void setZarfiyat(int zarfiyat) {
        Zarfiyat = zarfiyat;
    }
}
