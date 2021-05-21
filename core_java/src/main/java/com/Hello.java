package com;

//my first program

public class Hello {

	public static void main(String[] args) {
		//************program1 to print name********
		//printf=System.out.println
		
		//System.out.println("hello");
		//***********program1 ended
		
		//program2 adding 2 number start
		/*
		int i=5;
		int j=6;
		int k=i+j;
		
		System.out.println("Result is "+k);
		*/
		//program2 end
		
		//program3 write name 10 time start
		//when to use looping concept? if we have to repeat same information many times.
		//how to use ? via for , while ,do-while.
		//how to use for loop
		/*
		for(int m=1;m<=10;m++) {
			System.out.println("Rajesh");
		}
		
		//how to use while loop
		int m=1;
		while(m<=10) {
			System.out.println("Mahesh");
			m++;
		}
		*/
		
		//program3 ended
		//program 4 decide grade of student depends on marks. start
		//how to take decision? if-else, switch-case
		//how to use if-else?
		int marks=82;
		int mm=2;
		
		if(marks>60) {
			//System.out.println("First Division");
			mm=1;
		}
		else {
			if(marks>=45  && marks<60) {
				//System.out.println("Second Division");
				mm=2;
			}
			else {
				if(marks>=33  && marks<45) {
					//System.out.println("Third Division");
					mm=3;
				}
				else {
					//System.out.println("Fail");
					mm=4;
				}
			}
		}
			
		switch(mm) {
		case 1 : System.out.println("First Division");
		break;
		case 2 : System.out.println("Second Division");
		break;
		case 3 : System.out.println("Third Division");
		break;
		case 4 : System.out.println("Fail");
		break;
		default : System.out.println("invalid choice");
		}

	}

}























