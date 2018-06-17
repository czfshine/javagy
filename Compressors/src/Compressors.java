/**
 * @author:czfshine
 * @date:2018/2/14 19:34
 */

import org.apache.commons.codec.digest.DigestUtils;

import java.io.FileInputStream;
import java.io.IOException;


public class Compressors {
    public static void  main(String [] args ) throws IOException {
        String path="D:\\commons-codec-1.11-bin.zip";
        System.out.println( DigestUtils.md5Hex(new FileInputStream(path)));
        String[] md5s=new ImageDir("D:\\0e8d10eeaf7e4e90722adef8de9dca68\\image2").getAllImageMd5();
        System.out.println(md5s.length);
        for(String md5 :md5s){
            if(md5.length()!=34){
                System.out.println(md5);
            }
        }
    }
}
