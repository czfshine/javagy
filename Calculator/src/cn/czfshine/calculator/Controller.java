package cn.czfshine.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

import java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.exp;

public  class Controller {

        @FXML
        Label displayer;
        private core c =new core();
        Shower S;
        public  void SetShow(){
                S=new Shower();
                S.dis=displayer;
                c.SetShower(S);
        }
        //CONSTANTS
        @FXML
        private void e(ActionEvent event){
                c.push(exp(1));
        }
        @FXML
        private void pi(ActionEvent event){
                c.push(PI);
        }

        //FUNCTIONS
        @FXML
        private void sum(ActionEvent event){}
        @FXML
        private void power2(ActionEvent event){}
        @FXML
        private void power3(ActionEvent event){}
        @FXML
        private void product(ActionEvent event){}
        @FXML
        private void fact(ActionEvent event){}
        @FXML
        private void mod(ActionEvent event){}
        @FXML
        private void integral(ActionEvent event){}
        @FXML
        private void ln(ActionEvent event){}
        @FXML
        private void log(ActionEvent event){}
        @FXML
        private void sin(ActionEvent event){}
        @FXML
        private void cos(ActionEvent event){}
        @FXML
        private void tan(ActionEvent event){}

        //PATTERNS
        @FXML
        private void inv(ActionEvent event){}
        @FXML
        private void deg(ActionEvent event){}


        //MEMORY
        long mem;
        @FXML
        private void memoryclean(ActionEvent event){}
        @FXML
        private void memoryadd(ActionEvent event){}
        @FXML
        private void memorysub(ActionEvent event){}
        @FXML
        private void memoryreset(ActionEvent event){}

        //EDIT
        @FXML
        private void LR(ActionEvent event){}
        @FXML
        private void RR(ActionEvent event){}
        @FXML
        private void clean(ActionEvent event){
            displayer.setText("");
        }
        @FXML
        private void del(ActionEvent event){}
        @FXML
        private void dot(ActionEvent event){}

        //OPERATORS
        @FXML
        private void add(ActionEvent event){}
        @FXML
        private void sub(ActionEvent event){}
        @FXML
        private void mul(ActionEvent event){}
        @FXML
        private void div(ActionEvent event){}
        @FXML
        private void eq(ActionEvent event){}

        //NUMBERS
        @FXML
        private void num(ActionEvent event) {
            Button source=(Button) event.getSource();
            System.out.println (source.getText());
            displayer.setText(displayer.getText()+source.getText());
        }

    }

