import java.util.*;
public class helper{
    private String name;
    private long number;
    private Date date;

    public helper(String name,long number){
        this.name = name;
        this.number = number;
        Calendar cal = Calendar.getInstance();
        this.date = cal.getTime();
    }

    public long getNumber(){
        return this.number;
    }

    public String toString(){
        return this.name+" "+this.number+" at "+this.date;
    }
}