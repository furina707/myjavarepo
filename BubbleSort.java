//冒泡排序演示程序
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("请输入数组大小：");
        int size = sc.nextInt();
        
        System.out.print("请输入随机数范围 (1-?):");
        int range = sc.nextInt();
        
        int a[] = new int[size];
        getElemnts(a, range);
        
        System.out.println("\n排序前:");
        print(a);
        
        sort(a);
        
        System.out.println("排序后：");
        print(a);
        
        sc.close();
    }

    private static void sort(int a[]) {
        int i, j, t;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    private static void getElemnts(int a[], int range) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(range) + 1;
        }
    }

    private static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d ", a[i]);
        }
        System.out.println();
    }
}
