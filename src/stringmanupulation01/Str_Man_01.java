package stringmanupulation01;

public class Str_Man_01 {

	public static void main(String[] args) {		
		
		String bb = "Earth is looks like blue from out of space";
		String bb1[]=bb.split(" ");
		
		for (int i=0; i<bb1.length; i++) {
			System.out.println(bb1[i]);
		}
		
		String c = "Hello! how are you";
		String [] cc=c.split(" ");
		for (int i =0; i<cc.length; i++) {
			System.out.println(cc[i]);
		}
		
		String v = "We have to study in our childhood";
		char [] x=v.toCharArray();
		StringBuffer ss= new StringBuffer();
		for (int i=x.length-1; i>=0; i--) 
		{
			ss.append(x[i]);
		}
		System.out.println(ss);
		
		String vv = "We have to study in our childhood";
		String [] xx=vv.split(" ");
        StringBuffer zz= new StringBuffer();
		for (int i=xx.length-1; i>=0; i--)
		    {
			zz.append(xx[i]).append(" ");
		    }
		System.out.println(zz);
		
		String kk1 = "** New york city is one of the bussiest city in the world";
		String[] mm1=kk1.split(" ");
		for (int i=0; i<mm1.length; i++) {
			System.out.println(mm1[i]);
		}
		
		String oo1 = "** New york city is one of the bussiest city in the world";
		char[] hhs=oo1.toCharArray();
		StringBuffer qq1=new StringBuffer();
		for (int i=hhs.length-1; i>=0; i--) 
		{
			qq1.append(hhs[i]);
		}
		System.out.println(qq1);
		
		String reversewordbyword = "** New york city is one of the bussiest city in the world";
		String [] dd=reversewordbyword.split(" ");
		StringBuffer mam = new StringBuffer();
		for (int i=dd.length-1; i>=0; i--) 
		{
			mam.append(dd[i]).append(" ");
		}*/
		
		String splitWord = "Blue is my favourite color";
		String [] splitWord2 = splitWord.split(" ");
		for (int i = 0; i<splitWord2.length; i++) {
			System.out.println(splitWord2[i]);
		}
		
		String splitWordB = "Blue is my favourite color";
		char [] character = splitWordB.toCharArray();
		StringBuffer reverseWord = new StringBuffer();
		for (int i=character.length-1; i>=0; i--) 
		{
			reverseWord.append(character[i]);
		}
		System.out.println(reverseWord);
		
		String splitWordC = "Blue is my favourite color";
		String [] splitWord3 = splitWordC.split(" ");
        StringBuffer reverseWord1 = new StringBuffer();
		for (int i=splitWord3.length-1; i>=0; i--) 
		{
			reverseWord1.append(splitWord3[i]).append(" ");
		}
		System.out.println(reverseWord1);
		


		
		

		
		


		
		
		

	}

}
