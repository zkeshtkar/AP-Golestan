package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.Admin;
import model.PageLoader;
import model.Profosser;
import model.Student;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Controller {
    public static Student whichStudent;
    public static Profosser WhichProfosser;
    public static int which;
    @FXML
    public Button button;
    @FXML
    public TextField usernameField,Degree;
    @FXML
    public PasswordField passwordField;
    @FXML
    public Label wrongPassword;
    @FXML
    public Button closeButton;
    @FXML
    private Label timeLable;

    public void Exit(ActionEvent actionEvent)
    {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
    public static ArrayList<Student> ArrayStudent= new ArrayList<model.Student>();
    public static ArrayList<Profosser> ArrayProfosser= new ArrayList<Profosser>();
   static Admin A=new Admin("Zahra","97243057",true);
    public void currentDate(){
        Thread clock  = new Thread(){
            public void run(){
                for(;;){

                    Calendar cal = new GregorianCalendar();

                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);

                    timeLable.setText(day+"/"+(((month+1)<10)?"0"+(month+1):(month+1))+"/"+year+"  "
                            + hour+":"+minute+":"+second
                    );

                    try {
                        sleep(1000);//1000 miliseconds it will sleep which means one second sleep
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        };
        clock.start();
    }


    @FXML
    private void initialize() {
        Date date = new Date();
        timeLable.setText(date.toString());


    }

    public void Enter(ActionEvent actionEvent) throws IOException {

        if(D( Degree.getText())) {
            if(Degree.getText().equalsIgnoreCase("ADMIN") || Degree.getText().equalsIgnoreCase("ادمین "))
            {
                new PageLoader().load("/view/Admin2.fxml");

            }

            if(Degree.getText().equalsIgnoreCase("STUDENT") || Degree.getText().equalsIgnoreCase("دانشجو"))
            {
                new PageLoader().load("/view/Student.fxml");
            }
            if(Degree.getText().equalsIgnoreCase("PROFOSSER") || Degree.getText().equalsIgnoreCase("استاد"))
            {
                new PageLoader().load("/view/P.fxml");
            }


        }
            else
            {
                wrongPassword.setVisible(true);
            }

    }
    public static boolean textIsPersian(String s) {
        for (int i = 0; i < Character.codePointCount(s, 0, s.length()); i++) {
            int c = s.codePointAt(i);
            if (c >= 0x0600 && c <= 0x06FF || c == 0xFB8A || c == 0x067E || c == 0x0686 || c == 0x06AF)
                return true;
        }
        return false;
    }


    public boolean D(String STR) {
        if (STR.equalsIgnoreCase("ADMIN") || STR.equalsIgnoreCase("ادمین ")) {
            if (usernameField.getText().equalsIgnoreCase(A.getUserName()) && passwordField.getText().equalsIgnoreCase(A.getPassWord())) {
                return true;
            } else {
                return false;
            }
        }
        int count = 0;

        int LengthStudent = ArrayStudent.size();

        if (STR.equalsIgnoreCase("STUDENT") || STR.equalsIgnoreCase("دانشجو")) {

            for (int i = 0; i < LengthStudent; i++) {
                if (ArrayStudent.get(i).getUserName().equalsIgnoreCase(usernameField.getText()) && ArrayStudent.get(i).getPassWord().equalsIgnoreCase(passwordField.getText())) {
                    whichStudent=ArrayStudent.get(i);
                    which=i;
                    return true;
                }
            }
            return false;
        }
        if (STR.equalsIgnoreCase("Professor") || STR.equalsIgnoreCase("استاد"))
        {
            for (int i = 0; i <ArrayProfosser.size(); i++) {
                if (ArrayProfosser.get(i).getUserName().equalsIgnoreCase(usernameField.getText()) && ArrayProfosser.get(i).getPassWord().equalsIgnoreCase(passwordField.getText())) {
                    WhichProfosser=ArrayProfosser.get(i);
                    return true;
                }
            }
            return false;

        }

return false;


    }

    public void Dgree(ActionEvent actionEvent) {
    }


    public void register(ActionEvent actionEvent) throws IOException {

        new PageLoader().load("/view/Register.fxml");
    }
    public void IsPersian(KeyEvent keyEvent) {
        if(textIsPersian(keyEvent.getText()))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی لطفا صفحه ی کلید خود را به انگلیسی  تغییر دهید");
            alert.showAndWait();
            usernameField.clear();

        }
    }

    public void IsPersian2(KeyEvent keyEvent) {
        if(textIsPersian(keyEvent.getText()))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی لطفا صفحه ی کلید خود را به انگلیسی  تغییر دهید");
            alert.showAndWait();
            passwordField.clear();
        }
    }
}

