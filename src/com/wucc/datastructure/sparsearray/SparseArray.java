package com.wucc.datastructure.sparsearray;

public class SparseArray<main> {
    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        for (int[] row: chessArr1
             ) {
            for (int data: row
                 ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        
        //遍历二维数组记录有效数个数
        int sum =0;
        for (int i = 0;i < 11;i++){
            for (int j =0;j < 11;j++){
                if(chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }


        System.out.println("============================================");
        //创建稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        int count = 0;
        for (int i = 0;i < 11;i++){
            for (int j =0;j < 11;j++){
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        //输出稀疏数组
        for (int i = 0;i < sum + 1;i++){
            for (int j = 0;j < 3;j++){
                System.out.printf("%d\t",sparseArr[i][j]);
            }
            System.out.println();
        }
        System.out.println("============================================");
        //将稀疏数组转为二维数组
        int chessarr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int j = 1; j <= sparseArr[0][2];j++){
            chessarr2[sparseArr[j][0]][sparseArr[j][1]] = sparseArr[j][2];
        }

        for (int[] row: chessarr2
        ) {
            for (int data: row
            ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
}
