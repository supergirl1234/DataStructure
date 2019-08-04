package p;

import java.io.*;
import java.nio.file.Paths;

public class File2 {


    public static  void test2(){

        File file=Paths.get("D:","test","output1.txt").toFile();
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();

        }

        OutputStream out=null;
        try {
            out=new FileOutputStream(file);
            out.write(65);

            byte[] data=new byte[]{65,66,67,68,69};
            out.write(data);

            byte[] data2=new byte[]{10,68,69,79,80};
            out.write(data2,1,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
    public static void main(String[] args) {
        test2();

    }
}
