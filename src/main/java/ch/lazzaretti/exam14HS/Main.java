package ch.lazzaretti.exam14HS;

/**
 * Created by fab on 21.12.2016.
 */
public class Main {
    public static void main(String args[]){
        Base b = new Sub();
        b.print();


    }
}

class Base{
    void print(){
        System.out.println(getKind());
    }
    String getKind(){
        return "Base";
    }
}


class Sub extends Base {
    void print(){
        System.out.println(getKind());
        super.print();
    }
    String getKind(){
        return "Derivad";
    }
}