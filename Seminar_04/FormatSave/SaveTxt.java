package Seminar_04.FormatSave;

import Seminar_04.Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxt extends SaveFormat<Task> {
    @Override
    public void saveAs(List<Task> calendar, String path) {
        for (Task t : calendar) {
            try (FileWriter writer = new FileWriter(path + ".txt", true)) {
                writer.write(t.toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
