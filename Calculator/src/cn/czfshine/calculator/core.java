package cn.czfshine.calculator;

import com.sun.media.sound.SF2GlobalRegion;

/**
 * Created by czfshine on 2017/6/11.
 */
public class core {

    double num;
    Shower s;
    public void core(Shower S){
        s=S;
    }

    public void SetShower(Shower S){
        s=S;
    }
    public void push(double n){
        num=n;
        toshow();
    }
    void toshow(){
        System.out.println(num);
        s.push(String.valueOf(num));
    }
}
