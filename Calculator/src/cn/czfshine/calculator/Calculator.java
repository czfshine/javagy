package cn.czfshine.calculator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Map;

public class Calculator extends Application {
    @FXML
    Label displayer;

    @Override
    public void start(Stage primaryStage) throws Exception {

// 创建要放置在 Scene 中的边界面板 brdPaneInScene
        FXMLLoader loader=new FXMLLoader(getClass().getResource("cu.fxml"));
        BorderPane brdPaneInScene =loader.load();
        Controller C=loader.getController();
        C.SetShow();

// 设置边框距离
        //brdPaneInScene.setPadding(new Insets(10, 0, 0, 10));
        //brdPaneInScene.setBottom(grdPaneRight);

// 创建场景，并将 brdPaneInScene 放到场景里
        Scene scene = new Scene(brdPaneInScene);
        scene.getStylesheets().add("main.css");
        Map<Object,Object> map;
        map = scene.getProperties();
// 将场景放到窗口（舞台）里
        primaryStage.setScene(scene);
// 设置窗口的标题
        primaryStage.setTitle("计算器");
// 将窗口设置为不可调整大小
        primaryStage.setResizable(true);
// 显示窗口

        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }
}