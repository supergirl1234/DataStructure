package com;


/*找出字符串中连续最长的数字串*/
public class LongNumString {
    public  static  String Long(String str){
          int count=0;
          int max=0;//最长的数字串的长度
          int end=0;//记录数字结束的下标
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count++;
                if(count>max){
                    max=count;
                    end=i;
                }
            }else{
                count=0;
            }
        }
        return  str.substring(end-max+1,end+1);//左闭右开
    }
    public static void main(String[] args) {
        String string="123fgkkt34566789wkkke2";
        String result=Long(string);
        System.out.println(result);
    }
}
