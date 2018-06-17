import cn.czfshine.tools.packjpg.PackPool;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author:czfshine
 * @date:2018/5/7 20:57
 */

public class FileDiv {
    public static void main(String[] args) throws IOException {

        Files.walkFileTree(Paths.get("D:\\lightroomoutput"), new SimpleFileVisitor<Path>() {


            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                // TODO Auto-generated method stub
                // return super.visitFile(file, attrs);
                //System.out.println("\t正在访问" + file + "文件");
                if (file.toString().endsWith("jpg")) {
                    PackPool.getThePool().addFile(file.toRealPath().toString());
                }
                return FileVisitResult.CONTINUE; // 没找到继续找
            }

        });

        PackPool.getThePool().start();
    }
}
