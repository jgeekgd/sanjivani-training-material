package accessing.environment.variables;

import java.util.Map;

//https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getProperties--
//One can also modify the existing set of system properties, using System.setProperties() method. 

public class AccessingEnvironmentVariables {
	public static void main(String[] args) {
		for (Map.Entry<?, ?> e : System.getProperties().entrySet()) {
			System.out.println(String.format("%s = %s", e.getKey(), e.getValue()));
		}
	}
}
