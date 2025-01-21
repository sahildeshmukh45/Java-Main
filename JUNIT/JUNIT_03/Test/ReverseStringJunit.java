import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringJunit {

	@Test
	void test() {
		ReverseString rs=new ReverseString();
		assertEquals("java",rs.ReverseString("avaj"));
		assertEquals("oyo",rs.ReverseString("oyo"));
	}

}
