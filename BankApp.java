import java.util.Arrays;
import java.util.*;

class Employee{
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int id;
	private String name;
	private int salary;
}

public class BankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[1];
		while(true) {
			System.out.println("Select your choice");
			System.out.println("1 for Create");
			System.out.println("2 for Append");
			System.out.println("3 for Delete");
			System.out.println("4 for Update");
			System.out.println("5 for Search by Name");
			System.out.println("6 for Sort Ascending");
			System.out.println("7 for Sort Descending");
			System.out.println("8 for EXIT");
			int choice = sc.nextInt();
			if(choice == 8) {
				System.out.println("Quitting App!");
				break;
			}
			if(choice == 1) {
				System.out.println("Number of Entries?");
				int c = sc.nextInt();
				while(c!=0) {
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter salary");
					int sal = sc.nextInt();
					emp[emp.length-1] = new Employee(id, name, sal);
					emp = java.util.Arrays.copyOf(emp, emp.length+1);
					c-=1;
				}
				for(int i = 0; i<emp.length;i++)
					if(emp[i]!= null)
						System.out.println(emp[i].toString());
				
			}
			
			if(choice  == 2) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter salary");
				int sal = sc.nextInt();
				emp[emp.length-1] = new Employee(id, name, sal);
				emp = java.util.Arrays.copyOf(emp, emp.length+1);
				for(int i = 0; i<emp.length;i++)
					if(emp[i]!= null)
						System.out.println(emp[i].toString());
				
			}
			
			if(choice == 3) {
				Scanner scan = new Scanner(System.in);
				System.out.println("ID?");
				int id = scan.nextInt();

				  for (int i = 0; i < emp.length; i++) {
				       if (emp[i] != null && emp[i].getId() == id){
				           emp[i] = null;
				           System.out.println("Successfully Deleted");
				         break; 
				       }
				  }
				  for(int i = 0; i<emp.length;i++)
						if(emp[i]!= null)
							System.out.println(emp[i].toString());
					
			}
			if(choice == 4) {
				Scanner scan = new Scanner(System.in);
				System.out.println("ID, Name, Salary?");
				int id = scan.nextInt();

				  for (int i = 0; i < emp.length; i++) {
				       if (emp[i] != null && emp[i].getId() == id){
				           emp[i].setName(scan.next());
				           emp[i].setSalary(scan.nextInt());
				           System.out.println("Successfully Updated");
				         break; 
				       }
				  }
				  for(int i = 0; i<emp.length;i++)
						if(emp[i]!= null)
							System.out.println(emp[i].toString());
					
			}
			if(choice == 5) {
				Scanner scan = new Scanner(System.in);
				  System.out.println("Name");
				  String name = scan.nextLine();

				  for (int i = 0; i < emp.length; i++) {
				       if (emp[i] != null && emp[i].getName().equals(name)){
				           System.out.println(emp[i].toString());
				         break; 
				       }
				  }
			}
			if(choice == 6) {
				int id_list[] = new int[emp.length];
				  for (int i = 0; i < emp.length; i++) {
					  if(emp[i] != null)
						  id_list[i] = emp[i].getId();
				  }
				Arrays.sort(id_list);
				for(int iddd: id_list) {
					for (int i = 0; i < emp.length; i++) {
				       if (emp[i] != null && emp[i].getId() == iddd){
				           System.out.println(emp[i].toString()); 
				       }
				  }
				}
			}
			
			if(choice == 7) {
				int id_list[] = new int[emp.length];
				  for (int i = 0; i < emp.length; i++) {
					  if(emp[i] != null)
						  id_list[i] = emp[i].getId();
				  }
				Arrays.sort(id_list);
				for(int j = id_list.length-1; j>=0;j--) {
					for (int i = 0; i < emp.length; i++) {
				       if (emp[i] != null && emp[i].getId() == id_list[j]){
				           System.out.println(emp[i].toString()); 
				       }
				  }
				}
			}
			
		}
	}
}
