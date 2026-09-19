package DSA.patterns;


public class Pattern12 {
    public void pattern12(int n){
        int stat =1;
        for(int i =0; i <=n; i++){
            if(i % 2 ==0)
                stat =1;
            else stat =0;
            for(int j =0; j <=n-i; j++){
                System.out.print(stat);
                System.out.print(" ");
                stat = 1-stat;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N =4;
        Pattern12 pt = new Pattern12();
        pt.pattern12(N);
    }
}

