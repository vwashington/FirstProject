package ClassExample1;

public class Puppy2 {
	
	int puppyAge;

	   
	   public Puppy2(){
		   //This constructor has no parameters
		   String puppyName = "HotDog";
		   puppyAge = 1;
		   System.out.println("Passed Name is :" + puppyName );
	   }
	   
	   public Puppy2(String name){
	      // This constructor has one parameter, name.
		  // Also known as the overloaded constructor.
	      System.out.println("Passed Name is :" + name ); 
	   }
	   public void setAge( int age ){
	       puppyAge = age;
	   }

	   public int getAge( ){
	       System.out.println("Puppy's age is :" + puppyAge ); 
	       return puppyAge;
	   }
	   public static void main(String []args){
	      /* Object creation */
	      Puppy2 myPuppy = new Puppy2( "tommy" );
	      Puppy2 mySecondPuppy = new Puppy2(); // with no arguments

	      /* Call class method to set puppy's age */
	      myPuppy.setAge( 2 );
	      mySecondPuppy.setAge(4);

	      /* Call another class method to get puppy's age */
	      myPuppy.getAge( );
	      mySecondPuppy.getAge();

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPuppy.puppyAge );
	      System.out.println("Variable Value :" + mySecondPuppy.puppyAge );
	   }

}
