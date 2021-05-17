
public class Employee extends Person  {

	Long Salary;
	Integer workingHours;

	public Employee(String fname, String lname, Integer age, Integer id, Long salary, Integer workingHours) {
		super(fname, lname, age, id);
		Salary = salary;
		this.workingHours = workingHours;
	}
	
	public Employee(Person person, Long salary, Integer workingHours) {
		super(person);
		this.Salary = salary;
		this.workingHours = workingHours;
	}
	
	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		Salary = salary;
	}
	/**
	 * @return the workingHours
	 */
	public Integer getWorkingHours() {
		return workingHours;
	}
	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(Integer workingHours) {
		this.workingHours = workingHours;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [Salary=" + Salary + ", workingHours=" + workingHours +"  "+ super.toString()+ "]";
	}


	
	
}
