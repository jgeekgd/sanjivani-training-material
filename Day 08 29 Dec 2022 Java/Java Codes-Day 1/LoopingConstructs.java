public class LoopingConstructs{
    public static void main(String args[]) {
       
        //Assume jdk1 .....  while
        //for, do while again foreach....
        //Why so many loops?
        //Which one shall I prefer?
        
        //Evey loop has three things
        //    1. initialization
        //    2. temination condtion
        //    3. counter increment/decrement
        
        //whileLoop();
        //forLoop();
        doWhileLoop();  //foundation projects P0 starts
    }
    public static void whileLoop(){
        //Entry blocking loop,if condition do not meet for firs time the loop will not execute even once.
        
        int a=1; //initialization
        while(a<=10){
          System.out.println(a); //temination condtion
          a++; //counter increment/decrement
        }
        
        /*
        1. while they cant remove bcz existing app using it.
        2. while loop is very useful specially when you wan to run somthing infintly.
           e.g Web Servers rung 24x7 
           while(true){
               
           }
        */
    }
    
    public static void forLoop(){
        //Entry blocking loop,if condition do not meet for firs time the loop will not execute even once.
        
        // int a=1; //initialization
        // //80 lines;
        // for(;a<=10;){
        //   System.out.println(a); //temination condtion
        //   //30 lines;
        //   a++; //counter increment/decrement
        // }
        
        //1. all three things declared in one shot.
        //2. multiple initializations and multiple increament/decrement are easy.
        for(int a=1, b=10;a<=10;a++,b--){
          System.out.println(a+"----"+b); //temination condtion
          //30 lines;
        }
    }
    public static void doWhileLoop(){
        //Once the control goes into loop even if the condition fails for the very first time.
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while(a<=10);
        
        //These are more power and mostly used for MENU DRIVEN applications.
        //You need to check menu once even before exiting loop.
        
        a=1;
        do{
            System.out.println(">>>>>> Menus <<<<<<<");
            System.out.println(">>>>>> 1. Starters <<<<<<<");
            System.out.println(">>>>>> 2. Main Course  <<<<<<<");
            System.out.println(">>>>>> 3. Deserts  <<<<<<<");
            System.out.println(">>>>>> 4. Mocktails  <<<<<<<");
            System.out.println(">>>>>> 5. Exit  <<<<<<<");
            a++;
        }while(a<1);
    }
    
}
