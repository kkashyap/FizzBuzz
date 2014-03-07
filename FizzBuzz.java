public class FizzBuzz {
	public static void main (String [] args){
		for (int i = 1; i <= 100; i++){
			divisible:
			if((i % 3) == 0) {
				if ((i % 5) == 0){
					System.out.println("FizzBuzz"); 
				}
				else{
				System.out.println("Fizz");
				}
			 break divisible; //Break thread, move on to next incrementation in for loop
			}
			else if((i % 5) == 0) {
				System.out.println("Buzz");
				break divisible;
			}
			else {
				System.out.println(i);
			}
			}
		
	}
}

