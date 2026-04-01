//成绩等级评估器
import java.util.Scanner;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入成绩 (0-100): ");
        if (!s.hasNextInt()) {
            System.out.println("错误：请输入整数！");
            s.close();
            return;
        }
        int sc = s.nextInt();
        String g = switch (sc / 10) {
            case 10 -> "满分！优秀";
            case 9 -> "优秀";
            case 8 -> "良好";
            case 7 -> "中等";
            case 6 -> "及格";
            default -> "不及格";
        };
        System.out.println("成绩：" + sc + " 分 → 等级：" + g);
        s.close();
    }
}