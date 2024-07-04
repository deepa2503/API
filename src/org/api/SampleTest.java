package org.api;

import java.io.IOException;

public class SampleTest {
	
	public static void main (String[]args) throws IOException {
	HdfcBanking hdfc =  new HdfcBanking();
		hdfc.readDataFromDb();
		hdfc.setUsername("Deepa");
		hdfc.setPassword("deepa@123");
		String password = hdfc.getPassword();	
		hdfc.setBalance(1);
		int balance = hdfc.getBalance();
		System.out.println(balance);

}
}
