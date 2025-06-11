package Testutils;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

import sun.awt.SunHints.Value;

public class occurrencesofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		String s1="assdfssdd";
		String s2="";
		char c='a';
		/// with help of map we can count 
		Map<Character, Integer> charcount=new HashMap();
		for(int i=0;i<s1.length();i++) {
			
			if(charcount.containsKey(s1.charAt(i))) {
				
				charcount.put(s1.charAt(i), charcount.get(s1.charAt(i))+1);
				
				
			}
			
			else
			{
				charcount.put(s1.charAt(i), 1);
			}
			
		}
		
		System.out.println(charcount);
		
		
		// without map "assdfssdd";
		char ch[]=s1.toCharArray();
		int countofcharacter=1;
		for(int i=0 ;i<s1.length();i++) {
			if(ch[i]=='\0') {
				continue;
			}
			
			for(int j=i+1;j<s1.length();j++) {
				
				if(ch[i]==ch[j]) {
					countofcharacter++;
					
					ch[j]='\0'; // here we make that character as null
				}
			}
			
			System.out.println(ch[i]+" : "+countofcharacter);
			countofcharacter=1;
		}
		
		
		

	}

}
