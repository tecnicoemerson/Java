package entitiesFuncionarios;

import java.util.List;
import java.util.function.Predicate;

public class searchFuncionarios {

	public  double fil(List<Employee> em, Predicate<Employee> cr) {
		double sum = 0.0;
		for (Employee p : em) {
			if (cr.test(p)) {
				sum += p.getSalary();
			}
		}
		return sum;
	}
	
}
