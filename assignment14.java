package in.ineuron.main;

public class assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if( i-j>=(n-1)/2 ||
				   i+j>=(n-1+(n-1)/2))
				System.out.print("*");
				else
				System.out.print(" ");
	         }
			System.out.println();
             
         }
	}

}
