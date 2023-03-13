package Seminar_04.FormatSave;

import Seminar_04.Calendar;
import Seminar_04.Task;

import java.util.List;

public interface SerializingMy<T extends Task> {
   void exportingCalendar(Calendar<T> calendar, String path);
   Calendar<T> importingCalendar(String path);
}
