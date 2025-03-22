package com.enigma.gosling.menu.menu_option;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;
import com.enigma.gosling.menu.menu_option.view.*;
import com.enigma.gosling.util.MenuViewOption;

import java.util.Scanner;

import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.validation.InputValidation.intValidation;


public class View {

    public static ToDoService todoservice = new ToDoServiceImpl();

    public static void viewMenu() {
        while (true) {

            System.out.println("1. View All Tasks");
            System.out.println("2. Filter By Status");
            System.out.println("3. Filter By Date");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = intValidation(scanner.nextLine());

            MenuViewOption option = MenuViewOption.fromValue(choice);

            switch (option) {
                case VIEW_TASKS:
                    view();
                    break;

                case VIEW_BY_STATUS:
                    FilterByStatus.filterByStatus();
                    break;

                case SORT_BY_DATE:
                    SortByDate.sortByDate();
                    break;

                case BACK_TO_MAIN_MENU:
                    System.out.println("Back to Main Menu...");

                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void view() {
        todoservice.viewTasks();
    }

}
