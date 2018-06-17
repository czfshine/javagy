import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
@author:czfshine
@date:2018/5/7 20:26
 */

object TestWatch {
    @JvmStatic
    fun main(args: Array<String>) {
        try {

            //创建一个监听服务
            val service = FileSystems.getDefault().newWatchService()
            //设置路径
            val path = Paths.get("D:\\upload")
            //注册监听器
            path.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY)

            var watchKey: WatchKey

            //使用dowhile
            do {
                //获取一个watch key
                watchKey = service.take()
                for (event in watchKey.pollEvents()) {
                    //如果时间列表不为空，打印事件内容
                    val kind = event.kind()
                    val eventPath = event.context() as Path
                    println(eventPath.toAbsolutePath() + ":" + kind + ":" + event.toString())

                }

                println("目录内容发生改变")

            } while (watchKey.reset())
        } catch (e: Exception) {
            e.printStackTrace()

        }

        // 1、通过FileSystems.getDefault().newWatchService()创建一个监听服务；
        // 2、设置路径；
        // 3、对目录注册一个监听器；
        // 4、之后进入循环，等待watch key；
        // 5、此时如果有事件发生可通过watchkey的pollevent()方法获取；
        // 6、之后可以对event处理；
    }
}
fun main(){

}
