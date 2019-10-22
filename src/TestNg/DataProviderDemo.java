package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
@DataProvider(name="LoginText")
public Object[][] Log()
{
Object[][] data=new Object[2][2];
data[0][0]="admin";
data[0][1]="ad12";
data[1][0]="ad";
data[1][1]="ad1234";
//data[2][0]="adm";
//data[2][1]="a3412";

return data;
}

@Test(dataProvider="LoginText")
public void LoginDemo(String uname,String pass)
{
	System.out.println("User name is :-"+uname);
	System.out.println("Password is :-"+pass);
}
}
