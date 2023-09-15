package Test;

import java.sql.Array;

abstract class Animal {
    abstract void voice();

    abstract void colour();

}

class Lion extends Animal {
    void voice() {
        System.out.println("Roar");
    }

    @Override
    void colour() {
        System.out.println("gold");
    }


}

public class t1{
    public static void main(String args[]){
        Animal obj=new Lion();
        obj.voice();
        obj.colour();
    }
}
