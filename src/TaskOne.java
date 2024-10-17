import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first temp, please :");
        double temp1 = scan.nextDouble();

        System.out.println("enter the second temp, please :");
        double temp2 = scan.nextDouble();

       boolean isWorking = checkDevice(temp1,temp2);
        System.out.println("does device is working? The answer is " + isWorking);

    }


    public static boolean checkDevice (double temp1, double temp2){
        return temp1 > 100 && temp2 < 100;
    }
}