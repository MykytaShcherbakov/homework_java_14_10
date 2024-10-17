import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money do you what to draw? ");
        int N = scan.nextInt();

        int result = countDays(N);
        System.out.println("result = " + result);
    }

    public static int countDays (int N){
        int days = 0;
        while (N > 1) {
            for (int i = N / 2; i > 0; i--) {
                if (N % i == 0) {
                    N -= i;
                    days++;
                    break;
                }
            }
        }
        if (N == 1){
            days++;
        }
        return days;
    }
}
