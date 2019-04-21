package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import model.Admin;
import model.PageLoader;
import model.Profosser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static controller.Controller.A;
import static controller.Controller.whichStudent;


public class StudentController {
    public Line Three69;
    public Line Three70;
    public Line Three71;
    public Line Three72;
    public Line Three73;
    public Line Three74;
    public Label Three61;
    public Label Three62;
    public Label Three63;
    public Label Three65;
    public Label Three64;
    public Line Three75;
    public Label Three66;
    public Line Three76;
    public Label Three67;
    public Line Three77;
    public Line Three78;
    public Label Three68;
    public Label Three82;
    public Line Three79;
    public Line Three80;
    public Line Three81;
    public Button SubmitFood;
    public  Label ShowingCredit;
    public  Label C;
    public Label Four37;
    public Line Four45;
    public Line Four46;
    public Line Four42;
    public Line Four44;
    public Line Four43;
    public ImageView Four41;
    public Label Four38;
    public RadioButton Four39;
    public Label Four40;
    public Line Four47;
    public Button Four48;
    public Line five1;
    public Line five2;
    public Line five3;
    public Line five4;
    public Line five5;
    public Line five6;
    public Line five7;
    public Label five8;
    public Label five9;
    public Label five10;
    public Label five11;
    public Label five12;
    public Label five13;
    public Label name1;
    public Label vahed1;
    public Label zarfiyat1;
    public Label day1;
    public Label day2;
    public Label day9;
    public Label day5;
    public Label day3;
    public Label day10;
    public Label pish1;
    public Label pish2;
    public Label time1;
    public Button Sabt1;
    public Label name2;
    public Label vahed2;
    public Label zarfiyat2;
    public Label day6;
    public Label day7;
    public Label day8;
    public Label pish4;
    public Label pish5;
    public Label time11;
    public Button Sabt2;
    public Label day4;
    public Label pish3;
    public Label pish6;
    public Label time2;
    public Label name3;
    public Label vahed3;
    public Label zarfiyat3;
    public Label day11;
    public Label day12;
    public Label day13;
    public Label day14;
    public Label day15;
    public Label pish7;
    public Label pish8;
    public Label pish9;
    public Label time3;
    public Button Sabt3;
    public Label name4;
    public Label vahed4;
    public Label zarfiyat4;
    public Label day16;
    public Label day17;
    public Label day18;
    public Label day19;
    public Label day20;
    public Label pish10;
    public Label pish11;
    public Label pish12;
    public Label time4;
    public Button Sabt4;
    public Label name5;
    public Label vahed5;
    public Label zarfiyat5;
    public Label day21;
    public Label day22;
    public Label day23;
    public Label day24;
    public Label day25;
    public Label pish13;
    public Label pish14;
    public Label pish15;
    public Label time5;
    public Button Sabt5;
    public Label name6;
    public Label vahed6;
    public Label zarfiyat6;
    public Label day26;
    public Label day27;
    public Label day28;
    public Label day29;
    public Label day30;
    public Label pish16;
    public Label pish18;
    public Label pish17;
    public Label time6;
    public Button Sabt6;
    public Label name7;
    public Label vahed7;
    public Label zarfiyat7;
    public Label day31;
    public Label day32;
    public Label day33;
    public Label day34;
    public Label day35;
    public Label pish19;
    public Label pish20;
    public Label pish21;
    public Label time7;
    public Button Sabt7;
    public Button next;
    public Button previous;
    public Label six1;
    public Label six2;
    public Label six3;
    public Label NameStudentSx;
    public Label six4;
    public Label six5;
    public Label vahedSix;
    public Line six22;
    public Line six28;
    public Line six29;
    public Line six30;
    public Line six31;
    public Line six32;
    public Line six27;
    public Line six21;
    public Label six6;
    public Label six7;
    public Label six8;
    public Label six9;
    public Label six10;
    public Label six11;
    public Label six12;
    public Label six13;
    public Label six14;
    public Label six15;
    public Line six23;
    public Line six24;
    public Line six25;
    public Line six26;
    public Label six16;
    public Label six17;
    public Label six18;
    public Label six19;
    public Label six20;
    public Label SATURDAY1;
    public Label SUNDAY1;
    public Label MONDAY1;
    public Label TUESDAY1;
    public Label SATURDAY2;
    public Label SUNDAY2;
    public Label MONDAY2;
    public Label WEDNESDAY1;
    public Label TUESDAY2;
    public Label WEDNESDAY2;
    public Label SATURDAY3;
    public Label SUNDAY3;
    public Label MONDAY3;
    public Label TUESDAY3;
    public Label WEDNESDAY3;
    public Button SEVEN;
    public Label SEVEN11;
    public MenuButton SEVEN10;
    public MenuItem Nasher;
    public MenuItem NameBook;
    public MenuItem Writer;
    public MenuItem All;
    public Line SEVEN1;
    public Line SEVEN2;
    public Line SEVEN3;
    public Line SEVEN4;
    public Line SEVEN5;
    public Line SEVEN6;
    public Line SEVEN7;
    public Line SEVEN8;
    public Line SEVEN9;
    public Label NUM1;
    public Label NUM2;
    public Label NUM3;
    public Label NUM4;
    public Label NUM5;
    public Label NUM6;
    public Label NUM7;
    public Label NUM8;
    public Label WRITER;
    public Label NASHER;
    public Label BOOOK;
    public Label WRITER1;
    public Label NASHER1;
    public Label BOOK1;
    public Label WRITER2;
    public Label NASHER2;
    public Label BOOK2;
    public Label WRITER3;
    public Label NASHER3;
    public Label BOOK3;
    public Label WRITER4;
    public Label NASHER4;
    public Label BOOK4;
    public Label WRITER5;
    public Label NASHER5;
    public Label BOOK5;
    public Label WRITER6;
    public Label NASHER6;
    public Label BOOK6;
    public Label WRITER7;
    public Label WRITER8;
    public Label NASHER7;
    public Label NASHER8;
    public Label BOOK7;
    public Label BOOK8;
    public Button R1;
    public Button R2;
    public Button R3;
    public Button R4;
    public Button R5;
    public Button R6;
    public Button R7;
    public Button R8;
    public Label SEVEN12;
    public TextField SEVEN13;
    public Button Search;
    public Button pre;
    public Button Next;
    public Button R9,R10,R11,R12,R13,R14,R15,R16;
    public Label T3;
    public Label V3;
    public Label T2;
    public Label V2;
    public Label T1;
    public Label V1;
    public Label class3;
    public Label class2;
    public Label class1;
    public ImageView IMG8;
    public Label E1;
    public Label E2;
    public Label E3;
    public Label E4;
    public Label E5;
    public Label E6;
    public Label E8;
    public Label E7;
    public Label E11;
    public Label E10;
    public Label E9;
    public Line E12;
    public Line E13;
    public Line E14;
    public Line E15;
    public HBox E16;
    public Line E17,E18;
    public Button EIGHT;
    public ImageView IMG2;
    public Button PRE8;
    public Button NEXT8;
    public Label IDN1;
    public Label IDN3;
    public Label IDN2;
    public Label IDN4;
    public Label ShowingCredit1;
    public Label Credit1;
    private Button[]ArreyButtonFive=new Button[7];
    private Label[]ArreyTimeFive=new Label[7];
    private Label[]ArreyZarfiyatFive=new Label[7];
    private Label[]ArreyVahedFive=new Label[7];
    private Label[]ArreyNameFive=new Label[7];
    private Label[][]ArreyPishFive=new Label[3][7];
    private Label[][]ArreyDayFive=new Label[5][7];

    int counter=0;
    @FXML
    public TextField oldPassword;
    @FXML
    public TextField oldUsername;
    @FXML
    public TextField newPassword;
    @FXML
    public TextField newUsername;
    @FXML
    public TextField confirmNewPassword;
    @FXML
    public TextField confirmNewUsername;
    @FXML
    public ImageView i1;
    @FXML
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
    @FXML
    ImageView Image3;
    @FXML
    ImageView Image2;
    @FXML
    ImageView Image1;
    @FXML
    ImageView Image4;
    @FXML
    ImageView Image5;
    @FXML
    ImageView Four35;
    public ImageView[]ArreyImage=new ImageView[6];
    @FXML
    TextField Four31;

    @FXML
    RadioButton Three40,Three39,Three38,Three37,Three36,Three35,Three34,Three33,Three32,Three31,Three30,Three29,Three28,Three27,Three26,Three25,Three24,Three23,Three21,Three22;

    private RadioButton [][]ArreyButton=new  RadioButton[5][4];
    private boolean FlagNasher=false;
    private boolean FlagBook=false;
    private boolean FlagWriter=false;
    private boolean FlagAll=false;

    @FXML
    private Label StudentName;
    @FXML
    Button TWO;
    @FXML
    Button THREE;
    @FXML
    Button FOUR;
    @FXML
    Button FIVE;
    @FXML
    Button SIX;
    @FXML
    Button ONE;
    @FXML
    Button chumchi;
    @FXML
    Label Lable1one,Lable2one,Lable3one,Three1,Three3,Three20,Three2,Three4,Three5,Three6,Three7,Three8,Three9,Three10,Three11,Three12,Three13,Three14,Three15,Three16,Three17,Three18,Three19,
            Three42,Three44,Three45,Three46,Three47,Three48,Three49,Three50,Three51,Three52,Three53,Three54,Three55,Three56,Three57,Three58,Three59,Three60,Three41,Three43;
    private   Label [][]ArreyLable=new Label[5][4];
    private   Label [][]ArreyLablePrice=new Label[5][4];
    private  Label[]ArreyNasher=new Label[8];
    private Label[]ArreyWriter=new Label[8];
    private Label[]ArreyBOOK=new Label[8];
    private Button[]ARRButton=new Button[8];
    private Button[]arrButton=new Button[8];
    private Label[]NUMBER=new Label[8];
    private Label[]CLASS=new Label[3];
    private Label[]TIME=new Label[3];
    ///public static ArrayList<Book> ArreyB= new ArrayList<Book>();
    public  static  ArrayList<model.Class> ClassProfosser=new ArrayList<model.Class>();
    public static  ArrayList<Profosser> ClassProfosserName=new ArrayList<Profosser>();
    public static ArrayList<Integer>Zarfiyat=new ArrayList<>();
    public static String MoneyIncrease;
    private boolean empty=true;
    @FXML
    Label Four1;
    @FXML
    Label Four2;
    @FXML
    Label Four3;
    @FXML
    Label Four4;
    @FXML
    Label Four5;
    @FXML
    Label Four6;
    @FXML
    Label Four7;
    @FXML
    Label Four8;
    @FXML
    Label Four9;
    @FXML
    Label Four10;
    @FXML
    Label Four11;
    @FXML
    Label Four12;
    @FXML
    Label Four13;
    @FXML
    Label Four14,two1,two2,two3,two4,two5,two6,two7,two8,two10,two11,two12,two13,two14,two15,two16,two9;
    @FXML
    Label Four15;
    @FXML
    Label Four16;
    @FXML
    Label Four17;
    @FXML
    Label Four18;
    @FXML
    Label Four19;
    @FXML
    Label Four20;
    @FXML
    Label Four27;
    @FXML
    Label Four28;
    @FXML
    Label Four29;
    @FXML
    Label Four30;
    @FXML
    Label Four32;
    @FXML
    Label Four36;
    @FXML
    Button buttonOne;
    @FXML
    Button buttonTwo;
    @FXML
    Button Four33;
    @FXML
    Button Four34;
    @FXML
    Button Four21;
    @FXML
    Button Four22;
    @FXML
    Button Four23;
    @FXML
    Button Four24;
    @FXML
    Button Four25;
    @FXML
    Button Four26,Chenging;
    private int counter21,counter22,counter23,counter24,counter25,counter26,counter27,counter28,counter29,counter30,counter31,counter32,counter33,counter34,counter35,counter36,counter37,counter38,counter39,counter40;

    public StudentController() throws FileNotFoundException {
    }

    @FXML
    private void initialize() {
        StudentName.setText(whichStudent.getUserName());
        ShowingCredit1.setText(whichStudent.getCredit());
        SettingVisible7(false);
        CLASS[0]=class1;
        CLASS[1]=class2;
        CLASS[2]=class3;
        TIME[0]=T1;
        TIME[1]=T2;
        TIME[2]=T3;


        NUMBER[0]=NUM1;
        NUMBER[1]=NUM2;
        NUMBER[2]=NUM3;
        NUMBER[3]=NUM4;
        NUMBER[4]=NUM5;
        NUMBER[5]=NUM6;
        NUMBER[6]=NUM7;
        NUMBER[7]=NUM8;

        arrButton[0]=R9;
        arrButton[1]=R10;
        arrButton[2]=R11;
        arrButton[3]=R12;
        arrButton[4]=R13;
        arrButton[5]=R14;
        arrButton[6]=R15;
        arrButton[7]=R16;


        ArreyWriter[0]=WRITER1;
        ArreyWriter[1]=WRITER2;
        ArreyWriter[2]=WRITER3;
        ArreyWriter[3]=WRITER4;
        ArreyWriter[4]=WRITER5;
        ArreyWriter[5]=WRITER6;
        ArreyWriter[6]=WRITER7;
        ArreyWriter[7]=WRITER8;

        ARRButton[0]=R1;
        ARRButton[1]=R2;
        ARRButton[2]=R3;
        ARRButton[3]=R4;
        ARRButton[4]=R5;
        ARRButton[5]=R6;
        ARRButton[6]=R7;
        ARRButton[7]=R8;

        ArreyNasher[0]=NASHER1;
        ArreyNasher[1]=NASHER2;
        ArreyNasher[2]=NASHER3;
        ArreyNasher[3]=NASHER4;
        ArreyNasher[4]=NASHER5;
        ArreyNasher[5]=NASHER6;
        ArreyNasher[6]=NASHER7;
        ArreyNasher[7]=NASHER8;

        ArreyBOOK[0]=BOOK1;
        ArreyBOOK[1]=BOOK2;
        ArreyBOOK[2]=BOOK3;
        ArreyBOOK[3]=BOOK4;
        ArreyBOOK[4]=BOOK5;
        ArreyBOOK[5]=BOOK6;
        ArreyBOOK[6]=BOOK7;
        ArreyBOOK[7]=BOOK8;


        ArreyButtonFive[0]=Sabt1;
        ArreyButtonFive[1]=Sabt2;
        ArreyButtonFive[2]=Sabt3;
        ArreyButtonFive[3]=Sabt4;
        ArreyButtonFive[4]=Sabt5;
        ArreyButtonFive[5]=Sabt6;
        ArreyButtonFive[6]=Sabt7;

        ArreyTimeFive[0]=time1;
        ArreyTimeFive[1]=time2;
        ArreyTimeFive[2]=time3;
        ArreyTimeFive[3]=time4;
        ArreyTimeFive[4]=time5;
        ArreyTimeFive[5]=time6;
        ArreyTimeFive[6]=time7;

        ArreyZarfiyatFive[0]=zarfiyat1;
        ArreyZarfiyatFive[1]=zarfiyat2;
        ArreyZarfiyatFive[2]=zarfiyat3;
        ArreyZarfiyatFive[3]=zarfiyat4;
        ArreyZarfiyatFive[4]=zarfiyat5;
        ArreyZarfiyatFive[5]=zarfiyat6;
        ArreyZarfiyatFive[6]=zarfiyat7;

        ArreyVahedFive[0]=vahed1;
        ArreyVahedFive[1]=vahed2;
        ArreyVahedFive[2]=vahed3;
        ArreyVahedFive[3]=vahed4;
        ArreyVahedFive[4]=vahed5;
        ArreyVahedFive[5]=vahed6;
        ArreyVahedFive[6]=vahed7;

        ArreyNameFive[0]=name1;
        ArreyNameFive[1]=name2;
        ArreyNameFive[2]=name3;
        ArreyNameFive[3]=name4;
        ArreyNameFive[4]=name5;
        ArreyNameFive[5]=name6;
        ArreyNameFive[6]=name7;

        ArreyPishFive[0][0]=pish1;
        ArreyPishFive[1][0]=pish2;
        ArreyPishFive[2][0]=pish3;
        ArreyPishFive[0][1]=pish4;
        ArreyPishFive[1][1]=pish5;
        ArreyPishFive[2][1]=pish6;
        ArreyPishFive[0][2]=pish7;
        ArreyPishFive[1][2]=pish8;
        ArreyPishFive[2][2]=pish9;
        ArreyPishFive[0][3]=pish10;
        ArreyPishFive[1][3]=pish11;
        ArreyPishFive[2][3]=pish12;
        ArreyPishFive[0][4]=pish13;
        ArreyPishFive[1][4]=pish14;
        ArreyPishFive[2][4]=pish15;
        ArreyPishFive[0][5]=pish16;
        ArreyPishFive[1][5]=pish17;
        ArreyPishFive[2][5]=pish18;
        ArreyPishFive[0][6]=pish19;
        ArreyPishFive[1][6]=pish20;
        ArreyPishFive[2][6]=pish21;

        ArreyDayFive[0][0]=day1;
        ArreyDayFive[1][0]=day2;
        ArreyDayFive[2][0]=day3;
        ArreyDayFive[3][0]=day4;
        ArreyDayFive[4][0]=day5;
        ArreyDayFive[0][1]=day6;
        ArreyDayFive[1][1]=day7;
        ArreyDayFive[2][1]=day8;
        ArreyDayFive[3][1]=day9;
        ArreyDayFive[4][1]=day10;
        ArreyDayFive[0][2]=day11;
        ArreyDayFive[1][2]=day12;
        ArreyDayFive[2][2]=day13;
        ArreyDayFive[3][2]=day14;
        ArreyDayFive[4][2]=day15;
        ArreyDayFive[0][3]=day16;
        ArreyDayFive[1][3]=day17;
        ArreyDayFive[2][3]=day18;
        ArreyDayFive[3][3]=day19;
        ArreyDayFive[4][3]=day20;
        ArreyDayFive[0][4]=day21;
        ArreyDayFive[1][4]=day22;
        ArreyDayFive[2][4]=day23;
        ArreyDayFive[3][4]=day24;
        ArreyDayFive[4][4]=day25;
        ArreyDayFive[0][5]=day26;
        ArreyDayFive[1][5]=day27;
        ArreyDayFive[2][5]=day28;
        ArreyDayFive[3][5]=day29;
        ArreyDayFive[4][5]=day30;
        ArreyDayFive[0][6]=day31;
        ArreyDayFive[1][6]=day32;
        ArreyDayFive[2][6]=day33;
        ArreyDayFive[3][6]=day34;
        ArreyDayFive[4][6]=day35;

        ArreyImage[0]=Image1;
        ArreyImage[1]=Image2;
        ArreyImage[2]=Image3;
        ArreyImage[3]=Image4;
        ArreyImage[4]=Image5;
        ArreyLable[0][0]=Three1;
        ArreyLable[0][1]=Three2;
        ArreyLable[0][2]=Three3;
        ArreyLable[0][3]=Three4;
        ArreyLable[1][0]=Three5;
        ArreyLable[1][1]=Three6;
        ArreyLable[1][2]=Three7;
        ArreyLable[1][3]=Three8;
        ArreyLable[2][0]=Three9;
        ArreyLable[2][1]=Three10;
        ArreyLable[2][2]=Three11;
        ArreyLable[2][3]=Three12;
        ArreyLable[3][0]=Three13;
        ArreyLable[3][1]=Three14;
        ArreyLable[3][2]=Three15;
        ArreyLable[3][3]=Three16;
        ArreyLable[4][0]=Three17;
        ArreyLable[4][1]=Three18;
        ArreyLable[4][2]=Three19;
        ArreyLable[4][3]=Three20;

        ArreyButton[0][0]=Three21;
        ArreyButton[0][1]=Three22;
        ArreyButton[0][2]=Three23;
        ArreyButton[0][3]=Three24;
        ArreyButton[1][0]=Three25;
        ArreyButton[1][1]=Three26;
        ArreyButton[1][2]=Three27;
        ArreyButton[1][3]=Three28;
        ArreyButton[2][0]=Three29;
        ArreyButton[2][1]=Three30;
        ArreyButton[2][2]=Three31;
        ArreyButton[2][3]=Three32;
        ArreyButton[3][0]=Three33;
        ArreyButton[3][1]=Three34;
        ArreyButton[3][2]=Three35;
        ArreyButton[3][3]=Three36;
        ArreyButton[4][0]=Three37;
        ArreyButton[4][1]=Three38;
        ArreyButton[4][2]=Three39;
        ArreyButton[4][3]=Three40;

        ArreyLablePrice[0][0]=Three41;
        ArreyLablePrice[0][1]=Three42;
        ArreyLablePrice[0][2]=Three43;
        ArreyLablePrice[0][3]=Three44;
        ArreyLablePrice[1][0]=Three45;
        ArreyLablePrice[1][1]=Three46;
        ArreyLablePrice[1][2]=Three47;
        ArreyLablePrice[1][3]=Three48;
        ArreyLablePrice[2][0]=Three49;
        ArreyLablePrice[2][1]=Three50;
        ArreyLablePrice[2][2]=Three51;
        ArreyLablePrice[2][3]=Three52;
        ArreyLablePrice[3][0]=Three53;
        ArreyLablePrice[3][1]=Three54;
        ArreyLablePrice[3][2]=Three55;
        ArreyLablePrice[3][3]=Three56;
        ArreyLablePrice[4][0]=Three57;
        ArreyLablePrice[4][1]=Three58;
        ArreyLablePrice[4][2]=Three59;
        ArreyLablePrice[4][3]=Three60;
        ONE.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(true);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(true);
        Lable2one.setVisible(true);
        Lable3one.setVisible(true);
        buttonOne.setVisible(true);
        buttonTwo.setVisible(true);
        SetingVisible3(false);
        SetingVisible5(false);
        SettingVisibleRadio(false);
        SettingVisible6(false);
        SettingVisible8(false);
        String money= whichStudent.getCredit();
        for(int i=0;i<Controller.ArrayProfosser.size();i++)
        {
            for(int j=0;j<Controller.ArrayProfosser.get(i).ArreyClass.size();j++)
            {
                if(!ClassProfosser.contains(Controller.ArrayProfosser.get(i).ArreyClass.get(j)))
                {
                    ClassProfosser.add(Controller.ArrayProfosser.get(i).ArreyClass.get(j));
                    ClassProfosserName.add(Controller.ArrayProfosser.get(i));
                    Zarfiyat.add(ProfosserController.AZ.get(j));
                }


            }
        }
    }
    public void SettingVisible8(boolean chumchi)
    {
        IMG8.setVisible(chumchi);
        E1.setVisible(chumchi);
        E2.setVisible(chumchi);
        E3.setVisible(chumchi);
        E4.setVisible(chumchi);
        E5.setVisible(chumchi);
        E6.setVisible(chumchi);
        E7.setVisible(chumchi);
        E8.setVisible(chumchi);
        E9.setVisible(chumchi);
        E9.setVisible(chumchi);
        E11.setVisible(chumchi);
        class1.setVisible(chumchi);
        class2.setVisible(chumchi);
        class3.setVisible(chumchi);
        T1.setVisible(chumchi);
        T2.setVisible(chumchi);
        T3.setVisible(chumchi);
        E12.setVisible(chumchi);
        E13.setVisible(chumchi);
        E14.setVisible(chumchi);
        E15.setVisible(chumchi);
        E16.setVisible(chumchi);
        E17.setVisible(chumchi);
        IMG2.setVisible(chumchi);
        E18.setVisible(chumchi);
        NEXT8.setVisible(chumchi);
        PRE8.setVisible(chumchi);
        IDN1.setVisible(chumchi);
        IDN3.setVisible(chumchi);
         IDN2.setVisible(chumchi);
        IDN4.setVisible(chumchi);


    }
    public void SettingVisible6(boolean chumchi)
    {
        six1.setVisible(chumchi);
        six2.setVisible(chumchi);
        six3.setVisible(chumchi);
        NameStudentSx.setVisible(chumchi);
        six4.setVisible(chumchi);
        six5.setVisible(chumchi);
        vahedSix.setVisible(chumchi);
        six22.setVisible(chumchi);
        six28.setVisible(chumchi);
        six29.setVisible(chumchi);
        six30.setVisible(chumchi);
        six31.setVisible(chumchi);
        six32.setVisible(chumchi);
        six27.setVisible(chumchi);
        six21.setVisible(chumchi);
        six6.setVisible(chumchi);
        six7.setVisible(chumchi);
        six8.setVisible(chumchi);
        six9.setVisible(chumchi);
         six10.setVisible(chumchi);
        six11.setVisible(chumchi);
        six12.setVisible(chumchi);
        six13.setVisible(chumchi);
         six14.setVisible(chumchi);
        six15.setVisible(chumchi);
        six23.setVisible(chumchi);
         six24.setVisible(chumchi);
        six25.setVisible(chumchi);
         six26.setVisible(chumchi);
        six16.setVisible(chumchi);
        six17.setVisible(chumchi);
         six18.setVisible(chumchi);
        six19.setVisible(chumchi);
         six20.setVisible(chumchi);
         SATURDAY1.setVisible(chumchi);
         SUNDAY1.setVisible(chumchi);
        MONDAY1.setVisible(chumchi);
         TUESDAY1.setVisible(chumchi);
         SATURDAY2.setVisible(chumchi);
         SUNDAY2.setVisible(chumchi);
        MONDAY2.setVisible(chumchi);
        WEDNESDAY1.setVisible(chumchi);
         TUESDAY2.setVisible(chumchi);
         WEDNESDAY2.setVisible(chumchi);
       SATURDAY3.setVisible(chumchi);
         SUNDAY3.setVisible(chumchi);
        MONDAY3.setVisible(chumchi);
         TUESDAY3.setVisible(chumchi);
         WEDNESDAY3.setVisible(chumchi);
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
    public void SettingChooseBank(boolean chum)
    {
        Four37.setVisible(chum);
        Four45.setVisible(chum);
        Four46.setVisible(chum);
        Four42.setVisible(chum);
        Four44.setVisible(chum);
        Four43.setVisible(chum);
        Four41.setVisible(chum);
        Four38.setVisible(chum);
        Four39.setVisible(chum);
        Four40.setVisible(chum);
        Four47.setVisible(chum);
        Four48.setVisible(chum);
    }

    public void ONE(ActionEvent actionEvent)
    {
        SettingVisible7(false);
        ONE.setStyle("-fx-background-color:#4682B4");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(true);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(true);
        Lable2one.setVisible(true);
        Lable3one.setVisible(true);
        buttonOne.setVisible(true);
        buttonTwo.setVisible(true);
        SetingVisible3(false);
        SetingVisible4(false);
        SettingVisibleRadio(false);
        SettingVisible2(false);
        SetingVisible5(false);
        SettingVisible6(false);
        SettingVisible8(false);
    }
public void  SetingVisible3(boolean chum)
{
    Three1.setVisible(chum);
    Three2.setVisible(chum);
    Three3.setVisible(chum);
    Three4.setVisible(chum);
    Three5.setVisible(chum);
    Three6.setVisible(chum);
    Three7.setVisible(chum);
    Three8.setVisible(chum);
    Three10.setVisible(chum);
    Three11.setVisible(chum);
    Three12.setVisible(chum);
    Three13.setVisible(chum);
    Three14.setVisible(chum);
    Three15.setVisible(chum);
    Three16.setVisible(chum);
    Three17.setVisible(chum);
    Three18.setVisible(chum);
    Three19.setVisible(chum);
    Three20.setVisible(chum);
    Three21.setVisible(chum);
    Three22.setVisible(chum);
    Three23.setVisible(chum);
    Three24.setVisible(chum);
    Three25.setVisible(chum);
    Three26.setVisible(chum);
    Three27.setVisible(chum);
    Three28.setVisible(chum);
    Three29.setVisible(chum);
    Three30.setVisible(chum);
    Three31.setVisible(chum);
    Three32.setVisible(chum);
    Three33.setVisible(chum);
    Three34.setVisible(chum);
    Three35.setVisible(chum);
    Three36.setVisible(chum);
    Three37.setVisible(chum);
    Three38.setVisible(chum);
    Three39.setVisible(chum);
    Three40.setVisible(chum);
    Three41.setVisible(chum);
    Three42.setVisible(chum);
    Three43.setVisible(chum);
    Three44.setVisible(chum);
    Three45.setVisible(chum);
    Three46.setVisible(chum);
    Three47.setVisible(chum);
    Three48.setVisible(chum);
    Three49.setVisible(chum);
    Three50.setVisible(chum);
    Three51.setVisible(chum);
    Three52.setVisible(chum);
    Three53.setVisible(chum);
    Three54.setVisible(chum);
    Three55.setVisible(chum);
    Three56.setVisible(chum);
    Three57.setVisible(chum);
    Three58.setVisible(chum);
    Three59.setVisible(chum);
    Three60.setVisible(chum);
    Three69.setVisible(chum );
    Three70.setVisible(chum);
    Three71.setVisible(chum);
    Three72.setVisible(chum);
    Three73.setVisible(chum);
    Three74.setVisible(chum);
    Three61.setVisible(chum);
    Three62.setVisible(chum);
    Three63.setVisible(chum);
    Three65.setVisible(chum);
    Three64.setVisible(chum);
    Three75.setVisible(chum);
    Three66.setVisible(chum);
    Three76.setVisible(chum);
    Three67.setVisible(chum);
    Three77.setVisible(chum);
    Three78.setVisible(chum);
    Three68.setVisible(chum);
    Three82.setVisible(chum);
    Three79.setVisible(chum);
    Three80.setVisible(chum);
    Three81.setVisible(chum);
    SubmitFood.setVisible(chum);
    C.setVisible(chum);
    ShowingCredit.setVisible(chum);
}
    public void  SetingVisible4(boolean chum)
    {
        Four1.setVisible(chum);
        Four2.setVisible(chum);
        Four3.setVisible(chum);
        Four4.setVisible(chum);
        Four5.setVisible(chum);
        Four6.setVisible(chum);
        Four7.setVisible(chum);
        Four8.setVisible(chum);
        Four9.setVisible(chum);
        Four10.setVisible(chum);
        Four11.setVisible(chum);
        Four12.setVisible(chum);
        Four13.setVisible(chum);
        Four14.setVisible(chum);
        Four15.setVisible(chum);
        Four16.setVisible(chum);
        Four17.setVisible(chum);
        Four18.setVisible(chum);
        Four19.setVisible(chum);
        Four20.setVisible(chum);
        Four21.setVisible(chum);
        Four22.setVisible(chum);
        Four23.setVisible(chum);
        Four24.setVisible(chum);
        Four25.setVisible(chum);
        Four26.setVisible(chum);
        Four27.setVisible(chum);
        Four28.setVisible(chum);
        Four29.setVisible(chum);
        Four30.setVisible(chum);
        Four31.setVisible(chum);
        Four32.setVisible(chum);
        Four33.setVisible(chum);
        Four34.setVisible(chum);
        Four35.setVisible(chum);
        Four36.setVisible(chum);
        C.setVisible(chum);
        ShowingCredit.setVisible(chum);

    }
    public void  SetingVisible5(boolean chum)
    {
        for(int i=0;i<7;i++)
        {
            ArreyButtonFive[i].setVisible(chum);
            ArreyTimeFive[i].setVisible(chum);
            ArreyZarfiyatFive[i].setVisible(chum);
            ArreyVahedFive[i].setVisible(chum);
            ArreyNameFive[i].setVisible(chum);
        }
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<3;j++)
            {
                ArreyPishFive[j][i].setVisible(chum);
            }
        }
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<5;j++)
            {
                ArreyDayFive[j][i].setVisible(chum);
            }
        }
        five1.setVisible(chum);
        five2.setVisible(chum);
        five3.setVisible(chum);
        five4.setVisible(chum);
        five5.setVisible(chum);
        five6.setVisible(chum);
        five7.setVisible(chum);
        five8.setVisible(chum);
        five9.setVisible(chum);
        five10.setVisible(chum);
        five11.setVisible(chum);
        five12.setVisible(chum);
        five13.setVisible(chum);
        next.setVisible(chum);
        previous.setVisible(chum);

    }
    public void THREE(ActionEvent actionEvent) {
        SettingVisible7(false);
        SetingVisible3(true);
        THREE.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SetingVisible4(false);
        SettingVisible2(false);
        SetingVisible5(false);
        SettingVisible6(false);
        SettingVisible8(false);
        for(int i=0;i<5;i++)
        {
           inner: for(int j=0;j<4;j++)
            {
                if(AdminController.ArreyFood[i][j] != null && ArreyLablePrice[i][j] !=null)
                {

                    ArreyLable[i][j].setText(AdminController.ArreyFood[i][j]);
                    ArreyLablePrice[i][j].setText(AdminController.PriceFood[i][j]+"تومان ");
                    ArreyButton[i][j].setVisible(true);
                    if(j <3 )
                        if( AdminController.ArreyFood[i][j+1].equals("0"))
                        {
                            break inner;
                        }
                }

            }
        }
    }
public  void SettingVisibleRadio(boolean chumchi)
{
    for (int i=0;i<5;i++)
    {
        for(int j=0;j<4;j++)
        {
            ArreyButton[i][j].setVisible(chumchi);
        }
    }
}
    public void FOUR(ActionEvent actionEvent) {
        SettingVisible7(false);
        SettingVisible6(false);
        SetingVisible5(false);
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        FOUR.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        SetingVisible3(false);
        SetingVisible4(true);
        Four35.setVisible(false);
        Four36.setVisible(false);
        SettingVisible2(false);
        SettingVisible8(false);
    }
    public void SIX(ActionEvent actionEvent) {

        SettingVisible7(false);
        SIX.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SetingVisible5(false);
        SetingVisible4(false);
        SettingVisible2(false);
        SetingVisible3(false);
        SettingVisible6(true);
        SettingVisible8(false);
        SATURDAY1.setVisible(false);
        SATURDAY2.setVisible(false);
        SATURDAY3.setVisible(false);
        SUNDAY1.setVisible(false);
        SUNDAY2.setVisible(false);
        SUNDAY3.setVisible(false);
        MONDAY1.setVisible(false);
        MONDAY2.setVisible(false);
        MONDAY3.setVisible(false);
        TUESDAY1.setVisible(false);
        TUESDAY2.setVisible(false);
        TUESDAY3.setVisible(false);
        WEDNESDAY1.setVisible(false);
        WEDNESDAY2.setVisible(false);
        WEDNESDAY3.setVisible(false);
        NameStudentSx.setText(whichStudent.getUserName());
        vahedSix.setText(""+whichStudent.getVahed());

        for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
        {
            if(whichStudent.ArreyTime.get(k)==1)
            {
                for(int i=0;i<5;i++)
                {
                    if(whichStudent.ArreyDay.get(i+k*5))
                    {
                        ///shanbe sanse aval
                        if(i==0)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                SATURDAY1.setVisible(true);
                                SATURDAY1.setText(whichStudent.ArreyNameClass.get(k));
                            }
                        }
                        ///yek shanbe sanse aval
                        if(i==1)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                SUNDAY1.setText(whichStudent.ArreyNameClass.get(k));
                                SUNDAY1.setVisible(true);
                            }
                        }
                        if(i==2)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                MONDAY1.setText(whichStudent.ArreyNameClass.get(k));
                                MONDAY1.setVisible(true);
                            }
                        }
                        if(i==3)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                TUESDAY1.setText(whichStudent.ArreyNameClass.get(k));
                                TUESDAY1.setVisible(true);
                            }
                        }
                        if(i==4)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                WEDNESDAY1.setVisible(true);
                                WEDNESDAY1.setText(whichStudent.ArreyNameClass.get(k));
                            }
                        }
                    }
                }
            }
            if(whichStudent.ArreyTime.get(k)==2)
            {
                for(int i=0;i<5;i++)
                {
                    if(whichStudent.ArreyDay.get(i+k*5))
                    {
                        ///shanbe sanse aval
                        if(i==0)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                SATURDAY2.setVisible(true);
                                SATURDAY2.setText(whichStudent.ArreyNameClass.get(k));
                            }
                        }
                        ///yek shanbe sanse aval
                        if(i==1)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                SUNDAY2.setText(whichStudent.ArreyNameClass.get(k));
                                SUNDAY2.setVisible(true);
                            }
                        }
                        if(i==2)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                MONDAY2.setText(whichStudent.ArreyNameClass.get(k));
                                MONDAY2.setVisible(true);
                            }
                        }
                        if(i==3)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                TUESDAY2.setText(whichStudent.ArreyNameClass.get(k));
                                TUESDAY2.setVisible(true);
                            }
                        }
                        if(i==4)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                WEDNESDAY2.setVisible(true);
                                WEDNESDAY2.setText(whichStudent.ArreyNameClass.get(k));
                            }
                        }
                    }
                }

            }
            if(whichStudent.ArreyTime.get(k)==3)
            {
                for(int i=0;i<5;i++)
                {
                    if(whichStudent.ArreyDay.get(i+k*5))
                    {
                        ///shanbe sanse aval
                        if(i==0)
                        {
                            if(whichStudent.ArreyScore.get(k)>20)
                            {
                                SATURDAY3.setVisible(true);
                                SATURDAY3.setText(whichStudent.ArreyNameClass.get(k));
                            }
                        }
                        ///yek shanbe sanse aval
                        if(i==1)
                        {
                            if(whichStudent.ArreyScore.get(k)>20) {
                                SUNDAY3.setText(whichStudent.ArreyNameClass.get(k));
                                SUNDAY3.setVisible(true);
                            }
                        }
                        if(i==2)
                        {
                            if(whichStudent.ArreyScore.get(k)>20) {
                                MONDAY3.setText(whichStudent.ArreyNameClass.get(k));
                                MONDAY3.setVisible(true);
                            }
                        }
                        if(i==3)
                        {
                            if(whichStudent.ArreyScore.get(k)>20) {
                                TUESDAY3.setText(whichStudent.ArreyNameClass.get(k));
                                TUESDAY3.setVisible(true);
                            }
                        }
                        if(i==4)
                        {
                            if(whichStudent.ArreyScore.get(k)>20){
                            WEDNESDAY3.setVisible(true);
                            WEDNESDAY3.setText(whichStudent.ArreyNameClass.get(k));
                        }}
                    }
                }
            }
        }



    }
    public void SEVEN(ActionEvent actionEvent) {
        FlagNasher=false;
        FlagBook=false;
         FlagWriter=false;
        FlagAll=false;
        SEVEN10.setText("عنوان");
        SettingVisible7(false);
        SettingVisible6(false);
        SetingVisible5(false);
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SEVEN.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");

        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
        SettingVisible8(false);
        SetingVisible3(false);
        SetingVisible4(false);
        Four35.setVisible(false);
        Four36.setVisible(false);
        SettingVisible2(false);
        SEVEN13.setVisible(true);
        SEVEN12.setVisible(true);
        SEVEN11.setVisible(true);
        SEVEN10.setVisible(true);
        Nasher.setVisible(true);
        NameBook.setVisible(true);
        Writer.setVisible(true);
        All.setVisible(true);
        Search.setVisible(true);
    }

    public void SettingVisible7(boolean chum)
    {
        Search.setVisible(chum);
        SEVEN11.setVisible(chum);
        SEVEN10.setVisible(chum);
        Nasher.setVisible(chum);
        NameBook.setVisible(chum);
        Writer.setVisible(chum);
        All.setVisible(chum);
        SEVEN1.setVisible(chum);
        SEVEN2.setVisible(chum);
        SEVEN3.setVisible(chum);
        SEVEN4.setVisible(chum);
        SEVEN5.setVisible(chum);
        SEVEN6.setVisible(chum);
        SEVEN7.setVisible(chum);
        SEVEN8.setVisible(chum);
        SEVEN9.setVisible(chum);
        NUM1.setVisible(chum);
        NUM2.setVisible(chum);
        NUM3.setVisible(chum);
        NUM4.setVisible(chum);
        NUM5.setVisible(chum);
        NUM6.setVisible(chum);
        NUM7.setVisible(chum);
         NUM8.setVisible(chum);
        WRITER.setVisible(chum);
         NASHER.setVisible(chum);
         BOOOK.setVisible(chum);
         WRITER1.setVisible(chum);
         NASHER1.setVisible(chum);
         BOOK1.setVisible(chum);
         WRITER2.setVisible(chum);
         NASHER2.setVisible(chum);
         BOOK2.setVisible(chum);
         WRITER3.setVisible(chum);
         NASHER3.setVisible(chum);
        BOOK3.setVisible(chum);
        WRITER4.setVisible(chum);
         NASHER4.setVisible(chum);
        BOOK4.setVisible(chum);
         WRITER5.setVisible(chum);
         NASHER5.setVisible(chum);
         BOOK5.setVisible(chum);
         WRITER6.setVisible(chum);
         NASHER6.setVisible(chum);
       BOOK6.setVisible(chum);
       WRITER7.setVisible(chum);
       WRITER8.setVisible(chum);
        NASHER7.setVisible(chum);
        NASHER8.setVisible(chum);
         BOOK7.setVisible(chum);
       BOOK8.setVisible(chum);
        R1.setVisible(chum);
        R2.setVisible(chum);
         R3.setVisible(chum);
        R4.setVisible(chum);
         R5.setVisible(chum);
       R6.setVisible(chum);
       R7.setVisible(chum);
       R8.setVisible(chum);
        SEVEN12.setVisible(chum);
        SEVEN13.setVisible(chum);
        R9.setVisible(chum);
        R10.setVisible(chum);
        R11.setVisible(chum);
        R12.setVisible(chum);
        R13.setVisible(chum);
        R14.setVisible(chum);
        R15.setVisible(chum);
        R16.setVisible(chum);
        pre.setVisible(chum);
        Next.setVisible(chum);
    }
    public void ShowingClass(int first,int end)
    {
        SetingVisible5(false);
        five1.setVisible(true);
        five2.setVisible(true);
        five3.setVisible(true);
        five4.setVisible(true);
        five5.setVisible(true);
        five6.setVisible(true);
        five7.setVisible(true);
        five8.setVisible(true);
        five9.setVisible(true);
        five10.setVisible(true);
        five11.setVisible(true);
        five12.setVisible(true);
        five13.setVisible(true);
        next.setVisible(true);
        previous.setVisible(true);
        for(int i=first;i<end;i++)
        {
            int p=i;

            String Name= ClassProfosser.get(i).getNameLesson();
            String Vahed= ""+ClassProfosser.get(i).getVahed();
            String zarfiyat=""+Zarfiyat.get(i);
            String Shanbe="";
            String Yek="";
            String Do="";
            String Se="";
            String chahar="";
            int sanse=ClassProfosser.get(i).getSanse();
            String one=ClassProfosser.get(i).PishNiyaz[0];
            String two=ClassProfosser.get(i).PishNiyaz[1];
            String three=ClassProfosser.get(i).PishNiyaz[2];
            String Sanse="";
            if(sanse==1)
            {
                Sanse=" 8 تا 10";
            }
            if(sanse==2)
            {
                Sanse=" 10 تا 12";
            }
            if(sanse==3)
            {
                Sanse="14 تا16";
            }
            boolean []chumchi=new boolean[5];
            for(int j=0;j<5;j++)
            {
                chumchi[j]=ClassProfosser.get(i).ArrayDay[j];
                if(j==0 && chumchi[j])
                {
                    Shanbe="شنبه";
                }
                if(j==1 && chumchi[j])
                {
                    Yek="یکشنبه";
                }
                if(j==2 && chumchi[j])
                {
                    Do="دوشنبه";
                }
                if(j==3 && chumchi[j])
                {
                    Se="سه شنبه";
                }
                if(j==4 && chumchi[j])
                {
                    chahar="چهار شنبه";
                }
            }
            if(p>=7)
            {
                p=i%7;
            }
            ArreyButtonFive[p].setVisible(true);
            ArreyNameFive[p].setVisible(true);
            ArreyVahedFive[p].setVisible(true);
            ArreyZarfiyatFive[p].setVisible(true);
            ArreyTimeFive[p].setVisible(true);
            for(int k=0;k<3;k++)
            {
                ArreyPishFive[k][p].setVisible(true);
            }
            for(int k=0;k<5;k++)
            {
                ArreyDayFive[k][p].setVisible(true);
            }
            ArreyNameFive[p].setText(Name);
            ArreyVahedFive[p].setText(Vahed);
            ArreyZarfiyatFive[p].setText(zarfiyat);
            ArreyTimeFive[p].setText(Sanse);
            ArreyPishFive[0][p].setText(one);
            ArreyPishFive[1][p].setText(two);
            ArreyPishFive[2][p].setText(three);
            ArreyDayFive[0][p].setText(Shanbe);
            ArreyDayFive[1][p].setText(Yek);
            ArreyDayFive[2][p].setText(Do);
            ArreyDayFive[3][p].setText(Se);
            ArreyDayFive[4][p].setText(chahar);
        }
    }

    public void FIVE(ActionEvent actionEvent) {
        SettingVisible7(false);
        SettingVisible6(false);
        SetingVisible3(false);
        SetingVisible4(false);
        SettingVisible2(false);
        SetingVisible5(false);
        five1.setVisible(true);
        five2.setVisible(true);
        five3.setVisible(true);
        five4.setVisible(true);
        five5.setVisible(true);
        five6.setVisible(true);
        five7.setVisible(true);
        five8.setVisible(true);
        five9.setVisible(true);
        five10.setVisible(true);
        five11.setVisible(true);
        five12.setVisible(true);
        five13.setVisible(true);
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SettingVisible8(false);
        FIVE.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        C.setVisible(true);
        C.setText("تعداد واحد");
        ShowingCredit.setVisible(true);
        ShowingCredit.setText(whichStudent.getVahed()+"");

         if( ClassProfosser.size()<=7)
        {
            ShowingClass(0,ClassProfosser.size());
        }

        else
        {
            ShowingClass(0,7);
        }


    }

    public void buttonOne(ActionEvent actionEvent) {
        boolean flag=false;
        if(counter<=3)
        {
            counter++;
            flag=true;
        }
        if(counter<=4 && flag)
        {
            ArreyImage[counter].setVisible(true);
            for(int i=0;i<5;i++)
            {
                if(i !=counter)
                    ArreyImage[i].setVisible(false);
            }
        }

    }
    public void buttonTwo(ActionEvent actionEvent) {
        boolean flag=false;
        if(counter>=1)
        {
            counter--;
            flag=true;
        }
        if(counter>=0 && flag)
        {
            ArreyImage[counter].setVisible(true);
            for(int i=0;i<5;i++)
            {
                if(i !=counter)
                    ArreyImage[i].setVisible(false);
            }
        }

    }
    public void EIGHT(ActionEvent actionEvent) {
        SettingVisible7(false);
        EIGHT.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        TWO.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SetingVisible5(false);
        SetingVisible4(false);
        SettingVisible2(false);
        SetingVisible3(false);
        SettingVisible6(false);
        SettingVisible8(true);
        if(whichStudent.isF())
        {
            IMG2.setVisible(true);
            IMG8.setVisible(false);
        }
        if(whichStudent.isM())
        {
            IMG2.setVisible(false);
            IMG8.setVisible(true);
        }
        class1.setVisible(false);
        class2.setVisible(false);
        class3.setVisible(false);
        T1.setVisible(false);
        T2.setVisible(false);
        T3.setVisible(false);
        E3.setText(whichStudent.getUserName());
        E7.setText(whichStudent.getMooadel()+"");
        E4.setText(whichStudent.getPassWord());
        E8.setText(whichStudent.getCredit());
        if(whichStudent.ArreyNameClass.size()<=3)
        {
            Show8(0, whichStudent.ArreyNameClass.size());
        }
        else
        {
            Show8(0,3);
        }


    }
    public void Show8(int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            int p=i;
            if(p>=3)
            {
                p=p%3;
            }
            CLASS[p].setVisible(true);
            CLASS[p].setText(whichStudent.ArreyNameClass.get(i));
            TIME[p].setVisible(true);
            if(whichStudent.ArreyTime.get(i)==1)
            TIME[p].setText(" 8 تا 10");
            if(whichStudent.ArreyTime.get(i)==2)
                TIME[p].setText(" 10 تا 12 ");

            if(whichStudent.ArreyTime.get(i)==3)
                TIME[p].setText(" 14 تا 16");


        }
    }
    public void TWO(ActionEvent actionEvent) {
        SettingVisible7(false);
        TWO.setStyle("-fx-background-color:#4682B4");
        ONE.setStyle("-fx-background-color:#DCDCDC");
        THREE.setStyle("-fx-background-color:#DCDCDC");
        FOUR.setStyle("-fx-background-color:#DCDCDC");
        FIVE.setStyle("-fx-background-color:#DCDCDC");
        SIX.setStyle("-fx-background-color:#DCDCDC");
        SEVEN.setStyle("-fx-background-color:#DCDCDC");
        EIGHT.setStyle("-fx-background-color:#DCDCDC");
        ArreyImage[0].setVisible(false);
        ArreyImage[1].setVisible(false);
        ArreyImage[2].setVisible(false);
        ArreyImage[3].setVisible(false);
        ArreyImage[4].setVisible(false);
        Lable1one.setVisible(false);
        Lable2one.setVisible(false);
        Lable3one.setVisible(false);
        buttonOne.setVisible(false);
        buttonTwo.setVisible(false);
        SettingVisibleRadio(false);
        SetingVisible5(false);
        SetingVisible4(false);
        SettingVisible2(true);
        SetingVisible3(false);
        SettingVisible6(false);
        SettingVisible8(false);
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
    }
    public void Chenging(ActionEvent actionEvent) {
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
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی رمز عبور جدید شما با تاییدیه رمز عبور مطابقت ندارد   ");
            alert.showAndWait();
        }
        if (!confirmNewUsername.getText().equalsIgnoreCase(newUsername.getText()) && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty())
        {
            ok=false;
            flagUser=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی نام کاربری  جدید شما با تاییدیه نام کاربری  مطابقت ندارد   ");
            alert.showAndWait();
        }
        if(newPassword.getText().length()<6 && !newPassword.getText().isEmpty() && flagPass)
        {
            ok=false;
            newPsswordLable.setText("رمز عبور کمتر از 6 کاراکتر نمی تواند باشد  ");
            newPsswordLable.setVisible(true);
            i3.setVisible(true);
        }
        if( !oldPassword.getText().equalsIgnoreCase(whichStudent.getPassWord()) && !oldPassword.getText().isEmpty())
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی رمز عبور فعلی شما درست وارد نشده است    ");
            alert.showAndWait();
        }
        if( !oldUsername.getText().equalsIgnoreCase(whichStudent.getUserName()) && !oldUsername.getText().isEmpty())
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی نام کاربری  فعلی شما درست وارد نشده است    ");
            alert.showAndWait();
        }
        for (int i=0;i<Controller.ArrayStudent.size();i++) {
            if(Controller.which !=i)
            {
                if(newUsername.getText().equalsIgnoreCase(Controller.ArrayStudent.get(i).getUserName()) && flagUser && !newUsername.getText().isEmpty() && !confirmNewUsername.getText().isEmpty())
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی  گرامی نام کاربری انتخاب شده تکراری می باشد     ");
                    alert.showAndWait();
                }
            }
        }

        for (int i=0;i<Controller.ArrayProfosser.size();i++)
        {
            if(Controller.which !=i)
            {
                if(newUsername.getText().equalsIgnoreCase(Controller.ArrayProfosser.get(i).getUserName()) && flagUser)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی  نام کاربری انتخاب شده تکراری می باشد     ");
                    alert.showAndWait();
                }
            }

        }
        if((newUsername.getText().equalsIgnoreCase(A.getUserName())) && flagUser)
        {


                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی نام کاربری انتخاب شده تکراری می باشد");
                alert.showAndWait();


        }
        if (ok)
        {
            whichStudent.setUserName(newUsername.getText());
            whichStudent.setPassWord(newPassword.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی درخواست شما با موفقیت انجام شد");
            alert.showAndWait();
            StudentName.setText(whichStudent.getUserName());
        }

        }
    public void Three21(ActionEvent actionEvent) {

        counter21++;
        if(counter21%2==1)
        {
            Three21.setDisable(false);
            Three22.setDisable(true);
            Three23.setDisable(true);
            Three24.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-(AdminController.PriceFood[0][0])));
            ShowingCredit1.setText(whichStudent.getCredit());
         }
        if(counter21%2==0)
        {
            Three22.setDisable(false);
            Three23.setDisable(false);
            Three24.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[0][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        }
    public void Three22(ActionEvent actionEvent) {
        counter22++;
        if(counter22%2==1)
        {
            Three21.setDisable(true);
            Three22.setDisable(false);
            Three23.setDisable(true);
            Three24.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-(AdminController.PriceFood[0][1])));
            ShowingCredit1.setText(whichStudent.getCredit());

            }

        if(counter22%2==0)
        {

            Three21.setDisable(false);
            Three23.setDisable(false);
            Three24.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[0][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        }
    public void Three23(ActionEvent actionEvent) {
        counter23++;
        if(counter23%2==1)
        {
            Three21.setDisable(false);
            Three22.setDisable(true);
            Three23.setDisable(true);
            Three24.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[0][2]));
            ShowingCredit1.setText(whichStudent.getCredit());

        }
        if(counter23%2==0)
        {
            Three22.setDisable(false);
            Three23.setDisable(false);
            Three24.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[0][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        }
    public void Three24(ActionEvent actionEvent) {
        counter24++;
        if(counter24%2==1)
        {
            Three21.setDisable(false);
            Three22.setDisable(true);
            Three23.setDisable(true);
            Three24.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[0][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if(counter24%2==0)
        {
            Three22.setDisable(false);
            Three23.setDisable(false);
            Three24.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[0][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        }

    public void Three25(ActionEvent actionEvent) {
        counter25++;
        if(counter25%2==1)
        {
            Three25.setDisable(false);
            Three26.setDisable(true);
            Three27.setDisable(true);
            Three28.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[1][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if(counter25%2==0)
        {
            Three26.setDisable(false);
            Three27.setDisable(false);
            Three28.setDisable(false);

                whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[1][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        }
    public void Three26(ActionEvent actionEvent) {
        counter26++;
        if(counter26%2==1)
        {
            Three26.setDisable(false);
            Three25.setDisable(true);
            Three27.setDisable(true);
            Three28.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[1][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if(counter26%2==0)
        {
            Three25.setDisable(false);
            Three27.setDisable(false);
            Three28.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[1][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        }
    public void Three27(ActionEvent actionEvent) {
        counter27++;
        if (counter27 % 2 == 1) {
            Three27.setDisable(false);
            Three25.setDisable(true);
            Three26.setDisable(true);
            Three28.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[1][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter27 % 2 == 0) {
            Three25.setDisable(false);
            Three26.setDisable(false);
            Three28.setDisable(false);
           whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[1][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
    }
    public void Three28(ActionEvent actionEvent) {
        counter28++;
        if (counter28 % 2 == 1) {
            Three28.setDisable(false);
            Three25.setDisable(true);
            Three27.setDisable(true);
            Three26.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[1][3]));
            ShowingCredit1.setText(whichStudent.getCredit());

        }
        if (counter28 % 2 == 0) {
            Three25.setDisable(false);
            Three27.setDisable(false);
            Three26.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[1][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
    }

    public void Three29(ActionEvent actionEvent) {
        counter29++;
        if (counter29 % 2 == 1) {
            Three29.setDisable(false);
            Three30.setDisable(true);
            Three31.setDisable(true);
            Three32.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[2][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter29 % 2 == 0) {
            Three30.setDisable(false);
            Three31.setDisable(false);
            Three32.setDisable(false);
           whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[2][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three30(ActionEvent actionEvent) {
        counter30++;
        if (counter30 % 2 == 1) {
            Three30.setDisable(false);
            Three29.setDisable(true);
            Three31.setDisable(true);
            Three32.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[2][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter30 % 2 == 0) {
            Three29.setDisable(false);
            Three31.setDisable(false);
            Three32.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[2][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three31(ActionEvent actionEvent) {
        counter31++;
        if (counter31 % 2 == 1) {
            Three31.setDisable(false);
            Three29.setDisable(true);
            Three30.setDisable(true);
            Three32.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[2][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter31 % 2 == 0) {
            Three29.setDisable(false);
            Three30.setDisable(false);
            Three32.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[2][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three32(ActionEvent actionEvent) {
        counter32++;
        if (counter32 % 2 == 1) {
            Three32.setDisable(false);
            Three29.setDisable(true);
            Three30.setDisable(true);
            Three31.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[2][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter32 % 2 == 0) {
            Three29.setDisable(false);
            Three30.setDisable(false);
            Three31.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[2][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
    }


    public void Three33(ActionEvent actionEvent) {
        counter33++;
        if (counter33 % 2 == 1) {
            Three33.setDisable(false);
            Three34.setDisable(true);
            Three35.setDisable(true);
            Three36.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[3][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter33 % 2 == 0) {
            Three34.setDisable(false);
            Three35.setDisable(false);
            Three36.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[2][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three34(ActionEvent actionEvent) {
        counter34++;
        if (counter34 % 2 == 1) {
            Three34.setDisable(false);
            Three33.setDisable(true);
            Three35.setDisable(true);
            Three36.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[3][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter34 % 2 == 0) {
            Three33.setDisable(false);
            Three35.setDisable(false);
            Three36.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[3][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three35(ActionEvent actionEvent) {
        counter35++;
        if (counter35 % 2 == 1) {
            Three35.setDisable(false);
            Three33.setDisable(true);
            Three34.setDisable(true);
            Three36.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[3][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter35 % 2 == 0) {
            Three33.setDisable(false);
            Three34.setDisable(false);
            Three36.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[3][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
    }
    public void Three36(ActionEvent actionEvent) {
        counter36++;
        if (counter36 % 2 == 1) {
            Three36.setDisable(false);
            Three33.setDisable(true);
            Three34.setDisable(true);
            Three35.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[3][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
            }
        if (counter36 % 2 == 0) {
            Three35.setDisable(false);
            Three34.setDisable(false);
            Three33.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[3][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
    }


    public void Three37(ActionEvent actionEvent) {
        counter37++;
        if (counter37 % 2 == 1) {
            Three37.setDisable(false);
            Three38.setDisable(true);
            Three39.setDisable(true);
            Three40.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[4][0]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter37 % 2 == 0) {
            Three38.setDisable(false);
            Three39.setDisable(false);
            Three40.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[4][0]));
            ShowingCredit1.setText(whichStudent.getCredit());

        }
    }
    public void Three38(ActionEvent actionEvent) {
        counter38++;
        if (counter38 % 2 == 1) {
            Three38.setDisable(false);
            Three37.setDisable(true);
            Three39.setDisable(true);
            Three40.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[4][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter38 % 2 == 0) {
            Three37.setDisable(false);
            Three39.setDisable(false);
            Three40.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[4][1]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
    }
    public void Three39(ActionEvent actionEvent) {
        counter39++;
        if (counter39 % 2 == 1) {
            Three39.setDisable(false);
            Three37.setDisable(true);
            Three38.setDisable(true);
            Three40.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[4][2]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }

        if (counter39 % 2 == 0) {
            Three37.setDisable(false);
            Three38.setDisable(false);
            Three40.setDisable(false);
           whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[4][2]));
            ShowingCredit1.setText(whichStudent.getCredit());

        }
    }
    public void Three40(ActionEvent actionEvent) {
        counter40++;
        if (counter40 % 2 == 1) {
            Three40.setDisable(false);
            Three37.setDisable(true);
            Three38.setDisable(true);
            Three39.setDisable(true);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())-AdminController.PriceFood[4][3]));
            ShowingCredit1.setText(whichStudent.getCredit());
        }
        if (counter40 % 2 == 0) {
            Three37.setDisable(false);
            Three38.setDisable(false);
            Three39.setDisable(false);
            whichStudent.setCredit(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[4][3]));
            ShowingCredit1.setText(""+(Integer.parseInt(whichStudent.getCredit())+AdminController.PriceFood[4][3]));
        }
    }

    public void SubmitFood(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(whichStudent.getCredit())<0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی موجودی شما کافی نمی باشد ");
            /// bad inja age daneshjo raft afzayesh etebar az money estefade kon
            alert.showAndWait();
        }
        if(Integer.parseInt(whichStudent.getCredit())>=0 && ok)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی درخواست شما با موفقیت انجام شد  ");
            alert.showAndWait();
        }

    }


    public void Four21(ActionEvent actionEvent) {
        //1000 toman
        MoneyIncrease=Four21.getText();
        empty=false;
        Four31.setText(Four21.getText());
        Four21.setStyle("-fx-background-color:#4169E1");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
    }
    /////ino dar mordesh tahghigh bokon

    public void Four31(ActionEvent actionEvent) {
        Four31.isPressed();
        Four31.clear();
        MoneyIncrease= Four31.getText();
        Four26.setStyle("-fx-background-color:#DCDCDC");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");

    }

    public void Four33(ActionEvent actionEvent) {
        boolean ok=true;
        // in halato hanoz dar nazar nagereftm k adade ba text fargh dashte bashe
        if(empty && (Four31.getText().isEmpty()))
        {
            Four36.setText("لطفا مبلغ را انتخاب کنید ");
            Four35.setVisible(true);
            Four36.setVisible(true);
            ok=false;
        }
        if(empty && ! Four31.getText().isEmpty())
        {
            Four35.setVisible(false);
            Four36.setVisible(false);
            MoneyIncrease= Four31.getText();
            if(!Four31.getText().equals("")&& Integer.parseInt(MoneyIncrease)<1000)
            {
                ok=false;
                Four36.setText("مقدار انتخاب شده کمتر از مقدار استاندار می باشد");
                Four31.clear();
                Four35.setVisible(true);
                Four36.setVisible(true);
            }
        }
        if(ok)

        {
           SetingVisible4(false);
            SettingChooseBank(true);


        }
    }

    public void Four34(ActionEvent actionEvent) {
    }

    public void Four26(ActionEvent actionEvent) {
        empty=false;
        MoneyIncrease=Four26.getText();

        Four31.setText(Four26.getText());
        Four26.setStyle("-fx-background-color:#4169E1");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
    }

    public void Four25(ActionEvent actionEvent) {
        empty=false;
        MoneyIncrease=Four25.getText();
        Four31.setText(Four25.getText());
        Four25.setStyle("-fx-background-color:#4169E1");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
    }

    public void Four24(ActionEvent actionEvent) {
        empty=false;
        MoneyIncrease=Four24.getText();
        Four31.setText(Four24.getText());
        Four24.setStyle("-fx-background-color:#4169E1");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
    }

    public void Four23(ActionEvent actionEvent)
    {
        empty=false;
        MoneyIncrease=Four23.getText();
        Four31.setText(Four23.getText());
        Four23.setStyle("-fx-background-color:#4169E1");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four22.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
    }

    public void Four22(ActionEvent actionEvent) {
        empty=false;
        MoneyIncrease=Four22.getText();
        Four31.setText(Four22.getText());
        Four22.setStyle("-fx-background-color:#4169E1");
        Four21.setStyle("-fx-background-color:#DCDCDC");
        Four23.setStyle("-fx-background-color:#DCDCDC");
        Four24.setStyle("-fx-background-color:#DCDCDC");
        Four25.setStyle("-fx-background-color:#DCDCDC");
        Four26.setStyle("-fx-background-color:#DCDCDC");
    }

    public void Four48(ActionEvent actionEvent) throws IOException {
        if( !Four39.isSelected())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nبانکی را انتخاب کنید ");
            alert.showAndWait();
        }
        else
        {
            new PageLoader().load("/view/Bank.fxml");
        }
    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        new PageLoader().load("/view/Login2.fxml");
    }

    public void Sabt7(ActionEvent actionEvent) {
        boolean ok=true;

        if(Integer.parseInt(ArreyZarfiyatFive[6].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[6].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[6].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[6].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(6).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed7.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed7.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish19.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish19.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish20.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish20.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish21.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish21.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed7.getText()));
            int num=Integer.parseInt(ArreyZarfiyatFive[6].getText())-1;
            Zarfiyat.add(6+counNext*7,num);
            ArreyZarfiyatFive[6].setText(""+num);
            whichStudent.ArreyNameClass.add(name7.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed7.getText()));
            whichStudent.ArreyScore.add(25.00);
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(6).ArrayDay[h]);
            }
            whichStudent.ArreyTime.add( ClassProfosser.get(6).getSanse());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt6(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[5].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[5].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[5].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[5].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(5).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed6.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed6.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish16.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish16.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish17.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish17.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish18.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish18.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed6.getText()));
            whichStudent.ArreyNameClass.add(name6.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed6.getText()));
            int num=Integer.parseInt(ArreyZarfiyatFive[5].getText())-1;
            Zarfiyat.add(5+counNext*7,num);
            ArreyZarfiyatFive[5].setText(""+num);
            whichStudent.ArreyScore.add(25.00);
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(5).ArrayDay[h]);
            }
            whichStudent.ArreyTime.add( ClassProfosser.get(5).getSanse());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt5(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[4].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[4].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[4].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[4].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if(ClassProfosser.get(4).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed5.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed5.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish13.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish13.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish14.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish14.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish15.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish15.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed5.getText()));
            whichStudent.ArreyNameClass.add(name5.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed5.getText()));
            int num=Integer.parseInt(ArreyZarfiyatFive[4].getText())-1;
            Zarfiyat.add(4+counNext*7,num);
            ArreyZarfiyatFive[4].setText(""+num);
            whichStudent.ArreyScore.add(25.00);
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(4).ArrayDay[h]);
            }
            whichStudent.ArreyTime.add( ClassProfosser.get(4).getSanse());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt4(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[3].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[3].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[3].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[3].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(3).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed4.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed4.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish10.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish10.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish11.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish11.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish12.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish12.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            int num=Integer.parseInt(ArreyZarfiyatFive[3].getText())-1;

            ProfosserController.AZ.add(3,num);
            Zarfiyat.add(3+counNext*7,num);
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed4.getText()));
            whichStudent.ArreyNameClass.add(name4.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed4.getText()));
            whichStudent.ArreyScore.add(25.00);
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(3).ArrayDay[h]);
            }
            whichStudent.ArreyTime.add( ClassProfosser.get(3).getSanse());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt3(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[2].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[2].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[2].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[2].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(2).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed3.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed3.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish7.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish7.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish8.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish8.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish9.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish9.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            int num=Integer.parseInt(ArreyZarfiyatFive[2].getText())-1;
            Zarfiyat.add(2+counNext*7,num);
            ArreyZarfiyatFive[2].setText(""+num);
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed3.getText()));
            whichStudent.ArreyNameClass.add(name3.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed3.getText()));
            whichStudent.ArreyScore.add(25.00);
            whichStudent.ArreyTime.add( ClassProfosser.get(2).getSanse());
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(2).ArrayDay[h]);
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt2(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[1].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[1].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[1].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[1].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(1).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed2.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed2.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish4.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish4.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish5.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish5.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish6.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish6.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            int num=Integer.parseInt(ArreyZarfiyatFive[1].getText())-1;
            ArreyZarfiyatFive[1].setText(""+num);
            Zarfiyat.add(1+7*counNext,num);
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed2.getText()));
            whichStudent.ArreyNameClass.add(name2.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed2.getText()));
            whichStudent.ArreyScore.add(25.00);
            whichStudent.ArreyTime.add( ClassProfosser.get(1).getSanse());
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(1).ArrayDay[h]);
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }
    }

    public void Sabt1(ActionEvent actionEvent) {
        boolean ok=true;
        if(Integer.parseInt(ArreyZarfiyatFive[0].getText())==0)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ظرفیت این کلاس تکمیل شده است  ");
            alert.showAndWait();
        }
        int Sanse=0;
        if(ArreyTimeFive[0].getText().equalsIgnoreCase(" 8 تا 10"))
        {
            Sanse=1;
        }
        if(ArreyTimeFive[0].getText().equalsIgnoreCase(" 10 تا 12"))
        {
            Sanse=2;
        }
        if(ArreyTimeFive[0].getText().equalsIgnoreCase("14 تا16"))
        {
            Sanse=3;
        }
        for(int j = 0; j< whichStudent.ArreyTime.size(); j++)
        {
            //////////
            if(whichStudent.ArreyTime.get(j)==Sanse && whichStudent.ArreyScore.get(j)>20)
            {

                for(int y=j;y<j+5;y++)
                {
                    if( ClassProfosser.get(0).ArrayDay[y-j]&& whichStudent.ArreyDay.get(y))
                    {
                        ok=false;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \nدانشجوی گرامی به دلیل تداخل زمانی شما قادر به ثبت نام نمی باشید ");
                        alert.showAndWait();
                    }

                }

            }
        }
        boolean kamtar=false;
        for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
        {
            if(whichStudent.ArreyScore.get(k)<=20)
            {
                kamtar=true;
            }
        }
        //mohasebeye moadele daneshjooooo
        if(whichStudent.ArreyNameClass.isEmpty() || (!whichStudent.ArreyNameClass.isEmpty() && !kamtar))
        {
            whichStudent.setMooadel(20);
        }
        else
        {
            double sum=0;
            int counter=0;
            for(int k = 0; k< whichStudent.ArreyScore.size(); k++)
            {
                if(whichStudent.ArreyScore.get(k)<=20)
                {
                    sum+= whichStudent.ArreyScore.get(k);
                    counter++;
                }
            }
            sum=sum/counter;
            whichStudent.setMooadel(sum);
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed1.getText())>20 && whichStudent.getMooadel()<17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(whichStudent.getVahed()+Integer.parseInt(vahed1.getText())>24 && whichStudent.getMooadel()>17)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی با برداشتن این کلاس تعداد واحدهای شما بیشتر از حد مجاز میشود  ");
            alert.showAndWait();
        }
        if(!pish1.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish1.getText()))
                {
                    num=k;
                }
            }

            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish2.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish2.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {

                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(!pish3.getText().isEmpty())
        {
            int num=-1;
            for(int k = 0; k< whichStudent.ArreyNameClass.size(); k++)
            {
                if(whichStudent.ArreyNameClass.get(k).equalsIgnoreCase(pish3.getText()))
                {
                    num=k;
                }
            }
            if(num<0)
            {
                ok=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                alert.showAndWait();
            }
            if(num>=0)
            {
                if(whichStudent.ArreyScore.get(num)<10 || whichStudent.ArreyScore.get(num)>20)
                {
                    ok=false;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این درس نیازمند پیش نیاز می باشد  ");
                    alert.showAndWait();
                }
            }
        }
        if(ok)
        {
            int num=Integer.parseInt(ArreyZarfiyatFive[0].getText())-1;
            Zarfiyat.add(counNext*7,num);
            ArreyZarfiyatFive[0].setText(""+num);
            whichStudent.setVahed(whichStudent.getVahed()+Integer.parseInt(vahed1.getText()));
            whichStudent.ArreyNameClass.add(name1.getText());
            whichStudent.ArreyNameClassVahed.add(Integer.parseInt(vahed1.getText()));
            whichStudent.ArreyScore.add(25.00);
            whichStudent.ArreyTime.add( ClassProfosser.get(0).getSanse());
            for(int h=0;h<5;h++)
            {
                whichStudent.ArreyDay.add( ClassProfosser.get(0).ArrayDay[h]);
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی ثبت نام شما در این کلاس با موفقیت انجام شد  ");
            alert.showAndWait();
            ShowingCredit.setText(whichStudent.getVahed()+"");
        }

    }
    ///////AdminController.ArreyBook
    ////ArreyB ,araye az ketab haye rezerv shodeas

    public void Nasher(ActionEvent actionEvent) {
        FlagNasher=true;
        FlagBook=false;
        FlagWriter=false;
        FlagAll=false;
        SEVEN10.setText("نام ناشر");
    }

    public void NameBook(ActionEvent actionEvent) {
        FlagNasher=false;
        FlagBook=true;
        FlagWriter=false;
        FlagAll=false;

        SEVEN10.setText("نام کتاب");
    }

    public void Writer(ActionEvent actionEvent) {
        FlagNasher=false;
        FlagBook=false;
        FlagWriter=true;
        FlagAll=false;
        SEVEN10.setText("نام نویسنده");
    }

    public void All(ActionEvent actionEvent) {
        FlagNasher=false;
        FlagBook=false;
        FlagWriter=false;
        FlagAll=true;
        SEVEN10.setText("مشاهده ی همه ی کتاب ها");

    }
    public void Nashr(int start,int end)
    {

        SettingVisible7(false);
        WRITER.setVisible(true);
        BOOOK.setVisible(true);
        NASHER.setVisible(true);
        SEVEN11.setVisible(true);
        SEVEN10.setVisible(true);
        Nasher.setVisible(true);
        NameBook.setVisible(true);
        Writer.setVisible(true);
        All.setVisible(true);
        SEVEN1.setVisible(true);
        SEVEN2.setVisible(true);
        SEVEN3.setVisible(true);
        SEVEN4.setVisible(true);
        SEVEN5.setVisible(true);
        SEVEN6.setVisible(true);
        SEVEN7.setVisible(true);
        SEVEN8.setVisible(true);
        SEVEN9.setVisible(true);
        SEVEN12.setVisible(true);
        SEVEN13.setVisible(true);
        Search.setVisible(true);
        boolean ok = true;
        if (SEVEN13.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی لطفا عبارت جستوجو را مشخص کنید ");
            alert.showAndWait();
        }
        if (ok) {
            int count = 0;
            for (int i = start; i <end; i++) {
                if (AdminController.ArreyBook.get(i).getNasher().equalsIgnoreCase(SEVEN13.getText())) {
                    ArreyBOOK[count].setText(AdminController.ArreyBook.get(i).getName());
                    ArreyNasher[count].setText(AdminController.ArreyBook.get(i).getNasher());
                    ArreyWriter[count].setText(AdminController.ArreyBook.get(i).getWriterName());
                    ArreyBOOK[count].setVisible(true);
                    ArreyNasher[count].setVisible(true);
                    ArreyWriter[count].setVisible(true);
                    if(AdminController.ArreyBook.get(i).isRezerv() && whichStudent.ArreyB.contains(AdminController.ArreyBook.get(i)))
                    {
                        arrButton[count].setVisible(true);
                        ARRButton[count].setVisible(false);
                    }
                    else
                    {
                        ARRButton[count].setVisible(true);
                        arrButton[count].setVisible(false);
                    }
                    NUMBER[count].setText(count+1+"");
                    NUMBER[count].setVisible(true);
                    count++;
                }
            }
        }

    }
    public void Writer(int start,int end)
    {
        boolean ok = true;
        SettingVisible7(false);
        WRITER.setVisible(true);
        BOOOK.setVisible(true);
        NASHER.setVisible(true);
        SEVEN11.setVisible(true);
        SEVEN10.setVisible(true);
        Nasher.setVisible(true);
        NameBook.setVisible(true);
        Writer.setVisible(true);
        All.setVisible(true);
        SEVEN1.setVisible(true);
        SEVEN2.setVisible(true);
        SEVEN3.setVisible(true);
        SEVEN4.setVisible(true);
        SEVEN5.setVisible(true);
        SEVEN6.setVisible(true);
        SEVEN7.setVisible(true);
        SEVEN8.setVisible(true);
        SEVEN9.setVisible(true);
        SEVEN12.setVisible(true);
        SEVEN13.setVisible(true);
        Search.setVisible(true);
        if (SEVEN13.getText().isEmpty()) {
            ok = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی لطفا عبارت جستوجو را مشخص کنید ");
            alert.showAndWait();
        }
        if (ok) {
            int count = 0;
            for (int i = start; i <end; i++) {
                if (AdminController.ArreyBook.get(i).getWriterName().equalsIgnoreCase(SEVEN13.getText())) {
                    ArreyBOOK[count].setText(AdminController.ArreyBook.get(i).getName());
                    ArreyNasher[count].setText(AdminController.ArreyBook.get(i).getNasher());
                    ArreyWriter[count].setText(AdminController.ArreyBook.get(i).getWriterName());
                    ArreyBOOK[count].setVisible(true);
                    ArreyNasher[count].setVisible(true);
                    ArreyWriter[count].setVisible(true);
                    if(AdminController.ArreyBook.get(i).isRezerv() && whichStudent.ArreyB.contains(AdminController.ArreyBook.get(i)))
                    {
                        arrButton[count].setVisible(true);
                        ARRButton[count].setVisible(false);
                    }
                    else
                    {
                        ARRButton[count].setVisible(true);
                        arrButton[count].setVisible(false);
                    }
                    NUMBER[count].setText(count+1+"");
                    NUMBER[count].setVisible(true);
                }
            }
        }
    }
    public void Book(int start,int end)
    {

        SettingVisible7(false);
        WRITER.setVisible(true);
        BOOOK.setVisible(true);
        NASHER.setVisible(true);
        SEVEN11.setVisible(true);
        SEVEN10.setVisible(true);
        Nasher.setVisible(true);
        NameBook.setVisible(true);
        Writer.setVisible(true);
        All.setVisible(true);
        SEVEN1.setVisible(true);
        SEVEN2.setVisible(true);
        SEVEN3.setVisible(true);
        SEVEN4.setVisible(true);
        SEVEN5.setVisible(true);
        SEVEN6.setVisible(true);
        SEVEN7.setVisible(true);
        SEVEN8.setVisible(true);
        SEVEN9.setVisible(true);
        SEVEN12.setVisible(true);
        SEVEN13.setVisible(true);
        Search.setVisible(true);

        boolean ok=true;
        if(SEVEN13.getText().isEmpty())
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی لطفا عبارت جستوجو را مشخص کنید ");
            alert.showAndWait();
        }
        if(ok)
        {
            int count=0;
            for(int i=start;i<end;i++)
            {
                if(AdminController.ArreyBook.get(i).getName().equalsIgnoreCase(SEVEN13.getText()))
                {
                    ArreyBOOK[count].setText(AdminController.ArreyBook.get(i).getName());
                    ArreyNasher[count].setText(AdminController.ArreyBook.get(i).getNasher());
                    ArreyWriter[count].setText(AdminController.ArreyBook.get(i).getWriterName());
                    ArreyBOOK[count].setVisible(true);
                    ArreyNasher[count].setVisible(true);
                    ArreyWriter[count].setVisible(true);
                    if(AdminController.ArreyBook.get(i).isRezerv() && whichStudent.ArreyB.contains(AdminController.ArreyBook.get(i)))
                    {
                        arrButton[count].setVisible(true);
                        ARRButton[count].setVisible(false);
                    }
                    else
                    {
                        ARRButton[count].setVisible(true);
                        arrButton[count].setVisible(false);
                    }

                    NUMBER[count].setText(count+1+"");
                    NUMBER[count].setVisible(true);
                }
            }
        }
    }
    public void All(int start,int end)
    {
        SettingVisible7(false);
        WRITER.setVisible(true);
        BOOOK.setVisible(true);
        NASHER.setVisible(true);
        SEVEN11.setVisible(true);
        SEVEN10.setVisible(true);
        Nasher.setVisible(true);
        NameBook.setVisible(true);
        Writer.setVisible(true);
        All.setVisible(true);
        SEVEN1.setVisible(true);
        SEVEN2.setVisible(true);
        SEVEN3.setVisible(true);
        SEVEN4.setVisible(true);
        SEVEN5.setVisible(true);
        SEVEN6.setVisible(true);
        SEVEN7.setVisible(true);
        SEVEN8.setVisible(true);
        SEVEN9.setVisible(true);
        SEVEN12.setVisible(true);
        SEVEN13.setVisible(true);
        Search.setVisible(true);
        for(int i=start;i<end;i++)
        {
            int p=i;
            if(p>=8)
            {
                p=p%8;
            }
            ArreyBOOK[p].setText(AdminController.ArreyBook.get(i).getName());
            ArreyNasher[p].setText(AdminController.ArreyBook.get(i).getNasher());
            ArreyWriter[p].setText(AdminController.ArreyBook.get(i).getWriterName());
            ArreyBOOK[p].setVisible(true);
            ArreyNasher[p].setVisible(true);
            ArreyWriter[p].setVisible(true);
            if(AdminController.ArreyBook.get(i).isRezerv() && whichStudent.ArreyB.contains(AdminController.ArreyBook.get(i)))
            {
                arrButton[p].setVisible(true);
                ARRButton[p].setVisible(false);
            }
            else
            {
                ARRButton[p].setVisible(true);
                arrButton[p].setVisible(false);
            }
            NUMBER[p].setText(i+1+"");
            NUMBER[p].setVisible(true);

        }
    }
    public void Search(ActionEvent actionEvent)
    {
        CounterNextBook=0;
        if(FlagNasher)
        {
            if(AdminController.ArreyBook.size()<8)
            {
                Nashr(0,AdminController.ArreyBook.size());
            }
            else
            {
                Nashr(0,8);
            }

        }
        if(FlagWriter)
        {
            if(AdminController.ArreyBook.size()<8)
            {
                Writer(0,AdminController.ArreyBook.size());
            }
            else
            {
                Writer(0,8);
            }

        }
        if(FlagBook)
        {
            if(AdminController.ArreyBook.size()<8)
            {
                Book(0,AdminController.ArreyBook.size());
            }
            else
            {
                Book(0,8);
            }

        }
        if(FlagAll)
        {
            System.out.println(Admin.ArreyB.size());
            if(AdminController.ArreyBook.size()<8)
            {
                All(0,AdminController.ArreyBook.size());
            }
            else
            {
                All(0,8);
            }

        }

    }

    public void R1(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook));
            /////Araye e az book haye rezerv shode
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook));
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            R1.setVisible(false);
            R9.setVisible(true);
            alert.showAndWait();
        }
    }

    public void R2(ActionEvent actionEvent) {
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+1)))
            {
                chum=true;
            }
        }
        boolean ok=true;
        if(AdminController.ArreyBook.get(8*CounterNextBook+1).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+1).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+1));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+1));
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            R2.setVisible(false);
            R10.setVisible(true);
            alert.showAndWait();
        }
    }

    public void R3(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+2)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+2).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+2).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+2));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+2));
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            R3.setVisible(false);
            R11.setVisible(true);
            alert.showAndWait();
        }
    }

    public void R4(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+3)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+3).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+3).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+3));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+3));
            R4.setVisible(false);
            R12.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            alert.showAndWait();
        }
    }

    public void R5(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+4)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+4).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+4).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+4));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+4));
            R5.setVisible(false);
            R13.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            alert.showAndWait();
        }
    }

    public void R6(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+5)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+5).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+5).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+5));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+5));
            R6.setVisible(false);
            R14.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");


            alert.showAndWait();

        }
    }

    public void R7(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+6)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+6).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+6).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+6));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+6));
            R7.setVisible(false);
            R15.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            alert.showAndWait();
        }
    }

    public void R8(ActionEvent actionEvent) {
        boolean ok=true;
        boolean chum=false;
        for(int i=0;i<Admin.ArreyB.size();i++)
        {

            if(Admin.ArreyB.contains(AdminController.ArreyBook.get(8*CounterNextBook+7)))
            {
                chum=true;
            }
        }
        if(AdminController.ArreyBook.get(8*CounterNextBook+7).isRezerv() || chum)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب قبلا رزرو شده است  ");
            alert.showAndWait();
        }
        if (whichStudent.ArreyB.size()>=3)
        {
            ok=false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی شما قادر به رزرو کتاب نمی باشید  ");
            alert.showAndWait();
        }
        if (ok)
        {
            AdminController.ArreyBook.get(8*CounterNextBook+7).setRezerv(true);
            whichStudent.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+7));
            Admin.ArreyB.add(AdminController.ArreyBook.get(8*CounterNextBook+7));

            R8.setVisible(false);
            R16.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n دانشجوی گرامی این کتاب به لیست کتاب های رزرو شما افزوده گردید  ");
            alert.showAndWait();
        }

    }
  private   int counNext=0;

    public void previous(ActionEvent actionEvent) {
        if(counNext>=1)
        {
            counNext--;
            ShowingClass((counNext)*7,(counNext+1)*7);
        }

    }

    public void pre(ActionEvent actionEvent) {
        if(CounterNextBook>=1)
        {
            CounterNextBook--;
            if( FlagNasher)
                Nashr(CounterNextBook*8,(CounterNextBook+1)*8);
            if(FlagWriter)
            {
                Writer(CounterNextBook*8,(CounterNextBook+1)*8);
            }
            if(FlagBook)
            {
                Book(CounterNextBook*8,(CounterNextBook+1)*8);
            }
            if(FlagAll)
            {
                All(CounterNextBook*8,(CounterNextBook+1)*8);
            }
           // ShowingClass((CounterNextBook)*8,(CounterNextBook+1)*8);
        }
    }
  private int CounterNextBook=0;
    public void PRE8(ActionEvent actionEvent) {
        if(COUNT8>=1)
        {
            COUNT8--;
            ShowingClass((COUNT8)*3,(COUNT8+1)*3);
        }

    }
    public void Next(ActionEvent actionEvent) {
        if(AdminController.ArreyBook.size()>8)
        {
            CounterNextBook++;
            if(AdminController.ArreyBook.size()>=8*CounterNextBook)
            {
                if((CounterNextBook+1)*8<=AdminController.ArreyBook.size())
                {
                    if( FlagNasher)
                    Nashr(CounterNextBook*8,(CounterNextBook+1)*8);
                    if(FlagWriter)
                    {
                        Writer(CounterNextBook*8,(CounterNextBook+1)*8);
                    }
                    if(FlagBook)
                    {
                        Book(CounterNextBook*8,(CounterNextBook+1)*8);
                    }
                    if(FlagAll)
                    {
                        All(CounterNextBook*8,(CounterNextBook+1)*8);
                    }
                }
                else
                {
                    if( FlagNasher)
                        Nashr(CounterNextBook*8,AdminController.ArreyBook.size());
                    if(FlagWriter)
                    {
                        Writer(CounterNextBook*8,AdminController.ArreyBook.size());
                    }
                    if(FlagBook)
                    {
                        Book(CounterNextBook*8,AdminController.ArreyBook.size());
                    }
                    if(FlagAll)
                    {
                        All(CounterNextBook*8,AdminController.ArreyBook.size());
                    }
                }
            }
            else
            {
                CounterNextBook--;
            }


        }

    }

    public void R9(ActionEvent actionEvent) {
        R9.setVisible(false);
        R1.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }



    }

    public void R10(ActionEvent actionEvent) {
        R10.setVisible(false);
        R2.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+1).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+1).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+1).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+1).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }


    }


    public void R11(ActionEvent actionEvent) {
        R11.setVisible(false);
        R3.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+2).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+2).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+2).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+2).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }


    }

    public void R12(ActionEvent actionEvent) {
        R12.setVisible(false);
        R4.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+3).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+3).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+3).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+3).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }


    }

    public void R13(ActionEvent actionEvent) {
        R13.setVisible(false);
        R5.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+4).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+4).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+4).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+4).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }

    }

    public void R15(ActionEvent actionEvent) {
        R15.setVisible(false);
        R7.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+6).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+6).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+6).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+6).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }

    }

    public void R16(ActionEvent actionEvent) {
        R16.setVisible(false);
        R8.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+7).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+7).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+7).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+7).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }

    }

    public void R14(ActionEvent actionEvent) {
        R14.setVisible(false);
        R6.setVisible(true);
        AdminController.ArreyBook.get(8*CounterNextBook+5).setRezerv(false);
        int delete=-1;
        for(int i = 0; i< whichStudent.ArreyB.size(); i++)
        {
            if(whichStudent.ArreyB.get(i).getName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+5).getName()))
            {
                if(whichStudent.ArreyB.get(i).getNasher().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+5).getNasher()))
                {
                    if(whichStudent.ArreyB.get(i).getWriterName().equalsIgnoreCase(AdminController.ArreyBook.get(8*CounterNextBook+5).getWriterName()))
                    {
                        delete=i;
                    }
                }

            }
        }
        if(delete>=0)
        {
            whichStudent.ArreyB.remove(delete);
        }
    }
int COUNT8=0;
    public void next(ActionEvent actionEvent) {
        if(Controller.WhichProfosser.ArreyClass.size()>7) {
            counNext++;
            if(Controller.WhichProfosser.ArreyClass.size()>=7*counNext)
            {

                if((counNext+1)*7<Controller.WhichProfosser.ArreyClass.size())
                {
                    ShowingClass(counNext*7,(counNext+1)*7);
                }
                else
                {
                    ShowingClass(counNext*7,Controller.WhichProfosser.ArreyClass.size());
                }
            }
            else
            {
                counNext--;
            }


        }
    }
    public void NEXT8(ActionEvent actionEvent) {
        if(whichStudent.ArreyNameClass.size()>3)
        {
            COUNT8++;
            if(whichStudent.ArreyNameClass.size()>=3*COUNT8)
            {
                if((COUNT8+1)*3<whichStudent.ArreyNameClass.size())
                {
                    Show8(COUNT8*3,(COUNT8+1)*3);
                }
                else
                {
                    Show8(COUNT8*3,whichStudent.ArreyNameClass.size());
                }
            }
            else
            {
                COUNT8--;
            }
        }
    }
}

