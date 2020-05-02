import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        NumberFormatException aaa = new NumberFormatException();
        aaa.calculate(x,y);

    }
    private void calculate(int x, int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x * y;
            int d = x/y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }
        catch (Exception e){
            System.out.println("NGoại lệ: " + e.getMessage());
        }
    }
}
