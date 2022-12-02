package infinite.Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNO;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNO = sc.nextInt();
		Bankdao dao = new Bankdao();
		try {
			Bank bank = dao.searchAccount(accountNO);
			System.out.println(bank);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
