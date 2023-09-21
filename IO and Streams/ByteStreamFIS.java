/*
	 ByteStreamClass
	 FileInputStream -> Reads from file, 
	 int read()
	 int read(byte [])
	 close()
*/
import java.io.*;
class ByteStreamFIS{
	public static void main(String a[]) throws IOException, FileNotFoundException
	{
		File f=new File("abc.txt");
		FileInputStream fis=new FileInputStream(f);
		int aa;
		while((aa=fis.read())!=-1)
			System.out.print((char)aa);
		fis.close();
	}
}