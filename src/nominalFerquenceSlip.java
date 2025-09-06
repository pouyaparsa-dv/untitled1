import java.util.Scanner;

public class nominalFerquenceSlip {
    nominalFerquenceSlip(){
        System.out.printf("\nnominalFerquenceSlip\n");
        System.out.print("pls print youre motor RPM ? ");
        Scanner input = new Scanner(System.in);
        double motorRpm= input.nextInt();
        double x= (1500 - motorRpm)/1500*50;
        System.out.printf("youre nominalFerquenceSlip : ");
        System.out.print(x);
    }
}
