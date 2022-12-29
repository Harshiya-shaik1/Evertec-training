import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallindrameTest {

	@Test
	void test() {
		Pallindrame p1=new Pallindrame();
		String result=p1.isPallindrame("madam");
		assertEquals("madam", result);
	}
	@Test
	void test1() {
		Pallindrame p1=new Pallindrame();
		String result=p1.isPallindrame("madam");
		assertNotEquals("java", result);
	}
	@Test
	void test2() {
		Pallindrame p1=new Pallindrame();
		String result=p1.isPallindrame("madam");
		p1.equals(result);
	}
	
	

}
