package advent.code.day;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class D3Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test_1() {

		D3 d3 = new D3();

		int answer = d3.d3_1answer(this.getContent());

		assertEquals(198, answer);
	}

	@Test
	void test_2() {

		D3 d3 = new D3();

		int answer = d3.d3_2answer(this.getContent());

		assertEquals(230, answer);
	}

	private List<String> getContent() {
		List<String> data = Arrays.asList(
				"00100",
				"11110",
				"10110",
				"10111",
				"10101",
				"01111",
				"00111",
				"11100",
				"10000",
				"11001",
				"00010",
				"01010");

		return data;
	}

}
