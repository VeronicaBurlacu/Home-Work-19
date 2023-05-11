package HomeWork19;

import java.lang.reflect.Method;

public class TaskN4 {
     TaskN4(int a, int b, int c, int d,int r) {

    }

    /*Create 1 class with a private method that has 3 overloaded forms.
         Then call each overloaded method with specific arguments and observe result.
         */
    private int  MethodTest(int a,int b,int d){

        return a*b+d;

    }
    private int MethodTest(int a,int b, int c, int d){
        return a+b/c+d;
    }
    private int MethodTest(int a, int b,int c,int d,int r){
        return a+b+c+d+r;
    }
}
class Tester{
    public static void main(String[] args) {


    }


//can not access it
}
