package cn.czfshine.calculator;

import javafx.scene.control.Label;

/**
 * Created by czfshine on 2017/6/11.
 */
public class Shower {
    Label dis;
    public void Shower(Label dis){
        this.dis=dis;
    }

    public void push(String s){
        dis.setText(s);
    }
}
