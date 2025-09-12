public class MatrixOpsAdvanced {
    public static double[][] randomMatrix(int r, int c) {
        double[][] m = new double[r][c];
        java.util.Random rand = new java.util.Random();
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j] = rand.nextInt(10);
        return m;
    }

    public static double[][] transpose(double[][] m) {
        int r = m.length, c = m[0].length;
        double[][] t = new double[c][r];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) t[j][i] = m[i][j];
        return t;
    }

    public static double det2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double det3x3(double[][] m) {
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    public static double[][] inverse2x2(double[][] m) {
        double d = det2x2(m);
        if (Math.abs(d) < 1e-9) return new double[0][0];
        double[][] inv = {{m[1][1]/d, -m[0][1]/d},{-m[1][0]/d, m[0][0]/d}};
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double d = det3x3(m);
        if (Math.abs(d) < 1e-9) return new double[0][0];
        double[][] adj = new double[3][3];
        // cofactor matrix transposed (adjugate)
        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);
        double[][] inv = new double[3][3];
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) inv[i][j] = adj[i][j] / d;
        return inv;
    }

    public static void print(double[][] m) {
        if (m.length == 0) { System.out.println("No inverse / empty matrix"); return; }
        for (int i=0;i<m.length;i++) {
            for (int j=0;j<m[0].length;j++) System.out.printf("%.2f\t", m[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] M2 = randomMatrix(2,2);
        double[][] M3 = randomMatrix(3,3);
        System.out.println("2x2 M:"); print(M2);
        System.out.println("Det 2x2: " + det2x2(M2));
        System.out.println("Inverse 2x2:"); print(inverse2x2(M2));
        System.out.println("3x3 M:"); print(M3);
        System.out.println("Det 3x3: " + det3x3(M3));
        System.out.println("Inverse 3x3:"); print(inverse3x3(M3));
    }
}
