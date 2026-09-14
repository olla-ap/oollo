import java.util.Scanner;

public class Toolbox {
    
    //递归计算阶乘的独立方法
    public int calculateFactorial(int n) {
        if (n < 0) return -1; // 处理非法输入
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Toolbox toolbox = new Toolbox();
        Scanner scanner = new Scanner(System.in);

        //系统菜单与循环控制
        while (true) {
            System.out.println("\n=== 🧰 多功能工具箱 ===");
            System.out.println("1. 成绩评定");
            System.out.println("2. 空心金字塔");
            System.out.println("3. 递归阶乘");
            System.out.println("4. 退出系统");
            System.out.print("请输入您的选择: ");

            int choice = scanner.nextInt();

            //当输入4时使用 break 跳出循环并结束程序
            if (choice == 4) {
                System.out.println("感谢使用，再见！👋");
                break;
            }

            switch (choice) {
                
                case 1:
                    //成绩评定
                    System.out.print("请输入0-100的分数: ");
                    int score = scanner.nextInt();
                    
                    if (score < 0 || score > 100) {
                        System.out.println("❌ 分数无效，请输入0-100之间的整数！");
                        break;
                    }

                    //区间判断
                    String resultIfElse;
                    if (score >= 90) {
                        resultIfElse = "A";
                    } else if (score >= 80) {
                        resultIfElse = "B";
                    } else if (score >= 70) {
                        resultIfElse = "C";
                    } else if (score >= 60) {
                        resultIfElse = "D";
                    } else {
                        resultIfElse = "E";
                    }
                    System.out.println("👉 if-else 判定结果: " + resultIfElse);
                    break;

                case 2:
                    //空心金字塔
                    System.out.print("请输入金字塔的层数: ");
                    int rows = scanner.nextInt();
                    if (rows <= 0) {
                        System.out.println("❌ 层数必须大于0！");
                        break;
                    }

                    //嵌套 for 循环打印空心金字塔
                    for (int i = 1; i <= rows; i++) {                     
                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print(" ");
                        }                      
                        if (i == 1 || i == rows) {                           
                            for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.print("*");
                            }
                        } else {                       
                            System.out.print("*"); //行首
                            for (int k = 1; k <= 2 * i - 3; k++) {
                                System.out.print(" "); //内部空心
                            }
                            System.out.print("*"); //行尾
                        }
                        // 换行
                        System.out.println();
                    }
                    break;

                case 3:
                    //递归阶乘
                    System.out.print("请输入要计算阶乘的整数n: ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("❌ 阶乘不支持负数！");
                    } else {
                        int fact = toolbox.calculateFactorial(n);
                        System.out.println("👉 " + n + " 的阶乘为: " + fact);
                    }
                    break;

                default:
                    System.out.println("❌ 无效的选择，请输入1-4之间的数字！");
                    break;
            }
        }
        scanner.close();
    }
}