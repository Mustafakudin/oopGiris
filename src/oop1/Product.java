package oop1;


//PascalCase 	isimlendirme standartı kelimelerin ilk harfleri büyk
public class Product { // ürünü tanımlayabilecek ortam hazırlıyoruz 
	private String name;
	// camelCase  fieldlar camelCase yazılır
	//private sadece o class içinde kullanılır sonra get seti ayrı ayrı yazarak dişarıya açmalıyız set yazdırmak get okumak 
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitInStock;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	 
	
	
	

}
