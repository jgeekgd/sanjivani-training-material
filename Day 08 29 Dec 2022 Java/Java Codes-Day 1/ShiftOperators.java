public class ShiftOperators{
    public static void main(String args[]) {
        System.out.println("LEFT SHIFT:");  
        int m = 1 << 3;   // In binary: 1 to 1000
        System.out.println(m);  // Prints "8"
        int n = 1 << 8;   // In binary: 1 to 100000000
        System.out.println(n);  // Prints "256"
        int o = 2 << 3;   // In binary: 10 to 10000
        System.out.println(o);  // Prints "16"
        int p = 13 << 1;  // In binary: 1101 to 11010
        System.out.println(p);  // Prints "26"
        
        System.out.println("RIGHT SHIFT:");  
        m = 8 >> 3;    // In binary: 1000 to 1
        System.out.println(m);  // Prints "1"
        n = 256 >> 6;  // In binary: 100000000 to 100 
        System.out.println(n);  // Prints "4"
        o = 16 >> 3;   // In binary: 10000 to 10 
        System.out.println(o);  // Prints "2"
        p = 26 >> 1;   // In binary: 11010 to 1101 
        System.out.println(p);  // Prints "13"
    }
}
/*
LEFT SHIFT:
Each shift to the left doubles the number, therefore each left shift multiplies the original number by 2. 
1 << 3
2=1*2
4=2*2
8=4*2

RIGHT SHIFT:
Each shift to the right halves the number, therefore each right shift divides the original number by 2. 
*/