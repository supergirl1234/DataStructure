package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
*  某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，每批客人有两个参数:b人数，c预计消费金额。
*  在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，使得总预计消费金额最大
*
*
*
*
*  输入包括m+2行。
*  第一行两个整数n(1 <= n <= 50000),m(1 <= m <= 50000)
*  第二行为n个参数a,即每个桌子可容纳的最大人数,以空格分隔,范围均在32位int范围内。
 *  接下来m行，每行两个参数b,c。分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。
*
* 注意:桌子可容纳的最大人数可能会是一样的，例如：1 2 2 2 3 3 3 5
所以在二分的时候，我们要找到最左边的那个重复的，如果找到其他的，是不行的，如果二分没有找到相应
的桌子，就需要返回比他大一点的桌子。
*
* */
public class Resurant {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();//n张桌子
            int m=in.nextInt();//m批客人
            long max=0L;
            int[] a=new int[n];
            int[] vis=new int[n];//标记，查看这个桌子是否被占用了，1表示占用

            int[][] num=new int[m][2];
            for(int i=0;i<n;i++){//每个桌承受人数
                a[i]=in.nextInt();
            }
            Arrays.sort(a);//每个桌承受人数排序

            for(int i=0;i<m;i++){
                num[m][0]=in.nextInt();
                num[m][1]=in.nextInt();
            }

            Arrays.sort(num, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1]-o1[1];//按预计消费金额排序
                }
            });//排序

            for(int i=0;i<m;i++){ //遍历m批人
                if(a[n-1]<num[i][0]){//桌子容纳人数<每批人数

                    continue;
                }

                int nu=num[i][0];//人数
                int price=num[i][i];//价值

                /*找到nu在a中的位置，a是按从小到大的顺序排序的*/
                int index=dic(nu,a);
                /*向后找到没有被占用的桌子*/
                while(index<n && vis[index]==1){

                    index++;
                }
                if(index<n){

                    max+=price;
                    vis[index]=1;
                }

            }

            System.out.println(max);

        }
    }

    private static int dic(int num, int[] a) {
        int left=0;
        int right=a.length-1;
        int mid=0;
        while(left<=right){

            mid=(left+right)/2;
            if(num<=a[mid]){
                right=mid-1;

            }else{

                left=mid+1;
            }
        }

        return  left;
    }
}
