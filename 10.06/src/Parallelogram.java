interface IObject { 
} 

class Foo implements IObject{ 
} 

class Test extends Foo{ 
} 

public class Parallelogram { 
	public static void main(String[] args){ 
                test(); 
        } 

	public static void test(){ 
                IObject f=new Test(); 
                if(f instanceof java.lang.Object)System.out.println("true"); 
                if(f instanceof Foo)System.out.println("true"); 
                if(f instanceof Test)System.out.println("true"); 
                if(f instanceof IObject)System.out.println("true"); 
        } 
}