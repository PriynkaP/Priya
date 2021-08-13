package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
        boolean user = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                user = true;
               
            }
        }

        if (!user)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
