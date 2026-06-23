class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(board, 0, 0, 0, 0, n);
        return res;
    }
    private void solve(char[][] board, int row,
                       int cols, int diags, int antiDiags, int n) {

        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) {
                temp.add(new String(r));
            }
            res.add(temp);
            return;
        }

        int available = ((1 << n) - 1) & ~(cols | diags | antiDiags);

        while (available != 0) {
            int bit = available & -available;
            available &= available - 1;

            int col = Integer.numberOfTrailingZeros(bit);

            board[row][col] = 'Q';

            solve(
                board,
                row + 1,
                cols | bit,
                (diags | bit) << 1,
                (antiDiags | bit) >> 1,
                n
            );

            board[row][col] = '.';
        }
    }
}