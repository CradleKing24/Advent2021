package advent.code.d1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import advent.code.day.D1;

class D1_1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test_d1_1() {
		List<List<String>> content = this.getContent();

		D1 d1 = new D1();

		int answer = d1.d1_1answer(content);

		assertEquals(7, answer);
	}

	@Test
	void test_d1_2() {
		List<List<String>> content = this.getContent();

		D1 d1 = new D1();

		int answer = d1.d1_2answer(content);

		assertEquals(5, answer);
	}

	private List<List<String>> getContent() {
		List<String> data = Arrays.asList(
				"199",
				"200",
				"208",
				"210",
				"200",
				"207",
				"240",
				"269",
				"260",
				"263");
		List<List<String>> content = new ArrayList<List<String>>();
		for(String val: data) {
			List<String> row = Arrays.asList(val);
			content.add(row);
		}
		return content;
	}

}
