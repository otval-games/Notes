package com.example.notes.Modules;

import com.example.notes.Start;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.Objects;

public class Module {
//Functions
    public void createNote(ListView <Node> list) throws IOException {
        HBox newNote = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("note-view.fxml")));
        list.getItems().add(newNote);
    }

    public void clearField(TextField textField){
        textField.clear();
    }
}