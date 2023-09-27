
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String s = d.getData();
		System.out.println(s);
		MethodsDemo2 d2 = new MethodsDemo2();
		String s2 = d2.getUserData();
		System.out.println(s2);
		getData1();								//no obj rq as method is static
	}
	
	public String getData()      //access specifier   return type    method name
	{
		System.out.println("Hello World");
		return "Hi World";
	}
	
	public static String getData1()      
	{
		System.out.println("Automation");
		return "Hi World";
	}
}

