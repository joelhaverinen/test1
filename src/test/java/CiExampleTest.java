import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CiExampleTest {
	@Test
	public void sayHelloTest() {
		assertEquals("Hello World", new CiExample().sayHello());
	}
}
