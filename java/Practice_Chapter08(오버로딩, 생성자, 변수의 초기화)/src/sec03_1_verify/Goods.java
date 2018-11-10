package sec03_1_verify;

public class Goods {

	
	String name;
	int price;
	int numberOfStock;
	int sold;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	Goods(String name,int price,int numberOfStock,int sold){
		
		this.name=name;
		this.price=price;
		this.numberOfStock=numberOfStock;
		this.sold=sold;
		
	}
	
	
	
}
