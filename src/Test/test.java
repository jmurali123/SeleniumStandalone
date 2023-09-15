package Test;

import javax.swing.plaf.synth.SynthTextAreaUI;

class staticclass {

     int nonstaticVariable;
static int staticVariable;


    static void staticmethod() {

        System.out.println(staticVariable);
    }
    void nonStaticMethod(){
        System.out.println(staticVariable);
        System.out.println(nonstaticVariable);
    }
}

     class test{

        public static void main(String args[]){
            staticclass.staticVariable=10;
            staticclass.staticmethod();
            staticclass a1=new staticclass();
            System.out.println(a1.nonstaticVariable);
            System.out.println(a1.staticVariable);
        }
    }

