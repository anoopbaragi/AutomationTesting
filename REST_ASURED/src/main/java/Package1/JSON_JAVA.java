package Package1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON_JAVA 
{
	public static void main(String[] args) throws IOException 
	{
		ObjectMapper mapper = new ObjectMapper();
		Accounting accounting = mapper.readValue(new File("Data/Sample.json"), Accounting.class);
		System.out.println(accounting.getFirstName());
		System.out.println(accounting.getLastName());
		System.out.println(accounting.getAge());
		Sales sales = accounting.getSales();
		System.out.println("Sales Department Data");
		System.out.println(sales.getFirstName());
		System.out.println(sales.getLastName());
		System.out.println(sales.getAge());
	}
}