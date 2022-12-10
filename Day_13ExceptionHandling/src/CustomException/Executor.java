package CustomException;
import java.util.Scanner;
public class Executor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		if(id!="skumbhalkar@tnsif.org" && password!="123abc")
		{
			throw new LoginCredentials(id, password);
	
		}

	}

}
