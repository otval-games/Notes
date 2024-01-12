package com.example.notes.Classes;

import com.example.notes.Controllers.Controller;
import com.example.notes.Controllers.NoteController;
import com.example.notes.Modules.NoteModule;
import javafx.scene.Node;
import javafx.scene.control.ListView;

public class AppInstance {
    public static String noteName;
    public static ListView<Node> list;
    public static int index;
    public static NoteModule noteModule;
    public static NoteController noteController;
}
