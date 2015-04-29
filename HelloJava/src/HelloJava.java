public class HelloJava {
    public static void main(String[] args) {
    //同样都是用Say这个接口类型实例，却可以输出两个结果
        Say say = new SayHello();
        Tell tell1 = new SayHello();
        say.sayMessage();
        tell1.tellMessage();
        Say say1 = new SayHi();
        Tell tell2 = new SayHi();
        say1.sayMessage();
        tell2.tellMessage();
    }
}

//声明一个接口
interface Say {
    public void sayMessage();
}

//声明一个接口
interface Tell {
  public void tellMessage();
}

//两个实现类
class SayHello implements Say,Tell {
    public void sayMessage() {
        System.out.println("say hello");
    }
    
    public void tellMessage() {
        System.out.println("tell hello");
    }
}

class SayHi implements Say,Tell {
    public void sayMessage() {
        System.out.println("Say Hi");
    }
    
    public void tellMessage() {
        System.out.println("tell Hi");
    }
}
