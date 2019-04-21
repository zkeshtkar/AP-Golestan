package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import model.Admin;
import model.Class;
import model.PageLoader;

import java.io.IOException;
import java.util.ArrayList;

import static controller.Controller.A;

public class ProfosserController {
    public Button NEXT6;
    public Button PRE6;
    public Button PreStudent6;
    public Button NextStudent6;
    private int counterSix = 0;
    public RadioButton sanse1;
    public RadioButton sanse2;
    public RadioButton sanse3;
    public TextField Zarfiyat;
    public Button chenging;
    public TextField ClassName;
    public TextField Vahed;
    public Label THREE1;
    public Label THREE3;
    public Label THREE7;
    public Label THREE8;
    public Label THREE4;
    public Label THREE2;
    public RadioButton Saturday;
    public RadioButton Sunday;
    public RadioButton Monday;
    public RadioButton Tuesday;
    public RadioButton Thursday;
    public Label THREE9;
    public Label THREE10;
    public Label THREE11;
    public Label THREE12;
    public Label THREE13;
    public Label THREE14;
    public Label THREE15;
    public Label THREE16;
    public Label THREE17;
    public Label THREE18;
    public Label THREE19;
    public Label THREE5;
    public Label THREE20;
    public Label THREE24;
    public Label THREE21;
    public Label THREE22;
    public Label THREE23;
    public TextField THREE25;
    public Label THREE26;
    public TextField Lesson1;
    public Label THREE27;
    public TextField Lesson2;
    public Label THREE28;
    public TextField Lesson3;
    public Button HowMuchPish;
    public Label THREE6;
    public Label FOUR1;
    public Label FOUR2;
    public Label FOUR3;
    public Label NameStudent;
    public Label NameLesson;
    public TextField Grade;
    public Button Next;
    public Button Previous;
    public Button Confirmation4;
    public Button FIVE1;
    public ImageView SIXIMG;
    public Label SIXNAME;
    public Label SIX1;
    public Label SIXPASS;
    public Label SIX2;
    public Label SIXNAME2;
    public Label SIXPASS2;
    public Button Vaheds;
    public Button Lists;
    public Label NameOfclass;
    public Label NumOfVahed;
    public Label nc;
    public Label nv;
    public Button pre7;
    public Button next7;
    public Label StudentVahed;
    public Label VahedSix1;
    public Label StudentVahedLabel;
    public Line VahedSix11;
    public Line VahedSix12;
    public Line VahedSix13, VahedSix16;
    public Line VahedSix14;
    public Line VahedSix15;
    public Label VahedSix2;
    public Label VahedSix3;
    public Label VahedSix4;
    public Label VahedSix5;
    public Label VahedSix6;
    public Label VahedSix7;
    public Label VahedSix8;
    public Label VahedSix9;
    public Label VahedSix10;
    private int counter1, counter2, counter3, counterSunday, counterSaturday, counterMonday, counterTuesday, counterThursday = 0;
    private int counter = 0;
    private int COUNT7 = 0;
    public boolean[] Arrey = {false, false, false, false, false};
    public TextField oldPassword;
    public TextField oldUsername;
    public TextField newPassword;
    public TextField newUsername;
    public TextField confirmNewPassword;
    public TextField confirmNewUsername;
    public ImageView i1;
    public ImageView i4;
    public ImageView i3;
    public ImageView i2;
    public ImageView i6;
    public ImageView i5;
    public Label OldPasswordLable;
    public Label oldUsernameLable;
    public Label newPsswordLable;
    public Label newUsrnameLable;
    public Label confirmpass;
    public Label confirmUser;
    public Label two1;
    public Label two2;
    public Label two3;
    public Label two4;
    public Label two5;
    public Label two9;
    public Label two6;
    public Label two10;
    public Label two11;
    public Label two13;
    public Label two12;
    public Label two16;
    public Label two7;
    public Label two14;
    public Label two8;
    public Label two15;
    public Button Chenging;
    public Button ONE, TWO, THREE, FOUR, FIVE, SIX;
    public Label ONE1;
    public Label ONE2;
    public Label ONE3;
    public ImageView ONE4;

    public static ArrayList<String> Student = new ArrayList<String>();
    public static ArrayList<String> Dars = new ArrayList<String>();
    public static ArrayList<Integer> AZ = new ArrayList<Integer>();
    private static ArrayList<String> Arrey6 = new ArrayList<String>();

    private Label[] ArreyVahedSix = new Label[8];
    private int COUNT = 0;

    @FXML
    private void initialize() {
        ArreyVahedSix[0] = VahedSix3;
        ArreyVahedSix[1] = VahedSix4;
        ArreyVahedSix[2] = VahedSix5;
        ArreyVahedSix[3] = VahedSix6;
        ArreyVahedSix[4] = VahedSix7;
        ArreyVahedSix[5] = VahedSix8;
        ArreyVahedSix[6] = VahedSix9;
        ArreyVahedSix[7] = VahedSix10;


        SettingVisible6(false);
        SettingVisible5(false);
        SettingVisible4(false);
        SettingVisible3(false);
        SettingVisible2(false);
        SettingVisible1(true);
    }

    private void SettingVisible3(boolean chumchi) {
        THREE28.setVisible(chumchi);
        THREE27.setVisible(chumchi);
        THREE26.setVisible(chumchi);
        THREE25.setVisible(chumchi);
        THREE24.setVisible(chumchi);
        THREE23.setVisible(chumchi);
        THREE22.setVisible(chumchi);
        THREE21.setVisible(chumchi);
        THREE20.setVisible(chumchi);
        THREE19.setVisible(chumchi);
        THREE18.setVisible(chumchi);
        THREE17.setVisible(chumchi);
        THREE16.setVisible(chumchi);
        THREE15.setVisible(chumchi);
        THREE14.setVisible(chumchi);
        THREE13.setVisible(chumchi);
        THREE12.setVisible(chumchi);
        THREE11.setVisible(chumchi);
        THREE10.setVisible(chumchi);
        THREE9.setVisible(chumchi);
        THREE8.setVisible(chumchi);
        THREE7.setVisible(chumchi);
        THREE6.setVisible(chumchi);
        THREE5.setVisible(chumchi);
        THREE4.setVisible(chumchi);
        THREE3.setVisible(chumchi);
        THREE2.setVisible(chumchi);
        THREE1.setVisible(chumchi);
        ClassName.setVisible(chumchi);
        Vahed.setVisible(chumchi);
        Zarfiyat.setVisible(chumchi);
        HowMuchPish.setVisible(chumchi);
        Lesson1.setVisible(chumchi);
        Lesson2.setVisible(chumchi);
        Lesson3.setVisible(chumchi);
        chenging.setVisible(chumchi);
        ONE4.setVisible(chumchi);
        Saturday.setVisible(chumchi);
        Sunday.setVisible(chumchi);
        Monday.setVisible(chumchi);
        Tuesday.setVisible(chumchi);
        Thursday.setVisible(chumchi);
        sanse1.setVisible(chumchi);
        sanse2.setVisible(chumchi);
        sanse3.setVisible(chumchi);
    }

    public void SettingVisible2(boolean chumchi) {
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
        two1.setVisible(chumchi);
        two2.setVisible(chumchi);
        two10.setVisible(chumchi);
        two11.setVisible(chumchi);
        two12.setVisible(chumchi);
        two13.setVisible(chumchi);
        two14.setVisible(chumchi);
        two15.setVisible(chumchi);
        two16.setVisible(chumchi);
        two3.setVisible(chumchi);
        two4.setVisible(chumchi);
        two5.setVisible(chumchi);
        two6.setVisible(chumchi);
        two7.setVisible(chumchi);
        two8.setVisible(chumchi);
        two9.setVisible(chumchi);
        Chenging.setVisible(chumchi);
    }

    private void SettingVisible1(boolean chumchi) {
        ONE1.setVisible(chumchi);
        ONE2.setVisible(chumchi);
        ONE3.setVisible(chumchi);
        ONE4.setVisible(chumchi);
    }

    private void SettingVisible5(boolean chumchi) {
        FIVE1.setVisible(chumchi);
    }

    private void SettingVisible4(boolean chumchi) {
        FOUR1.setVisible(chumchi);
        FOUR2.setVisible(chumchi);
        FOUR3.setVisible(chumchi);
        NameStudent.setVisible(chumchi);
        NameLesson.setVisible(chumchi);
        Grade.setVisible(chumchi);
        Next.setVisible(chumchi);
        Previous.setVisible(chumchi);
        ONE4.setVisible(chumchi);
        Confirmation4.setVisible(chumchi);

    }

    private void SettingVisible6(boolean chumchi) {
        SIXIMG.setVisible(chumchi);
        SIXNAME.setVisible(chumchi);
        SIXPASS.setVisible(chumchi);
        SIX1.setVisible(chumchi);
        SIX2.setVisible(chumchi);
        SIXNAME2.setVisible(chumchi);
        SIXPASS2.setVisible(chumchi);
        Vaheds.setVisible(chumchi);
        Lists.setVisible(chumchi);
        NameOfclass.setVisible(chumchi);
        NumOfVahed.setVisible(chumchi);
        nc.setVisible(chumchi);
        nv.setVisible(chumchi);
        pre7.setVisible(chumchi);
        next7.setVisible(chumchi);
        StudentVahed.setVisible(chumchi);
        VahedSix1.setVisible(chumchi);
        StudentVahedLabel.setVisible(chumchi);
        VahedSix2.setVisible(chumchi);
        VahedSix3.setVisible(chumchi);
        VahedSix4.setVisible(chumchi);
        VahedSix5.setVisible(chumchi);
        VahedSix6.setVisible(chumchi);
        VahedSix7.setVisible(chumchi);
        VahedSix8.setVisible(chumchi);
        VahedSix9.setVisible(chumchi);
        VahedSix10.setVisible(chumchi);
        VahedSix11.setVisible(chumchi);
        VahedSix12.setVisible(chumchi);
        VahedSix13.setVisible(chumchi);
        VahedSix14.setVisible(chumchi);
        VahedSix15.setVisible(chumchi);
        VahedSix16.setVisible(chumchi);
        PRE6.setVisible(chumchi);
        NEXT6.setVisible(chumchi);
        NextStudent6.setVisible(chumchi);
        PreStudent6.setVisible(chumchi);
    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        new PageLoader().load("/view/Login2.fxml");
    }

    public void changpassButtom(ActionEvent actionEvent) {
        SettingVisible2(true);
        SettingVisible1(false);

    }

    public void Chenging(ActionEvent actionEvent) {
        boolean flagPass = true;
        boolean flagUser = true;
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
        boolean ok = true;
        if (oldPassword.getText().isEmpty()) {
            ok = false;
            OldPasswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
            OldPasswordLable.setVisible(true);
            i1.setVisible(true);
        }
        if (oldUsername.getText().isEmpty()) {
            ok = false;
            oldUsernameLable.setText("لطفا فیلد موردنظر را پر کنید ");
            oldUsernameLable.setVisible(true);
            i2.setVisible(true);
        }
        if (newPassword.getText().isEmpty()) {
            ok = false;
            newPsswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
            newPsswordLable.setVisible(true);
            i3.setVisible(true);
        }
        if (newUsername.getText().isEmpty()) {
            ok = false;
            newUsrnameLable.setText("لطفا فیلد موردنظر را پر کنید ");
            newUsrnameLable.setVisible(true);
            i4.setVisible(true);
        }
        if (confirmNewPassword.getText().isEmpty()) {
            ok = false;
            confirmpass.setText("لطفا فیلد موردنظر را پر کنید ");
            confirmpass.setVisible(true);
            i5.setVisible(true);
        }
        if (confirmNewUsername.getText().isEmpty()) {
            ok = false;
            confirmUser.setText("لطفا فیلد موردنظر را پر کنید ");
            confirmUser.setVisible(true);
            i6.setVisible(true);
        }
        if (!confirmNewPassword.getText().equalsIgnoreCase(newPassword.getText()) && !newPassword.getText().isEmpty() && !confirmNewPassword.getText().isEmpty()) {
            ok = false;
            flagPass = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد گرامی رمز عبور جدید شما با تاییدیه رمز عبور مطابقت ندارد   ");
            alert.showAndWait();
        }
        if (!confirmNewUsername.getText().equalsIgnoreCase(newUsername.getText()) && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty()) {
            ok = false;
            flagUser = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی نام کاربری  جدید شما با تاییدیه نام کاربری  مطابقت ندارد   ");
            alert.showAndWait();
        }
        if (newPassword.getText().length() < 6 && !newPassword.getText().isEmpty() && flagPass) {
            ok = false;
            newPsswordLable.setText("رمز عبور کمتر از 6 کاراکتر نمی تواند باشد  ");
            newPsswordLable.setVisible(true);
            i3.setVisible(true);
        }
        if (!oldPassword.getText().equalsIgnoreCase(Controller.WhichProfosser.getPassWord()) && !oldPassword.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد گرامی رمز عبور فعلی شما درست وارد نشده است    ");
            alert.showAndWait();
        }
        if (!oldUsername.getText().equalsIgnoreCase(Controller.WhichProfosser.getUserName()) && !oldUsername.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی نام کاربری  فعلی شما درست وارد نشده است    ");
            alert.showAndWait();
        }
        for (int i = 0; i < Controller.ArrayStudent.size(); i++) {
            if (Controller.which != i) {
                if (newUsername.getText().equalsIgnoreCase(Controller.ArrayStudent.get(i).getUserName()) && flagUser && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty()) {
                    ok = false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد گرامی نام کاربری انتخاب شده تکراری می باشد     ");
                    alert.showAndWait();
                }
            }
        }

        for (int i = 0; i < Controller.ArrayProfosser.size(); i++) {
            if (newUsername.getText().equalsIgnoreCase(Controller.ArrayProfosser.get(i).getUserName()) && flagUser) {
                ok = false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی  نام کاربری انتخاب شده تکراری می باشد     ");
                alert.showAndWait();
            }
        }
        if ((newUsername.getText().equalsIgnoreCase(A.getUserName())) && flagUser) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی نام کاربری انتخاب شده تکراری می باشد");
            alert.showAndWait();
        }
        if (ok) {
            Controller.WhichProfosser.setUserName(newUsername.getText());
            Controller.WhichProfosser.setPassWord(newPassword.getText());
        }
    }

    public void ONE(ActionEvent actionEvent) {
        ONE.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SettingVisible4(false);
        SettingVisible3(false);
        SettingVisible1(true);
        SettingVisible2(false);
        SettingVisible5(false);
        SettingVisible6(false);
    }

    public void TWO(ActionEvent actionEvent) {
        SettingVisible6(false);
        SettingVisible4(false);
        SettingVisible3(false);
        SettingVisible1(false);
        SettingVisible5(false);
        SettingVisible2(true);
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
        TWO.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
    }

    public void THREE(ActionEvent actionEvent) {
        SettingVisible6(false);
        SettingVisible4(false);
        SettingVisible2(false);
        SettingVisible1(false);
        SettingVisible5(false);
        SettingVisible3(true);
        Lesson1.setVisible(false);
        Lesson2.setVisible(false);
        Lesson3.setVisible(false);
        THREE26.setVisible(false);
        THREE27.setVisible(false);
        THREE28.setVisible(false);
        THREE.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
    }

    public void HowMuchPish(ActionEvent actionEvent) {
        Lesson1.setVisible(false);
        Lesson2.setVisible(false);
        Lesson3.setVisible(false);
        THREE26.setVisible(false);
        THREE27.setVisible(false);
        THREE28.setVisible(false);
        if (THREE25.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفاتعداد دروس پیش نیاز را مشخص کنید  ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) < 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی عدد انتخاب شده غیر قابل قبول می باشد  ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) == 1) {
            Lesson1.setVisible(true);
            THREE26.setVisible(true);
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) == 2) {
            Lesson1.setVisible(true);
            Lesson2.setVisible(true);
            THREE26.setVisible(true);
            THREE27.setVisible(true);
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) == 3) {
            Lesson1.setVisible(true);
            Lesson2.setVisible(true);
            Lesson3.setVisible(true);
            THREE26.setVisible(true);
            THREE27.setVisible(true);
            THREE28.setVisible(true);
        }

    }

    public void FOUR(ActionEvent actionEvent) {
        COUNT = 0;
        SettingVisible6(false);
        SettingVisible5(false);
        SettingVisible2(false);
        SettingVisible1(false);
        SettingVisible3(false);
        SettingVisible4(true);
        FOUR.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        Student.clear();
        Dars.clear();
        for (int i = 0; i < Controller.ArrayStudent.size(); i++) {
            int counter = 0;
            boolean NOTHING = false;
            for (int h = 0; h < Student.size(); h++) {
                if (Student.get(h).equalsIgnoreCase(Controller.ArrayStudent.get(i).getName()) && Dars.get(h).equalsIgnoreCase("هیچ کلاسی موجود نمی باشد")) {
                    NOTHING = true;
                }
            }
            if (Controller.ArrayStudent.get(i).ArreyNameClass.size() == 0 && !NOTHING) {
                Student.add(Controller.ArrayStudent.get(i).getName());
                Dars.add("هیچ کلاسی موجود نمی باشد");
                NOTHING = true;
            }
            while (counter < Controller.ArrayStudent.get(i).ArreyNameClass.size()) {

                Student.add(Controller.ArrayStudent.get(i).getName());
                Dars.add(Controller.ArrayStudent.get(i).ArreyNameClass.get(counter));
                counter++;

            }
        }
        NameStudent.setText(Student.get(COUNT));
        NameLesson.setText(Dars.get(COUNT));
    }

    public void FIVE(ActionEvent actionEvent) {
        SettingVisible6(false);
        SettingVisible5(true);
        SettingVisible4(false);
        SettingVisible2(false);
        SettingVisible1(false);
        SettingVisible3(true);
        Lesson1.setVisible(false);
        Lesson2.setVisible(false);
        Lesson3.setVisible(false);
        THREE26.setVisible(false);
        THREE27.setVisible(false);
        THREE28.setVisible(false);
        Zarfiyat.setVisible(false);
        THREE5.setVisible(false);
        THREE6.setVisible(false);
        chenging.setVisible(false);
        FIVE.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
    }

    public void SIX(ActionEvent actionEvent) {
        SettingVisible1(false);
        SettingVisible2(false);
        SettingVisible3(false);
        SettingVisible4(false);
        SettingVisible5(false);
        SettingVisible6(true);
        ONE4.setVisible(true);
        NameOfclass.setVisible(false);
        NumOfVahed.setVisible(false);
        nc.setVisible(false);
        nv.setVisible(false);
        pre7.setVisible(false);
        next7.setVisible(false);
        PRE6.setVisible(false);
        NEXT6.setVisible(false);
        VahedSix16.setVisible(false);
        NextStudent6.setVisible(false);
        PreStudent6.setVisible(false);
        SIXNAME2.setText(Controller.WhichProfosser.getUserName());
        SIXPASS2.setText(Controller.WhichProfosser.getPassWord());
        SIX.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        StudentVahed.setVisible(false);
        VahedSix1.setVisible(false);
        StudentVahedLabel.setVisible(false);
        VahedSix2.setVisible(false);
        VahedSix3.setVisible(false);
        VahedSix4.setVisible(false);
        VahedSix5.setVisible(false);
        VahedSix6.setVisible(false);
        VahedSix7.setVisible(false);
        VahedSix8.setVisible(false);
        VahedSix9.setVisible(false);
        VahedSix10.setVisible(false);
        VahedSix11.setVisible(false);
        VahedSix12.setVisible(false);
        VahedSix13.setVisible(false);
        VahedSix14.setVisible(false);
        VahedSix15.setVisible(false);
    }

    public void Saturday(ActionEvent actionEvent) {
        counterSaturday++;
    }

    public void Sunday(ActionEvent actionEvent) {
        counterSunday++;
    }

    public void Monday(ActionEvent actionEvent) {
        counterMonday++;
    }

    public void Thursday(ActionEvent actionEvent) {
        counterThursday++;
    }

    public void Tuesday(ActionEvent actionEvent) {
        counterTuesday++;
    }

    public void sanse1(ActionEvent actionEvent) {
        counter1++;
        if (counter1 % 2 == 1) {
            sanse1.setDisable(false);
            sanse2.setDisable(true);
            sanse3.setDisable(true);
        } else {
            sanse1.setDisable(false);
            sanse2.setDisable(false);
            sanse3.setDisable(false);
        }
    }

    public void Sanse2(ActionEvent actionEvent) {
        counter2++;
        if (counter2 % 2 == 1) {
            sanse2.setDisable(false);
            sanse1.setDisable(true);
            sanse3.setDisable(true);
        } else {
            sanse1.setDisable(false);
            sanse2.setDisable(false);
            sanse3.setDisable(false);
        }
    }


    public void Sanse3(ActionEvent actionEvent) {
        counter3++;
        if (counter3 % 2 == 1) {
            sanse3.setDisable(false);
            sanse1.setDisable(true);
            sanse2.setDisable(true);
        } else {
            sanse1.setDisable(false);
            sanse2.setDisable(false);
            sanse3.setDisable(false);
        }
    }

    public void chenging(ActionEvent actionEvent) {
        boolean ok = true;
        if (THREE25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفاتعداد دروس پیش نیاز را مشخص کنید  ");
            alert.showAndWait();
        }
        if (counter1 % 2 == 0 && counter2 % 2 == 0 && counter3 % 2 == 0) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی یکی از ساعت ها را برای اراعه درس انتخاب بکنید ");
            alert.showAndWait();
        }
        if (ClassName.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نامی برای کلاس بنویسید ");
            alert.showAndWait();
        }
        if (Zarfiyat.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا تعداد ظرفیت کلاس را مشخص کنید ");
            alert.showAndWait();
        }
        if (Vahed.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا تعداد واحد درس  را مشخص کنید ");
            alert.showAndWait();
        }
        if (counterSaturday % 2 == 0 && counterSunday % 2 == 0 && counterMonday % 2 == 0 && counterTuesday % 2 == 0 && counterThursday % 2 == 0) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفاروزی را برای اراعه ی درس مشخص کنید  ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) >= 1 && Lesson1.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس اول را مشخص نمایید   ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) >= 2 && Lesson2.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس دوم را مشخص نمایید   ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) == 3 && Lesson3.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس سوم را مشخص نمایید   ");
            alert.showAndWait();
        }
        int adad = 0;
        if (counterMonday % 2 == 1) {
            Arrey[2] = true;

        }
        if (counterSaturday % 2 == 1) {
            Arrey[0] = true;
        }
        if (counterSunday % 2 == 1) {
            Arrey[1] = true;
        }
        if (counterTuesday % 2 == 1) {
            Arrey[3] = true;
        }
        if (counterThursday % 2 == 1) {
            Arrey[4] = true;
        }
        ///************
        if (counterMonday % 2 == 0) {

            Arrey[2] = false;

        }
        if (counterSaturday % 2 == 0) {
            Arrey[0] = false;
        }
        if (counterSunday % 2 == 0) {
            Arrey[1] = false;
        }
        if (counterTuesday % 2 == 0) {
            Arrey[3] = false;
        }
        if (counterThursday % 2 == 0) {
            Arrey[4] = false;
        }
        if (ok) {
            int s = 0;
            String one = "";
            String two = "";
            String three = "";
            if (counter1 % 2 == 1) {
                s = 1;
            }
            if (counter2 % 2 == 1) {
                s = 2;
            }
            if (counter3 % 2 == 1) {
                s = 3;
            }
            if (Integer.parseInt(THREE25.getText()) == 1) {
                one = Lesson1.getText();
            }
            if (Integer.parseInt(THREE25.getText()) == 2) {
                one = Lesson1.getText();
                two = Lesson2.getText();
            }
            if (Integer.parseInt(THREE25.getText()) == 3) {
                one = Lesson1.getText();
                two = Lesson2.getText();
                three = Lesson3.getText();
            }

            AZ.add(Integer.parseInt(Zarfiyat.getText()));
            Class chum = new Class(ClassName.getText(), Integer.parseInt(Vahed.getText()), Integer.parseInt(Zarfiyat.getText()), s, one, two, three, Arrey);
            Controller.WhichProfosser.ArreyClass.add(chum);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی درخواست شما با موفقیت انجام شد   ");
            alert.showAndWait();
        }

    }

    public void Next(ActionEvent actionEvent) {
        if (COUNT < Dars.size() - 1) {
            COUNT++;
        }
        if (COUNT < Dars.size()) {
            NameStudent.setText(Student.get(COUNT));
            NameLesson.setText(Dars.get(COUNT));
        }
    }


    public void Previous(ActionEvent actionEvent) {
        if (COUNT >= 1) {
            COUNT--;
        }
        if (COUNT >= 0) {
            NameStudent.setText(Student.get(COUNT));
            NameLesson.setText(Dars.get(COUNT));
        }
    }

    public void pre7(ActionEvent actionEvent) {
        if (COUNT7 >= 1) {
            COUNT7--;
        }
        //?????????
        if (COUNT7 > 0) {
            nc.setText(Controller.WhichProfosser.ArreyClass.get(COUNT7).getNameLesson());
            nv.setText(Controller.WhichProfosser.ArreyClass.get(COUNT7).getVahed() + "");
        }
    }

    public void Confirmation4(ActionEvent actionEvent) {
        boolean ok = true;
        if (Grade.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا قسمت نمره دهی را پر نمایید   ");
            alert.showAndWait();
        }
        if (!Grade.getText().isEmpty() && (Integer.parseInt(Grade.getText()) < 0 || Integer.parseInt(Grade.getText()) > 20)) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی  نمره ی داده شده معتبر نمی باشد   ");
            alert.showAndWait();
        }
        if (NameLesson.getText().equalsIgnoreCase("هیچ کلاسی موجود نمی باشد")) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد گرامی درسی موجود نمی باشد   ");
            alert.showAndWait();
        }
        if (ok) {
            boolean Kodom = false;
            for (int i = 0; i < Controller.ArrayStudent.size(); i++) {
                if (Controller.ArrayStudent.get(i).getName().equalsIgnoreCase(NameStudent.getText())) {
                    for (int j = 0; j < Controller.ArrayStudent.get(i).ArreyNameClass.size(); j++) {
                        if (NameLesson.getText().equalsIgnoreCase(Controller.ArrayStudent.get(i).ArreyNameClass.get(j))) {

                            Controller.ArrayStudent.get(i).ArreyScore.add(j, (double) Integer.parseInt(Grade.getText()));
                            Controller.ArrayStudent.get(i).setVahed(Controller.ArrayStudent.get(i).getVahed()-Controller.ArrayStudent.get(i).ArreyNameClassVahed.get(j));
                            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد گرامی درخواست شما با موفقیت انجام شد   ");
                            alert.showAndWait();

                        }
                    }

                }
            }
        }
    }

    public void FIVE1(ActionEvent actionEvent) {
        boolean ok = true;
        if (THREE25.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفاتعداد دروس پیش نیاز را مشخص کنید  ");
            alert.showAndWait();
        }
        if (counter1 % 2 == 0 && counter2 % 2 == 0 && counter3 % 2 == 0) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی یکی از ساعت ها را برای اراعه درس انتخاب بکنید ");
            alert.showAndWait();
        }
        if (ClassName.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نامی برای کلاس بنویسید ");
            alert.showAndWait();
        }
        if (Vahed.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا تعداد واحد درس  را مشخص کنید ");
            alert.showAndWait();
        }
        if (counterSaturday % 2 == 0 && counterSunday % 2 == 0 && counterMonday % 2 == 0 && counterTuesday % 2 == 0 && counterThursday % 2 == 0) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفاروزی را برای اراعه ی درس مشخص کنید  ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) >= 1 && Lesson1.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس اول را مشخص نمایید   ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) >= 2 && Lesson2.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس دوم را مشخص نمایید   ");
            alert.showAndWait();
        }
        if (!THREE25.getText().isEmpty() && Integer.parseInt(THREE25.getText()) == 3 && Lesson3.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی لطفا نام درس سوم را مشخص نمایید   ");
            alert.showAndWait();
        }
        int which = -1;

        int s = 0;
        if (counter1 % 2 == 1) {
            s = 1;
        }
        if (counter2 % 2 == 1) {
            s = 2;
        }
        if (counter3 % 2 == 1) {
            s = 3;
        }
        boolean[] arr = new boolean[5];
        if (counterMonday % 2 == 1) {
            arr[2] = true;

        }
        if (counterSaturday % 2 == 1) {
            arr[0] = true;
        }
        if (counterSunday % 2 == 1) {
            arr[1] = true;
        }
        if (counterTuesday % 2 == 1) {
            arr[3] = true;
        }
        if (counterThursday % 2 == 1) {
            arr[4] = true;
        }
        ///************
        if (counterMonday % 2 == 0) {

            arr[2] = false;

        }
        if (counterSaturday % 2 == 0) {
            arr[0] = false;
        }
        if (counterSunday % 2 == 0) {
            arr[1] = false;
        }
        if (counterTuesday % 2 == 0) {
            arr[3] = false;
        }
        if (counterThursday % 2 == 0) {
            arr[4] = false;
        }
        if (Controller.WhichProfosser.ArreyClass.size() == 0) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی درسی با چنین نامی ایجاد نشده است   ");
            alert.showAndWait();
        }
        boolean peyda = false;
        for (int i = 0; i < Controller.WhichProfosser.ArreyClass.size(); i++) {
            if (Controller.WhichProfosser.ArreyClass.get(i).getNameLesson().equalsIgnoreCase(ClassName.getText())) {
                if (Controller.WhichProfosser.ArreyClass.get(i).getVahed() == Integer.parseInt(Vahed.getText())) {
                    if (Controller.WhichProfosser.ArreyClass.get(i).getSanse() == s) {

                        boolean hast = true;
                        for (int k = 0; k < 5; k++) {
                            if (!Controller.WhichProfosser.ArreyClass.get(i).ArrayDay[k] == arr[k]) {
                                hast = false;
                            }
                        }
                        if (hast) {
                            String one = "";
                            String two = "";
                            String three = "";
                            if (Integer.parseInt(THREE25.getText()) == 1) {
                                one = Lesson1.getText();
                            }
                            if (Integer.parseInt(THREE25.getText()) == 2) {
                                one = Lesson1.getText();
                                two = Lesson2.getText();
                            }
                            if (Integer.parseInt(THREE25.getText()) == 3) {
                                one = Lesson1.getText();
                                two = Lesson2.getText();
                                three = Lesson3.getText();
                            }
                            boolean is = true;
                            if (!one.equalsIgnoreCase(Controller.WhichProfosser.ArreyClass.get(i).PishNiyaz[0])) {
                                is = false;
                            }
                            if (!two.equalsIgnoreCase(Controller.WhichProfosser.ArreyClass.get(i).PishNiyaz[1])) {
                                is = false;
                            }
                            if (!three.equalsIgnoreCase(Controller.WhichProfosser.ArreyClass.get(i).PishNiyaz[2])) {
                                is = false;
                            }
                            if (is) {
                                which = i;
                                peyda = true;
                            }

                        }

                    }

                }
            }
        }
        if (!peyda) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی درسی با چنین نامی ایجاد نشده است   ");
            System.out.println("1");
            alert.showAndWait();
        }
        if (ok) {
            if (which >= 0) {
                ArrayList<Integer> numberOfStudent = new ArrayList<Integer>();
                ArrayList<Integer> numberOfClass = new ArrayList<Integer>();
                for (int i = 0; i < Controller.ArrayStudent.size(); i++) {
                    ////shak daram sharteshooooooo
                    for (int h = 0; h < Controller.ArrayStudent.get(i).ArreyNameClass.size(); h++) {
                        if (Controller.ArrayStudent.get(i).ArreyNameClass.get(h).equalsIgnoreCase(ClassName.getText())) {
                            if (Controller.ArrayStudent.get(i).ArreyTime.get(h) == s) {
                                boolean IS = true;
                                for (int y = h; y < h + 5; y++) {
                                    if (!Controller.ArrayStudent.get(i).ArreyDay.get(y) == arr[y - h]) {
                                        IS = false;
                                    }
                                }
                                if (IS) {
                                    Controller.ArrayStudent.get(i).setVahed(Controller.ArrayStudent.get(i).getVahed() - Integer.parseInt(Vahed.getText()));
                                    numberOfStudent.add(i);
                                    numberOfClass.add(h);
                                    for (int l = 0; l < Student.size(); l++) {
                                        if (Student.get(i).equalsIgnoreCase(Controller.ArrayStudent.get(i).getName()) && Dars.get(l).equalsIgnoreCase(Controller.ArrayStudent.get(i).ArreyNameClass.get(h))) {
                                            Dars.remove(h);
                                            Student.remove(h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                for (int u = 0; u < numberOfClass.size(); u++) {
                    int r = numberOfClass.get(u);
                    Controller.ArrayStudent.get(numberOfStudent.get(u)).ArreyNameClass.remove(r);
                    Controller.ArrayStudent.get(numberOfStudent.get(u)).ArreyNameClassVahed.remove(r);

                }
                Controller.WhichProfosser.ArreyClass.remove(which);
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n استاد  گرامی درس مورد نظر حذف گردید   ");
            alert.showAndWait();
        }
    }
    public void Lists(ActionEvent actionEvent) {
        SettingVisible6(false);
        StudentVahed.setVisible(true);
        VahedSix1.setVisible(true);
        StudentVahedLabel.setVisible(true);
        VahedSix2.setVisible(true);
        VahedSix3.setVisible(true);
        VahedSix4.setVisible(true);
        VahedSix5.setVisible(true);
        VahedSix6.setVisible(true);
        VahedSix7.setVisible(true);
        VahedSix8.setVisible(true);
        VahedSix9.setVisible(true);
        VahedSix10.setVisible(true);
        VahedSix11.setVisible(true);
        VahedSix12.setVisible(true);
        VahedSix13.setVisible(true);
        VahedSix14.setVisible(true);
        VahedSix15.setVisible(true);
        VahedSix16.setVisible(true);
        PRE6.setVisible(true);
        NEXT6.setVisible(true);
        NextStudent6.setVisible(true);
        PreStudent6.setVisible(true);

        if (Controller.WhichProfosser.ArreyClass.size() == 0) {
            StudentVahedLabel.setText("هیچ واحدی برای ارائه وجود ندارد");
            VahedSix3.setVisible(false);
            VahedSix4.setVisible(false);
            VahedSix5.setVisible(false);
            VahedSix6.setVisible(false);
            VahedSix7.setVisible(false);
            VahedSix8.setVisible(false);
            VahedSix9.setVisible(false);
            VahedSix10.setVisible(false);
        } else {
            Show6();
        }
    }

    public void Vaheds(ActionEvent actionEvent) {
        SettingVisible6(false);
        NameOfclass.setVisible(true);
        NumOfVahed.setVisible(true);
        nc.setVisible(true);
        nv.setVisible(true);
        pre7.setVisible(true);
        next7.setVisible(true);
        if (Controller.WhichProfosser.ArreyClass.size() == 0) {
            nc.setText("هیج کلاسی برای ارائه وجود ندارد");
            nv.setText("هیج کلاسی برای ارائه وجود ندارد");
        } else {
            nc.setText(Controller.WhichProfosser.ArreyClass.get(0).getNameLesson());
            nv.setText(Controller.WhichProfosser.ArreyClass.get(0).getVahed() + "");
        }

    }

    public void next7(ActionEvent actionEvent) {
        if (COUNT7 < Controller.WhichProfosser.ArreyClass.size() - 1) {
            COUNT7++;
        }
        if (COUNT7 < Controller.WhichProfosser.ArreyClass.size()) {
            nc.setText(Controller.WhichProfosser.ArreyClass.get(COUNT7).getNameLesson());
            nv.setText(Controller.WhichProfosser.ArreyClass.get(COUNT7).getVahed() + "");
        }

    }

    public void Show6() {
        for (int i = 0; i < 8; i++) {
            ArreyVahedSix[i].setVisible(false);
        }
        Arrey6.clear();
        StudentVahedLabel.setText(Controller.WhichProfosser.ArreyClass.get(counterSix).getNameLesson());
        for (int i = 0; i < Controller.ArrayStudent.size(); i++) {
            for (int j = 0; j < Controller.ArrayStudent.get(i).ArreyNameClass.size(); j++) {
                if (Controller.ArrayStudent.get(i).ArreyNameClass.get(j).equalsIgnoreCase(StudentVahedLabel.getText())) {
                    if (Controller.WhichProfosser.ArreyClass.get(counterSix).getSanse() == Controller.ArrayStudent.get(i).ArreyTime.get(j)) {
                        boolean is = true;
                        if (is) {
                            Arrey6.add(Controller.ArrayStudent.get(i).getName());
                        }

                    }
                }
            }
        }
        int r = 8;
        if (Arrey6.size() < 8) {
            r = Arrey6.size();
        }
        for (int j = 0; j < r; j++) {
            ArreyVahedSix[j].setVisible(true);
            ArreyVahedSix[j].setText(Arrey6.get(j));
        }

    }

    public void NEXT6(ActionEvent actionEvent) {
        if (counterSix < Controller.WhichProfosser.ArreyClass.size() - 1) {
            counterSix++;
        }
        if (counterSix < Controller.WhichProfosser.ArreyClass.size()) {
            StudentVahedLabel.setText(Controller.WhichProfosser.ArreyClass.get(counterSix).getNameLesson());
            Show6();
        }

    }

    public void PRE6(ActionEvent actionEvent) {
        if (counterSix >= 1) {
            counterSix--;
            Show6();
        }
    }

    public void PreStudent6(ActionEvent actionEvent) {
        if(COUNTNEXT6>=1)
        {
            COUNTNEXT6--;
            for (int j =COUNTNEXT6*8; j <(COUNTNEXT6+1)*8; j++)
            {
                int p=j;
                if(p>=8)
                {
                    p=p%8;
                }
                ArreyVahedSix[p].setVisible(true);
                ArreyVahedSix[p].setText(Arrey6.get(j));
            }

        }

    }

   private int COUNTNEXT6 = 0;

    public void NextStudent6(ActionEvent actionEvent) {
        COUNTNEXT6++;
        if (Arrey6.size() >= 8 * COUNTNEXT6) {
            if ((COUNTNEXT6 + 1) * 8 <= Arrey6.size())
            {
                for (int j =COUNTNEXT6*8; j <(COUNTNEXT6+1)*8; j++)
                {
                    int p=j;
                    if(p>=8)
                    {
                        p=p%8;
                    }
                    ArreyVahedSix[p].setVisible(true);
                    ArreyVahedSix[p].setText(Arrey6.get(j));
                }
            }
            else
            {
                for (int j =COUNTNEXT6*8; j <Arrey6.size(); j++)
                {
                    int p=j;
                    if(p>=8)
                    {
                        p=p%8;
                    }
                    ArreyVahedSix[p].setVisible(true);
                    ArreyVahedSix[p].setText(Arrey6.get(j));
                }
            }


        }
        else
        {
            COUNTNEXT6--;
        }

    }
}

