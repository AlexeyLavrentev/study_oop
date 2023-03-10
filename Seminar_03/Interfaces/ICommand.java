package Seminar_02.Interfaces;

import java.util.Scanner;

import Seminar_02.FamilyTreeUtils;


public interface ICommand {
    /**
     * Информация о команде
     * @return
     */
    String info();

    /**
     * код команды при вводе с клавиатуры
     * @return
     */
    String getName();

    /**
     * Выполняемый метод
     * @param scanner 
     * @param utils
     */
    void exercute(Scanner scanner, FamilyTreeUtils utils);
}
