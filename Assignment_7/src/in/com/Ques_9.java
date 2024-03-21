/*9) Write a program which generates the series 1,4,27,16,125,36*/


package in.com;

public class Ques_9 {

		// TODO Auto-generated method stub
		public static int Sequence(int N) 
		{ 
		    if (N % 2 == 0)  
		        N = N * N;  
		    else
		        N = N * N * N;  
		    return N; 
		} 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int N = 6; 
			    System.out.println(Sequence(N)); 

		}

	}


