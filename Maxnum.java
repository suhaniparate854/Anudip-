public class Maxnum{
    public static void main(String[] args) {
        int a=25;
        int b=40;
        int c=15;

        int max;
        if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max=b;
        }
        else{
            max=c;
        }
        System.out.println("Maximum number is:" +max);
    }
 }