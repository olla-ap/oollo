public class ProductTask {
    public static void main(String[] args) {
        // ================= Task 1: 声明并初始化商品变量 =================
        String productName = "机械键盘";
        double unitPrice = 150.0;
        int stock = 10; // 库存，题目没有硬性要求怎么用，但需要声明
        boolean isPromotion = false; // 促销状态
        int buyQuantity = 2; // 购买数量

        // 计算总价
        double totalPrice = unitPrice * buyQuantity;

        // 打印基础商品信息（严格对照示例输出格式）
        System.out.println("商品：" + productName + "，单价：" + unitPrice + "元，促销中：" + isPromotion + "，购买" + buyQuantity + "件，总价为：" + totalPrice + "元");

        // ================= Task 2: 判断是否包邮 =================
        // 条件：总价 >= 100 元 或 促销中
        boolean isFreeShipping = (totalPrice >= 100) || isPromotion;
        System.out.println("是否享受包邮：" + isFreeShipping);

        // ================= Task 3: 变量交换挑战 =================
        int a = 10;
        int b = 20;

        System.out.println("交换前：a=" + a + ", b=" + b);

        // 核心挑战：不依赖第三个临时变量，使用算术运算符（加减法）完成交换
        a = a + b; // a 变成了 10 + 20 = 30
        b = a - b; // b 变成了 30 - 20 = 10 （成功拿到原来的 a 值）
        a = a - b; // a 变成了 30 - 10 = 20 （成功拿到原来的 b 值）

        System.out.println("交换后：a=" + a + ", b=" + b);
    }
}
