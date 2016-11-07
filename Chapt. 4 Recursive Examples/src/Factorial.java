
public class Factorial {

	public static String indent="";
	
	public static int factorial(int n)
	// Precondition: n is non-negative
	//
	// Returns the value of "n!".
	{
	  int retValue;	
	  System.out.println(indent + "Enter factorial " + n);
	  indent = indent + "  ";
	  
	  if (n == 0)		  
		  retValue= 1;          // Base case
	  else
		  retValue= (n * factorial(n-1));     // General case

	  indent = indent.substring(2);
	  System.out.println(indent + "Return " + retValue);
	  
	  return retValue;
	} 

	public static int sum(int n)
	// Precondition: n is non-negative
	//
	// Returns the value of "n!".
	{
	  if (n<=0)
		  return -1;
	  
	  int retValue;	
	  System.out.println(indent + "Enter sum " + n);
	  indent = indent + "  ";
	  
	  if (n == 1)		  
		  retValue= 1;          // Base case
	  else
		  retValue= (n + sum(n-1));     // General case

	  indent = indent.substring(2);
	  System.out.println(indent + "Return " + retValue);
	  
	  return retValue;
	} 

	public static int bipower(int n)
	// Precondition: n is non-negative
	//
	// Returns the value of "n!".
	{
	  if (n<=0)
		  return -1;
	  
	  int retValue;	
	  System.out.println(indent + "Enter bipower " + n);
	  indent = indent + "  ";
	  
	  if (n == 1)		  
		  retValue= 2;          // Base case
	  else
		  retValue= (2 * bipower(n-1));     // General case

	  indent = indent.substring(2);
	  System.out.println(indent + "Return " + retValue);
	  
	  return retValue;
	} 

	public static int timesFive(int n)
	// Precondition: n is non-negative
	//
	// Returns the value of "n!".
	{
	  if (n<0)
		  return -1;
	  
	  int retValue;	
	  System.out.println(indent + "Enter timesFive " + n);
	  indent = indent + "  ";
	  
	  if (n == 0)		  
		  retValue= 0;          // Base case
	  else
		  retValue= (5 + timesFive(n-1));     // General case

	  indent = indent.substring(2);
	  System.out.println(indent + "Return " + retValue);
	  
	  return retValue;
	} 

}
