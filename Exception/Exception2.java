
class Exception2{
	public static void main(String ar[])
	{
		int[] arr=new int[10];
		try{
			try{
				System.out.println(arr[15]);
			}catch(NullPointerException e){
				System.out.println("NullPointerException Handled");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}	
		System.out.println("Back To Normal Execution");		
	}
}


