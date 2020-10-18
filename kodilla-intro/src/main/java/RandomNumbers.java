import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random ();
                int result = 0;
        int sum = 0;
        int min = 30;
        int max = 0;
        while (sum <= 5001) {
            int temp = r.nextInt (31) ;
           sum = sum + temp;
           result++;
            if (temp >= max) {
                max = temp;
                System.out.println("maksymalna wylosowana to " + " " + max);
            }
            if (temp <= min) {
                min = temp;
                System.out.println("minimalna wylosowana to " + " " + min);
            }


        }
       // int [] tabela = new int[result];
        System.out.println(result);


    }


}
