package constructors;

class Main2 {
	  public static void main(String[] args) {
	    int i=16777217;
	    float f=16777216.0f;
	    double d=16777216.0;

	    if(i == f) {
	       System.out.println("i == f");
	       System.out.println("i:"+i);
	       System.out.println("i in float:"+(float)i);
	       System.out.println("f:"+f);
	    }
	    if(d == f) {
	       System.out.println("d == f");
	       System.out.println("d:"+d);
	       System.out.println("f:"+f);
	       System.out.println("d in float:"+(float)d);
	       System.out.println("f in double:"+(double)f);
	    }
	    if(i == d) {
	       System.out.println("i == d");
	    }
	  
	  
	    //https://stackoverflow.com/questions/4377842/how-can-i-convert-integer-into-float-in-java
	    
	    int x = 1111111111;
	    int y = 10000;
	    float ff = (float) x / y;
	    double dd = (double) x / y;
	    System.out.println("ff= "+ff);
	    System.out.println("dd= "+dd);
	  }
	  
	}
