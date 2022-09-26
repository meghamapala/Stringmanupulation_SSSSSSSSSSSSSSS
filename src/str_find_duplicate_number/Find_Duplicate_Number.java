package str_find_duplicate_number;

public class Find_Duplicate_Number {

	public static void main(String[] args) {
		
		String s = "united states of america zz xx";
		char[] arrs = s.toCharArray();
		for(int i=0; i<arrs.length; i++) {
			for(int j=i+1; j<arrs.length; j++) {
				if(arrs[i]==arrs[j]) {
					System.out.println(arrs[i]+" is duplicate character");
				}
			}
		}

	}

}
