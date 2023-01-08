public class UnaryOperator {
    public static void main(String args[]) {
      int a=100;
      //System.out.println(++(++a));
      int b=++a;
            ++b;
      System.out.println(b);
          b=(++a);
          b--; 
      System.out.println(b);
      
      /*
      System.out.println((100)++);
      required: variable
      found:    value
      */
    }
}
