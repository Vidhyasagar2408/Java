public class RecursiveSum {
    public static void main(String[] args) {
        //sum of n numbers using parameters
        int n = 5;
        fparameter(n,0);
        System.out.println(ffunctional(5));
    }
    static void fparameter(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        fparameter(i-1,sum+i);
    }
    static int ffunctional(int n){
        if (n==0) return 0;
        return n+ffunctional(n-1);
    }
}