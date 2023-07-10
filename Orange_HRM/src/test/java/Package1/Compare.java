package Package1;

import static org.testng.Assert.assertEquals;

public class Compare extends Configaration
{
	public void Compare_Usernames()
	{
		assertEquals(User_Name_1, User_Name);
	}
}
