package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ChangePasswordController {
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

    public void Chenging(ActionEvent actionEvent) {
        if(oldPassword.getText().isEmpty())
        {
            OldPasswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
            OldPasswordLable.setVisible(true);
            i1.setVisible(true);
        }
        if(oldUsername.getText().isEmpty())
        {
            oldUsernameLable.setText("لطفا فیلد موردنظر را پر کنید ");
            oldUsernameLable.setVisible(true);
            i2.setVisible(true);
        }
        if(newPassword.getText().isEmpty())
        {
            newPsswordLable.setText("لطفا فیلد موردنظر را پر کنید ");
            newPsswordLable.setVisible(true);
            i3.setVisible(true);
        }
        if(newUsername.getText().isEmpty())
        {
            newUsrnameLable.setText("لطفا فیلد موردنظر را پر کنید ");
            newUsrnameLable.setVisible(true);
            i4.setVisible(true);
        }
        if(confirmNewPassword.getText().isEmpty())
        {
            confirmpass.setText("لطفا فیلد موردنظر را پر کنید ");
            confirmpass.setVisible(true);
            i5.setVisible(true);
        }
        if(confirmNewUsername.getText().isEmpty())
        {
            confirmUser.setText("لطفا فیلد موردنظر را پر کنید ");
            confirmUser.setVisible(true);
            i6.setVisible(true);
        }

    }
}
