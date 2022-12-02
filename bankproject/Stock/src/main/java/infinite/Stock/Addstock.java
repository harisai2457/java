package infinite.Stock;

import java.sql.SQLException;
import java.util.Scanner;

public class Addstock  {
	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		Stock stock=new Stock();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter item name");
		stock.setItemName(sc.next());
		System.out.println("enter price");
		stock.setPrice(sc.nextInt());
		System.out.println("enter quantityvail");
		stock.setQuantityAvail(sc.nextInt());
		try {
			System.out.println(new StockDAO().generatestockid());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
			
			
		}

			
		
		
		
		
		
		
		

		

		
		}
		

	}

		