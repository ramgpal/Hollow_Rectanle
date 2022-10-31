//Pattern - Hollow Rectangle
public class Main
{
    //function definition
	public static void Hollow_Rectangle(int row,int col) {
	    for(int i=1;i<=row;i++) { //for rows
	        for (int j=1;j<=col;j++) { //for columns
	  if(i==1 || i==row || j==1 || j==col) {
	       //for stars
	       System.out.print("*");
	  }
	  else
	   //for stars
	   System.out.print(" ");
	    }
	    //for newlines
	    System.out.println(); 
	   
	  
	} 
	    
	}
	public static void main(String[] args) {
	//function calling
		Hollow_Rectangle(4,5);
} 
    
}
