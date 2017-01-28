package ch.lazzaretti.exam;

/**
 * Created by fab on 21.12.2016.
 */
public class Main {
    public static void main(String args[]){
        Base a = new Sub();
        Sub b = new Sub();

        a.copyTo(b);

        System.out.println("Wert von a.name="+a.name);
        System.out.println("Wert von a.name="+a.getName());
        System.out.println("Wert von b.name="+b.name);
    }
}

class Base{
    protected String name = "Base";

    public String getName(){
        return name;
    }

    public void copyTo(Base other){
        other.name = name;
    }
}


class Sub extends Base{
    protected String name = "Sub";

    public String getName(){
        return name;
    }

    public void copyTo(Base other){
        other.name = name;
    }

    public void coptyTo(Sub other){
        other.name = name;
    }
}