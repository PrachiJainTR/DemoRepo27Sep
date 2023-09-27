import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6,7,8,9,10,122};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				break; 							// to find atleast 1 multiple of 2(if found 1 no need to proceed just break)
			}
			else
			{
				System.out.println(arr[i] + " is not multiple of 2");
			}
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);						//add()
		al.add(6);
		al.add(7);
		System.out.println(al);
		System.out.println(al.get(1));  //get() : to get or call or extract any value: get with help of index
		al.remove(1);					//remove()
		System.out.println(al);
		
		for(int i=0; i<al.size();i++)
		{	
			System.out.println(al.get(i));
		}
		System.out.println("**********");
		for(Integer a:al)				//Enhanced for loop for ArrayList
		{
			System.out.println(a);
		}
		System.out.println(al.contains(5));	//contains()
		
		String[] arr1 = {"ruchi","rhea","manu"};
		List<String> al1 = Arrays.asList(arr1);       		//to convert array to ArrayList. but store in List on ArrayList else need to typecaste this converted List to ArrayList 1st
		System.out.println(al1.contains("ruchi"));          //To check if got converted correctly
	}

}
