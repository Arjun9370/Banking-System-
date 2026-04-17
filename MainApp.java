
import com.bank.model.Account;
import com.bank.service.BankingLogic;
import com.bank.dao.DataBase;
import com.bank.util.DBconnection;
import com.bank.threadHandling.Thread;
public class MainApp
{
	public static void main(String [] args)
	{
		Account a = new Account(112024610,"Arjun",2000.00);
		BankingLogic b = new BankingLogic();
		DataBase db = new DataBase();
		DBconnection DBC = new DBconnection();
		Thread t = new Thread();
		b.show();
		db.show();
		DBC.show();
		t.show();
		// database 
		db.show();
		// db.getAccount(2);
		// db.deposit(1, 5000);
		// db.withdraw(1, 200);
		// // System.out.println(balance);
		a.show();
		db.checkBalance(1);
	}
}