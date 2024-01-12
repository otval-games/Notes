package com.example.notes.Modules;

import com.example.notes.Classes.AppInstance;
import com.example.notes.Start;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NoteModule {

    public void createRenameWindow() throws IOException {
        AppInstance.noteModule=this;

        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("rename-view.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Rename (note");
        stage.setScene(scene);
        stage.show();
    }

    public void rename(String newName){
        AppInstance.noteController.setNoteName(newName);
    }

    public void deleteNote(ListView <Node> list, int index){
        list.getItems().remove(index);
    }
}