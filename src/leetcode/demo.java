package leetcode;

/*Example 1:
Input: word1 = "horse", word2 = "rose"
Output: 3
Explanation:
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')*/
public   class demo {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("Minimum operations to convert " + word1 + "to" + word2 + ":" + minOperations(word1, word2));
    }

    public static int minOperations(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) { //same character
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }

        }
        return dp[m][n];
    }
}