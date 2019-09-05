package com;


import java.util.Arrays;

/*给定一个二进制矩阵，先水平翻转矩阵，再反转矩阵并返回结果
* 水平翻转[1,1,0] 为[0,1,1]
* 反转的意思是：矩阵中的0全部被替换，1全部被0替换
* */
public class ResverseArray {

    public static void resverse(int[][] array){

        for(int i=0;i<array.length;i++){//行
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<array[i].length;j++) {
                sb.append(array[i][j]);
            }
            sb=sb.reverse();//逆序
            for(int k=0;k<array[i].length;k++){

                array[i][k]=1-Integer.parseInt(sb.substring(k,k+1));//重新放回原数组，并且如果是0，改为1；如果是1，改为0
            }
        }
    }

    public static void main(String[] args) {
        int[][] array=new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        resverse(array);
         for(int i=0;i<array.length;i++){
             for(int j=0;j<array[i].length;j++){
                 System.out.print(array[i][j]+"  ");

             }
             System.out.println();
         }
    }
}
