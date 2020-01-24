/**
 * Write a description of class MathUtilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathUtilities
{
    
   public int add(int num1, int num2) {
        return(num1 + num2);
    }
   public double add(double num1, double num2) {
      return(num1 + num2);
    }
   public double half(int number) {
		return(number / 2);
	}
   
	public boolean isOdd(int number) {
       if((number % 2) == 0) {
			return false;
		}else {
			return true;
	}
	}
	
   public int square(int number) {
		return(number * number);
	}
}
