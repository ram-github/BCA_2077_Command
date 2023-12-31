/*
 * java.lang package contains classes and interfaces that are essential to java language as
 * Object- ultimate super classes of all classes in java
 * Thread- Multithreaded application
 * Throwable- Super class of all error and exceptions in java
 * Math- provides standard mathematical operations
 * String- represent and manipulate string
 * StringBuffer- represent and manipulate string buffer
 * Enum- enumeration types
 * Wrapper Classes- Class whose object wraps or contains primitive data types
 * 
 */
class MathClass1
{
	 public static void main(String[] args)     
    {    
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns  power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));       
           
    } 
}