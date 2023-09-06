package Genericbag;

public class Application {

	public static void main(String[] args) 
	{
		Item<String> sb1 = new Item<String>("Saaki Vishnumolakala");
		
		Item<Integer> sb2 = new Item<Integer>(17);
		
		
		
		
		SmallBag<Item> sb3 = new SmallBag<Item>();
		
		sb3.setSmallBag(sb1);
		System.out.println(sb3.getSmallBag().getItem());
		
		sb3.setSmallBag(sb2);
		System.out.println(sb3.getSmallBag().getItem());
	}

}