package advent.code.day;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D2 {

	public int d2_1answer(List<String> fileContents) {

		int horizontal = 0;
		int depth = 0;
		for(String direction : fileContents) {
			Pattern pattForward = Pattern.compile("^forward (\\d+)$");
			Matcher mForward = pattForward.matcher(direction);
			if(mForward.find()) {
				horizontal += Integer.valueOf(mForward.group(1));
				continue;
			}
			Pattern pattDown = Pattern.compile("^down (\\d+)$");
			Matcher mDown = pattDown.matcher(direction);
			if(mDown.find()) {
				depth += Integer.valueOf(mDown.group(1));
				continue;
			}

			Pattern pattUp = Pattern.compile("^up (\\d+)$");
			Matcher mUp = pattUp.matcher(direction);
			if(mUp.find()) {
				depth -= Integer.valueOf(mUp.group(1));
				continue;
			}
		}

		return horizontal * depth;
	}

	public int d2_2answer(List<String> fileContents) {

		int horizontal = 0;
		int depth = 0;
		int aim = 0;
		for(String direction : fileContents) {
			Pattern pattForward = Pattern.compile("^forward (\\d+)$");
			Matcher mForward = pattForward.matcher(direction);
			if(mForward.find()) {
				int forwVal = Integer.valueOf(mForward.group(1));
				if(aim == 0) {
					//noop
				} else {
					depth += forwVal * aim;
				}
				horizontal += forwVal;
				continue;
			}
			Pattern pattDown = Pattern.compile("^down (\\d+)$");
			Matcher mDown = pattDown.matcher(direction);
			if(mDown.find()) {
				aim += Integer.valueOf(mDown.group(1));
				continue;
			}

			Pattern pattUp = Pattern.compile("^up (\\d+)$");
			Matcher mUp = pattUp.matcher(direction);
			if(mUp.find()) {
				aim -= Integer.valueOf(mUp.group(1));
				continue;
			}
		}

		return horizontal * depth;
	}
}
