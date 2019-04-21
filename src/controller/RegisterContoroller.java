package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.PageLoader;
import model.Profosser;
import model.Student;

import java.io.*;

import static controller.Controller.A;

public class RegisterContoroller {
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
    public RadioButton Man;
    public RadioButton woman;
    @FXML
    private Label timeLable;
    private static BufferedWriter outputWriter = null;
    private static BufferedReader outputReader = null;




    public RegisterContoroller() throws IOException {

    }

    public void register(ActionEvent actionEvent) throws IOException {
        boolean ok=true;
        boolean degree=false;
        if(usernameField.getText().isEmpty() || Degree.getText().isEmpty() || passwordField.getText().isEmpty())
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی لطقا تمامی فیلد ها را پر نمایید  ");
            alert.showAndWait();

        }
        for (int i=0;i<Controller.ArrayStudent.size();i++)
        {

            if(usernameField.getText().equalsIgnoreCase(Controller.ArrayStudent.get(i).getUserName()))
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر  گرامی نام کاربری انتخاب شده تکراری می باشد     ");
                alert.showAndWait();
            }

        }
        for (int i=0;i<Controller.ArrayProfosser.size();i++)
        {
            if(usernameField.getText().equalsIgnoreCase(Controller.ArrayProfosser.get(i).getUserName()))
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر  گرامی نام کاربری انتخاب شده تکراری می باشد ");
                alert.showAndWait();
            }
        }
        if((usernameField.getText().equalsIgnoreCase(A.getUserName())))
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nکاربر  گرامی نام کاربری انتخاب شده تکراری می باشد ");
            alert.showAndWait();
        }
        if (passwordField.getText().length()<6)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی رمز عبور شما حداقل باید شامل 6 کاراکتر باشد  ");
            alert.showAndWait();
        }

        if(ok)
        {
            if(Degree.getText().equalsIgnoreCase("Student") || Degree.getText().equalsIgnoreCase("دانشجو"))
            {
                degree=true;
                if(woman.isSelected())
                {
                    Student B=new Student(passwordField.getText(),usernameField.getText(),usernameField.getText(),'f');
                    Controller.ArrayStudent.add(B);
                }
                else
                {
                    Student B=new Student(passwordField.getText(),usernameField.getText(),usernameField.getText(),'M');
                    Controller.ArrayStudent.add(B);
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی درخواست شما با موفقیت انجام شد  ");
                alert.showAndWait();
            }
            if (Degree.getText().equalsIgnoreCase("PROFOSSER") || Degree.getText().equalsIgnoreCase("استاد"))
            {
                   degree=true;
                    if(woman.isSelected())
                    {
                        Controller.ArrayProfosser.add(new Profosser(usernameField.getText(),passwordField.getText(),'f'));
                    }
                    else
                    {
                        Controller.ArrayProfosser.add(new Profosser(usernameField.getText(),passwordField.getText(),'m'));
                    }
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی درخواست شما با موفقیت انجام شد  ");
                    alert.showAndWait();
                    new PageLoader().load("/view/Login2.fxml");
            }
            if(!degree)
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی شما میتوانید یا دانشجو ویا استاد باشید  ");
                alert.showAndWait();
            }
        }
    }
    public void OptOut(ActionEvent actionEvent)  throws IOException {
        new PageLoader().load("/view/Login2.fxml");
    }
}
