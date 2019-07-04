package com.revature.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.revature.main.Employee;
import com.revature.main.EmployeeComparator;

public class EmployeeComparatorTest {

	EmployeeComparator ec = new EmployeeComparator();
	Employee e1 = new Employee();
	Employee e2 = new Employee();


	@Test
	public void testEquals() {
		try {
			e1.buildEmployee("Bob", "Utilities", 25);
			e2.buildEmployee("Bob", "Utilities", 25);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.equals(e2));
	}
	
	@Test
	public void testLessNameHigherDepartment() {
		try {
			e1.buildEmployee("Bob", "Utilities", 27);
			e2.buildEmployee("Gary", "Accounting", 25);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.greaterThan(e2));
	}
	
	@Test
	public void testLessAgeFirstSameOthers() {
		try {
			e1.buildEmployee("Bob", "Utilities", 25);
			e2.buildEmployee("Bob", "Utilities", 27);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.lessThan(e2));
	}
	@Test
	public void testLessAgeLastSameOthers() {
		try {
			e1.buildEmployee("Bob", "Utilities", 27);
			e2.buildEmployee("Bob", "Utilities", 25);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.greaterThan(e2));
	}
	
	@Test
	public void testLessNameFirstSameOthers() {
		try {
			e1.buildEmployee("Abe", "Utilities", 25);
			e2.buildEmployee("Bob", "Utilities", 25);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.lessThan(e2));
	}
	@Test
	public void testLessNameLastSameOthers() {
		try {
			e1.buildEmployee("Bob", "Utilities", 25);
			e2.buildEmployee("Abe", "Utilities", 25);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.greaterThan(e2));
	}
	
	@Test
	public void testLessDepartmentFirstSameOthers() {
		try {
			e1.buildEmployee("Bob", "Accounting", 25);
			e2.buildEmployee("Bob", "Utilities", 25);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.lessThan(e2));
	}
	@Test
	public void testLessDepartmentLastSameOthers() {
		try {
			e1.buildEmployee("Bob", "Utilities", 25);
			e2.buildEmployee("Bob", "Accounting", 25);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(e1.greaterThan(e2));
	}

}
