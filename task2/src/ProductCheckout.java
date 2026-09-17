public class ProductCheckout {
    public static void main(String[] args) {
        // 声明变量与计算总价
        String productName = "机械键盘";
        double unitPrice = 150.0;
        int stock = 100; 
        boolean isPromotion = false;

        // 声明购买数量
        int purchaseQuantity = 2;
        
        // 计算总价
        double totalPrice = unitPrice * purchaseQuantity;

        // 打印商品基础信息 
        System.out.println("商品：" + productName + "，单价：" + unitPrice + "元，促销中：" + isPromotion + "，购买" + purchaseQuantity + "件，总价为：" + totalPrice + "元");

        // 逻辑运算符与包邮判定
        boolean isFreeShipping = (totalPrice >= 100) || isPromotion;
        
        // 打印包邮判定信息
        System.out.println("是否享受包邮：" + isFreeShipping);

        // 变量交换
        int a = 10;
        int b = 20;
        
        System.out.println("交换前：a=" + a + ", b=" + b);

        // 方法一：使用算术运算符 (加减法) —— 存在数值溢出风险
        a = a + b;
        b = a - b;
        a = a - b; 
       
        /* 
        // 方法二：使用位运算符 (异或 ^) 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        */

        System.out.println("交换后：a=" + a + ", b=" + b);
    }
}