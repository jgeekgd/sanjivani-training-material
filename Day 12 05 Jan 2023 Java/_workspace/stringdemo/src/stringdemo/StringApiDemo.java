package stringdemo;

public class StringApiDemo {

	public static void main(String[] args) {
		String sms = "  Thi s is my empior and my world. I love freedom.     ";
		System.out.println("CHARACTERS: "+sms.length());
		System.out.println("WORDS: "+sms.split(" ").length);
		//System.out.println("SENTENCES: "+ sms.split(".").length); need to write regex
		int countSpace = countSpace(sms);
		System.out.println("SPACES: "+countSpace);
		System.out.println("OLD: \""+sms+"\"");
		System.out.println("TRIM: \""+sms.trim()+"\"");
		System.out.println("TRIM WORD COUNT: \""+sms.trim().split(" ").length+"\"");
		
		
		
	}

	public static int countSpace(String sms) {
		int countSpace=0;
		
		char [] allChars=sms.toCharArray();
		for (int i = 0; i < allChars.length; i++) {
			if(allChars[i]==' ') countSpace++;
		}
		return countSpace;
	}

}
