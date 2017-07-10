package pack1;

public class P05_concept_condition {
	public static void main(String[] args) {
		int	number	= -6;
		String str1	= "duong";
		String str2	= "chan";
		
		if(number < 0)		str1 = "am";
		if(number % 2 == 1)	str2 = "le";
		
		System.out.println("nguyen " + str1 + " " + str2);
	}
}
