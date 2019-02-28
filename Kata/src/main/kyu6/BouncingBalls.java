package main.kyu6;

public class BouncingBalls {
	
	public static int bouncingBall(double h, double bounce, double window) {
		
		/* My first example */
		
	      if (! (h>0)){
	        return -1;
	      }
	      if (! (bounce > 0 && bounce < 1)){
	        return -1;
	      }
	      if (! (window<h)){
	        return -1;
	      }
	      double bounceHight = h * bounce;
	      int count = 1;
	      
	      while (bounceHight > window) {
	        count += 2;
	        bounceHight = bounceHight * bounce;
	      }
	      return count;
	      
	  }

}
