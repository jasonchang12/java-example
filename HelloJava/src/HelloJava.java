public class HelloJava {
    public static void main(String[] args) {
    //ͬ��������Say����ӿ�����ʵ����ȴ��������������
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

//����һ���ӿ�
interface Say {
    public void sayMessage();
}

//����һ���ӿ�
interface Tell {
  public void tellMessage();
}

//����ʵ����
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
