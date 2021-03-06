public class Chirp {
    
    public static boolean isChirpy(int n) {
	return n%7==0;
    }

    public int collatz(int n) {
	if (n <= 1) {
	    return n;
	} else if (n % 2 == 0) {
	    return collatz(n / 2);
	} else {
	    return collatz((3 * n) + 1);
	}
    }
    
    public static boolean isNirpy(int n) {
		n = Chirp.collatz(n);
		return finalNum == Math.abs(n);
    }

    public static int schnirpyLevel(int n) {
	int toReturn = 0;
	for (int j = n; j < Integer.MAX_VALUE; j++) {
	    if (j % 2 == 0) {
		toReturn++;
	    }
	}
	return toReturn % 10;
    }
}
