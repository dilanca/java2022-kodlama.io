package interfaces;

import abstractDemo.SqlServerDatabaseManager;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new MySqlCustomerDal();

	}

}

//interfaceler de abstractlar gibi new'lenemezler.
//interface onu impelemente eden classýn referansýný tutabilir.
 
