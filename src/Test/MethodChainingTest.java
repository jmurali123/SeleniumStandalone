package Test;

public class MethodChainingTest {

    MethodChainingTest method1(){
        System.out.println("method1");
        return this;
    }

    MethodChainingTest method2(){
       System.out.println("method2");
        return this;
    }
    MethodChainingTest method3(){
        System.out.println("method3");
        return this;
    }
}
