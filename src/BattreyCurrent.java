import java.util.Scanner;

public class BattreyCurrent {
    BattreyCurrent() {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter youre motor rated current : ");
        double x = input.nextDouble();
        double y = x/3;
        System.out.println("");
        System.out.print("youre Battrey current : ");
        System.out.println(y);
    }
}
