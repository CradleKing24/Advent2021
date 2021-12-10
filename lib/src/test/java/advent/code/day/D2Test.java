package advent.code.day;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class D2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test_1() {

		D2 d2 = new D2();

		int answer = d2.d2_1answer(this.getContent());

		assertEquals(150, answer);
	}

	@Test
	void test_2() {

		D2 d2 = new D2();

		int answer = d2.d2_2answer(this.getContent());

		assertEquals(900, answer);
	}

	private List<String> getContent() {
		List<String> data = Arrays.asList(
				"forward 5",
				"down 5",
				"forward 8",
				"up 3",
				"down 8",
				"forward 2");

		return data;
	}

}
