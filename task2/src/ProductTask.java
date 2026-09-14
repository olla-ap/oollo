public class ProductTask {
    public static void main(String[] args) {
        //声明并初始化商品变量
        String productName = "机械键盘";
        double unitPrice = 150.0;
        int stock = 10; //库存
        boolean isPromotion = false; //促销状态
        int buyQuantity = 2; //购买数量

        //计算总价
        double totalPrice = unitPrice * buyQuantity;

        //打印基础商品信息
        System.out.println("商品：" + productName + "，单价：" + unitPrice + "元，促销中：" + isPromotion + "，购买" + buyQuantity + "件，总价为：" + totalPrice + "元");
        
        //判断是否包邮
        boolean isFreeShipping = (totalPrice >= 100) || isPromotion;
        System.out.println("是否享受包邮：" + isFreeShipping);

        //变量交换
        int a = 10;
        int b = 20;

        System.out.println("交换前：a=" + a + ", b=" + b);

    
        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("交换后：a=" + a + ", b=" + b);
    }
}
