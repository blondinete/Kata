package main.kyu5;

import java.util.Arrays;

public class KPrimes {
	
	public static void isPrim(int x) {
		
		boolean[] primes=new boolean[5]; 
		Arrays.fill(primes, true);
		
		for (int i =2; i<= primes.length; i++) {
			
			if (primes[i]) {
				System.out.println("cheguei");
				for (int j=i+1; j<= primes.length; j++) {
					if(i%j==0) {
						System.out.println(j);
						primes[j]=false;
					}
					
				}
			}
		}
		
	}
	
    
    public static long[] countKprimes(int k, long start, long end) {
    	
    	// if start is equal a 0, put the value at 2
    	isPrim(5);
    	for (long i = start == 0 ? 2 : start; i <= end; i++) {
    		
    		//System.out.println("n: "+i);
    		
    	}
		return null;

        
    }
    
    // task 2 - total number of solutions
    public static int puzzle(int s) {
    	
    	return 0;
       
    }
    
    public static void main(String args[]) 
    { 
        KPrimes.isPrim(10);
    	
    } 
    
}


