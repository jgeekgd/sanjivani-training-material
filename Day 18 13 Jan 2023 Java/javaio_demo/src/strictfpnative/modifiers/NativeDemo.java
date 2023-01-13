package strictfpnative.modifiers;

/**
 * 
 * The native keyword in Java is applied to a method to indicate that the method
 * is implemented in native code using JNI (Java Native Interface). The native
 * keyword is a modifier that is applicable only for methods, and we can’t apply
 * it anywhere else. The methods which are implemented in C, C++ are called
 * native methods or foreign methods.
 * 
 * The native modifier indicates that a method is implemented in
 * platform-dependent code, often seen in C language. Native modifier indicates
 * that a method is implemented in platform-dependent code, often in C.
 * 
 * Main objectives of the native keyword
 * 
 * To improve the performance of the system.
 * 
 * To achieve machine level/memory level communication.
 * 
 * To use already existing legacy non-java code.
 *
 *
 * Steps for the creation of native methods are as follows:
 * 
 * 
 * 1. Write java code
 * 
 * 2. Compile the java code.
 * 
 * 3. Create C header(.h file)
 * 
 * 4. Create C stubs file (using tool: Java HEdge)
 * 
 * 5. Write C code
 * 
 * 6. Create a shared code library (DLL)
 * 
 * 7. Run application
 * 
 */

// Java Program to Illustrate Native Keyword
// Inside DLL named: NameOfDLLFile

public class NativeDemo {

//Refer this: http://blog.mwrobel.eu/how-to-call-dll-methods-from-java/#a_downloads
}

/**
 * 
 * https://www.geeksforgeeks.org/strictfp-keyword-java/
 * 
 * 
 * Some conclusions can be drawn from the above illustrations as follows:
 * 
 * When a class or an interface is declared with strictfp modifier, then all
 * methods declared in the class/interface, and all nested types declared in the
 * class, are implicitly strictfp. strictfp cannot be used with abstract
 * methods. However, it can be used with abstract classes/interfaces. Since
 * methods of an interface are implicitly abstract, strictfp cannot be used with
 * any method inside an interface. From Java 17 version, strictfp keyword is NOT
 * required explicitly as all floating point expressions are strictly evaluated
 * 
 * 
 */
