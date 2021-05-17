
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("lisa", "Smith", 25, 805);
		
		Employee employee = new Employee("lisa", "Smith", 25, 805, (long) 2000, 23);
		
		System.out.println(person);
		System.out.println("\n \n"+employee);
	}

}
