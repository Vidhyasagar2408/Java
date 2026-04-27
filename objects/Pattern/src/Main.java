public class Main {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        System.out.println();
        pattern2(5);
        System.out.println();
        System.out.println();
        pattern3(5);
        System.out.println();
        System.out.println();
        pattern4(5);
        System.out.println();
        System.out.println();
        pattern5(5);
        System.out.println();
        System.out.println();
        pattern6(5);
        System.out.println();
        System.out.println();
        pattern7(5);
        System.out.println();
        System.out.println();
        pattern8(5);
        System.out.println();
        System.out.println();
        pattern9(5);
        System.out.println();
        System.out.println();
        pattern10(5);
        System.out.println();
        System.out.println();
        pattern11(5);
        System.out.println();
        System.out.println();
        pattern12(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
            for (int row = 1; row <= n ; row++) {
                for (int col = 1; col <= row ; col++) {
                    System.out.print(row+" ");
                }
                System.out.println();
            }
        }

    static void pattern7(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= n ; row++) {
            //space
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("  ");
            }
            //star
            for (int col = 1; col <= 2*row-1 ; col++) {
                System.out.print("* ");
            }
            //space
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int row = 1; row <= n ; row++) {
            //space
            for (int col = 1; col <= row-1 ; col++) {
                System.out.print("  ");
            }
            //start
            for (int col = 1; col <= 2*n-(2*row-1) ; col++) {
                System.out.print("* ");
            }
            //space
            for (int col = 1; col <= row-1 ; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        //combine pattern8 and pattern9
        pattern8(5);
        pattern9(5);
    }

    static void pattern11(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
            int stars = row;
            if (row > n) stars=2*n-row;
            for (int col = 1; col <= stars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        int start = 1;
        for (int row = 1; row <= n ; row++) {
            if (row % 2 == 0) start = 0;
            else start=1;
            for (int col = 1; col <= row ; col++) {
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }
    }

