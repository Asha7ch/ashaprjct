package tmp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cart {
	
	@Test(dataProvider="getData")
	public void buyProductTest(String cata , String pNAme){
		System.out.println("cata==>"+cata +"Product name==>"+pNAme);
	}
	
	@DataProvider
	public Object[][] getData(){
		 Object[][] objArr = new Object[5][2];
		 
		 objArr[0][0]= "mobile";
		 objArr[0][1]= "apple-7";
		 
		 objArr[1][0]= "mobile";
		 objArr[1][1]= "samsung-7";
		 
		 objArr[2][0]= "tv";
		 objArr[2][1]= "samsung";
		 
		 objArr[3][0]= "tv";
		 objArr[3][1]= "sony";
		 
		 objArr[4][0]= "printer";
		 objArr[4][1]= "hp-printer";
		return objArr;
	}

}
