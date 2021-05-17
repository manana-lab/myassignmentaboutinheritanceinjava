
public class Person {

	String fname;
	String lname;
	Integer age;
	Integer Id;

	public Person(String fname, String lname, Integer age, Integer id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		Id = id;
	}
	

	public Person(Person person) {
		super();
		Person newPerson = new Person(person.getFname(), person.getLname(), person.getAge(), person.getId());
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + ", Id=" + Id + "]";
	}
}
