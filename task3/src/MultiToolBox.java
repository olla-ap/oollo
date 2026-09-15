import java.util.Scanner;
public class MultiToolBox {

    public static void main(String[] args) {
        // ==========================================
        // 第一部分：任务1、任务2、任务3（图片1内容）
        // ==========================================
        System.out.println("========== 任务1、2、3 ==========");
        
        // Task1: 声明并初始化商品变量，计算总价
        String productName = "机械键盘";
        double unitPrice = 150.0;
        int stock = 50;
        boolean isPromotion = false;
        int purchaseQuantity = 2;
        double totalPrice = unitPrice * purchaseQuantity;

        // 打印商品信息
        System.out.printf("商品：%s，单价：%.1f元，促销中：%b，购买%d件，总价为：%.1f元\n",
                productName, unitPrice, isPromotion, purchaseQuantity, totalPrice);

        // Task2: 判断包邮条件（总价>=100 或 促销中）
        boolean isFreeShipping = (totalPrice >= 100.0) || isPromotion;
        System.out.println("是否享受包邮：" + isFreeShipping);

        // Task3: 变量交换挑战（不使用第三个临时变量，使用异或运算）
        int a = 10;
        int b = 20;
        System.out.println("交换前：a=" + a + ", b=" + b);
        
        // 异或交换法
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("交换后：a=" + a + ", b=" + b);
        System.out.println();

        // ==========================================
        // 第二部分：多功能工具箱（图片2、3内容）
        // ==========================================
        System.out.println("========== 多功能工具箱 ==========");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("【欢迎使用多功能工具箱】");
            System.out.print("请选择功能：");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // 成绩评定
                    System.out.print("请输入分数：");
                    int score = scanner.nextInt();
                    String gradeIfElse = getGradeByIfElse(score);
                    String gradeSwitch = getGradeBySwitch(score);
                    System.out.println("成绩评定（if-else）：" + gradeIfElse);
                    System.out.println("成绩评定（switch）：" + gradeSwitch);
                    break;

                case 2:
                    // 空心金字塔
                    System.out.print("请输入金字塔层数：");
                    int layers = scanner.nextInt();
                    printHollowPyramid(layers);
                    break;

                case 3:
                    // 递归计算阶乘
                    System.out.print("计算阶乘：");
                    int n = scanner.nextInt();
                    int result = calculateFactorial(n);
                    System.out.println("计算结果：" + result);
                    break;

                case 4:
                    // 退出
                    System.out.println("再见");
                    scanner.close();
                    return;

                default:
                    System.out.println("无效的选择，请重新输入。");
                    break;
            }
            System.out.println(); // 为了美观，每个功能结束后换行
        }
    }

    // --------------------------------------------------
    // Task4: 递归计算阶乘
    // --------------------------------------------------
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // --------------------------------------------------
    // 辅助方法：if-else 判断成绩
    // --------------------------------------------------
    public static String getGradeByIfElse(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // --------------------------------------------------
    // 辅助方法：switch 判断成绩（利用整除特性）
    // --------------------------------------------------
    public static String getGradeBySwitch(int score) {
        // 确保分数在合理范围内
        if (score < 0 || score > 100) return "无效分数";
        
        switch (score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    // --------------------------------------------------
    // 辅助方法：打印空心金字塔
    // --------------------------------------------------
    public static void printHollowPyramid(int layerCount) {
        // 外层循环控制行数
        for (int i = 1; i <= layerCount; i++) {
            // 1. 打印前导空格，让星星居中
            for (int j = 1; j <= layerCount - i; j++) {
                System.out.print("  "); // 为了对齐，使用两个空格
            }

            // 2. 打印星星和内部空格
            // 每一行的字符位置总数是 2 * i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                // 边界条件判断：
                // 第一行(i==1) 或 最后一行(i==layerCount) 全部打印星星
                // 每一行的首位置(k==1) 或 尾位置(k==2*i-1) 打印星星
                // 其余位置打印空格
                if (i == 1 || i == layerCount || k == 1 || k == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // 空心部分用空格填充
                }
            }
            // 换行
            System.out.println();
        }
    }
}