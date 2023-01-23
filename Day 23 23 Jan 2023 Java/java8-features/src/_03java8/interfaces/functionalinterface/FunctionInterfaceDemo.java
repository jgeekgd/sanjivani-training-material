package _03java8.interfaces.functionalinterface;

public class FunctionInterfaceDemo implements Chat{ 
	@Override
    public void sms(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	Chat chat = new FunctionInterfaceDemo();  
    	chat.sms("Hello there"); 
        System.out.println(chat);
        System.out.println(chat.hashCode());
        System.out.println(chat.equals(chat));
    }
}
@FunctionalInterface  
interface Chat{  
    void sms(String msg);   // abstract method
    //void sms2(String msg);   // this abstract method not allowed
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
