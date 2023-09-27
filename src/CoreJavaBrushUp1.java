
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String website = "Prachi Automation";
		char letter = 'a';
		double dec = 5.2;
		boolean flag = true;
		System.out.println(num + " is value stored in num variable");
		System.out.println("num is value stored in num variable");

		System.out.println("**********");

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int[] arr1 = { 1, 2, 3, 4, 5 };
		String[] name = { "ruchi", "rhea", "manu" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**********");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**********");

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("**********");

		for (int i : arr1) {
			System.out.println(i);
		}
		System.out.println("**********");

		for (String s : name) {
			System.out.println(s);
		}
	}

}
