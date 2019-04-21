package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import model.PageLoader;

import java.io.IOException;
import java.util.Random;

public class CheckController {
    public Label SecurityLabel;
    Random rand=new Random();
    public TextField SecurityTextfield;
    @FXML
    private void initialize()
    {
        int n=rand.nextInt(1000000);
       String M=""+n;
        SecurityLabel.setText(M);
    }
    public static boolean textIsPersian(String s) {
        for (int i = 0; i < Character.codePointCount(s, 0, s.length()); i++) {
            int c = s.codePointAt(i);
            if (c >= 0x0600 && c <= 0x06FF || c == 0xFB8A || c == 0x067E || c == 0x0686 || c == 0x06AF)
                return true;
        }
        return false;
    }

    public void confirm(ActionEvent actionEvent) throws IOException {
        if(SecurityTextfield.getText().equalsIgnoreCase(SecurityLabel.getText()))
        {
            new PageLoader().load("/view/Login2.fxml");
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n عبارت وارد شده صحیح نمی باشد");
            alert.showAndWait();
           int n=rand.nextInt(1000000);
            String M=""+n;
            SecurityLabel.setText(M);
        }

    }

    public void IsPersian(KeyEvent keyEvent) {
        if(textIsPersian(keyEvent.getText()))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "golestan.sbu.ac.ir says: \n کاربر گرامی لطفا صفحه ی کلید خود را به انگلیسی  تغییر دهید");
            alert.showAndWait();
            SecurityTextfield.clear();

        }
    }
}
