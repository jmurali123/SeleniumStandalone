package Test;

import java.util.ArrayList;

enum Directions{
    EAST,WEST,NORTH,SOUTH
}
public class P19 {

    public static void main(String args[]){
    try{
        System.out.println(2.0/0);
    }
    catch(ArithmeticException e){
        System.out.println("exce");
    }
    }
}
