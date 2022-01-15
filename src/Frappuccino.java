
public class Frappuccino implements IItem{
	private String frappuccinoName; 
	private String frappuccinoSize;
	private int frappuccinoPrice;
	Frappuccino(String name, String size, int price){
		this.frappuccinoName = name;
		this.frappuccinoPrice = price;
		this.frappuccinoSize = size;
	}
	public String itemName() {
		return this.frappuccinoName;
	}
	public String itemType() {
		return "frappuccino";
	}
	public int itemPrice() {
		return this.frappuccinoPrice;
	}
	public String Size(){
		return this.frappuccinoSize;
	}
}
