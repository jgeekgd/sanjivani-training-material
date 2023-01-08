public class TernaryOperator {
    public static void main(String args[]) {
      int age=10;
      String discount=null;
      if(age<18) 
        discount="12%";
      else 
        discount="5%";
      System.out.println(discount);
      
      String newYearDiscount=(age<18)?"12%":"5%";
      System.out.println(newYearDiscount); 
    }
}
