import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("количество этажей");
        int H = scan.nextInt();
        System.out.println("подъем на N этажей");
        int N = scan.nextInt();
        System.out.println("спуск на M этажей");
        int M = scan.nextInt();


        System.out.println("количество подъёмов =  " + numberOfLifts(H, N, M));
    }

    public static int numberOfLifts (int floor, int stepsUp, int stepsDown){
        int currentFloor = 0;
        int lifts = 0;

        while (currentFloor < floor){
            lifts++;
            currentFloor += stepsUp;
            if (currentFloor >= floor){
                break;
            }
            currentFloor -= stepsDown;
        }
        return lifts;
    }
}
