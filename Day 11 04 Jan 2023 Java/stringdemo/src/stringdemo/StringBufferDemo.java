package stringdemo;

public class StringBufferDemo {
	public static void main(String[] args) {

		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("Hi\n");
		stringBuffer.append("Hi\n");
		stringBuffer.append("Hi\n");
		stringBuffer.append("Hi\n");
		
		System.out.println(stringBuffer.toString());
		
		//Use this one--->
		
		StringBuilder builder=new StringBuilder();
		builder.append("Bye\n");
		builder.append("Bye\n");
		System.out.println(builder.toString());
		
	}
}
