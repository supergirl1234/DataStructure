package p;

import java.io.*;
import java.nio.file.Paths;

public class File1 {


    public static void test1(){

        File inputFile = Paths.get("D:","test","input.txt").toFile();
        File outputFile = Paths.get("D:","test","output.txt").toFile();

        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();

        }

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(inputFile);
            out = new FileOutputStream(outputFile);
            int value =-1 ;
            /*读取单个字节，每次读取一个字节的内容，直到没有数据了返回-1*/
            while ((value=in.read())!= -1) {

                /*将读取到的数据进行处理*/
                value=value+32;

                out.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            /*关闭数据流*/
            if(in!=null){

                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){

                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) {

        test1();


    }
}
