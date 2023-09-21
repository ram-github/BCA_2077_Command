/*

	CharacterStreamClass
	FileWriter -> Writes to file,
	write()	 
	write(int)
	write(char [])
	write(char [],int loc, int nchars)
	flush()
	close()
*/
import java.io.*;
class CharacterStreamFW{
	public static void main(String a[]) throws IOException
	{
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f);
		String str="I am storing into file using FW under characterstream class";
		fw.write(str);
		fw.flush();
		fw.close();
		System.out.println("Stored into file");
	}
}