import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay?");
        int a = sc.nextInt();
        System.out.println("Nhập số lãi suất theo tháng");
        double b = sc.nextDouble();
        System.out.println("Nhập số tháng bạn sẽ trả hết?");
        int c = sc.nextInt();
        double result = a * Math.pow((1 + b),c) - a;
        System.out.printf("Số tiền lãi suất theo tháng là: %f",result);
    }
}
