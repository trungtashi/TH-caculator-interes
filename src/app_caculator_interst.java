import java.util.Scanner;

public class app_caculator_interst {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest = 1;
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter interestment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interes rate in percentage: ");
        interest = scanner.nextDouble();

        double total_interes = 0;
        for( int i = 0; i < month; i++){
            total_interes = money * (interest/120/12) * month;
        }
        System.out.println("Total of interes: "+total_interes);


    }
}
