package com.epam;

public class MathOperation {
	MathOperation(){
		myltiply(); 
	}
	void myltiply() {
		int[][] matr1 = 
            {{1, 4, 5},
             {33, 7, 9},
             {12, 14, 6}};
        
        int[][] matr2 = 
            {{17,1,3},
             {43,5,17},
             {7,15,25}};

        
        int m1 = matr1.length;
        int m0 = matr2[0].length;
        int m2 = matr2.length;
        int[][] res = new int[m1][m2];
        
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m0; k++) {
                    res[i][j] += matr1[i][k] * matr2[k][j]; 
                }
            }
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
 
}
}
