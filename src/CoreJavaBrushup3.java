
public class CoreJavaBrushup3 {

	

	public static void main(String[] args) {
		String s= "Rahul Shetty Academy";
		
		String[] splittedString=s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		//String[] splittedString=s.split("Academy ");
		System.out.println(splittedString[1].trim());//trim is using for remove space
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
//		
//	this for loop will print all character letter by letter// lecture-26  
		
//	print the String into the reverse order  $$
		
		
//		for (int i=s.length()-1; i>=0; i--);
//		{
//			System.out.println(s.charAt(i));
//			 
//		}
			
		
		
		

	}

}
