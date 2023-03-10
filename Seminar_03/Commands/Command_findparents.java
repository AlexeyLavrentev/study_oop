package Seminar_02.Commands;

import java.util.List;
import java.util.Scanner;

import Seminar_02.FamilyTreeUtils;
import Seminar_02.Person;
import Seminar_02.Interfaces.ICommand;

/*
 * Поиск родителей для персоны ID
 */
public class Command_findparents implements ICommand {

    @Override
    public String info() {
        return "findparents - нахождение родителей персоны с ID";
    }

    @Override
    public String getName() {
        return "findparents";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        System.out.println("Введите ID: ");
        String input = scanner.nextLine();
        List<Person> parents = utils.FindParents(Integer.parseInt(input));
        for (Person person : parents) {
            System.out.println(person);
        }

    }

}
