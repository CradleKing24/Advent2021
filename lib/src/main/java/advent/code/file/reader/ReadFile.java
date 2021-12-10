package advent.code.file.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

	public static List<List<String>> readFile(String file) {
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				records.add(Arrays.asList(values));
			}
		} catch(IOException e) {

		}
		return records;
	}

	public static List<String> readFile_Flatten(String file) {
		List<String> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				String val = values[0];
				records.add(val);
			}
		} catch(IOException e) {

		}
		return records;
	}

	public static List<String> readFile_stdCSV(String file) {
		List<String> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				records.addAll(Arrays.asList(values));
			}
		} catch(IOException e) {

		}
		return records;
	}

}
