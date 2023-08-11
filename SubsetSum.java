public class SubsetSum {
    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Base case: If sum is 0, there's always an empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = arr.length;
        System.out.println("Output for Example is : " + (isSubsetSum(arr, n, sum) ? "1" : "0"));

    }
}
