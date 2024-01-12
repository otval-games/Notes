package com.example.notes.Controllers;

import com.example.notes.Classes.AppInstance;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RenameController {

    @FXML
    public TextField RenameTF;

    @FXML
    public Button BtnRename;

    @FXML
    public void onRenameClicked(ActionEvent actionEvent) {
        AppInstance.noteName = RenameTF.getText();
        AppInstance.noteModule.rename(AppInstance.noteName);
    }
}
