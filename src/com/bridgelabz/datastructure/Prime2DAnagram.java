/**purpose Print prime 2d anagram
 * @author Pranita Ananada Jadhav
 *
 */

package com.bridgelabz.datastructure;
public class Prime2DAnagram {

	public static void main(String[] args) {
		int prime[][] = new int[2][350];

		int arr[] = Utility1.prime(1000);

		int arr2[] = Utility1.anagramPrime(arr);

		int arr3[] = Utility1.compareTwo(arr, arr2);
		System.out.println("prime anagram are ");
			for (int i = 0; i < arr2.length; i++) {
				prime[0][i] = arr2[i];
			}
			for (int i = 0; i < arr3.length; i++) {
				prime[1][i] = arr3[i];
	
			}
				for (int i = 0; i < prime.length; i++) {
						for (int j = 0; j < prime[i].length; j++) {
								if (prime[i][j] != 0)
					              System.out.print(prime[i][j] + "-");

			}
			System.out.println();

		}

	}
}