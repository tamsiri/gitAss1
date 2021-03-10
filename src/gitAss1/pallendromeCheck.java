package gitAss1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class pallendromeCheck {
boolean temp;
public  boolean palCheck(String str) {
	String s= new StringBuffer(str).reverse().toString();
	System.out.println(s);
	if(s.equals(str)) {
		temp=true;
	}else
	{
	temp=false;	
	}
	
	return temp;
}
@Test
public void test1() {
	Assert.assertEquals(palCheck("RACECAR"), true);
	Assert.assertEquals(palCheck("ENGLISH"), false);
	Assert.assertEquals(palCheck("java"), false);
	
	
}

}	
