import java.io.File;
import java.util.ArrayList;

/**
 * @author:czfshine
 * @date:2018/2/14 20:03
 */

public class ImageDir {
    private String path;

    ImageDir(String path){
        this.path=path;
    }

    public String[] getAllImageMd5(){
        File inpath=new File(path);
        ArrayList<String> res=new ArrayList<>();
        if(inpath.isDirectory()){
            for(File child1:inpath.listFiles(File::isDirectory)){

                for(File child2:child1.listFiles(File::isDirectory)){
                   for(File imgfile:child2.listFiles()  ){
                       String imgfilename=imgfile.getName();
                       if(imgfilename.equals(".nomedia")){
                           //imgfile.delete();
                           continue;
                       }
                       if(imgfilename.startsWith("th_capture_")){
                           continue;
                       }
                       if(imgfilename.startsWith("th_")){

                           if(imgfilename.endsWith("hd")){
                               res.add("hd"+imgfilename.substring(3,imgfilename.length()-2));
                           }else{
                               res.add("th"+imgfilename.substring(3));
                           }
                           continue;
                       }

                       if(imgfilename.startsWith("static_map_")){
                           continue;
                       }
                       if(imgfilename.endsWith("_backup_hd") || imgfilename.endsWith("_backupnull")){

                           continue;
                       }

                       if(imgfilename.endsWith("temp")){
                           res.add("te"+imgfilename.substring(0,imgfilename.length()-5));
                           continue;
                       }

                       if(imgfilename.endsWith("temp.jpg")){
                           res.add("tp"+imgfilename.substring(0,imgfilename.length()-9));
                           continue;
                       }

                       if(imgfilename.endsWith("temp.png")){
                           res.add("tp"+imgfilename.substring(0,imgfilename.length()-9));
                           continue;
                       }
                       if(imgfilename.length()==32){
                            res.add("pu"+imgfilename);
                            continue;
                       }
                       if(imgfilename.length()==13){
                           continue;
                       }
                       if(imgfilename.startsWith("capture_")){
                           continue;
                       }
                       res.add("jp"+imgfilename.substring(0,imgfilename.length()-4));

                   }
                }

            }
        }
        String[] re=new String[res.size()];
        return res.toArray(re);
    }
}
