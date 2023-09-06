package com.class12;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;

	Product() {
	}

	Product(int product_id, String prod_name, String prod_desc, int prod_quantity, double prod_price,
			LocalDate prodValidity) 
	{
		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prodValidity = prodValidity;
	}

	public int getProduct_id() {

		return product_id;

	}

	public void setProduct_id(int product_id) {

		this.product_id = product_id;

	}

	public String getProd_name() {

		return prod_name;

	}

	public void setProd_name(String prod_name) {

		this.prod_name = prod_name;

	}

	public String getProd_desc() {

		return prod_desc;

	}

	public void setProd_desc(String prod_desc) {

		this.prod_desc = prod_desc;

	}

	public int getProd_quantity() {

		return prod_quantity;

	}

	public void setProd_quantity(int prod_quantity) {

		this.prod_quantity = prod_quantity;

	}

	public double getProd_price() {

		return prod_price;

	}

	public void setProd_price(double prod_price) {

		this.prod_price = prod_price;

	}

	public LocalDate getProdValidity() {

		return prodValidity;

	}

	public void setProdValidity(LocalDate prodValidity) {

		this.prodValidity = prodValidity;

	}

	public static int indexOf(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void set(int index, Product p) {
		// TODO Auto-generated method stub
		
	}

}

interface ProductDAO {

	String nameOfProduct(Product p);
	int priceOfProduct(Product p);
	int quantityOfProduct(Product p);
	String descriptionOfProduct(Product p);
	LocalDate prodValidityDate(Product p);
	List<Product> getAllProducts();
	void deleteProduct(Product p);
	void updateProduct(Product p);

}

class ProductDAOImpl implements ProductDAO {
	List<Product> listOfProducts = new ArrayList<>();
	public ProductDAOImpl() {
		Product p1 = new Product(123, "A", "B", 10, 10.29, LocalDate.now());
		Product p2 = new Product(124, "C", "D", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		Product p3 = new Product(125, "E", "F", 30, 30.29, LocalDate.of(2020, Month.FEBRUARY, 20));
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
	}

	@Override

	public String nameOfProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_name();
		}
		return null;
	}

	@Override

	public int priceOfProduct(Product p) {
		return 0;
	}

	@Override

	public int quantityOfProduct(Product p) {
		return 0;
	}

	@Override

	public String descriptionOfProduct(Product p) {
		return null;
	}

	@Override

	public LocalDate prodValidityDate(Product p) {
		return null;
	}

	@Override

	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	@Override

	public void deleteProduct(Product p) {
		listOfProducts.remove(p);
	}

	@Override
	public void updateProduct(Product p) {
		Iterator<Product> itr = getAllProducts().iterator()		;
		while(itr.hasNext()) {
			Product p2 = itr.next();
			p2.setProd_name(p.getProd_name());
		}
	}

}

public class ProductDAOClass {

	public static void main(String[] args) {
		ProductDAOImpl obj = new ProductDAOImpl();
		Iterator<Product> itr1 = obj.getAllProducts().iterator();
		System.out.println("Size of the list is " + obj.getAllProducts().size());
		Product p = null;
		
		Product p2 = new Product(126,"G","H",20,20.28,LocalDate.of(2019, Month.APRIL, 30));
		obj.updateProduct(p2);
		while(itr1.hasNext()) {
			p=itr1.next();
		}
		for (Product p3 : obj.getAllProducts()) {
			//obj.deleteProduct(p);
			//obj.updateProduct(p);
			System.out.println("Product Id " + p3.product_id + " Product_name is " + p3.prod_name + " Product_desc is "
					+ p3.prod_desc + " Product_quantity is " + p3.prod_quantity + " Product_price is " + p3.prod_price
					+ " Product Validity is " + p3.prodValidity);
		//	obj.deleteProduct(p);
		//	afterDeleteProducts();
		}
		Iterator<Product> itr2 = obj.getAllProducts().iterator();
		while(itr2.hasNext()) {
			p=itr2.next();
			System.out.println(p.product_id + " " + p.prod_name);
		}
	}
	
	void afterDeleteProducts() {
		ProductDAOImpl obj = new ProductDAOImpl();
		if(null!= obj.getAllProducts()) {
			System.out.println("Inside After Delete");
			for (Product p : obj.getAllProducts()) {
				System.out.println("Product Id " + p.product_id + " Product_name is " + p.prod_name + " Product_desc is "
						+ p.prod_desc + " Product_quantity is " + p.prod_quantity + " Product_price is " + p.prod_price
						+ " Product Validity is " + p.prodValidity);
		}
	}
		else {
			System.out.println("List is empty");
			}
		}
//	static void afterDeleteProducts() {
//		ProductDAOImpl obj = new ProductDAOImpl();
//		if(null != obj.getAllProducts()) {
//			for(Product p : obj.getAllProducts()) {
//				System.out.println("Product Id " + p.product_id + " Product_name is " + p.prod_name + "Product_desc is "
//						+ p.prod_desc + " Product_quantity is " + p.prod_quantity + " Product_price is " + p.prod_price
//						+ " Product Validity is " + p.prodValidity);
//			}
//		}
//		else {
//			System.out.println("List is Empty");
//		}
//	}
}
