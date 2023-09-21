/*
	 ByteStreamClass
	 FileOutputStream -> Writes to file, 
	 write(int)
	 write(byte[])
	 flush()
	 close()
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class ByteStreamFOS{
	static FileOutputStream fos=null;
	public static void main(String a[]){
		File f=new File("abc.txt");
		try{
			fos=new FileOutputStream(f);
		}catch(FileNotFoundException e){
			
		}
		String str="I am storing into file using FOS under bytestream class";
		byte[] b=str.getBytes();
		try{
			fos.write(b);
			fos.flush();
			fos.close();
		}catch(IOException e)
		{	
		}
		System.out.println("Stored into file");
	}
}