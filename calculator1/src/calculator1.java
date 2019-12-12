public class calculator1{
    static int a = 20;       //not-static variable in side the class outside method
    static int b = 30; //static variable in side the class outside method
     // No return type-No parameters
    public void m1(){
        System.out.println(a);    //instance variable
        System.out.println(b);     //instance variable
    }
       // NO return type-With parameters
    public static void addition (int a, int b) {
        System.out.print("ADDITON of " + a + " and " + b + " = ");
        System.out.println(a + b);
    }
       // No return type-With parameters
    public static void subtraction ( int a, int b){
        System.out.print("SUBTRATION of "+a+" and "+b+ " = ");
        System.out.println( a-b );
    }
      // NO return type-With parameters
    public static void multiplication ( int a, int b){
        System.out.print("MULTIPLICATION OF "+a+" and "+b+" = ");
        System.out.println( a*b );
    }
      // No return type-With parameters
    public static void division ( int a, int b) {
        System.out.print("DIVISION of " + a + "and" + b + " = ");
        System.out.println(a / b);
    }
      // NO return type-No parameters
    public static void addition(){
        System.out.print("Addition of "+a+" and " +b+ "=" );
        System.out.println(a+b);
    }

       // Main method
    public static void main(String[] args){

        String company = "TFL";       // Declared local variable
        System.out.println(company);
        addition(40, 20);     // Declared static method 'addition'
        subtraction(50, 20);   // Declared static method 'subtraction'
        multiplication(20, 20);    // Declare static method 'multiplication'
        division( 40, 20 );      // Declare static method 'division'
        System.out.println(b);      // Declare variable 'b'
        addition();
    }

}
