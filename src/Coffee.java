
public class Coffee implements IItem{
	private String coffeeName; 
	private String coffeeSize;
	private int coffeePrice;
	Coffee(String name, String size, int price){
		this.coffeeName = name;
		this.coffeePrice = price;
		this.coffeeSize = size;
	}
	public String itemName() {
		return this.coffeeName;
	}
	public String itemType() {
		return "Coffee";
	}
	public int itemPrice() {
		return this.coffeePrice;
	}
	public String Size(){
		return this.coffeeSize;
	}
	
}
