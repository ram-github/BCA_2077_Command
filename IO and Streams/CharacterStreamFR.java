/*
	 CharacterStreamClass
	 FileReader -> Reads from file, 
	 int read()
	 int read(char [])
	 int read(char [],int loc, int nchar)
	 close()
*/
import java.io.*;
class CharacterStreamFR{
	public static void main(String a[]) throws IOException, FileNotFoundException
	{
		File f=new File("abc.txt");
		FileReader fr=new FileReader (f);
		int aa;
		while((aa=fr.read())!=-1)
			System.out.print((char)aa);
		fr.close();
	}
}