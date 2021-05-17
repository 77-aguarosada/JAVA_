/**
 * Test
 */
/* public class Test {

    public static void main(String[] args) {
        
    }
} */


 import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class Student {

	
	String name;
	int date;

	
	public Student(String name, Integer date) {
		this.name = name;
		this.date = date;
	}

	public String getaddress() {
		return name;
	}

	public void setaddress(String name) {
		this.name= name;
	}

	public Integer getdate() {
		return date;
	}

	public void setdate(Integer date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Customer{" + "name=" +name + ",date=" +date + '}';
	}

	static class CustomerSortingComparator implements Comparator<Student> {

		@Override
		public int compare(Student customer1, Student customer2) {

		
			int addressCompare = customer1.getaddress() .compareTo(customer2.getaddress());
			int dateCompare = customer1.getdate().compareTo(customer2.getdate());

			
			if (addressCompare == 0) {
				return ((dateCompare  == 0) ? addressCompare : dateCompare );
			} else {
				return addressCompare;
			}
		}
	}

	public static void main(String[] args) {

		// create ArrayList to store Student
		List<Student> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Student obj1 = new Student("skkvgdsjkv", 27);
		Student obj2 = new Student("fdgd", 23);
		Student obj3 = new Student("hgfhfg", 37);
		Student obj4 = new Student("fdshdd", 22);
		Student obj5 = new Student("fgfnfg", 29);
		Student obj6 = new Student("fbdfb", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// before Sorting arraylist: iterate using Iterator
		Iterator<Student> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		
		Collections.sort(al, new CustomerSortingComparator());

		
		System.out.println("\n\nAfter Sorting:\n");
		for (Student customer : al) {
			System.out.println(customer);
		}
	}
} 
