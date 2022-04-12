package com.example.test;

import java.util.ArrayList;
import java.util.Iterator;

public class contacts {
    String name;
    int number;
    static ArrayList<contacts> al = new ArrayList<>();

    public contacts(String name,int number){
        this.name = name;
        this.number = number;
    }

    public void createContacts(){
        al.add(new contacts("p1",9234343));
        al.add(new contacts("p2",5436544));
        al.add(new contacts("p3",6643243));
        al.add(new contacts("p4",6324243));
        al.add(new contacts("p5",2345345));
    }

    public String check(int number){
        Iterator<contacts> i = al.iterator();
        while(i.hasNext()){
            contacts temp = i.next();
            if(temp.number == number){
                return temp.name;
            }
        }
        return null;
    }
}
