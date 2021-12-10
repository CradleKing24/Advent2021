package advent.code.day;

import java.util.ArrayList;
import java.util.List;

public class D1 {
	public int d1_1answer(List<List<String>> fileContents) {
		int totalIncrease = 0;
		String previousVal = null;
		for(List<String> row : fileContents) {
			for(String column: row) {
				if(previousVal == null) {
					//first value
					previousVal = column;
				} else if(Integer.valueOf(previousVal) < Integer.valueOf(column)) {
					totalIncrease++;
					previousVal = column;
				} else {
					previousVal = column;
				}
			}
		}
		return totalIncrease;
	}

	public int d1_2answer(List<List<String>> fileContents) {
		List<Integer> flatList = new ArrayList<>();
		for(List<String> row : fileContents) {
			for(String column : row) {
				flatList.add(Integer.valueOf(column));
			}
		}
		int sizeN = flatList.size();
		int windowSize = 3;

		int maxSum = 0;
		for(int i = 0; i < windowSize; i++) {
			maxSum += flatList.get(i);
		}

		int totalIncrease = 0;
		int windowSum = maxSum;
		int previousVal = maxSum;
		for(int i = windowSize; i < sizeN; i++) {
			windowSum += (flatList.get(i) - flatList.get(i - windowSize));
			if(previousVal < windowSum) {
				totalIncrease++;
				previousVal = windowSum;
			} else {
				previousVal = windowSum;
			}

		}


		return totalIncrease;
	}

}
