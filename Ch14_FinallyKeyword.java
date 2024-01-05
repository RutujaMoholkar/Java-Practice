package com.practice;


public class Ch14_FinallyKeyword {
	public static int divide1() {
		 try
         {
         	int a=90;
         	int b=10;
             int c=a/b;
            return c;
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
		 finally {
			 System.out.println("End of the method ..");
		 }
		return 0;
		
	}
	
	
	public static void main(String[] args) {
          // int s=divide1();
           //System.out.println(s);
         
		
			int a=7;
			int b=9;
			while(true)
			{
			try {
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			finally {
				System.out.println("I am finally block with value of b is :"+b);
			}
			b--;
		}
	}

}
