package infinite.Stock;
import java.sql.SQLException;
import java.util.Scanner;



public class Searchstock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stockid;
		System.out.println("Enter stock id ");
		stockid= sc.next();
		StockDAO dao = new StockDAO();
		try {
			Stock stock =dao.searchStock(stockid);
			if(stock!=null){
				System.out.println(stock);
			}else {
				System.out.println("**** Record Not Found*****");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}}


