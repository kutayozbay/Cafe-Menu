
public class Bakery implements IItem{
	private String bakeryName; 
	private int calories;
	private int bakeryPrice;
	Bakery(String name,int cal, int price){
		this.bakeryName = name;
		this.bakeryPrice = price;
		this.calories = cal;
	}
	public String itemName() {
		return this.bakeryName;
	}
	public String itemType() {
		return "Bakery";
	}
	public int itemPrice() {
		return bakeryPrice;
	} 
	public int itemCal(){
		return this.calories;
	}
}
