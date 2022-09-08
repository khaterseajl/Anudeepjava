package helllow1;  
//WAP to create methods for add,sub,mul,div?
public class MethodDemo {
    static void printmsg()
    {
    	System.out.println("hello we are learning method+class");
    }
    static void add(int a,int b)
    {
    	System.out.println("hope we will learn well: "+(a+b));
    }
    static void sub(int a,int b)
    {
    	System.out.println("hope we will learn well: "+(a-b));
    }
    static void mul(int a,int b)
    {
    	System.out.println("hope we will learn well: "+(a*b));
    }
    static void div(int a,int b)
    {
    	System.out.println("hope we will learn well: "+(a/b));
    }
    public static void main(String[] args)
    {
    	printmsg();
    	add(10,20);
    	sub(10,20);
    	mul(10,20);
    	div(10,20);
    }
}
