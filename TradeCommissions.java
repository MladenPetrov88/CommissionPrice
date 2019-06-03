import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        if (city.equals("Sofia")) {
            if (sells >= 0 && sells <= 500) {
                commission = 0.05;
            } else if (sells > 500 && sells <= 1000) {
                commission = 0.07;
            } else if (sells > 1000 && sells <= 10000) {
                commission = 0.08;
            } else if (sells > 10000) {
                commission = 0.12;
            }
        }
        if (city.equals("Varna")) {
            if (sells >= 0 && sells <= 500) {
                commission = 0.045;
            } else if (sells > 500 && sells <= 1000) {
                commission = 0.075;
            } else if (sells > 1000 && sells <= 10000) {
                commission = 0.10;
            } else if (sells > 10000) {
                commission = 0.13;
            }
        }
        if (city.equals("Plovdiv")) {
            if (sells >= 0 && sells <= 500) {
                commission = 0.055;
            } else if (sells > 500 && sells <= 1000) {
                commission = 0.08;
            } else if (sells > 1000 && sells <= 10000) {
                commission = 0.12;
            } else if (sells > 10000) {
                commission = 0.145;
            }
        }
        if (sells >=0 && city.equals("Sofia") || sells>= 0 && city.equals("Plovdiv") || sells>= 0 && city.equals("Varna")){
            double commissionPrice = commission * sells;
            System.out.printf("%.2f", commissionPrice);
        } else {
            System.out.println("error");
        }
    }
}
