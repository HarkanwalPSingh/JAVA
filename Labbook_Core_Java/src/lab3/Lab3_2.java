package lab3;

public class Lab3_2 {
	public static boolean positiveString(String str) {
		int length = str.length(), i, j;
		boolean result = true;
		char sequence[] = str.toCharArray();
		for (i = 0; i < length; i++) {
			for (j = i; j < length; j++)
				if (sequence[j] < sequence[i])
					result = false;
			if (result == false)
				break;
		}

		return result;
	}

}
