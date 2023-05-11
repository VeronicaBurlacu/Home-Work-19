package HomeWork19;

import static HomeWork19.TaskN3.Method;

public class TaskN3 {



    /*Create 1 class with a static method that has 3 overloaded forms.
         Then call each overloaded method with specific arguments and observe result.
         */
   static int Method(int a,int b){
       return a+b;

    }
    static int Method(int a,int b,int c){
     return a+b+c;
    }
    static int Method(int a,int b,int c,int d){
        return a+b+c+d;
    }


    public void TaskN3() {

    }
}
class TaskN3Tester{
    public static void main(String[] args) {
        int x=Method( 3,5,8,9);
        System.out.println(x);
    }
}






