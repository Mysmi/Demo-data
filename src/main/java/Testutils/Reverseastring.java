package Testutils;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="asdf@q#wer$t";
String s2="";
		char StoC[]=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		while(left<right)
		{			
			if(!Character.isLetterOrDigit(StoC[left])){
				left++;
			}
			else if(!Character.isLetterOrDigit(StoC[right])){
				right--;
			}
			else

			{

				char temp=StoC[left];
				StoC[left]=StoC[right];
				StoC[right]=temp;
				left++;
				right--;

			}
		}
		
		System.out.println(String.copyValueOf(StoC));

	}

}
