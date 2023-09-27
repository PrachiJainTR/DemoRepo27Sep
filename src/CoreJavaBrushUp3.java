import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prachi Jain Automation";
		String s1= "Prachi Jain Automation";
		String S2= "Welcome";
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		//String[] splitedString = s.split(" ");
		//String[] splitedString = s.split("Jain");
		//System.out.println(splitedString[1].trim());
		for(int i=0; i<s.length();i++)				//print each char of string
		{
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--)			// reverse each char of string
		{
			System.out.println(s.charAt(i));
		}
	}

}
