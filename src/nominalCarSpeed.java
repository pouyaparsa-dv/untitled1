import java.util.Scanner;

public class nominalCarSpeed {
    nominalCarSpeed(){
        System.out.print("youre model asynchrounus print 1 or synchronus print 2 ? ");
        Scanner input = new Scanner(System.in);
        int model = input.nextInt();
        System.out.printf(" ");
        if (model==1){
            System.out.printf("nominal car speed induction");
            System.out.print("enter youre motor RPM : ");
            double motorRPM = input.nextInt();
            System.out.printf("");
            System.out.printf("enter youre D Motor Router : ");
            double drive = input.nextInt();
            System.out.printf("");
            System.out.print("enter youre ?:1 : ");
            double choice = input.nextInt();
            System.out.print("enter youre induction ?:1 : ");
            double choicee = input.nextInt();
            System.out.printf("");
            System.out.print("youre nominal car speed : ");
            double p = 3.14;
            double x = (motorRPM / 60) * (drive / 100) * p /choice/choicee;
            System.out.print(x);
            return;
        }else{
            System.out.println("nominal car speed synchronus");
            System.out.print("enter youre motor RPM : ");
            double motorRPM = input.nextInt();
            System.out.printf("");
            System.out.printf("enter youre D Motor Router : ");
            double drive = input.nextInt();
            System.out.printf("");
            System.out.print("enter youre ?:1 : ");
            double choice = input.nextInt();
            System.out.printf("");
            System.out.print("youre nominal car speed : ");
            double p = 3.14;
            double x = (motorRPM / 60) * (drive / 100) * p /choice;
            System.out.print(x);
            return;
        }

    }
}
