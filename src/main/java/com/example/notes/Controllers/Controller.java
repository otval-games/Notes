package com.example.notes.Controllers;

import com.example.notes.Modules.Module;
import com.example.notes.Classes.AppInstance;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    //Variables
    public Button BtnCreate;

    @FXML
    private TextField TextField;

    @FXML
    ListView<Node> NotesList = new ListView<>();

    Module module = new Module();

//Functions
    @FXML
    void onBtnClicked() throws IOException {
        AppInstance.noteName = TextField.getText();
        AppInstance.list = NotesList;
        module.createNote(NotesList);
        module.clearField(TextField);
    }
}