class MathClass2    
{    
    public static void main(String[] args)     
    {    
        double a = 30;    
        // converting values to degree    
        double b = Math.toDegrees(a);  
		// converting values to radians    
        double c = Math.toRadians(a);		
		System.out.println(a+" "+b);
        // return the trigonometric sine of a      
        System.out.println("Sine value of a is: " +Math.sin(c));     
        // return the trigonometric cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cos(a));   
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tan(a));   
        System.out.println("Absolute value is: " +Math.abs(-10.05));    
        System.out.println("Absolute value is: " +Math.abs(10.05));  
		System.out.println("Round value is: " +Math.round(-10.05));    
        System.out.println("Round value is: " +Math.round(10.05));
		System.out.println("Cube root value is: " +Math.cbrt(27));    
        System.out.println("Ceiling value is: " +Math.ceil(10.05));		
		System.out.println("Ceiling value is: " +Math.ceil(10.55));	
		System.out.println("Floor value is: " +Math.floor(10.05));
		System.out.println("Floor value is: " +Math.floor(10.55));				
    }    
} 