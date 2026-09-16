public class Product {

    // ================= Task1: 封装属性 =================
    // 使用 private 隐藏属性，保护数据安全
    private String productId;   // 商品编号
    private String productName; // 商品名称
    private double price;       // 商品价格

    // 提供 public 的 Getter/Setter 方法
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // ================= Task3: 静态成员变量 =================
    // 声明 private static int 记录总数，归属类本身
    private static int totalProductCount = 0;

    // ================= Task2: 构造器重载 =================

    // 1. 无参构造器
    public Product() {
        // 每创建一个对象（无论是无参还是有参），计数器都加 1
        totalProductCount++;
    }

    // 2. 全参构造器 (包含三个属性)
    public Product(String productId, String productName, double price) {
        // 使用 this 区分成员变量和局部变量
        this.productId = productId;
        this.productName = productName;
        this.price = price;

        // 每创建一个对象，计数器都加 1
        totalProductCount++;
    }

    // ================= Task3: 静态方法 =================
    // 提供静态方法，通过类名直接调用，返回创建的对象总数
    public static int getTotalCount() {
        return totalProductCount;
    }

    // 辅助方法：打印商品信息（方便 Task4 调用）
    public void printInfo() {
        System.out.println("商品信息: [" + productId + "] " + productName + ", 价格: " + price + "元");
    }

    // ================= Task4: main 方法测试 =================
    public static void main(String[] args) {
        // 1. 实例化两个不同的 Product 对象
        // 这里使用全参构造器创建，以满足示例输出
        Product p1 = new Product("P001", "机械键盘", 450.0);
        Product p2 = new Product("P002", "蓝牙耳机", 299.0);

        // 2. 调用实例方法打印信息
        p1.printInfo();
        p2.printInfo();

        // 3. 通过类名调用静态方法，打印总数
        System.out.println("系统当前共创建了 " + Product.getTotalCount() + " 个商品实例。");
    }
}