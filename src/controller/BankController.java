package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import model.PageLoader;

import java.io.IOException;
import java.util.Random;

public class BankController {
    public Label Bank14;
    public TextField Bank15;
    public ImageView WarningPassImage;
    public Label WarningPassLable;
    public ImageView Warningcvv2Image;
    public Label Warningcvv2Lable;
    public ImageView MahImage;
    public Label MahLable;
    public ImageView image;
    public Label lable;
    Random rand=new Random();
    String M;
    public TextField Bank5;
    public TextField Bank11;
    public TextField Bank9;
    public TextField Bank7;
    public TextField Bank3;
    public TextField Bank1;
    public TextField Bank2;
    public TextField Bank12;
    public TextField Bank13;
    private int counterBank11,counterBank9,counterBank7,counterBank5,counterMah,counterYear,counterBank3=0;
    private String bank11,bank9,bank7,bank5;
    private String NumCart;
    private String PassWordCart;
    private String CVV2;
    private String mahe,Year;
    @FXML
    Label Money;
    @FXML
    private void initialize()
    {
        Money.setText(StudentController.MoneyIncrease);
    }
    public void Bank5(KeyEvent actionEvent) {
        bank5=Bank5.getText();
        counterBank5++;
        if(counterBank5==4)
        {
            NumCart+=bank5;
            Bank5.setDisable(true);
            Bank1.setDisable(false);
        }
    }
    public void Bank11(KeyEvent actionEvent) {
        bank11=Bank11.getText();
        counterBank11++;
        if(counterBank11==4)
        {
            NumCart=bank11;
           Bank11.setDisable(true);
           Bank9.getText();
            Bank9.setDisable(false);
        }
    }
    public void Bank9(KeyEvent actionEvent) {
        bank9=Bank9.getText();
        counterBank9++;
        if(counterBank9==4)
        {
            NumCart+=bank9;
            Bank7.getText();
            Bank9.setDisable(true);
            Bank7.setDisable(false);
        }
    }
    public void Bank7(KeyEvent actionEvent) {
        bank7=Bank7.getText();
        counterBank7++;
        if(counterBank7==4)
        {
            NumCart+=bank7;
            Bank5.getText();
            Bank7.setDisable(true);
            Bank5.setDisable(false);
        }
    }
    public void Bank3(KeyEvent actionEvent) {

    }
    public void Bank1(KeyEvent keyEvent) {
        Bank2.setDisable(false);
        PassWordCart=Bank1.getText();
    }
    public void Bank2(KeyEvent keyEvent) {
        CVV2=Bank2.getText();
        Bank12.setDisable(false);
    }

    public void Bank12(KeyEvent keyEvent) {
        mahe=Bank12.getText();
        counterMah++;
        if(counterMah==3)
        {

            Bank12.setDisable(true);
            Bank13.setDisable(false);

        }

    }


    public void Bank13(KeyEvent keyEvent) {
        Year=Bank13.getText();
        counterYear++;
        if(counterYear==3)
        {
            Bank13.setDisable(true);
            int n=rand.nextInt(1000000);
            M=""+n;
            Bank14.setText(M);

        }
    }
///AZ IN TABE MOGHEYE SABT KARDAN ESTEFADE BAYAD BOKONM
    public void Bank15(ActionEvent actionEvent) {
    }

    public void Pardakht(ActionEvent actionEvent) throws IOException {
        boolean ok=true;
        image.setVisible(false);
        lable.setVisible(false);
        Warningcvv2Image.setVisible(false);
        Warningcvv2Lable.setVisible(false);
        WarningPassImage.setVisible(false);
        WarningPassLable.setVisible(false);
        if(Bank12.getText().isEmpty())
        {
            ok=false;
            MahImage.setVisible(true);
            MahLable.setVisible(true);
            MahLable.setText("لطفا فیلد مورد نظر را پر کنید");
        }
        if ( !Bank15.getText().isEmpty() && !M.equalsIgnoreCase(Bank15.getText())) {
            ok=false;
            image.setVisible(true);
            lable.setVisible(true);
            lable.setText("عبارت وارد شده درست نمی باشد!!!!");
        }
        if (Bank2.getText().isEmpty()) {

            ok=false;
            Warningcvv2Image.setVisible(true);
            Warningcvv2Lable.setVisible(true);
            Warningcvv2Lable.setText("لطفا فیلد مورد نظر را پر کنید");
        }
        if ((Bank2.getText().length() >= 5 || Bank2.getText().length() <= 2) && !Bank2.getText().isEmpty())
        {

            ok=false;
            Warningcvv2Image.setVisible(true);
            Warningcvv2Lable.setVisible(true);
            Warningcvv2Lable.setText("کد cvv2واردشده درست نمی باشد");
        }
        if (Bank1.getText().isEmpty())
        {
            ok=false;
            WarningPassImage.setVisible(true);
            WarningPassLable.setVisible(true);
            WarningPassLable.setText("لطفا فیلد مورد نظر را پر کنید");
        }
        if (Bank1.getText().length()<=4 && !Bank1.getText().isEmpty())
        {
            ok=false;
            WarningPassImage.setVisible(true);
            WarningPassLable.setVisible(true);
            WarningPassLable.setText("رمز وارد شده صحیح نمی باشد ");
        }
        if(!Bank12.getText().isEmpty() && Integer.parseInt(Bank12.getText())>12)
        {
            ok=false;
            MahImage.setVisible(true);
            MahLable.setVisible(true);
            MahLable.setText("تاریخ وارد شده درست نمی باشد");
        }
        if(ok)
        {
            image.setVisible(false);
            lable.setVisible(false);
            Warningcvv2Image.setVisible(false);
            Warningcvv2Lable.setVisible(false);
            WarningPassImage.setVisible(false);
            WarningPassLable.setVisible(false);
            StudentController.MoneyIncrease= StudentController.MoneyIncrease.substring(0,StudentController.MoneyIncrease.length()-4);
             int num=Integer.parseInt(Controller.whichStudent.getCredit())+Integer.parseInt(StudentController.MoneyIncrease)/10;
             Controller.whichStudent.setCredit(""+num);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی درخواست شما با موفقیت انجام شد");
            alert.showAndWait();
            new PageLoader().load("/view/Student.fxml");

        }


    }
    public void FOUR(ActionEvent actionEvent) throws IOException {

        new PageLoader().load("/view/Student.fxml");


    }
}
