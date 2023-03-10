package Seminar_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Seminar_02.Commands.Command_findparents;
import Seminar_02.Commands.Command_load;
import Seminar_02.Commands.Command_print;
import Seminar_02.Commands.Command_save;
import Seminar_02.Interfaces.ICommand;


/**
 * main
 */
public class main {
    public static List<ICommand> commands;
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        FamilyTreeUtils utils = new FamilyTreeUtils(tree);
        utils.testFillTree();

        //#region добавляем команды меню в список commands
        commands = new ArrayList<ICommand>();
        commands.add(new Command_print());
        commands.add(new Command_save());
        commands.add(new Command_load());
        commands.add(new Command_findparents());
        //#endregion
         
        
        Scanner scanner = new Scanner(System.in);

        do {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("exit"))
                break;

            boolean input_is_OK = false;
            for (ICommand command : commands) {
                if (input.equals(command.getName())) {
                    command.exercute(scanner, utils);
                    input_is_OK = true;
                    break;
                }
            }
            if(!input_is_OK)
                 System.out.println("Неверная команда. Попробуйте еще раз.");
        } while (true);
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("***************** Меню ****************");
        System.out.println("Введите команду из списка:");
        System.out.println("exit - выход");
        for (ICommand command : commands) {
            System.out.println(command.info());
        }
        System.out.println("***************************************");
    }





}