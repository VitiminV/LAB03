import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee;
	
	@Before
	public void setUp () {
		 employee = new Employee(1000, "John Doe", 25);
	}
	
	@Test
	public void testThreeArgumentConstructor () {
		assertEquals("id was not set in the 3 argument constructor", 1000, employee.getId());
		assertEquals("name was not set in the 3 argument constructor", "John Doe", employee.getName());
		assertEquals("age was not set in the 3 argument constructor", 25, employee.getAge());
		assertEquals("title was not null", null, employee.getTitle());
		assertEquals("salary was not 0", 0, employee.getSalary(), 0);
		assertEquals("phoneNumber was not null", null, employee.getPhoneNumber());
	}
	
	@Test
	public void testCopyConstructor () {
		employee.setPhoneNumber("613-456-879");
		employee.setSalary(2500.50);
		
		Employee employee1 = new Employee(employee);
		assertEquals("id was not set in the 3 argument constructor", 1000, employee1.getId());
		assertEquals("name was not set in the 3 argument constructor", "John Doe", employee1.getName());
		assertEquals("age was not set in the 3 argument constructor", 25, employee1.getAge());
		assertEquals("title was not null", null, employee1.getTitle());
		assertEquals("salary was not 2500.50", 2500.50, employee1.getSalary(), 0);
		assertEquals("phoneNumber was not 613-456-879", "613-456-879", employee1.getPhoneNumber());
	}
	
	@Test
	public void testFullConstructor () {
		Employee employee = new Employee (1000, "John Doe", 25, "Software engineer", 2500.50, "613-456-879");

		assertEquals("id was not set in the 3 argument constructor", 1000, employee.getId());
		assertEquals("name was not set in the 3 argument constructor", "John Doe", employee.getName());
		assertEquals("age was not set in the 3 argument constructor", 25, employee.getAge());
		assertEquals("title was not Software engineer", "Software engineer", employee.getTitle());
		assertEquals("salary was not 2500.50", 2500.50, employee.getSalary(), 0);
		assertEquals("phoneNumber was not 613-456-879", "613-456-879", employee.getPhoneNumber());
	}
	
	@Test 
	public void testIncreaseSalary () {
		employee.setSalary(2550.50);
		
		assertEquals("salary was not 2652.52", 2652.52, employee.increaseSalary(4), 0);
	}
	
	@Test 
	public void testIncreaseSalaryWithTitleSpecified () {
		employee.setSalary(2550.50);
		
		assertEquals("salary was not 2652.52", 2652.52, employee.increaseSalary(4, "Software Engineer II"), 0);
		assertEquals("title was not Software Engineer II", "Software Engineer II", employee.getTitle());
	}

	@Test 
	public void testEquals () {
		employee.setPhoneNumber("613-456-879");
		employee.setSalary(2500.50);	
		employee.setTitle("Software Engineer");
		
		Employee employee1 = new Employee (0, null, 0);
		
		assertFalse("equals method not properly implemented", employee.equals(null));
		assertFalse("equals method not properly implemented", employee.equals(this));
		
		employee1.setId(employee.getId());
		assertFalse("equals method not properly implemented", employee.equals(employee1));

		employee1.setAge(employee.getAge());
		assertFalse("equals method not properly implemented", employee.equals(employee1));
		
		employee1.setName(employee.getName());
		assertFalse("equals method not properly implemented", employee.equals(employee1));
		
		employee1.setTitle(employee.getTitle());
		assertFalse("equals method not properly implemented", employee.equals(employee1));
		
		employee1.setSalary(employee.getSalary());
		assertFalse("equals method not properly implemented", employee.equals(employee1));
		
		employee1.setPhoneNumber(employee.getPhoneNumber());
		assertTrue("equals method not properly implemented", employee.equals(employee1));
		
		assertTrue("equals method not properly implemented", employee.equals(employee));
	}
}
