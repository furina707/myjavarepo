//一次性输入三条边，计算三角形的周长、面积和类型。
import java.util.Scanner;

public class Triangle1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("输入三条边长（空格分隔）：");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            System.out.printf("周长：%.2f，面积：%.2f\n", a + b + c, Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            System.out.println("类型：" + (a == b && b == c ? "等边" : a == b || a == c || b == c ? "等腰" : "一般"));
        } else System.out.println("无法构成三角形");
    }
}