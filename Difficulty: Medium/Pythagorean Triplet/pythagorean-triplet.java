import java.util.HashSet;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Integer> squares = new HashSet<>();

        // Step 1: Store all squares
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
            squares.add(arr[i]);
        }

        // Step 2: Check all pairs (a² + b²) and see if it's in the set
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (squares.contains(sum)) {
                    return true; // Found triplet
                }
            }
        }

        return false; // No triplet found
    }
}
