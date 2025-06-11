
public class highestnumberfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	 a[]= {92,6,7,4,67,86,99};
	int highestvalue=a[0];
	for(int i=1;i<a.length;i++) {
		
		if(a[i]>highestvalue) {
			highestvalue=a[i];
		}
		
	}
	
	System.out.println(highestvalue);
	

	}

}
