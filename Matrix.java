public class Matrix {
    public int numberOfNonZeroValues(int[][] be){
        int ki = 0;
        for (int i = 0; i < be.length; i++){
            for (int j = 0; i < be.length.length; j++){
                if (be[i][j] != 0) ki++;
            }
        }
        return ki;
    }
    public int[] indexOfColumnsWithSameValues(int[[]] be){
        int[] ki;
        int n = 0, k = 0;
        for (int j = 0; j < be.length.length; j++){
            for (int i = 0; i < be.length; i++) {
                n = be[i][j];
                if (k == 0) k = n;
                else if (n != k) break;
                else if (i+1 == be.length && k == n) ki.add(i);
            }
        }
        return ki;
    }
}
