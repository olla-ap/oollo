public class HelloWorld {
    public static void main(String[] args)
    {
        // 1.实例化greetingservice类
GreetingService service = new
        GreetingService();
        // 2.调用sayhello方法，上传一个名字参数

service.sayHello("World");
    }
    }