package com.example.notes.Controllers;

import com.example.notes.Modules.NoteModule;
import com.example.notes.Classes.AppInstance;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteController implements Initializable {
//Variables
    @FXML
    private Label NoteName;

    @FXML
    private Button EditButton;

    @FXML
    private Button BtnDel;

//Functions
    NoteModule noteModule = new NoteModule();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NoteName.setText(AppInstance.noteName);
        AppInstance.noteController = this;
    }

    @FXML
    void onEditNote(ActionEvent actionEvent) throws IOException {
        if (AppInstance.index != -1){
            noteModule.createRenameWindow();
        }
    }

    @FXML
    void OnDeleteNote(ActionEvent actionEvent) {
        AppInstance.index = AppInstance.list.getSelectionModel().getSelectedIndex();
        if (AppInstance.index != -1){
            noteModule.deleteNote(AppInstance.list, AppInstance.index);
        }
    }

    public void setNoteName(String noteName) {
        NoteName.setText(noteName);
    }
}