package infinite.Stock;

public class Stock {
	private String StockId;
	private String itemName;
	private int  Price;
	private int QuantityAvail;
	@Override
	public String toString() {
		return "Stock [StockId=" + StockId + ", itemName=" + itemName + ", Price=" + Price + ", QuantityAvail="
				+ QuantityAvail + "]";
	}
	public Stock(String stockId, String itemName, int price, int quantityAvail) {
	
		StockId = stockId;
		this.itemName = itemName;
		Price = price;
		QuantityAvail = quantityAvail;
	}
	public Stock() {
		
		// TODO Auto-generated constructor stub
	}
	public String getStockId() {
		return StockId;
	}
	public void setStockId(String string) {
		StockId = toString();
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	
}	
	