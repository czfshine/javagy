package cn.czfshine.tools.packjpg;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * @author:czfshine
 * @date:2018/5/8 11:09
 */

public class PackPoolTest {


    public static void main(String[] args) {

        PackPool packPool=PackPool.getThePool();
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\P71111-161006.jpg");
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\mmexport1488859383726-2.jpg");
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\mmexport1507373342659.jpg");
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\微信图片_20180409233436.jpg");
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\微信图片_20180409233447.jpg");
        packPool.addFile("C:\\Users\\czfshine\\Desktop\\推文素材\\cyj\\微信图片_20180409233453.jpg");
        packPool.start();
    }
}