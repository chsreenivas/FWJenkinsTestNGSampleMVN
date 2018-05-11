package Test2.test2;

import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.bussinessfunctions.BusinessFunctions;

public class Test2 extends Base{
  @Test
  public void loginTest() throws Exception {
  BusinessFunctions bp = new BusinessFunctions();
  bp.getURL();
  System.out.println("Test Case two with Thread Id:- "
			+ Thread.currentThread().getId());
  }
}
