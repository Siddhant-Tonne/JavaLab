package com.example.test;
import java.util.*;
public class helper {
    String name;
    int number;
    Date date;

    helper(int number){
        contacts c = new contacts("",0);
        String check = c.check(number);
        if(check != null)
            this.name = check;
        else
            this.name = "Private caller";
        this.number = number;
        Calendar cal = Calendar.getInstance();
        this.date = cal.getTime();
    }

    public String toString(){
        return "Missed call by "+name+ " number "+number+" at "+date;
    }

}
