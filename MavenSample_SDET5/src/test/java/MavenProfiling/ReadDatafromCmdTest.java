package MavenProfiling;
import org.testng.annotations.Test;

public class ReadDatafromCmdTest {
	
	@Test(groups="smoke")
	public void readData() {
		
		System.out.println("read Data from CommandLine");
		System.out.println("Executing Poll SCM");
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

@Test(groups="regression")
public void testdata() {
	
	System.out.println("read data from cmd");
}
	
	
}
