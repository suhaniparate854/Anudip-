import java.util.*;
class Product{

    int product(){
        int a=10;
        int b=30;
        int multiplication= a*b;
        return multiplication;
    
    
    }
    Product(){
        System.out.println("this is constructor");
    }
    public static void main(String[] args){

    Product p1= new Product();
    int multiplication= p1.product();
    System.out.println(multiplication);
    }
}