package str_polindrum;

public class PlayWithString {

	public static void  main(String[] args) {
		
		String word = "wowt";
		boolean flag=false;
		int j = word.length()-1;
		if(word.equals(" ")||word.length()<2||word.matches(".*\\d.*")) {
			System.out.println("wrong entry");
		}else {
			for (int i = 0; i < word.length(); i++,j--) {
				if(word.charAt(i)!=word.charAt(j)) {
					System.out.println(word+" <--- is not polindrom");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(word+" <--- is polindrom");
			}
		}
		

}
}
