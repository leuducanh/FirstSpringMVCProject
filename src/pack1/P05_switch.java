package pack1;

public class P05_switch {
	public static void main(String[] args) {
		int number		= 8;
		String result 	= "";
		
		switch (number) {
			case 2:{
				result = "thu hai";
				break;				
			}
			case 3:{
				result = "thu ba";
				break;				
			}
			case 4:{
				result = "thu tu";
				break;				
			}
			case 1:
			case 8:{
				result = "chu nhat";
				break;				
			}
			default:{
				result = "khong hop le";
				break;				
			}
		}
		
		System.out.println(result);
	}
}
