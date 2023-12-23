package stream_01;

import java.util.Arrays;
import java.util.List;


public class StreamPracticeMaxAndMinSalariedEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", 50000), new Employee("Jane", 60000),
				new Employee("Bob", 75000)
		// Add more employees as needed
		);

		// Using streams to find employee with max salary
		Employee maxSalaryEmployee = employees.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.orElse(null);
		
		
		/*Employee minSalaryEmployee = employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.orElse(null);*/
		
		 // Use allMatch to check if all employees have a salary greater than 50000
          boolean allMatchResult = employees.stream()
                .allMatch(employee -> employee.getSalary() > 50000);

        System.out.println("All employees have a salary greater than 50000: " + allMatchResult);

        // Use anyMatch to check if there is any employee with a salary greater than 70000
         boolean anyMatchResult = employees.stream()
                .anyMatch(employee -> employee.getSalary() > 70000);

        System.out.println("There is at least one employee with a salary greater than 70000: " + anyMatchResult);
        
        employees.stream().
		
	if (maxSalaryEmployee != null) 
		{
			System.out.println("Employee with max salary: " + maxSalaryEmployee.getName() + ", Salary: "
					+ maxSalaryEmployee.getSalary());
		} 
	else {
			System.out.println("No employees found");
		}
	}
}

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}