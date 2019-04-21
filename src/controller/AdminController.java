package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import model.Admin;
import model.Book;
import java.io.IOException;
import java.util.ArrayList;
import static controller.Controller.A;
import static controller.Controller.whichStudent;
import static model.Admin.fileReader;
import model.PageLoader;

public class AdminController {
    ///ino az inja bardar khaheshannnnnnnnn://////ino private kon bad brash setter getter bezar
    public static String[][] ArreyFood = new String[5][4];
    public static int [][]PriceFood= new int[5][4];
    public MenuButton pro;
    public Button PrePre;
    public Button NextNext;
    public Label Num1,Num2,Num3,Num4,Num5,Num6,UserName1,UserName2,UserName3,UserName4,UserName5,UserName6,PassWord1,PassWord2,PassWord3,PassWord4,PassWord5,PassWord6,UserNameP,PassWordP,P;
    public Line P2,P1,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12;
    public Button PrePreStudent;
    public Button NextNextStudent;
    public ImageView ImageProfileWoman;
    public Label NameKarbariPro;
    public Label PassAdmin;
    public Label UserAdminPro;
    public Label PassAdminPro;
    public ImageView ImageProfileMan;
    public Label AdminName;
    private Label[]Profile4=new Label[12];
    private Label[]PP=new Label[12];
    private Label[]NumberProfosser=new Label[6];

    public static ArrayList<Book> ArreyBook = new ArrayList<Book>();
    public static ArrayList<model.Class> ArreyNameClass = new ArrayList<model.Class>();
    public static ArrayList<String> ArreyNameProfosser = new ArrayList<String>();
    public Label confirmUser;
    public Label confirmpass;
    public Label newUsrnameLable;
    public Label newPsswordLable;
    public Label oldUsernameLable;
    public Label OldPasswordLable;
    public ImageView i5;
    public ImageView i6;
    public ImageView i2;
    public ImageView i3;
    public ImageView i4;
    public ImageView i1;
    public TextField confirmNewUsername;
    public TextField confirmNewPassword;
    public TextField newUsername;
    public TextField newPassword;
    public TextField oldUsername;
    public TextField oldPassword;
    public Label System1;
    public Label System2,System3,System4;
    public Label System5;
    public Label System6,System7,System8,System9,System10,System11,System12,System13,System14,System15;
    public Button RezervButton;
    public Line ProfileClass16,ProfileClass17,ProfileClass18,ProfileClass19,ProfileClass20,ProfileClass15;
    public Label ProfileClass1,ProfileClass2,ProfileClass3,ProfileClass4,ProfileClass5,ProfileClass6,ProfileClass7,ProfileClass8,ProfileClass9,ProfileClass10,ProfileClass11,ProfileClass12,ProfileClass13,ProfileClass14;
    public Button PreProfileClass;
    public Button NextProfileClass;
    @FXML
    private Label adminname;
    @FXML
    MenuButton Information, Days,Book1;
    @FXML
    TextField Saturday14, Saturday16, Saturday15, Saturday17, Saturday3, Sunday14, Sunday16, Sunday15, Sunday17, Sunday3, Monday14, Monday16, Monday15, Monday17, Monday3, Tuesday14, Tuesday16, Tuesday15, Tuesday17, Tuesday3,
            Wednesday14, Wednesday16, Wednesday15, Wednesday17, Wednesday3,Book6,Book7,Book8,Wednesday21,Wednesday22,Wednesday23,Wednesday24,Tuesday22,Tuesday23,Tuesday24,Tuesday25,Monday22,Monday23,Monday24,Monday25,
            Sunday22,Sunday23,Sunday24,Sunday25,Saturday22,Saturday23,Saturday24,Saturday25;
    @FXML
    Label text1, text2, text3, lable6, lable7, lable8, text4, lable5, lable4, Saturday1, Saturday2, Saturday4, Saturday5, Saturday6, Saturday7, Saturday8, Saturday9, Saturday10, Saturday11, Saturday12, Saturday13,
            Sunday1, Sunday2, Sunday4, Sunday5, Sunday6, Sunday7, Sunday8, Sunday9, Sunday10, Sunday11, Sunday12, Sunday13,Sunday18,Sunday19,Sunday20,Sunday21,
            Monday1, Monday2, Monday4, Monday5, Monday6, Monday7, Monday8, Monday9, Monday10, Monday11, Monday12, Monday13,Monday18,Monday19,Monday20,Monday21,
            Tuesday1, Tuesday2, Tuesday4, Tuesday5, Tuesday6, Tuesday7, Tuesday8, Tuesday9, Tuesday10, Tuesday11, Tuesday12, Tuesday13,Tuesday18,Tuesday19,Tuesday20,Tuesday21,
            Wednesday1, Wednesday2, Wednesday4, Wednesday5, Wednesday6, Wednesday7, Wednesday8, Wednesday9, Wednesday10, Wednesday11, Wednesday12, Wednesday13,
            Book3,Book4,Book5,Wednesday18,Wednesday25,Wednesday19,Wednesday20,Saturday18,Saturday21,Saturday19,Saturday20;

    @FXML
    Button System16,Emal, Emal2, HowMuchFood, HowMuchFoodSunday, Emal2Sunday, Emal2Monday, HowMuchFoodMonday, Emal2Tuesday, HowMuchFoodTuesday, Emal2Wednesday, HowMuchFoodWednesday,Book9;
    @FXML
    PasswordField PassWordfield1, PassWordfield2, PassWordfield3;
    @FXML
    TextArea Book10;
    @FXML
    HBox Book11,Book12;
    @FXML
    ImageView Book2;

    @FXML
    private void initialize() {
        AdminName.setText(A.getUserName());
        SettingVisibleAdminPro(false);
        SettingVisibleProStudent(false);
        Information.setVisible(true);
        SettingVisibleBook(false);
        SettingVisible2(false);
        RezervButton.setVisible(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleStudent(false);
        Profile4[0]=ProfileClass3;
        Profile4[1]=ProfileClass4;
        Profile4[2]=ProfileClass5;
        Profile4[3]=ProfileClass6;
        Profile4[4]=ProfileClass7;
        Profile4[5]=ProfileClass8;
        Profile4[6]=ProfileClass9;
        Profile4[7]=ProfileClass10;
        Profile4[8]=ProfileClass11;
        Profile4[9]=ProfileClass12;
        Profile4[10]=ProfileClass13;
        Profile4[11]=ProfileClass14;
        PP[0]=UserName1;
        PP[1]=PassWord1;
        PP[2]=UserName2;
        PP[3]=PassWord2;
        PP[4]=UserName3;
        PP[5]=PassWord3;
        PP[6]=UserName4;
        PP[7]=PassWord4;
        PP[8]=UserName5;
        PP[9]=PassWord5;
        PP[10]=UserName6;
        PP[11]=PassWord6;
        NumberProfosser[0]=Num1;
        NumberProfosser[1]=Num2;
        NumberProfosser[2]=Num3;
        NumberProfosser[3]=Num4;
        NumberProfosser[4]=Num5;
        NumberProfosser[5]=Num6;
        pro.setVisible(false);
        SettingVisibleStudent(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleWednesday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
    }
    public void SettingVisibleBook(boolean chumchi) {
        Book1.setVisible(chumchi);
        Book2.setVisible(chumchi);
        Book3.setVisible(chumchi);
        Book4.setVisible(chumchi);
        Book5.setVisible(chumchi);
        Book6.setVisible(chumchi);
        Book7.setVisible(chumchi);
        Book8.setVisible(chumchi);
        Book9.setVisible(chumchi);
        Book11.setVisible(chumchi);
        Book12.setVisible(chumchi);
    }
    public void SetingViibleSystem(boolean chumchi) {
        SettingVisibleProStudent(false);
        SettingVisible2(false);
        pro.setVisible(false);
        text2.setVisible(chumchi);
        text3.setVisible(chumchi);
        text4.setVisible(chumchi);
        Emal.setVisible(chumchi);
        lable4.setVisible(chumchi);
        lable5.setVisible(chumchi);
        lable6.setVisible(chumchi);
        lable7.setVisible(chumchi);
        lable8.setVisible(chumchi);
        PassWordfield1.setVisible(chumchi);
        PassWordfield2.setVisible(chumchi);
        PassWordfield3.setVisible(chumchi);
    }
    public void SettingVisible2(boolean chumchi)
    {
        oldPassword.setVisible(chumchi);
        oldUsername.setVisible(chumchi);
        newPassword.setVisible(chumchi);
        newUsername.setVisible(chumchi);
        confirmNewPassword.setVisible(chumchi);
        confirmNewUsername.setVisible(chumchi);
        i1.setVisible(chumchi);
        i4.setVisible(chumchi);
        i3.setVisible(chumchi);
        i2.setVisible(chumchi);
        i6.setVisible(chumchi);
        i5.setVisible(chumchi);
        OldPasswordLable.setVisible(chumchi);
        oldUsernameLable.setVisible(chumchi);
        newPsswordLable.setVisible(chumchi);
        newUsrnameLable.setVisible(chumchi);
        confirmpass.setVisible(chumchi);
        confirmUser.setVisible(chumchi);
        System1.setVisible(chumchi);
        System2.setVisible(chumchi);
        System3.setVisible(chumchi);
        System4.setVisible(chumchi);
        System5.setVisible(chumchi);
        System6.setVisible(chumchi);
        System7.setVisible(chumchi);
        System8.setVisible(chumchi);
        System9.setVisible(chumchi);
        System10.setVisible(chumchi);
        System11.setVisible(chumchi);
        System12.setVisible(chumchi);
        System13.setVisible(chumchi);
        System14.setVisible(chumchi);
        System15.setVisible(chumchi);
        System16.setVisible(chumchi);
        //System17.setVisible(chumchi);

    }
    public void SettingVisibleAdminPro(boolean chumchi)
    {
        ImageProfileMan.setVisible(chumchi);
        ImageProfileWoman.setVisible(chumchi);
        NameKarbariPro.setVisible(chumchi);
        UserAdminPro.setVisible(chumchi);
        PassAdmin.setVisible(chumchi);
        PassAdminPro.setVisible(chumchi);
    }
    public void SettingVisibleProStudent(boolean chumchi)
    {
        UserName1.setVisible(chumchi);
        UserName2.setVisible(chumchi);
        UserName3.setVisible(chumchi);
        UserName4.setVisible(chumchi);
        UserName5.setVisible(chumchi);
        UserName6.setVisible(chumchi);
        PassWord1.setVisible(chumchi);
        PassWord2.setVisible(chumchi);
        PassWord3.setVisible(chumchi);
        PassWord4.setVisible(chumchi);
        PassWord5.setVisible(chumchi);
        PassWord6.setVisible(chumchi);
        P.setVisible(chumchi);
        UserNameP.setVisible(chumchi);
        PassWordP.setVisible(chumchi);
        PrePre.setVisible(chumchi);
        NextNext.setVisible(chumchi);

        P1.setVisible(chumchi);
        P2.setVisible(chumchi);
        P3.setVisible(chumchi);
        P4.setVisible(chumchi);
        P5.setVisible(chumchi);
        P6.setVisible(chumchi);
        P7.setVisible(chumchi);
        P8.setVisible(chumchi);
        P9.setVisible(chumchi);
        P10.setVisible(chumchi);
        P11.setVisible(chumchi);
        P12.setVisible(chumchi);

        Num1.setVisible(chumchi);
        Num2.setVisible(chumchi);
        Num3.setVisible(chumchi);
        Num4.setVisible(chumchi);
        Num5.setVisible(chumchi);
        Num6.setVisible(chumchi);

    }
    public void SettingVisibleProfileClassMenu(boolean chum)
    {
        ProfileClass1.setVisible(chum);
        ProfileClass2.setVisible(chum);
        ProfileClass3.setVisible(chum);
        ProfileClass4.setVisible(chum);
        ProfileClass5.setVisible(chum);
        ProfileClass6.setVisible(chum);
        ProfileClass7.setVisible(chum);
        ProfileClass8.setVisible(chum);
        ProfileClass9.setVisible(chum);
        ProfileClass10.setVisible(chum);
        ProfileClass11.setVisible(chum);
        ProfileClass12.setVisible(chum);
        ProfileClass13.setVisible(chum);
        ProfileClass14.setVisible(chum);
        ProfileClass15.setVisible(chum);
        ProfileClass16.setVisible(chum);
        ProfileClass17.setVisible(chum);
        ProfileClass18.setVisible(chum);
        ProfileClass19.setVisible(chum);
        ProfileClass20.setVisible(chum);
        PreProfileClass.setVisible(chum);
        NextProfileClass.setVisible(chum);
    }

    public void SettingVisibleStudent(boolean chumchi)
    {
        UserName1.setVisible(chumchi);
        UserName2.setVisible(chumchi);
        UserName3.setVisible(chumchi);
        UserName4.setVisible(chumchi);
        UserName5.setVisible(chumchi);
        UserName6.setVisible(chumchi);
        PassWord1.setVisible(chumchi);
        PassWord2.setVisible(chumchi);
        PassWord3.setVisible(chumchi);
        PassWord4.setVisible(chumchi);
        PassWord5.setVisible(chumchi);
        PassWord6.setVisible(chumchi);
        P.setVisible(chumchi);
        UserNameP.setVisible(chumchi);
        PassWordP.setVisible(chumchi);
        PrePreStudent.setVisible(chumchi);
        NextNextStudent.setVisible(chumchi);
        P1.setVisible(chumchi);
        P2.setVisible(chumchi);
        P3.setVisible(chumchi);
        P4.setVisible(chumchi);
        P5.setVisible(chumchi);
        P6.setVisible(chumchi);
        P7.setVisible(chumchi);
        P8.setVisible(chumchi);
        P9.setVisible(chumchi);
        P10.setVisible(chumchi);
        P11.setVisible(chumchi);
        P12.setVisible(chumchi);

        Num1.setVisible(chumchi);
        Num2.setVisible(chumchi);
        Num3.setVisible(chumchi);
        Num4.setVisible(chumchi);
        Num5.setVisible(chumchi);
        Num6.setVisible(chumchi);

    }
    public void changeUsername(ActionEvent actionEvent) {
        SettingVisible2(true);
    }

    public void ChangePassword(ActionEvent actionEvent) {
        SettingVisibleStudent(false);
        SettingVisibleProfileClassMenu(false);
        SetingViibleSystem(true);
        SettingVisibleSaturday(false);
        Days.setVisible(false);
        RezervButton.setVisible(false);
        SettingVisibleAdminPro(false);
    }

    public void EmaleTaghiratPassWord(ActionEvent actionEvent) throws IOException {
        boolean empty = false;
        boolean equal = false;
        boolean ok = true;
        if (PassWordfield1.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n رمز عبور فعلی نمی تواند خالی باشد");
            empty = true;
            ok = false;
            alert.showAndWait();
        }
        if (PassWordfield2.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n رمز عبور جدید نمی تواند خالی باشد");
            empty = true;
            ok = false;
            alert.showAndWait();
        }
        if (PassWordfield2.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تایید رمز  عبور جدید نمی تواند خالی باشد");
            empty = true;
            ok = false;
            alert.showAndWait();
        }
        if (!empty && !PassWordfield2.getText().equals(PassWordfield3.getText())) {
            equal = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n رمز عبور  جدید با تاییدرمزعبور  مطابقت ندارد ");
            alert.showAndWait();
        }
        if (!empty && !PassWordfield1.getText().equals(fileReader.toString())) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nرمز عبور فعلی شما  اشتباه می باشد  ");
            alert.showAndWait();
        }
        if (!empty && !equal && PassWordfield2.getText().length() < 6) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nرمز عبور جدید  شما حداقل باید شامل 6 کاراکتر باشد  ");
            alert.showAndWait();
        }
        if (ok) {
           A.setPassWord(PassWordfield2.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nرمز عبور با موفقیت تغییر یافت   ");
            alert.showAndWait();
        }

    }

    public void System(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProfileClassMenu(false);
        pro.setVisible(false);
        RezervButton.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        Information.setVisible(true);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
//        SetingViibleSystem(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleWednesday(false);
        SettingVisibleBook(false);

    }

    public void Food(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        pro.setVisible(false);
        RezervButton.setVisible(false);
        Information.setVisible(false);
        SettingVisible2(false);
///        SetingViibleSystem(false);
        Days.setVisible(true);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleBook(false);
        SettingVisibleProfileClassMenu(false);
    }

    public void SettingVisibleSaturday(boolean chumchi) {
        Saturday1.setVisible(chumchi);
        Saturday2.setVisible(chumchi);
        Saturday3.setVisible(chumchi);
        Saturday4.setVisible(chumchi);
        Saturday5.setVisible(chumchi);
        Saturday6.setVisible(chumchi);
        Saturday7.setVisible(chumchi);
        Saturday8.setVisible(chumchi);
        Saturday14.setVisible(chumchi);
        Saturday15.setVisible(chumchi);
        Saturday16.setVisible(chumchi);
        Saturday17.setVisible(chumchi);

        Saturday18.setVisible(chumchi);
        Saturday19.setVisible(chumchi);
        Saturday20.setVisible(chumchi);
        Saturday21.setVisible(chumchi);
        Saturday22.setVisible(chumchi);
        Saturday23.setVisible(chumchi);
        Saturday24.setVisible(chumchi);
        Saturday25.setVisible(chumchi);
        HowMuchFood.setVisible(chumchi);
        Emal2.setVisible(chumchi);
        RezervButton.setVisible(false);
    }

    public void SettingVisibleSunday(boolean chumchi) {
        Sunday1.setVisible(chumchi);
        Sunday2.setVisible(chumchi);
        Sunday3.setVisible(chumchi);
        Sunday4.setVisible(chumchi);
        Sunday5.setVisible(chumchi);
        Sunday6.setVisible(chumchi);
        Sunday7.setVisible(chumchi);
        Sunday8.setVisible(chumchi);
        Sunday9.setVisible(chumchi);
        Sunday14.setVisible(chumchi);
        Sunday15.setVisible(chumchi);
        Sunday16.setVisible(chumchi);
        Sunday17.setVisible(chumchi);

        Sunday18.setVisible(chumchi);
        Sunday19.setVisible(chumchi);
        Sunday20.setVisible(chumchi);
        Sunday21.setVisible(chumchi);
        Sunday22.setVisible(chumchi);
        Sunday23.setVisible(chumchi);
        Sunday24.setVisible(chumchi);
        Sunday25.setVisible(chumchi);
        HowMuchFoodSunday.setVisible(chumchi);
        Emal2Sunday.setVisible(chumchi);
        RezervButton.setVisible(false);
    }


    public void SettingVisibleMonday(boolean chumchi) {
        Monday1.setVisible(chumchi);
        Monday2.setVisible(chumchi);
        Monday3.setVisible(chumchi);
        Monday4.setVisible(chumchi);
        Monday5.setVisible(chumchi);
        Monday6.setVisible(chumchi);
        Monday7.setVisible(chumchi);
        Monday8.setVisible(chumchi);
        Monday9.setVisible(chumchi);
        Monday14.setVisible(chumchi);
        Monday15.setVisible(chumchi);
        Monday16.setVisible(chumchi);
        Monday17.setVisible(chumchi);

        Monday18.setVisible(chumchi);
        Monday19.setVisible(chumchi);
        Monday20.setVisible(chumchi);
        Monday21.setVisible(chumchi);
        Monday22.setVisible(chumchi);
        Monday23.setVisible(chumchi);
        Monday24.setVisible(chumchi);
        Monday25.setVisible(chumchi);
        RezervButton.setVisible(false);

        HowMuchFoodMonday.setVisible(chumchi);
        Emal2Monday.setVisible(chumchi);
    }

    public void SettingVisibleTuesday(boolean chumchi) {
        Tuesday1.setVisible(chumchi);
        Tuesday2.setVisible(chumchi);
        Tuesday3.setVisible(chumchi);
        Tuesday4.setVisible(chumchi);
        Tuesday5.setVisible(chumchi);
        Tuesday6.setVisible(chumchi);
        Tuesday7.setVisible(chumchi);
        Tuesday8.setVisible(chumchi);
        Tuesday9.setVisible(chumchi);
        Tuesday14.setVisible(chumchi);
        Tuesday15.setVisible(chumchi);
        Tuesday16.setVisible(chumchi);
        Tuesday17.setVisible(chumchi);
        Tuesday18.setVisible(chumchi);
        Tuesday19.setVisible(chumchi);
        Tuesday20.setVisible(chumchi);
        Tuesday21.setVisible(chumchi);
        Tuesday22.setVisible(chumchi);
        Tuesday23.setVisible(chumchi);
        Tuesday24.setVisible(chumchi);
        Tuesday25.setVisible(chumchi);
        RezervButton.setVisible(false);


        HowMuchFoodTuesday.setVisible(chumchi);
        Emal2Tuesday.setVisible(chumchi);
    }

    public void SettingVisibleWednesday(boolean chumchi) {
        Wednesday1.setVisible(chumchi);
        Wednesday2.setVisible(chumchi);
        Wednesday3.setVisible(chumchi);
        Wednesday4.setVisible(chumchi);
        Wednesday5.setVisible(chumchi);
        Wednesday6.setVisible(chumchi);
        Wednesday7.setVisible(chumchi);
        Wednesday8.setVisible(chumchi);
        Wednesday9.setVisible(chumchi);
        Wednesday14.setVisible(chumchi);
        Wednesday15.setVisible(chumchi);
        Wednesday16.setVisible(chumchi);
        Wednesday17.setVisible(chumchi);
        Wednesday18.setVisible(chumchi);
        Wednesday19.setVisible(chumchi);
        Wednesday20.setVisible(chumchi);
        Wednesday21.setVisible(chumchi);
        Wednesday22.setVisible(chumchi);
        Wednesday23.setVisible(chumchi);
        Wednesday24.setVisible(chumchi);
        Wednesday25.setVisible(chumchi);
        RezervButton.setVisible(false);


        HowMuchFoodWednesday.setVisible(chumchi);
        Emal2Wednesday.setVisible(chumchi);
    }


    public void Saturday(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleSunday(false);
        SettingVisibleWednesday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Saturday1.setVisible(true);
        Saturday2.setVisible(true);
        Saturday3.setVisible(true);
        Saturday4.setVisible(true);
        HowMuchFood.setVisible(true);
        SettingVisibleBook(false);
    }

    public void HowMuchFood(ActionEvent actionEvent) {
        boolean empty = false;
        boolean ok = true;
        if (Saturday3.getText().isEmpty()) {
            empty = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند خالی باشد ");
            alert.showAndWait();

        }
        if (Integer.parseInt(Saturday3.getText()) > 4) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند بیشتر از 4 نوع باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) < 1 && !empty) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند کمتر  از 1 نوع باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Saturday3.getText()) == 1) {
                Saturday5.setVisible(true);
                Saturday14.setVisible(true);
                Emal2.setVisible(true);
                Saturday8.setVisible(false);
                Saturday17.setVisible(false);
                Saturday7.setVisible(false);
                Saturday16.setVisible(false);
                Saturday6.setVisible(false);
                Saturday15.setVisible(false);

                Saturday18.setVisible(true);
                Saturday19.setVisible(false);
                Saturday20.setVisible(false);
                Saturday21.setVisible(false);
                Saturday22.setVisible(true);
                Saturday23.setVisible(false);
                Saturday24.setVisible(false);
                Saturday25.setVisible(false);
            }
            if (Integer.parseInt(Saturday3.getText()) == 2) {
                Saturday5.setVisible(true);
                Saturday14.setVisible(true);
                Saturday6.setVisible(true);
                Saturday15.setVisible(true);
                Emal2.setVisible(true);
                Saturday8.setVisible(false);
                Saturday17.setVisible(false);
                Saturday7.setVisible(false);
                Saturday16.setVisible(false);
                Saturday18.setVisible(true);
                Saturday19.setVisible(true);
                Saturday20.setVisible(false);
                Saturday21.setVisible(false);
                Saturday22.setVisible(true);
                Saturday23.setVisible(true);
                Saturday24.setVisible(false);
                Saturday25.setVisible(false);
            }
            if (Integer.parseInt(Saturday3.getText()) == 3) {
                Saturday5.setVisible(true);
                Saturday14.setVisible(true);
                Saturday6.setVisible(true);
                Saturday15.setVisible(true);
                Saturday7.setVisible(true);
                Saturday16.setVisible(true);
                Emal2.setVisible(true);
                Saturday8.setVisible(false);
                Saturday17.setVisible(false);

                Saturday18.setVisible(true);
                Saturday19.setVisible(true);
                Saturday20.setVisible(true);
                Saturday21.setVisible(false);
                Saturday22.setVisible(true);
                Saturday23.setVisible(true);
                Saturday24.setVisible(true);
                Saturday25.setVisible(false);
            }
            if (Integer.parseInt(Saturday3.getText()) == 4) {
                Saturday5.setVisible(true);
                Saturday14.setVisible(true);
                Saturday6.setVisible(true);
                Saturday15.setVisible(true);
                Saturday7.setVisible(true);
                Saturday16.setVisible(true);
                Saturday8.setVisible(true);
                Saturday17.setVisible(true);
                Emal2.setVisible(true);

                Saturday18.setVisible(true);
                Saturday19.setVisible(true);
                Saturday20.setVisible(true);
                Saturday21.setVisible(true);
                Saturday22.setVisible(true);
                Saturday23.setVisible(true);
                Saturday24.setVisible(true);
                Saturday25.setVisible(true);
            }
        }
    }

    public void Emal2(ActionEvent actionEvent) {
        boolean ok = true;
        if (Integer.parseInt(Saturday3.getText()) >= 1 && Saturday14.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) >= 1 && Saturday22.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع اول نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) >= 2 && Saturday15.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع دو  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) >= 2 && Saturday23.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع دوم  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) >= 3 && Saturday16.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) >= 3 && Saturday24.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع سوم  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) == 4 && Saturday17.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع جهار   نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Saturday3.getText()) == 4 && Saturday25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع چهارم  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Saturday3.getText()) == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        ArreyFood[0][i] = Saturday14.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[0][i] = Saturday15.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday23.getText());
                    }
                }
                ArreyFood[0][2] = "0";
            }
            if (Integer.parseInt(Saturday3.getText()) == 1) {
                for (int i = 0; i < 1; i++) {
                    ArreyFood[0][i] = Saturday14.getText();
                    PriceFood[0][i] =Integer.parseInt(Saturday22.getText());
                }
                ArreyFood[0][1] = "0";
            }
            if (Integer.parseInt(Saturday3.getText()) == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        ArreyFood[0][i] = Saturday14.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[0][i] = Saturday15.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[0][i] = Saturday16.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday24.getText());
                    }
                    ArreyFood[0][3] = "0";

                }
            }
            if (Integer.parseInt(Saturday3.getText()) == 4) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        ArreyFood[0][i] = Saturday14.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[0][i] = Saturday15.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[0][i] = Saturday16.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday24.getText());
                    }
                    if (i == 3) {
                        ArreyFood[0][i] = Saturday17.getText();
                        PriceFood[0][i] =Integer.parseInt(Saturday25.getText());
                    }

                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n درخواست شما با موفقیت انجام شد");
            alert.showAndWait();

        }


    }

    public void Sunday(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleSaturday(false);
        SettingVisibleWednesday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Sunday1.setVisible(true);
        Sunday2.setVisible(true);
        Sunday3.setVisible(true);
        Sunday9.setVisible(true);
        Sunday4.setVisible(true);
        HowMuchFoodSunday.setVisible(true);
        SettingVisibleBook(false);

    }

    public void HowMuchFoodSunday(ActionEvent actionEvent) {
        boolean empty = false;
        boolean ok = true;
        if (Sunday3.getText().isEmpty()) {
            empty = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند خالی باشد ");
            alert.showAndWait();

        }
        if (Integer.parseInt(Sunday3.getText()) > 4) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند بیشتر از 4 نوع باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) < 1 && !empty) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند کمتر  از 1 نوع باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Sunday3.getText()) == 1) {
                Sunday5.setVisible(true);
                Sunday14.setVisible(true);
                Emal2Sunday.setVisible(true);
                Sunday8.setVisible(false);
                Sunday17.setVisible(false);
                Sunday7.setVisible(false);
                Sunday16.setVisible(false);
                //Sunday12.setVisible(false);
                Sunday6.setVisible(false);
                Sunday15.setVisible(false);

                Sunday18.setVisible(true);
                Sunday19.setVisible(false);
                Sunday20.setVisible(false);
                Sunday21.setVisible(false);
                Sunday22.setVisible(false);
                Sunday23.setVisible(false);
                Sunday24.setVisible(true);
                Sunday25.setVisible(false);
            }
            if (Integer.parseInt(Sunday3.getText()) == 2) {
                Sunday5.setVisible(true);
                Sunday14.setVisible(true);
                Sunday6.setVisible(true);
                Sunday15.setVisible(true);
                Emal2Sunday.setVisible(true);
                Sunday8.setVisible(false);
                Sunday17.setVisible(false);
                Sunday7.setVisible(false);
                Sunday16.setVisible(false);

                Sunday18.setVisible(true);
                Sunday19.setVisible(true);
                Sunday20.setVisible(false);
                Sunday21.setVisible(false);
                Sunday22.setVisible(false);
                Sunday23.setVisible(true);
                Sunday24.setVisible(true);
                Sunday25.setVisible(false);
            }
            if (Integer.parseInt(Sunday3.getText()) == 3) {
                Sunday5.setVisible(true);
                Sunday14.setVisible(true);
                Sunday6.setVisible(true);
                Sunday15.setVisible(true);
                Sunday7.setVisible(true);
                Sunday16.setVisible(true);
                Emal2Sunday.setVisible(true);
                Sunday8.setVisible(false);
                Sunday17.setVisible(false);

                Sunday18.setVisible(true);
                Sunday19.setVisible(true);
                Sunday20.setVisible(true);
                Sunday21.setVisible(false);
                Sunday22.setVisible(true);
                Sunday23.setVisible(true);
                Sunday24.setVisible(true);
                Sunday25.setVisible(false);
            }
            if (Integer.parseInt(Sunday3.getText()) == 4) {
                Sunday5.setVisible(true);
                Sunday14.setVisible(true);
                Sunday6.setVisible(true);
                Sunday15.setVisible(true);
                Sunday7.setVisible(true);
                Sunday16.setVisible(true);
                Sunday8.setVisible(true);
                Sunday17.setVisible(true);
                Emal2Sunday.setVisible(true);

                Sunday18.setVisible(true);
                Sunday19.setVisible(true);
                Sunday20.setVisible(true);
                Sunday21.setVisible(true);
                Sunday22.setVisible(true);
                Sunday23.setVisible(true);
                Sunday24.setVisible(true);
                Sunday25.setVisible(true);
            }
        }
    }

    public void Emal2Sunday(ActionEvent actionEvent) {
        boolean ok = true;
        if (Integer.parseInt(Sunday3.getText()) >= 1 && Sunday14.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) >= 1 && Sunday24.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع یک نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) >= 2 && Sunday15.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع دو  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) >= 2 && Sunday23.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع دو  نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) >= 3 && Sunday16.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) >= 3 && Sunday22.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع سه نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) == 4 && Sunday17.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع جهار   نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Sunday3.getText()) == 4 && Sunday25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع چهار  نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Sunday3.getText()) == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        ArreyFood[1][i] = Sunday14.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday24.getText());
                    }
                    if (i == 1) {
                        ArreyFood[1][i] = Sunday15.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday23.getText());
                    }
                }
                ArreyFood[1][2] = "0";
            }
            if (Integer.parseInt(Sunday3.getText()) == 1) {
                for (int i = 0; i < 1; i++) {
                    ArreyFood[1][i] = Sunday14.getText();
                    PriceFood[1][i] = Integer.parseInt(Sunday24.getText());
                }
                ArreyFood[1][1] = "0";
            }
            if (Integer.parseInt(Sunday3.getText()) == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        ArreyFood[1][i] = Sunday14.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday24.getText());
                    }
                    if (i == 1) {
                        ArreyFood[1][i] = Sunday15.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[1][i] = Sunday16.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday22.getText());
                    }
                    ArreyFood[1][3] = "0";

                }
            }
            if (Integer.parseInt(Sunday3.getText()) == 4) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        ArreyFood[1][i] = Sunday14.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday24.getText());
                    }
                    if (i == 1) {
                        ArreyFood[1][i] = Sunday15.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[1][i] = Sunday16.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday22.getText());
                    }
                    if (i == 3) {
                        ArreyFood[1][i] = Sunday17.getText();
                        PriceFood[1][i] = Integer.parseInt(Sunday25.getText());
                    }

                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n درخواست شما با موفقیت انجام شد");
            alert.showAndWait();

        }
    }
    public void Chenging(ActionEvent actionEvent) {
        {
            boolean flagPass=true;
            boolean flagUser=true;
            i1.setVisible(false);
            i4.setVisible(false);
            i3.setVisible(false);
            i2.setVisible(false);
            i6.setVisible(false);
            i5.setVisible(false);
            OldPasswordLable.setVisible(false);
            oldUsernameLable.setVisible(false);
            newPsswordLable.setVisible(false);
            newUsrnameLable.setVisible(false);
            confirmpass.setVisible(false);
            confirmUser.setVisible(false);
            SettingVisibleAdminPro(false);
            SettingVisibleStudent(false);
            boolean ok=true;
            if(oldPassword.getText().isEmpty())
            {
                ok=false;
                OldPasswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
                OldPasswordLable.setVisible(true);
                i1.setVisible(true);
            }
            if(oldUsername.getText().isEmpty())
            {
                ok=false;
                oldUsernameLable.setText("لطفا فیلد موردنظر را پر کنید ");
                oldUsernameLable.setVisible(true);
                i2.setVisible(true);
            }
            if(newPassword.getText().isEmpty())
            {
                ok=false;
                newPsswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
                newPsswordLable.setVisible(true);
                i3.setVisible(true);
            }
            if(newUsername.getText().isEmpty())
            {
                ok=false;
                newUsrnameLable.setText("لطفا فیلد موردنظر را پر کنید ");
                newUsrnameLable.setVisible(true);
                i4.setVisible(true);
            }
            if(confirmNewPassword.getText().isEmpty())
            {
                ok=false;
                confirmpass.setText("لطفا فیلد موردنظر را پر کنید ");
                confirmpass.setVisible(true);
                i5.setVisible(true);
            }
            if(confirmNewUsername.getText().isEmpty())
            {
                ok=false;
                confirmUser.setText("لطفا فیلد موردنظر را پر کنید ");
                confirmUser.setVisible(true);
                i6.setVisible(true);
            }
            if (!confirmNewPassword.getText().equalsIgnoreCase(newPassword.getText()) && !newPassword.getText().isEmpty() && !confirmNewPassword.getText().isEmpty())
            {
                ok=false;
                flagPass=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  رمز عبور جدید شما با تاییدیه رمز عبور مطابقت ندارد   ");
                alert.showAndWait();
            }
            if (!confirmNewUsername.getText().equalsIgnoreCase(newUsername.getText()) && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty())
            {
                ok=false;
                flagUser=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  نام کاربری  جدید شما با تاییدیه نام کاربری  مطابقت ندارد   ");
                alert.showAndWait();
            }
            if(newPassword.getText().length()<6 && !newPassword.getText().isEmpty() && flagPass)
            {
                ok=false;
                newPsswordLable.setText("رمز عبور کمتر از 6 کاراکتر نمی تواند باشد  ");
                newPsswordLable.setVisible(true);
                i3.setVisible(true);
            }
            if( !oldPassword.getText().equalsIgnoreCase(A.getPassWord()) && !oldPassword.getText().isEmpty())
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  رمز عبور فعلی شما درست وارد نشده است    ");
                alert.showAndWait();
            }
            if( !oldUsername.getText().equalsIgnoreCase(A.getUserName()) && !oldUsername.getText().isEmpty())
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  نام کاربری  فعلی شما درست وارد نشده است    ");
                alert.showAndWait();
            }
            for (int i=0;i<Controller.ArrayStudent.size();i++) {
                    if(newUsername.getText().equalsIgnoreCase(Controller.ArrayStudent.get(i).getUserName()) && flagUser && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty())
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی  گرامی نام کاربری انتخاب شده تکراری می باشد     ");
                        alert.showAndWait();
                    }
                }


            for (int i=0;i<Controller.ArrayProfosser.size();i++)
            {
                if(newUsername.getText().equalsIgnoreCase(Controller.ArrayProfosser.get(i).getUserName()) && flagUser)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی  نام کاربری انتخاب شده تکراری می باشد     ");
                    alert.showAndWait();
                }
            }
            if (ok)
            {
                whichStudent.setUserName(newUsername.getText());
                whichStudent.setPassWord(newPassword.getText());
            }

        }
    }
    /////*********************************************
    public void HowMuchFoodMonday(ActionEvent actionEvent) {
        boolean empty = false;
        boolean ok = true;
        if (Monday3.getText().isEmpty()) {
            empty = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند خالی باشد ");
            alert.showAndWait();

        }
        if (Integer.parseInt(Monday3.getText()) > 4) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند بیشتر از 4 نوع باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) < 1 && !empty) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند کمتر  از 1 نوع باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Monday3.getText()) == 1) {
                Monday5.setVisible(true);
                Monday14.setVisible(true);
                Emal2Monday.setVisible(true);
                Monday8.setVisible(false);
                Monday17.setVisible(false);
                Monday7.setVisible(false);
                Monday16.setVisible(false);
                Monday6.setVisible(false);
                Monday15.setVisible(false);

                Monday18.setVisible(true);
                Monday19.setVisible(false);
                Monday20.setVisible(false);
                Monday21.setVisible(false);
                Monday22.setVisible(true);
                Monday23.setVisible(false);
                Monday24.setVisible(false);
                Monday25.setVisible(false);
            }
            if (Integer.parseInt(Monday3.getText()) == 2) {
                Monday5.setVisible(true);
                Monday14.setVisible(true);
                Monday6.setVisible(true);
                Monday15.setVisible(true);
                Emal2Monday.setVisible(true);
                Monday8.setVisible(false);
                Monday17.setVisible(false);
                Monday7.setVisible(false);
                Monday16.setVisible(false);

                Monday18.setVisible(true);
                Monday19.setVisible(true);
                Monday20.setVisible(false);
                Monday21.setVisible(false);
                Monday22.setVisible(true);
                Monday23.setVisible(true);
                Monday24.setVisible(false);
                Monday25.setVisible(false);
            }
            if (Integer.parseInt(Monday3.getText()) == 3) {
                Monday5.setVisible(true);
                Monday14.setVisible(true);
                Monday6.setVisible(true);
                Monday15.setVisible(true);
                Monday7.setVisible(true);
                Monday16.setVisible(true);
                Emal2Monday.setVisible(true);
                Monday8.setVisible(false);
                Monday17.setVisible(false);

                Monday18.setVisible(true);
                Monday19.setVisible(true);
                Monday20.setVisible(true);
                Monday21.setVisible(false);
                Monday22.setVisible(true);
                Monday23.setVisible(true);
                Monday24.setVisible(true);
                Monday25.setVisible(false);
            }
            if (Integer.parseInt(Monday3.getText()) == 4) {
                Monday5.setVisible(true);
                Monday14.setVisible(true);
                Monday6.setVisible(true);
                Monday15.setVisible(true);
                Monday7.setVisible(true);
                Monday16.setVisible(true);
                Monday8.setVisible(true);
                Monday17.setVisible(true);
                Emal2Monday.setVisible(true);

                Monday18.setVisible(true);
                Monday19.setVisible(true);
                Monday20.setVisible(true);
                Monday21.setVisible(true);
                Monday22.setVisible(true);
                Monday23.setVisible(true);
                Monday24.setVisible(true);
                Monday25.setVisible(true);
            }
        }
    }
    public void Monday(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleSaturday(false);
        SettingVisibleWednesday(false);
        SettingVisibleSunday(false);
        SettingVisibleTuesday(false);
        Monday1.setVisible(true);
        Monday2.setVisible(true);
        Monday3.setVisible(true);
        Monday9.setVisible(true);
        Monday4.setVisible(true);
        HowMuchFoodMonday.setVisible(true);
        SettingVisibleBook(false);

    }
    public void Emal2Monday(ActionEvent actionEvent) {
        boolean ok = true;
        if (Integer.parseInt(Monday3.getText()) >= 1 && Monday14.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) >= 1 && Monday22.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع یک نمی تواند خالی باشد     ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) >= 2 && Monday15.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع دو  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) >= 2 && Monday23.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع دو نمی تواند خالی باشد     ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) >= 3 && Monday16.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) >= 3 && Monday24.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع سه  نمی تواند خالی باشد     ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) == 4 && Monday17.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع جهار   نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Monday3.getText()) ==4 && Monday25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع چهار  نمی تواند خالی باشد     ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Monday3.getText()) == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        ArreyFood[2][i] = Monday14.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[2][i] = Monday15.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday23.getText());
                    }
                }
                ArreyFood[2][2] = "0";
            }
            if (Integer.parseInt(Monday3.getText()) == 1) {
                for (int i = 0; i < 1; i++) {
                    ArreyFood[2][i] = Monday14.getText();
                    PriceFood[2][i] = Integer.parseInt(Monday22.getText());
                }
                ArreyFood[2][1] = "0";
            }
            if (Integer.parseInt(Monday3.getText()) == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        ArreyFood[2][i] = Monday14.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[2][i] = Monday15.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[2][i] = Monday16.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday24.getText());
                    }
                    ArreyFood[2][3] = "0";

                }
            }
            if (Integer.parseInt(Monday3.getText()) == 4) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        ArreyFood[2][i] = Monday14.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[2][i] = Monday15.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[2][i] = Monday16.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday24.getText());
                    }
                    if (i == 3) {
                        ArreyFood[2][i] = Monday17.getText();
                        PriceFood[2][i] = Integer.parseInt(Monday25.getText());
                    }

                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n درخواست شما با موفقیت انجام شد");
            alert.showAndWait();

        }
    }
    /////**********************************************
    public void Wednesday(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleSaturday(false);
        Wednesday1.setVisible(true);
        Wednesday2.setVisible(true);
        Wednesday3.setVisible(true);
        Wednesday9.setVisible(true);
        Wednesday4.setVisible(true);
        HowMuchFoodWednesday.setVisible(true);
        SettingVisibleBook(false);
    }
    public void HowMuchFoodWednesday(ActionEvent actionEvent) {
        boolean empty = false;
        boolean ok = true;
        if (Wednesday3.getText().isEmpty()) {
            empty = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند خالی باشد ");
            alert.showAndWait();

        }
        if (Integer.parseInt(Wednesday3.getText()) > 4) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند بیشتر از 4 نوع باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) < 1 && !empty) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند کمتر  از 1 نوع باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Wednesday3.getText()) == 1) {
                Wednesday5.setVisible(true);
                Wednesday14.setVisible(true);
                Emal2Wednesday.setVisible(true);

                Wednesday18.setVisible(true);
                Wednesday21.setVisible(true);
                Wednesday19.setVisible(false);
                Wednesday20.setVisible(false);
                Wednesday22.setVisible(false);
                Wednesday23.setVisible(false);
                Wednesday24.setVisible(false);
                Wednesday25.setVisible(false);

                Wednesday8.setVisible(false);
                Wednesday17.setVisible(false);
                Wednesday7.setVisible(false);
                Wednesday16.setVisible(false);
                Wednesday6.setVisible(false);
                Wednesday15.setVisible(false);
            }
            if (Integer.parseInt(Wednesday3.getText()) == 2) {
                Wednesday5.setVisible(true);
                Wednesday14.setVisible(true);
                Wednesday6.setVisible(true);
                Wednesday15.setVisible(true);
                Emal2Wednesday.setVisible(true);
                Wednesday8.setVisible(false);
                Wednesday17.setVisible(false);
                Wednesday7.setVisible(false);
                Wednesday16.setVisible(false);

                Wednesday18.setVisible(true);
                Wednesday21.setVisible(true);
                Wednesday19.setVisible(false);
                Wednesday20.setVisible(false);
                Wednesday22.setVisible(true);
                Wednesday23.setVisible(false);
                Wednesday24.setVisible(false);
                Wednesday25.setVisible(true);
            }
            if (Integer.parseInt(Wednesday3.getText()) == 3) {
                Wednesday5.setVisible(true);
                Wednesday14.setVisible(true);
                Wednesday6.setVisible(true);
                Wednesday15.setVisible(true);
                Wednesday7.setVisible(true);
                Wednesday16.setVisible(true);
                Emal2Wednesday.setVisible(true);
                Wednesday8.setVisible(false);
                Wednesday17.setVisible(false);

                Wednesday18.setVisible(true);
                Wednesday21.setVisible(true);
                Wednesday19.setVisible(true);
                Wednesday20.setVisible(false);
                Wednesday22.setVisible(true);
                Wednesday23.setVisible(true);
                Wednesday24.setVisible(false);
                Wednesday25.setVisible(true);
            }
            if (Integer.parseInt(Wednesday3.getText()) == 4) {
                Wednesday5.setVisible(true);
                Wednesday14.setVisible(true);
                Wednesday6.setVisible(true);
                Wednesday15.setVisible(true);
                Wednesday7.setVisible(true);
                Wednesday16.setVisible(true);
                Wednesday8.setVisible(true);
                Wednesday17.setVisible(true);
                Emal2Wednesday.setVisible(true);

                Wednesday18.setVisible(true);
                Wednesday21.setVisible(true);
                Wednesday19.setVisible(true);
                Wednesday20.setVisible(true);
                Wednesday22.setVisible(true);
                Wednesday23.setVisible(true);
                Wednesday24.setVisible(true);
                Wednesday25.setVisible(true);
            }
        }
    }
    public void Emal2Wednesday(ActionEvent actionEvent) throws IOException {
        boolean ok = true;
        if (Integer.parseInt(Wednesday3.getText()) >= 1 && Wednesday14.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) >= 1 && Wednesday21.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) >= 2 && Wednesday15.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع دو  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) >= 2 && Wednesday22.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  قیمت غذای نوع دو نمی تواند خالی باشد  ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) >= 3 && Wednesday16.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) >= 3 && Wednesday23.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  قیمت غذای نوع سه  نمی تواند خالی باشد  ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) == 4 && Wednesday17.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع جهار   نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Wednesday3.getText()) == 4 && Wednesday24.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  قیمت غذای نوع چهار  نمی تواند خالی باشد  ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Wednesday3.getText()) == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        ArreyFood[4][i] = Wednesday14.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday21.getText());
                    }
                    if (i == 1) {
                        ArreyFood[4][i] = Wednesday15.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday22.getText());
                    }
                }
                ArreyFood[4][2] = "0";
            }
            if (Integer.parseInt(Wednesday3.getText()) == 1) {
                for (int i = 0; i < 1; i++) {
                    ArreyFood[4][i] = Wednesday14.getText();
                    PriceFood[4][i]=Integer.parseInt(Wednesday21.getText());
                }
                ArreyFood[4][1] = "0";
            }
            if (Integer.parseInt(Wednesday3.getText()) == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        ArreyFood[4][i] = Wednesday14.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday21.getText());
                    }
                    if (i == 1) {
                        ArreyFood[4][i] = Wednesday15.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday22.getText());
                    }
                    if (i == 2) {
                        ArreyFood[4][i] = Wednesday16.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday23.getText());
                    }
                    ArreyFood[4][3] = "0";

                }
            }
            if (Integer.parseInt(Wednesday3.getText()) == 4) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        ArreyFood[4][i] = Wednesday14.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday21.getText());
                    }
                    if (i == 1) {
                        ArreyFood[4][i] = Wednesday15.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday22.getText());
                    }
                    if (i == 2) {
                        ArreyFood[4][i] = Wednesday16.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday23.getText());
                    }
                    if (i == 3) {
                        ArreyFood[4][i] = Wednesday17.getText();
                        PriceFood[4][i]=Integer.parseInt(Wednesday24.getText());
                    }

                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n درخواست شما با موفقیت انجام شد");
            alert.showAndWait();
        }
    }
    //////**********************************************
    public void Tuesday(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleSaturday(false);
        SettingVisibleWednesday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        Tuesday1.setVisible(true);
        Tuesday2.setVisible(true);
        Tuesday3.setVisible(true);
        Tuesday9.setVisible(true);
        Tuesday4.setVisible(true);
        HowMuchFoodTuesday.setVisible(true);
        SettingVisibleBook(false);
    }
    public void Emal2Tuesday(ActionEvent actionEvent) {
        boolean ok = true;
        if (Integer.parseInt(Tuesday3.getText()) >= 1 && Tuesday14.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع یک نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) >= 1 && Tuesday22.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع یک نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) >= 2 && Tuesday15.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع دو  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) >= 2 && Tuesday23.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n   قیمت غذای نوع دو نمی تواند خالی باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) >= 3 && Tuesday16.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) >= 3 && Tuesday24.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n قیمت غذای نوع سه  نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) == 4 && Tuesday17.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n غذای نوع جهار   نمی تواند خالی باشد   ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) == 4 && Tuesday25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n  قیمت غذای نوع چهار  نمی تواند خالی باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Tuesday3.getText()) == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        ArreyFood[3][i] = Tuesday14.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[3][i] = Tuesday15.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday23.getText());
                    }
                }
                ArreyFood[3][2] = "0";
            }
            if (Integer.parseInt(Tuesday3.getText()) == 1) {
                for (int i = 0; i < 1; i++) {
                    ArreyFood[3][i] = Tuesday14.getText();
                    PriceFood[3][i]= Integer.parseInt(Tuesday22.getText());
                }
                ArreyFood[3][1] = "0";
            }
            if (Integer.parseInt(Tuesday3.getText()) == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        ArreyFood[3][i] = Tuesday14.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[3][i] = Tuesday15.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[3][i] = Tuesday16.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday24.getText());
                    }
                    ArreyFood[3][3] = "0";

                }
            }
            if (Integer.parseInt(Tuesday3.getText()) == 4) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        ArreyFood[3][i] = Tuesday14.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday22.getText());
                    }
                    if (i == 1) {
                        ArreyFood[3][i] = Tuesday15.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday23.getText());
                    }
                    if (i == 2) {
                        ArreyFood[3][i] = Tuesday16.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday24.getText());
                    }
                    if (i == 3) {
                        ArreyFood[3][i] = Tuesday17.getText();
                        PriceFood[3][i]= Integer.parseInt(Tuesday25.getText());
                    }

                }
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n درخواست شما با موفقیت انجام شد");
            alert.showAndWait();

        }
    }
    public void HowMuchFoodTuesday(ActionEvent actionEvent) {
        boolean empty = false;
        boolean ok = true;
        if (Tuesday3.getText().isEmpty()) {
            empty = true;
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند خالی باشد ");
            alert.showAndWait();

        }
        if (Integer.parseInt(Tuesday3.getText()) > 4) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند بیشتر از 4 نوع باشد ");
            alert.showAndWait();
        }
        if (Integer.parseInt(Tuesday3.getText()) < 1 && !empty) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n تعداد انواع غذا نمی تواند کمتر  از 1 نوع باشد ");
            alert.showAndWait();
        }
        if (ok) {
            if (Integer.parseInt(Tuesday3.getText()) == 1) {
                Tuesday5.setVisible(true);
                Tuesday14.setVisible(true);
                Emal2Tuesday.setVisible(true);
                Tuesday8.setVisible(false);
                Tuesday17.setVisible(false);
                Tuesday7.setVisible(false);
                Tuesday16.setVisible(false);
                Tuesday6.setVisible(false);
                Tuesday15.setVisible(false);

                Tuesday18.setVisible(true);
                Tuesday19.setVisible(false);
                Tuesday20.setVisible(false);
                Tuesday21.setVisible(false);
                Tuesday22.setVisible(true);
                Tuesday23.setVisible(false);
                Tuesday24.setVisible(false);
                Tuesday25.setVisible(false);


            }
            if (Integer.parseInt(Tuesday3.getText()) == 2) {
                Tuesday5.setVisible(true);
                Tuesday14.setVisible(true);
                Tuesday6.setVisible(true);
                Tuesday15.setVisible(true);
                Emal2Tuesday.setVisible(true);
                Tuesday8.setVisible(false);
                Tuesday17.setVisible(false);
                Tuesday7.setVisible(false);
                Tuesday16.setVisible(false);

                Tuesday18.setVisible(true);
                Tuesday19.setVisible(true);
                Tuesday20.setVisible(false);
                Tuesday21.setVisible(false);
                Tuesday22.setVisible(true);
                Tuesday23.setVisible(true);
                Tuesday24.setVisible(false);
                Tuesday25.setVisible(false);
            }
            if (Integer.parseInt(Tuesday3.getText()) == 3) {
                Tuesday5.setVisible(true);
                Tuesday14.setVisible(true);
                Tuesday6.setVisible(true);
                Tuesday15.setVisible(true);
                Tuesday7.setVisible(true);
                Tuesday16.setVisible(true);
                Emal2Tuesday.setVisible(true);
                Tuesday8.setVisible(false);
                Tuesday17.setVisible(false);

                Tuesday18.setVisible(true);
                Tuesday19.setVisible(true);
                Tuesday20.setVisible(true);
                Tuesday21.setVisible(false);
                Tuesday22.setVisible(true);
                Tuesday23.setVisible(true);
                Tuesday24.setVisible(true);
                Tuesday25.setVisible(false);
            }
            if (Integer.parseInt(Tuesday3.getText()) == 4) {
                Tuesday5.setVisible(true);
                Tuesday14.setVisible(true);
                Tuesday6.setVisible(true);
                Tuesday15.setVisible(true);
                Tuesday7.setVisible(true);
                Tuesday16.setVisible(true);
                Tuesday8.setVisible(true);
                Tuesday17.setVisible(true);
                Emal2Tuesday.setVisible(true);

                Tuesday18.setVisible(true);
                Tuesday19.setVisible(true);
                Tuesday20.setVisible(true);
                Tuesday21.setVisible(true);
                Tuesday22.setVisible(true);
                Tuesday23.setVisible(true);
                Tuesday24.setVisible(true);
                Tuesday25.setVisible(true);
            }
        }
    }
    //////***********************************************
    public void library(ActionEvent actionEvent) {
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        pro.setVisible(false);
        SettingVisibleProfileClassMenu(false);
        Information.setVisible(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleWednesday(false);
        SettingVisibleBook(false);
        Book1.setVisible(true);
        RezervButton.setVisible(false);
        Book6.clear();
        Book7.clear();
        Book8.clear();
    }
    //////************************************************
    public void NewBook(ActionEvent actionEvent) {
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleBook(true);
        Information.setVisible(false);
        /// SetingViibleSystem(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        RezervButton.setVisible(false);
        Book6.clear();
        Book7.clear();
        Book8.clear();
    }
    private int CounterBook=0;
    public void Submit(ActionEvent actionEvent){
        boolean ok=true;
        if(Book6.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام کتاب نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if(Book7.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام نویسنده نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if(Book8.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام ناشر  نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if (ok)
        {
            ArreyBook.add(new Book(Book6.getText(),Book7.getText(),Book8.getText()));
            CounterBook++;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدرخواست شما با موفقیت انجام شد    ");
            alert.showAndWait();

        }


    }
    //////************************************************
    public void Rezerv(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleProStudent(false);
        SettingVisibleBook(true);
        Information.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Book9.setVisible(false);
        RezervButton.setVisible(true);
        SettingVisibleStudent(false);
        Book6.clear();
        Book7.clear();
        Book8.clear();
    }
    public void RezervButton(ActionEvent actionEvent) {
        boolean ok=true;
        if(Book6.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام کتاب نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if(Book7.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام نویسنده نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if(Book8.getText().isEmpty())
        {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nنام ناشر  نمی تواند خالی باشد    ");
            alert.showAndWait();
        }
        if(ok)
        {
            boolean contain=false;
            for(int i=0;i<Admin.ArreyB.size();i++)
            {
                if(Admin.ArreyB.get(i).getName().equalsIgnoreCase(Book6.getText()))
                {
                    if(Admin.ArreyB.get(i).getWriterName().equalsIgnoreCase(Book7.getText()))
                    {
                        if(Admin.ArreyB.get(i).getNasher().equalsIgnoreCase(Book8.getText()))
                        {
                            contain=true;
                            Admin.ArreyB.remove(i);
                            break;

                        }
                    }
                }
            }
            if(!contain)
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nهمچین کتابی وجود ندارد    ");
                alert.showAndWait();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nکتاب از حالت رزرو خارج گردید    ");
                alert.showAndWait();
            }
        }
    }
    /////************************************************
    public void profile(ActionEvent actionEvent) {
        coutProfile4=0;
        for(int i=0;i<Controller.ArrayProfosser.size();i++)
        {
            for(int j=0;j<Controller.ArrayProfosser.get(i).ArreyClass.size();j++)
            {
                ArreyNameClass.add(Controller.ArrayProfosser.get(i).ArreyClass.get(j));
                ArreyNameProfosser.add(Controller.ArrayProfosser.get(i).getUserName());
            }
        }
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        pro.setVisible(true);
        RezervButton.setVisible(false);
        Information.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleBook(false);
        SettingVisibleProfileClassMenu(false);
        Information.setVisible(false);
    }
    //////**********************************************
    private int coutProfile4=0;
    public void PreProfileClass(ActionEvent actionEvent) {
        if(coutProfile4>=1)
        {
            coutProfile4--;
            ShowingProfileClassMenu((coutProfile4)*6,(coutProfile4+1)*6);
        }
    }
    public void NextProfileClass(ActionEvent actionEvent) {
        if( Controller.WhichProfosser.ArreyClass.size()>6) {
            coutProfile4++;
            if(Controller.WhichProfosser.ArreyClass.size()>=6*coutProfile4)
            {
                ProfileClass3.setVisible(false);
                ProfileClass4.setVisible(false);
                ProfileClass5.setVisible(false);
                ProfileClass6.setVisible(false);
                ProfileClass7.setVisible(false);
                ProfileClass8.setVisible(false);
                ProfileClass9.setVisible(false);
                ProfileClass10.setVisible(false);
                ProfileClass11.setVisible(false);
                ProfileClass12.setVisible(false);
                ProfileClass13.setVisible(false);
                ProfileClass14.setVisible(false);

                if(((coutProfile4+1)*6<Controller.WhichProfosser.ArreyClass.size()))
                {
                    ShowingProfileClassMenu(coutProfile4*6,(coutProfile4+1)*6);
                }
                else
                {
                    ShowingProfileClassMenu(coutProfile4*6,Controller.WhichProfosser.ArreyClass.size());
                }
            }
            else
            {
                coutProfile4--;
            }


        }

    }
    public void ProfileClassMenu(ActionEvent actionEvent) {
        SettingVisibleAdminPro(false);
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleProfileClassMenu(true);
        Information.setVisible(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        SettingVisibleWednesday(false);
        SettingVisibleBook(false);
        Book1.setVisible(false);
        RezervButton.setVisible(false);
        ProfileClass3.setVisible(false);
        ProfileClass4.setVisible(false);
        ProfileClass5.setVisible(false);
        ProfileClass6.setVisible(false);
        ProfileClass7.setVisible(false);
        ProfileClass8.setVisible(false);
        ProfileClass9.setVisible(false);
        ProfileClass10.setVisible(false);
        ProfileClass11.setVisible(false);
        ProfileClass12.setVisible(false);
        ProfileClass13.setVisible(false);
        ProfileClass14.setVisible(false);
        if(ArreyNameClass.size()>=6)
        {
            ShowingProfileClassMenu(0,6);
        }
        else
        {
            ShowingProfileClassMenu(0,ArreyNameClass.size());
        }



    }
    public  void ShowingProfileClassMenu(int start,int end) {
        for(int i=start;i<end;i++)
        {
            int p=i;
            if(p>=6)
            {
                p=p%6;
            }
            Profile4[2*p].setVisible(true);
            Profile4[2*p+1].setVisible(true);
            Profile4[2*p].setText(ArreyNameClass.get(i).getNameLesson());
            Profile4[2*p+1].setText(ArreyNameProfosser.get(i));
        }
    }
    ////**************************************************
    private int coutProfileProfosser=0;
    public void ProProfosser(ActionEvent actionEvent) {
        coutProfileProfosser=0;
        SettingVisibleStudent(false);
        SettingVisibleProStudent(true);
        P.setText("لیست نام اساتید دانشگاه شهید بهشتی");
        for(int i=0;i<12;i++)
        {
            PP[i].setVisible(false);
        }
        SettingVisibleAdminPro(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleBook(false);
        Information.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Book9.setVisible(false);
        RezervButton.setVisible(false);
        for(int i=0;i<6;i++)
        {
            NumberProfosser[i].setText(""+(coutProfileProfosser*6+(i+1)));
        }
        if(Controller.ArrayProfosser.size()>=6)
        {
            ShowingProProfosser(0,6);
        }
        else
        {
            ShowingProProfosser(0,Controller.ArrayProfosser.size());
        }
    }
    public void PrePre(ActionEvent actionEvent) {
        if(coutProfileProfosser>=1)
        {

            coutProfileProfosser--;
            for(int i=0;i<6;i++)
            {
                NumberProfosser[i].setText(""+(coutProfileProfosser*6+(i+1)));
            }
            ShowingProProfosser((coutProfileProfosser)*6,(coutProfileProfosser+1)*6);
        }
    }
    public void NextNext(ActionEvent actionEvent) {
        if(Controller.ArrayProfosser.size()>6) {
            coutProfileProfosser++;
            if(Controller.ArrayProfosser.size()>=6*coutProfileProfosser)
            {
                for(int i=0;i<12;i++)
                {
                    PP[i].setVisible(false);
                }
                for(int i=0;i<6;i++)
                {
                    NumberProfosser[i].setText(""+(coutProfileProfosser*6+(i+1)));
                }


                if(((coutProfileProfosser+1)*6<Controller.ArrayProfosser.size()))
                {
                    ShowingProProfosser(coutProfileProfosser*6,(coutProfileProfosser+1)*6);
                }
                else
                {
                    ShowingProProfosser(coutProfileProfosser*6,Controller.ArrayProfosser.size());
                }
            }
            else
            {
                coutProfileProfosser--;
            }


        }

    }
    public  void ShowingProProfosser(int start,int end) {

        for(int i=start;i<end;i++)
        {
            int p=i;
            if(p>=6)
            {
                p=p%6;
            }
            PP[2*p].setVisible(true);
            PP[2*p+1].setVisible(true);
            PP[2*p].setText(Controller.ArrayProfosser.get(i).getUserName());
            PP[2*p+1].setText(Controller.ArrayProfosser.get(i).getPassWord());
        }
    }
    ////******************************************************
    private int coutProfileStudent=0;
    public void ProStudent(ActionEvent actionEvent) {
        coutProfileStudent=0;
        SettingVisibleProStudent(false);
        SettingVisibleStudent(true);
        P.setText("لیست نام دانشجویان دانشگاه شهید بهشتی");
        for(int i=0;i<12;i++)
        {
            PP[i].setVisible(false);
        }
        SettingVisibleAdminPro(false);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleBook(false);
        Information.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Book9.setVisible(false);
        RezervButton.setVisible(false);
        for(int i=0;i<6;i++)
        {
            NumberProfosser[i].setText(""+(coutProfileStudent*6+(i+1)));
        }
        if(Controller.ArrayStudent.size()>=6)
        {
            ShowingProStudent(0,6);
        }
        else
        {
            ShowingProStudent(0,Controller.ArrayStudent.size());
        }

    }
    public void NextNextStudent(ActionEvent actionEvent) {
        if(Controller.ArrayStudent.size()>6) {
            coutProfileStudent++;
            if(Controller.ArrayProfosser.size()>=6*coutProfileStudent)
            {
                for(int i=0;i<12;i++)
                {
                    PP[i].setVisible(false);
                }
                for(int i=0;i<6;i++)
                {
                    NumberProfosser[i].setText(""+(coutProfileStudent*6+(i+1)));
                }


                if(((coutProfileStudent+1)*6<Controller.ArrayProfosser.size()))
                {
                    ShowingProStudent(coutProfileStudent*6,(coutProfileStudent+1)*6);
                }
                else
                {
                    ShowingProStudent(coutProfileStudent*6,Controller.ArrayStudent.size());
                }
            }
            else
            {
                coutProfileStudent--;
            }


        }

    }
    public void PrePreStudent(ActionEvent actionEvent) {
        if(coutProfileStudent>=1)
        {

            coutProfileStudent--;
            for(int i=0;i<6;i++)
            {
                NumberProfosser[i].setText(""+(coutProfileStudent*6+(i+1)));
            }
            ShowingProStudent((coutProfileStudent)*6,(coutProfileStudent+1)*6);
        }

    }
    public  void ShowingProStudent(int start,int end) {

        for(int i=start;i<end;i++)
        {
            int p=i;
            if(p>=6)
            {
                p=p%6;
            }
            PP[2*p].setVisible(true);
            PP[2*p+1].setVisible(true);
            PP[2*p].setText(Controller.ArrayStudent.get(i).getUserName());
            PP[2*p+1].setText(Controller.ArrayStudent.get(i).getPassWord());
        }
    }
    /////*****************************************************
    public void ProfileAdmin(ActionEvent actionEvent) {
        SettingVisibleStudent(false);
        SettingVisibleProStudent(false);
        SettingVisibleAdminPro(true);
        SettingVisibleProfileClassMenu(false);
        SettingVisibleBook(false);
        Information.setVisible(false);
        SettingVisible2(false);
        Days.setVisible(false);
        SettingVisibleSaturday(false);
        SettingVisibleSunday(false);
        SettingVisibleMonday(false);
        SettingVisibleTuesday(false);
        Book9.setVisible(false);
        RezervButton.setVisible(false);
        if(A.isWoman())
        {
            ImageProfileWoman.setVisible(true);
            ImageProfileMan.setVisible(false);
        }
        else
        {
            ImageProfileMan.setVisible(true);
            ImageProfileWoman.setVisible(false);
        }
        UserAdminPro.setText(A.getUserName());
        PassAdminPro.setText(A.getPassWord());
    }
    ////******************************************************
    public void Exit(ActionEvent actionEvent) throws IOException {
        new PageLoader().load("/view/Login2.fxml");
    }
    ////*******************************************************

}


