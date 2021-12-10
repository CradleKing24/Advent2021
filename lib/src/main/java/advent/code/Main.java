package advent.code;

import advent.code.day.D3;
import advent.code.day.D4;
import advent.code.file.reader.ReadFile;

public class Main {

	public static void main(String[] args) {

		//		D1 d1 = new D1();
		//		System.out.println(d1.d1_1answer(ReadFile.readFile("src/main/resources/day1_p1.csv")));
		//		System.out.println(d1.d1_2answer(ReadFile.readFile("src/main/resources/day1_p1.csv")));

		//		D2 d2 = new D2();
		//		System.out.println(d2.d2_1answer(ReadFile.readFile_Flatten("src/main/resources/day2.csv")));
		//		System.out.println(d2.d2_2answer(ReadFile.readFile_Flatten("src/main/resources/day2.csv")));

				D3 d3 = new D3();
				System.out.println(d3.d3_1answer(ReadFile.readFile_Flatten("src/main/resources/day3.csv")));
				System.out.println(d3.d3_2answer(ReadFile.readFile_Flatten("src/main/resources/day3.csv")));

//		D4 d4 = new D4();
//		System.out.println(d4.d4_1answer(ReadFile.readFile_stdCSV("src/main/resources/day4_numsCalled.csv")));
//		System.out.println(d4.d4_2answer(ReadFile.readFile_Flatten("src/main/resources/day3.csv")));
	}
}
