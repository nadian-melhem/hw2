package testt;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculater.cal;
 
public class calTest {

	static cal obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new cal() ; 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(5,obj.add(3,2));
	}

}
