package patt;

public class nineteen {
	public static void main(String[] args) {
	
		int n=6;
		int p=0;
		while(p<3)
		{
		if((n%2==0)&&(n%3==0)&&(n%5==0))
		{
		System.out.println(n);
		p++;
		}
		n++;
		}

		}

		


}
