 

public class LoopFun {
	
	
	
	public int factorial(int number) {
		if(number == 0) {
			return 1;
		}
		return number*factorial(number-1);
	}
	
	public String acronym(String phrase) {
		String a = Character.toString((phrase.toUpperCase().charAt(0)));
		
		for (int i = 1; i <= phrase.length() - 1; i++) {
            if (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-') {
                a += phrase.toUpperCase().charAt(i);
            }
        }

        return a;
    }
	
	
	public String encrypt(String word) {
		char[] a = word.toCharArray();
		int r;
		String t = "";
		for(int i = 0; i <= a.length-1; i++) {
			int n = (int)a[i];

			if((n >=88  && n<= 90) || (n >=120 && n<=122)) {
				 r = n - 23;
			}
			else {
				 r = n + 3;
			}
			char c = (char)r;
			t += c;
		}
		return t;
	}
}
