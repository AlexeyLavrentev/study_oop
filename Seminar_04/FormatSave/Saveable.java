package Seminar_04.FormatSave;

import Seminar_04.Calendar;
import Seminar_04.Task;

import java.util.List;

public interface Saveable<T extends Task> {
    void saveAs(List<T> calendar, String path);
}
