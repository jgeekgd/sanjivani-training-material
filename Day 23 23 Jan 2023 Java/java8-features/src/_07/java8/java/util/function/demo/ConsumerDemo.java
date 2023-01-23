package _07.java8.java.util.function.demo;

import java.util.function.Consumer;

class PrintStringWithoutSpace implements Consumer<String> {

	@Override
	public void accept(String val) {
		System.out.println(val.replaceAll("\\s+", ""));
	}
}

public class ConsumerDemo {

	public static void main(String[] args) {

		String sms = "There are legacy rule breaking changes in Java 8";
		Consumer<String> consumer = new PrintStringWithoutSpace();
		consumer.accept(sms);

		// Lambada Easy Way No Need to Write class and override method
		Consumer<String> smartConsumer = val -> System.out.println(val.replaceAll("\\s+", ""));
		smartConsumer.accept(sms);
	}
}
