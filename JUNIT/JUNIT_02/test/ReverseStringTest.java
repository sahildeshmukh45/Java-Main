import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString rs=new ReverseString();
		rs.ReverseString("JAVA");
		assertEquals("AVAJ",rs.ReverseString("JAVA"));
	}

}
