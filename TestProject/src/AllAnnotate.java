import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class AllAnnotate {

	@Test
	public void test1() {
		System.out.println("Test method called");
	}

	@Before
	public void testBefore() {
		System.out.println("Before method called");
	}
	
	@After
	public void testAfter() {
		System.out.println("After method called");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("BeforeClass method called");
	}
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("AfterClass method called");
	}
	
	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("Ignore method called");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 methods called");
	}
}
