import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2= {1,2,4,5,6,7,8,16,64,122};
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]%2 ==0) {
			System.out.println(arr2[i]);
			
			//break;//
			}
			else 
			{
				System.out.println(arr2[i]+ " number is not multiply by 2");
			}
		}
		ArrayList<String> a= new ArrayList<String>();
		a.add("tareq");
		a.add("Is");
		a.add("Learning");
		a.add("Selenium");
		a.add("Taqi, Toha, Nabila");
		System.out.println(a.get(4));
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("@@@@@@@@@@");
		
		for(String val: a) {
			System.out.println(val);
			
		}
		//System.out.println(a.contains("Is"));
		
		String[] name= {"Toha", "Taqi", "Tareq", "Nabila"};
		System.out.println("****************************");
		List<String> nameArrayList=Arrays.asList(name);
		System.out.println(nameArrayList.contains("Taqi"));
	}

}
