public class practicepattern2 {
    public static void main(String[] args) {
//while printing rows a well
        int row = 5;
        while (row > 0) {
            System.out.print("*");
            int i = 0;
            while (i < row - 1) {
                System.out.print("*");
                i++;

            }
            System.out.println();
            row--;
        }
//with a different approach, without printing rows
        int row2 = 5;
        while(row2>0){
            int j=0;
            while(j<=row2-1){
                System.out.print("*");
                j++;
            }System.out.println();
            row2--;

        }

//with a different approach, starting rows from 0
        int row3=0;
        while(row3<5){
            System.out.print("*");
            int k=5;
            while(k>row3+1){
                System.out.print("*");
                k--;
            }
            System.out.println();
            row3++;
        }
    }

}
