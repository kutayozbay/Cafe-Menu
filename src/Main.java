import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
	BinarySearchTree coffeeTree = new BinarySearchTree();
	BinarySearchTree teaTree = new BinarySearchTree();
	BinarySearchTree frappuccinoTree = new BinarySearchTree();
	BinarySearchTree bakeryTree = new BinarySearchTree();
	try {
		File file= new File("CENG112_HW4_CafeMenu.txt");
		Scanner reader=new Scanner(file);
		while (reader.hasNextLine()){
			String data= reader.nextLine();
			String[] dataList = data.split(",");
			System.out.println(dataList[0]);
			switch(dataList[0]){
			case("Coffee"):
				coffeeTree.insert(Integer.parseInt(dataList[2]));
				new Coffee (dataList[1], dataList[3],Integer.parseInt(dataList[2]));
				break;
			case("Tea"):
				teaTree.insert(Integer.parseInt(dataList[2]));
				new Tea(dataList[1], dataList[3],Integer.parseInt(dataList[2]));
				break;
			case("Frappuccino"):
				frappuccinoTree.insert(Integer.parseInt(dataList[2]));
				new Frappuccino(dataList[1], dataList[3],Integer.parseInt(dataList[2]));
				break;
			case("Bakery"):
				bakeryTree.insert(Integer.parseInt(dataList[2]));
				new Bakery(dataList[1], Integer.parseInt(dataList[3]),Integer.parseInt(dataList[2]));
				break;
			}
		}
		reader.close();
	}catch (FileNotFoundException e){
		System.out.println("An error occurred.");
	     e.printStackTrace();
		}
	System.out.print("Coffee Ascending Order: " );
	coffeeTree.inorder();
	System.out.println();
	System.out.print("Coffee Descending Order: ");
	coffeeTree.reverseorder();
	System.out.println();
	System.out.println("Min Coffee Price: " + coffeeTree.minValue(coffeeTree.root));
	System.out.println("Max Coffee Price: " + coffeeTree.maxValue(coffeeTree.root));
	System.out.print("Tea Ascending Order: " );
	teaTree.inorder();
	System.out.println();
	System.out.print("Tea Descending Order: " );
	teaTree.reverseorder();
	System.out.println();
	System.out.println("Min Tea Price: " + teaTree.minValue(teaTree.root));
	System.out.println("Max Tea Price: " + teaTree.maxValue(teaTree.root));
	System.out.print("Frappuccino Ascending Order: " );
	frappuccinoTree.inorder();
	System.out.println();
	System.out.print("Frappuccino Descending Order: " );
	frappuccinoTree.reverseorder();
	System.out.println();
	System.out.println("Min Frappuccino Price: " + frappuccinoTree.minValue(frappuccinoTree.root));
	System.out.println("MAx Frappuccino Price: " + frappuccinoTree.maxValue(frappuccinoTree.root));
	System.out.print("Bakery Ascending Order: " );
	bakeryTree.inorder();
	System.out.println();
	System.out.print("Bakery Descending Order: " );
	bakeryTree.reverseorder();
	System.out.println();
	System.out.println("Min Bakery Price: " + bakeryTree.minValue(bakeryTree.root));
	System.out.println("Max Bakery Price: " + bakeryTree.maxValue(bakeryTree.root));
	}
}
	