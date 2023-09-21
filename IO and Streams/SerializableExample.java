//Serialization
import java.io.*;
import java.lang.*;
class Employee implements Serializable{
	String name;
	int Id;
	Employee(int Id,String name){
		this.name=name;
		this.Id=Id;
	}
}
class SerializableExample{
	public static void main(String a[]) throws IOException,FileNotFoundException
	{
		File f=new File("Emp.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(1,"Rupak");
		oos.writeObject(e);
		System.out.print("Stored as bytestream");
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
	}
}
class DeserializableExample{
	public static void main(String a[]) throws IOException,FileNotFoundException, ClassNotFoundException
	{
		File f=new File("Emp.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		System.out.print("Name: "+e.name+" Id: "+e.Id);
		ois.close();
		fis.close();
	}
}