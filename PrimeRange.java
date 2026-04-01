//输出指定范围内的所有质数（素数）
import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        boolean f = true;
        int c = 0;
        System.out.println("请输入两个参数:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        for (int i = a; i <= b; i++) {
            f = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0)
                    f = false;
            if (f) {
                c++;
                System.out.print(i + " ");
                if (c % 10 == 0)
                    System.out.println();
            }
        }
    }
}