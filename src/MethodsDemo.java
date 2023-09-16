
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d= new MethodsDemo();
		d.getData();
		String name= d.getData();	
		System.out.println(name);
		MethodDemo2 d1= new MethodDemo2();
		d1.getUserData();
		
		String namedemo=d1.getUserData();
		System.out.println(d1.getUserData());
		getData2();
		

	}
	
	public String getData() {
		System.out.println("Hello Taqi");
		return "Taqi Toha";
	}
	//is there any way that i can get access to my own class without creating object. below answer
	//sometimes people use Static keyword if method is present there own class..
	
	public static String getData2() {
		System.out.println("Hello Muslim");
		return "muslim should know the Quran";
	}
	
}
