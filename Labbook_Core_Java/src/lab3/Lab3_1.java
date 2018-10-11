package lab3;


public class Lab3_1 {
	public static String solution(String input, int choice) {
		String result = "";
		int length = input.length(), i, j;
		switch (choice) {
		case 1:
			result = input.concat(input);
			break;
		case 2:
			for (j = 0; j < length; j++)
				if (j % 2 != 0)
					result += "#";
				else
					result += input.charAt(j);
			break;
		case 3:
			char[] charSequence = input.toCharArray();
			int index = 1;
			for(i=1;i<length;i++){
				for(j=0;j<index;++j)
					if(charSequence[i]==charSequence[j])
						break;
				if(j==index){
					charSequence[index] = charSequence[i];
					++index;
				} else {
					charSequence[index]=0;
					++index;
				}
			}
			StringBuilder sb = new StringBuilder(charSequence.length);
			sb.append(charSequence);
			result = sb.toString();
			break;
		case 4: 
			for (j = 0; j < length; j++)
				if (j % 2 != 0)
					result += input.substring(j, j+1).toUpperCase();
				else
					result += input.charAt(j);
			break;
		}
	return result;
	}
}


