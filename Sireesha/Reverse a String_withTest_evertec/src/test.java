import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Resverse r1=new Resverse();
		String result=r1.reverse("Sireesha");
		assertEquals("ahseeriS", result);
	}
	@Test
	void test1() {
		Resverse r1=new Resverse();
		String result=r1.reverse("Sireesha");
		assertNotEquals("Sireesha", result);
	}
	@Test
	void test2() {
		Resverse r1=new Resverse();
		String result=r1.reverse("Sireesha");
		equals(result);
	}
	

}
