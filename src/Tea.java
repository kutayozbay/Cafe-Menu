
public class Tea implements IItem{
	private String teaName; 
	private String teaSize;
	private int teaPrice;
	Tea(String name, String size,int price){
		this.teaName = name;
		this.teaSize = size;
		this.teaPrice = price;
	}
	public String itemName() {
		return this.teaName;
	}
	public String itemType() {
		return "Tea";
	}
	public int itemPrice() {
		return this.teaPrice;
	}
	public String Size(){
		return this.teaSize;
	}
}
