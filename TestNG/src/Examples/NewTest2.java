package Examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

}
