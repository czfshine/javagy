package cn.czfshine.tools.packjpg;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author:czfshine
 * @date:2018/5/8 10:53
 */

public class PackPool {
    private int MAXTHREAD=4;
    private int cur=0;
    private int all=0;
    static  private PackPool thepool;

    static {
        thepool=new PackPool();
    }

    public static PackPool getThePool(){
        return thepool;
    }
    Queue<String> q=new LinkedBlockingQueue<>();
    public void addFile(String string){
        q.add(string);
    }

    private class CallBack implements Runnable{

        @Override
        public void run() {
            PackPool packPool =PackPool.getThePool();
            if(q.size()>0){
                new PackJPG(q.poll()).start();
                System.out.printf("%05d/%05d",cur++,all);
            }
        }
    }

    public void start(){
        PackJPG.setCallback(new CallBack());
        all=q.size();
        System.out.println("Count:"+q.size());
        for(int i=0;i<Math.min(q.size(),MAXTHREAD);i++){
            new PackJPG(q.poll()).start();
            System.out.printf("%05d/%05d",cur++,all);
        }
    }
}
