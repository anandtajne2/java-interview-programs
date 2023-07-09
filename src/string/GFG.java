package string;

public class GFG {

	// Function to print the maximum repeating
	// character at each index of the string
	public static void findFreq(String str, int N) {

		// Stores frequency of
		// each distinct character
		int[] freq = new int[256];

		// Stores frequency of maximum
		// repeating character
		int max = 0;

		// Stores the character having
		// maximum frequency
		char charMax = '0';

		// Traverse the string
		for (int i = 0; i < N; i++) {

			// Stores current character
			char ch = str.charAt(i);

			// Update the frequency of str[i]
			freq[ch]++;

			// If frequency of current
			// character exceeds max
			if (freq[ch] >= max) {

				// Update max
				max = freq[ch];

				// Update charMax
				charMax = ch;
			}

			// Print the required output
			System.out.println(charMax + " -> " + max);
		}
	}

	// Driver Code
	public static void main(String[] args) {
//		String str = "abbc";
		String str = "aaafffatttt";

		// Stores length of str
		int N = str.length();

		findFreq(str, N);
	}
}

