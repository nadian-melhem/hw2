package calculater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calTest {

	@Test
	void test() {
		cal ca = new cal();
		int c = ca.add(2, 4 );
		assertTrue (c==6);
		c = ca.sub(2, 4);
		assertTrue (c== -2) ;
		c = ca.mul(2, 4) ;
		assertTrue (c ==8);
		c = ca.div(2, 0) ;
		assertTrue (c==-1);
	}

}
