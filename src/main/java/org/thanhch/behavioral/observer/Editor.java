package org.thanhch.behavioral.observer;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: Editor
 */
public class Editor {
    public EventManager events = new EventManager("open", "save");
    String file = "";

    void openFile(String fileName) {
        this.file = fileName;
        events.notify("open", file);
    }

    void saveFile() {
        if (file != "") {
            events.notify("save", file);
        }
    }
}
