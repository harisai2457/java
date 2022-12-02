package infinite.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDAO {
	Connection connection;
	PreparedStatement pst;
	public String generatestockid() throws ClassNotFoundException, SQLException {
		connection =ConnectionHelper.getConnection();
		String cmd="select max(stockId) sid from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		String stockid=rs.getString("sid");
		int id = Integer.parseInt(stockid.substring(1));
		id++;
		String sid = String.format("S%03d",id);
		//System.out.println(id);
		return sid;
	}
		public String addstock(Stock stock) throws ClassNotFoundException, SQLException {
			String stockid=generatestockid();
			String cmd="insert into stock(stockid,itemname,"
					+"price,quatityavail, "
					+" values(?,?,?,?)";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, stock.getStockId() );
			pst.setString(2, stock.getItemName() );
			pst.setDouble(3, stock.getPrice());
			pst.setInt(4,  stock.getQuantityAvail());
			pst.executeUpdate();
			
			return "stock Created";
			
		}
	public List<Stock> showStock() throws ClassNotFoundException, SQLException{
		List<Stock> stockList= new ArrayList<Stock>();
		connection = ConnectionHelper.getConnection();
		String cmd ="select * from Stock ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		Stock stock =null;
		while(rs.next()){
		stock = new Stock();
		stock.setStockId(rs.getString("stockid"));
		stock.setItemName(rs.getString("itemname"));
		stock.setPrice(rs.getInt("price"));
		
		stockList.add(stock);
		
		
		}
		return stockList;
	}
		public Stock searchStock(String stockid) throws ClassNotFoundException, SQLException{
			connection =ConnectionHelper.getConnection();
			String cmd="select * from Stock where stockid=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs=pst.executeQuery();
			Stock stock =null;
			if(rs.next()){
				stock = new Stock();
				stock.setStockId(rs.getString("stockid"));
				stock.setItemName(rs.getString("itemname"));
				stock.setPrice(rs.getInt("price"));
			}						
			return stock;

}
}
