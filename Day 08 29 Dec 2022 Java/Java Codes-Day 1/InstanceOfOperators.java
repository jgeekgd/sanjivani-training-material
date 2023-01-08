public class InstanceOfOperators{
    public static void main(String args[]) {
        Car c=new Car();
        Animal a=null;
        System.out.println(c instanceof Car);  
        System.out.println(a instanceof Animal);  
    }
}
class Car{
    
}
class Animal{
    
}


/*
O/P:

true
false

*/