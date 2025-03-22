package com.enigma.gosling.menu;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;
import com.enigma.gosling.menu.menu_option.*;
import com.enigma.gosling.util.MenuOption;

import java.util.Scanner;

import static com.enigma.gosling.validation.InputValidation.intValidation;

public class MenuHandler {
    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("1. Add A New Task");
            System.out.println("2. View A List Of Tasks");
            System.out.println("3. Update A Task");
            System.out.println("4. Remove A Task");
            System.out.println("5. Search By Title");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = intValidation(scanner.nextLine());

            try {
                MenuOption option = MenuOption.fromValue(choice);
                System.out.println("\n======== MENU OPTION ========");
                switch (option) {
                    case ADD_TASK:
                        Create.add();
                        break;

                    case VIEW_TASK:
                        View.viewMenu();
                        break;

                    case UPDATE_TASK:
                        Update.update();
                        break;

                    case REMOVE_TASK:
                        Delete.delete();
                        break;

                    case SEARCH_BY_TITLE:
                        SearchByTitle.searchByTitle();
                        break;

                    case EXIT:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
