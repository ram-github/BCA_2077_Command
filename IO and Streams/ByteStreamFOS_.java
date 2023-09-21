/*
	 ByteStreamClass
	 FileOutputStream -> Writes to file, 
	 write(int)
	 write(byte[])
	 flush()
	 close()
*/
import java.io.*;
class ByteStreamFOS_{
	public static void main(String a[]) throws IOException,FileNotFoundException
	{
		File f=new File("abc_.txt");
		FileOutputStream fos=new FileOutputStream(f);
		String str="I am storing into file using FOS under bytestream class";
		byte[] b=str.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Stored into file");
	}
}