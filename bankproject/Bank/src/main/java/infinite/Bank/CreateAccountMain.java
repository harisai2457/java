package infinite.Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		Bankdao dao = new Bankdao();
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName ");
		bank.setFirstName(sc.next());
		System.out.println("Enter LastName ");
		bank.setLastName(sc.next());
		System.out.println("Enter City ");
		bank.setCity(sc.next());
		System.out.println("Enter State ");
		bank.setState(sc.next());
		System.out.println("Enter amount ");
		bank.setAmount(sc.nextInt());
		System.out.println("Enter checkFacil  (yes/no)");
		bank.setCheqFacil(sc.next());
		System.out.println("Enter AccountType ");
		bank.setAccountType(sc.next());
		
		try {
			System.out.println(dao.createAccount(bank));
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
