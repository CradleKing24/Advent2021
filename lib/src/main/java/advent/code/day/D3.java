package advent.code.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class D3 {

	public int d3_1answer(List<String> fileContents) {
		int[][] ret = this.getRotatedMatrix(fileContents);
		//end matrix rotate 90 degrees

		String gammaRate = "";
		String epsilonRate = "";

		for (int r = 0; r < ret.length; r++) {
			int oneCount = 0;
			int zeroCount = 0;
			for (int c = 0; c < ret[0].length; c++) {
				if(ret[r][c] == 0) {
					zeroCount++;
				} else {
					oneCount++;
				}
			}
			if(oneCount > zeroCount) {
				gammaRate += "1";
				epsilonRate += "0";
			} else {
				gammaRate += "0";
				epsilonRate += "1";
			}
		}
		return Integer.parseInt(gammaRate, 2) * Integer.parseInt(epsilonRate, 2);
	}

	public int d3_2answer(final List<String> fileContents) {

		LinkedList<String> editContents = new LinkedList<String>(fileContents);

		//get oxygen
		int[][] matrix = this.getRotatedMatrix(editContents);
		List<Integer> bitsToIgnore = new ArrayList<>();
		List<Integer> oneBits = new ArrayList<>();
		List<Integer> zeroBits = new ArrayList<>();

		for(int row = 0; row<matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if(!bitsToIgnore.contains(col)) {
					if(matrix[row][col] == 1) {
						oneBits.add(col);
					} else {
						zeroBits.add(col);
					}
				}
			}
			if(oneBits.size() > zeroBits.size()) {
				bitsToIgnore.addAll(zeroBits);
			} else if(oneBits.size() == zeroBits.size()){
				bitsToIgnore.addAll(zeroBits);
			} else {
				bitsToIgnore.addAll(oneBits);
			}
			oneBits.clear();
			zeroBits.clear();
			if(editContents.size()-1 == bitsToIgnore.size()) {
				break;
			}
		} //end bits check
		String oxygenRating = null;
		Collections.reverse(editContents);
		for(int i=0; i<editContents.size(); i++) {
			if(!bitsToIgnore.contains(i)) {
				oxygenRating = editContents.get(i);
			}
		}

		//get co2
		editContents = new LinkedList<String>(fileContents);
		bitsToIgnore = new ArrayList<>();
		oneBits = new ArrayList<>();
		zeroBits = new ArrayList<>();

		for(int row = 0; row<matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if(!bitsToIgnore.contains(col)) {
					if(matrix[row][col] == 1) {
						oneBits.add(col);
					} else {
						zeroBits.add(col);
					}
				}
			}
			if(oneBits.size() > zeroBits.size()) {
				bitsToIgnore.addAll(oneBits);
			} else if(oneBits.size() == zeroBits.size()){
				bitsToIgnore.addAll(oneBits);
			} else {
				bitsToIgnore.addAll(zeroBits);
			}
			oneBits.clear();
			zeroBits.clear();
			if(editContents.size()-1 == bitsToIgnore.size()) {
				break;
			}
		} //end bits check
		String co2Scrubber = null;
		Collections.reverse(editContents);
		for(int i=0; i<editContents.size(); i++) {
			if(!bitsToIgnore.contains(i)) {
				co2Scrubber = editContents.get(i);
			}
		}

		return Integer.parseInt(oxygenRating, 2) * Integer.parseInt(co2Scrubber, 2);

	}

	private int[][] getRotatedMatrix(List<String> remainingContents) {
		int[][] mat = new int[remainingContents.size()][remainingContents.get(0).length()];

		//create matrix taking each bit and splitting into an array index position
		for(int r = 0; r < remainingContents.size(); r++) {
			String row = remainingContents.get(r);
			for(int i = 0; i < row.length(); i++) {
				mat[r][i] = Character.getNumericValue(row.charAt(i));
			}
		}

		//start matrix rotate 90 degrees
		final int M = mat.length;
		final int N = mat[0].length;
		int[][] ret = new int[N][M];
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				ret[c][M-1-r] = mat[r][c];
			}
		}
		//end matrix rotate 90 degrees
		return ret;
	}

}
