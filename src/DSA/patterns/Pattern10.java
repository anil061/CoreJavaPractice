package DSA.patterns;

import java.sql.SQLOutput;

public class Pattern10 {
    public void pattern10(int n){
        for(int i =0; i< n; i++)
        {
            for(int j =0 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i < n; i++)
        {
            for(int j = 0; j <= n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
  int N =5;
  Pattern10 pt = new Pattern10();
  pt.pattern10(N);
    }
}
