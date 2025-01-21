import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c=new Calc();
		c.divide(10, 5);
		assertEquals(2,c.divide(10,5));
		//aseert equal use for comparsison between ecpected output and actualOutput
	}

}
