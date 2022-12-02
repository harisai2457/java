package infinite.Stock;


	import java.sql.SQLException;
	import java.util.List;
	public class Showstock {
		public static void main(String[] args) {
			StockDAO dao = new StockDAO();
			try {
				List<Stock> stockList = dao.showStock();
				for (Stock stock : stockList) {
					System.out.println(stock);
					
				}
					
			
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}


}

