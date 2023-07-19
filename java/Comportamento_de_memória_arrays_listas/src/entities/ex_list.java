package entities;

public class ex_list {

	private Integer id;
	private String name;
	private Double salary;
	
	public ex_list() {	
	}

	public ex_list(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(Double porcentage) {
		salary += salary * porcentage / 100;
	}
	
	public String toString() {
		return  id + ", " + name + ", " + String.format("%.2f%n", salary);
	}
	
}
