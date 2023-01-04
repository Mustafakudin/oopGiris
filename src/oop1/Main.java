package oop1;

public class Main {

	public static void main(String[] args) {

		// java bir object orianted bir proglama dili nesne yönelimli yanii
		// Ne işe yarar :  
		// class demek bir nesene o nesnenin özellik tutuculu bir diğeride operasyon tutucalr var classta
		// class bir şablon gibi düşün bizim product diye bir nesnemz var içinde özellik tutmak istiyoruz
		String mesaj = "Vade Oranı ";
		// STRİNG = VERİ TİPİ , Product veri tipi böyle de tanımmlanır  Product tip product1 değişken
		Product product1 =new Product(); // bi class böyle tanımlanır
		
	
						// YAZMAK İÇİN SET OKUMAK İÇİN GET
						// Set value değişken atama
		product1.setName("Delongi Kahve makinesi");   //product1.name="Delongi Kahve Makinesi ";
		product1.setUnitPrice(7500);				  //product1.unitPrice=7500;
		product1.setUnitInStock(3);					  //product1.unitInStock=3;
		product1.setDiscount(7);					  //product1.discount=7;
		product1.setImageUrl("bilmem.jpg");			  //product1.imageUrl="bilmem.jpg"; video 1.44.00
					
						// get read okumak 
		//System.out.println(product1.name);
		
		
		Product product2 =new Product();
		product2.setName("Simple Kahve makinesi"); 
		product2.setUnitPrice(4500);
		product2.setUnitInStock(2);
		product2.setDiscount(5);
		product2.setImageUrl("bilmem2.jpg");
		
		Product product3 =new Product();
		product3.setName("Kitchen Aid Kahve makinesi"); 
		product3.setUnitPrice(9500);
		product3.setUnitInStock(7);
		product3.setDiscount(8);
		product3.setImageUrl("bilmem3.jpg");
		
		Product[] products= {product1,product2,product3}; // array varsa for da vardır 
		for (Product product : products) { // products sen git hepsini gez ilk prod1 gez suslu parantez işlemleri yap sonra prod2 gez vs vs
			System.out.println(product.getName());//System.out.println(product.name);
			
			}
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setId(1);
		individualCustomer.setPhone("055555555");
		individualCustomer.setFirsttName("Mustafa");
		individualCustomer.setLastName("Kudin");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();  // class yani nesneyi tanımlama işlemi yaptık
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("KudinHol");
		corporateCustomer.setPhone("05444444444");
		corporateCustomer.setTaxNumber("1111111111111");
		corporateCustomer.setCustomerNumber("1231124");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};  // hata almamızım nedeni individual veya corporate customerı referans tutar
		
		for (Customer customer:customers) {
				System.out.println(customer.getCustomerNumber());
		}
	}

}
