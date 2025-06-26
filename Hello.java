import java.util.*;
class Hello{

    int add(){
        int a=10;
        int b=30;
        int sum= a+b;
        return sum;
    
    
    }
    Hello(){
        System.out.println("this is constructor");
    }
    public static void main(String[] args){

    Hello h1= new Hello();
    int sum = h1.add();
    System.out.println(sum);
    }
}