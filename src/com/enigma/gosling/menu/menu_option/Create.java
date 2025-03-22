package com.enigma.gosling.menu.menu_option;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;

import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.validation.InputValidation.stringValidation;

public class Create {

    public static void add() {

        ToDoService todoservice = new ToDoServiceImpl();

        String title;
        while (true) {
            System.out.print("Enter Your Activity: ");
            title = scanner.nextLine();
            try {
                title = stringValidation(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String description;
        while (true) {
            System.out.println("Enter The Description: ");
            description = scanner.nextLine();
            try {
                description = stringValidation(description);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        todoservice.addTask(title, description);
    }
}
