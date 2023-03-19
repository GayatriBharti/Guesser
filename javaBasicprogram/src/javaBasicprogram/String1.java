package javaBasicprogram;

public class String1 {
	public static void main(String []args)
	{
		String brand="gayatriparlour";
		System.out.println("welcome in my parlour");
		brand.concat("banguluru");             //string is immutable so its not concat value 
		System.out.println(brand);
		
		
		StringBuilder brand1=new StringBuilder("pwskills");  //stringbulider is mutable so its append the value
		brand1.append("bharti");
		System.out.println(brand1);
		
		
	}

}
