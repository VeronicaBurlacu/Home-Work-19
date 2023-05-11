package HomeWork19;

public class TaskN1HW19 {
    /* Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
Rectangle
Square

Use separate class to test your code*/
    int width;
    int length;

    void calculateArea(){
        System.out.println(width*4);
    }
void calculateArea2(){
    System.out.println((width*2)+(length*2));
}
TaskN1HW19(int length,int width){


        this.width=width;
        this.length=length;
}
public static void main (String []args){
        TaskN1HW19 task=new TaskN1HW19(4,5);
        task.calculateArea();
    System.out.println("We have a rectangle"+task);

        TaskN1HW19 ta=new TaskN1HW19(4,0);
        ta.calculateArea2();
    System.out.println("We have a square"+ta);
}
}
