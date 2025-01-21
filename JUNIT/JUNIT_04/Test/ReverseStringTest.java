import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	// test annotation is use for to declare that we are testing below code 
	void oneWordReverseTest() {
		ReverseString rs=new ReverseString();
		assertEquals("avaJ",rs.ReverseString("Java"));
	}
	
	@Test
	void multipleWordReverseTest() {
		ReverseString rs=new ReverseString();
		assertEquals("ysae si avaJ",rs.ReverseString("Java is easy"));
	}
	

}
