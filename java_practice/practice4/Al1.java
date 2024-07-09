package practice4;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

//public class Al1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<String> color_list = new ArrayList<>(4);
//		color_list.add("White");
//		color_list.add("Black");
//		color_list.add("Red");
//		color_list.add("White");
//		System.out.println("***Color List***");
//		for(int i=0;i<4;i++) {
//			System.out.println(color_list.get(i).toString());
//			
//		}
//		ArrayList<String> sample = new ArrayList<>(3);
//		sample.add("Yellow");
//		sample.add("Red");
//		sample.add("White");
//		color_list.addAll(sample);
//		System.out.println("New size of the list is:" + color_list.size());
//		System.out.println("***Color List***");
//		for(int i=0;i<color_list.size();i++) {
//			System.out.println(color_list.get(i).toString());
//		}
//
//	}
//
//}

//Hash set
//public class Al1 {
//
//	public static void main(String[] args) {
//		HashSet<String> h = new HashSet<String>();
//		h.add("A");
//		h.add("Z");
//		h.add("D");
//		h.add("C");
//		h.add("C");
//		Iterator<String> itr = h.iterator();
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str);
//		}
//		System.out.print(h);
//		
//	}
//}


//Tree set
//public class Al1 {
//
//	public static void main(String[] args) {
//		TreeSet ts = new TreeSet();
//		ts.add("A");
//		ts.add("Z");
//		ts.add("D");
//		ts.add("C");
//		System.out.println(ts);
//		
//	}
//}

//CRUD operations-Create Read Update Delete

 class ShoppingCart {
	 ArrayList<String> name2 = new ArrayList<>();
	 ArrayList price2 = new ArrayList();
	 ArrayList id2 = new ArrayList();

    public void addItems(String name1, int price1, int id1) {
    	name2.add(name1);
    	price2.add(price1);
    	id2.add(id1);
    	
    }

    public void showAllItems() {
    	System.out.println("ID   "+"   Name   "+"   Price");
    	for(int i=0;i<name2.size();i++ ) {
    		System.out.println(id2.get(i)+ "      " +name2.get(i)+ "      " +price2.get(i));
    		
    	}
    }

    public void deleteItems(int id) {
        Iterator iterator = id2.iterator();
        while (iterator.hasNext()) {
            int currentId = (int) iterator.next();
            if (currentId == id) {
                int index = id2.indexOf(currentId);
                iterator.remove();
                name2.remove(index);
                price2.remove(index);
            }
        }
    }
//hasNext():This method returns true if there is at least one more element in the 
//collection being iterated, and it returns false otherwise.
//next():This method returns the next element in the collection being iterated.
//It is typically called after hasNext() to retrieve and process the next element.
    
  
    public void updateItems(int id, String field, String newV) {
    	Iterator iterator = id2.iterator();
        while (iterator.hasNext()) {
            int currentId = (int) iterator.next();
            if (currentId == id) {
            	
                if(field=="ID") {
                	
                }
                else if(field=="Name") {
                	
                }
                else if(field=="Price") {
                	
                }
            }
        }
    }
    
}




public class Al1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart t = new ShoppingCart();
        while(true) {
        System.out.println("Shopping menu driven program");
        System.out.println("1. Add Items");
        System.out.println("2. Show all items");
        System.out.println("3. Delete Items");
        System.out.println("4. Update items");
        System.out.println("5. Exit");
        System.out.println("Enter choice: ");
        
        int choice = sc.nextInt();
        if(choice==1) {
        	System.out.println("Name of product: ");
        	String name1= sc.next(); 
        	System.out.println("Price of the product: ");
        	int price1 = sc.nextInt();
        	System.out.println("Assign an ID number to the product: ");
        	int id1 = sc.nextInt();
        	t.addItems(name1,price1, id1);
        	System.out.println("Added to the Shop!");
        }
        else if(choice==2) {
        	
        	t.showAllItems();
        }
        else if(choice==3) {
        	t.showAllItems();
        	System.out.println("Enter the ID of the element to be deleted");
        	int id =sc.nextInt();
        	t.deleteItems(id);
        	System.out.println("Deleted the requested item/items.");
        	
        }
        else if(choice==4) {
        	t.showAllItems();
        	System.out.println("Enter the ID of the element to be updated");
        	int id =sc.nextInt();
        	System.out.println("Enter the field of the element to be updated");
        	String field = sc.next();
        	System.out.println("Enter the new value :");
        	String newV = sc.next();
        	t.updateItems(id, field, newV);
        }
        else if(choice==5) {
        	System.out.println("Thank you !");
        	System.exit(0);
        	
        }
        else {
        	System.out.println("Invalid choice");
        }
        }

    }
}