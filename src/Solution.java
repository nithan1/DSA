public class Solution {
    public String solve(String A, int B) {
        StringBuilder result = new StringBuilder();
        int n = A.length();

        for (int i = 0; i < n; ) {
            char currentChar = A.charAt(i);
            int count = 0;

            // Count consecutive identical characters
            while (i < n && A.charAt(i) == currentChar) {
                i++;
                count++;
            }

            // Append to result if the count is not equal to B
            if (count % B != 0) {
                result.append(A.substring(i - count, i));
            }
        }

        return result.toString();
    }
}

