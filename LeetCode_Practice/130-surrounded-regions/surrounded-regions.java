class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Mark all 'O's connected to the borders as 'S'
        for (int i = 0; i < rows; i++) {
            check(board, i, 0);
            check(board, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            check(board, 0, j);
            check(board, rows - 1, j);
        }

        // Convert remaining 'O' to 'X' and restore 'S' to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void check(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;

        if (board[row][col] != 'O') {
            return;
        }
        board[row][col] = 'S';  // Temporarily mark the safe region
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});

        int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0], c = current[1];
            for (int[] dir : direction) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && board[nr][nc] == 'O') {
                    board[nr][nc] = 'S';
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
