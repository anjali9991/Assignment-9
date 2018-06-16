import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class File1 {
	public static void main(String[] args)throws IOException
	{
		File f=new File("H://acadview//Files//abc.txt");
		f.createNewFile();
		FileReader fr=new FileReader(f);
		try {
			int current=fr.read();
			while(current!=-1)
			{
				System.out.print((char)current);
				current=fr.read();
			}
		}
		catch(IOException e)
		{
			System.out.println("e.getMessage()");
		}
		finally
		{
		fr.close();
		}
	}
}
