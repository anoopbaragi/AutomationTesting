package Package1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounting 
{
	private String firstName;
    private String lastName;
    private int age;
    
    private Sales Sales;
    
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public Sales getSales() 
	{
		return Sales;
	}
	public void setSales(Sales sales)
	{
		Sales = sales;
	}
}
