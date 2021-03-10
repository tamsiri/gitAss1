package gitAss1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class checkSubstringPresent {
boolean temp;
	public boolean subStringPresent(String s,String sub) {
		
	if(s.toUpperCase().contains(sub.toUpperCase())){
		temp=true;
	}else {
		temp=false;
	}

		return temp;
	}


@Test
public void check() {
Assert.assertEquals(subStringPresent("JAVACODE","JAVA"),true);	
Assert.assertEquals(subStringPresent("SELENIUM","JAVA"),false);
}
}