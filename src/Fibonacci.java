public class Fibonacci {

    static int calculateResult(int n) {
        /*long num1 = 0;
        long num2 = 1;
        long sum = 0;

        for(long count = 1; count <= n; count++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;


        }

         */
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci Series of "+n);
        int sumOfPrevTwo = 0;
        for (int i = 1; i <= n; ++i)
        {
            System.out.println(num1+" ");

            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return sumOfPrevTwo;

    }

}
