public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int rowsCount = 3;
        int columnsCount = 6;

        int[][] arrayMultiplicationTable = getToMultiplicationTable(rowsCount, columnsCount);

        for (int[] row : arrayMultiplicationTable) {
            for (int column : row) {
                System.out.printf("%10d", column);
            }

            System.out.println();
        }
    }

    public static int[][] getToMultiplicationTable(int rowsCount, int columnsCount) {
        int[][] arrayMultiplicationTable = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                arrayMultiplicationTable[i][j] = (j + 1) * (i + 1);
            }
        }

        return arrayMultiplicationTable;
    }
}