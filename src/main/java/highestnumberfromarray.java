
public class highestnumberfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	 a[]= {92,6,7,4,67,86,99};

		
	int highestvalue=a[0];
		int secondhighestvalue=0;
	for(int i=1;i<a.length;i++) {
		
		if(a[i]>highestvalue) {
			
			secondhighestvalue=highestvalue;
				highestvalue=a[i];
		}

		else if(secondhighestvalue<a[i]){

			secondhighestvalue=a[i];
		
	}
	
	System.out.println(secondhighestvalue);
	

	}

}
