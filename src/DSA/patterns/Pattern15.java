package DSA.patterns;

public class Pattern15 {
    public void solution(int n){
        for(int i =0; i< n; i++){
            for(char ch = 'A'; ch <= 'A' +(n-1-i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 4;
        Pattern15 pt = new Pattern15();
        pt.solution(N);
    }
}
