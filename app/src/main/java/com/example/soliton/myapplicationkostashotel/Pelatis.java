package com.example.soliton.myapplicationkostashotel;

/**
 * Created by User on 4/5/2017.
 */

public class Pelatis {

    String category;
    int stayDays;

    public Pelatis(String category, int stayDays) {
        this.category = category;
        this.stayDays = stayDays;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        this.stayDays = stayDays;
    }


    public Pelatis() {
    }

    @Override
    public String toString() {
        return "com.example.soliton.myapplicationkostashotel.Pelatis{" +
                "category='" + category + '\'' +
                ", stayDays=" + stayDays +
                '}';
    }


    public  double computeXreosi(){
        double xrewsh=0;
        if(category.equalsIgnoreCase("A"))
        {
            xrewsh=100;

        }
        else if(category.equalsIgnoreCase("B"))
        {
            xrewsh=80;
        }
        else if(category.equalsIgnoreCase("C"))
        {
            xrewsh=50;
        }
        else{
            xrewsh=20;

        }
        xrewsh=xrewsh*getStayDays();



        return xrewsh;
    }
}
