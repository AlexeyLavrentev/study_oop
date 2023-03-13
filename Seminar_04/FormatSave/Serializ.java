package Seminar_04.FormatSave;

import Seminar_04.Calendar;
import Seminar_04.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializ implements SerializingMy<Task>{
    @Override
    public void exportingCalendar(Calendar<Task> calendar, String path) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path+".dat"))){
            oos.writeObject(calendar);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public  Calendar<Task> importingCalendar(String path) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path+".dat"))) {
            return (Calendar<Task>) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Calendar<>();
    }
}
