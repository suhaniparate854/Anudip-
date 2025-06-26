public class Pattern2 {
      public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n-i; j++){
            System.out.print("*");
        }
            for(int j=1;j<=i;j++){
              System.out.println("");
        }
            System.out.println();
    }
    }
    
}
