package model;

import controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static model.Admin.fileReader;

public class Main extends Application {



    @Override
public void init() throws IOException {

}
@Override
public void start(Stage primaryStage) throws Exception{
   Student student=new Student("123456","Maryam","Maryam","0",'M');
    Student st=new Student("123456","Fatemeh","Fatemeh","10000",'m');
    Student s=new Student("123456","zahra","zahra","10000",'f');
    Student b=new Student("123456","Mina","Mina","10000",'f');
    Controller.ArrayStudent.add(student);
    Controller.ArrayStudent.add(st);
    Controller.ArrayStudent.add(s);
    Controller.ArrayStudent.add(b);
    Profosser P=new Profosser("AliAkbari","123456",'m');
    Profosser m=new Profosser("Malek","123456",'f');
    Controller.ArrayProfosser.add(m);
    Controller.ArrayProfosser.add(P);
    PageLoader.initStage(primaryStage);
    new PageLoader().load("/view/Check.fxml");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
