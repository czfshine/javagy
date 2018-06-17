package cn.czfshine.tools.packjpg;

import java.util.concurrent.TimeUnit;

/**
 * @author:czfshine
 * @date:2018/5/8 10:17
 */

public class PackJPG extends Thread {
    private Thread t;
    private String threadName;

    PackJPG( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    private static Runnable callback;
    public static void setCallback(Runnable callback){
        PackJPG.callback=callback;
    }
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            Process process = Runtime.getRuntime().exec("D:\\packjpg\\packJPG.exe -np "+threadName);
            process.waitFor(1,TimeUnit.MINUTES);
            if(process.isAlive()){
                System.out.println("timeout & kill "+threadName);
                process.destroy();

            }
        }catch (Exception e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        if(callback!=null){
            callback.run();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting "+threadName);
        super.start();
    }
}
