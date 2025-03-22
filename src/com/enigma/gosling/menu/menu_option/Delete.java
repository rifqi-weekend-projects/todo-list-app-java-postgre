package com.enigma.gosling.menu.menu_option;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;


import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.validation.InputValidation.intValidation;


public class Delete {
    public static void delete() {

        ToDoService todoservice = new ToDoServiceImpl();

        int deletedId;
        while (true) {
            System.out.println("Enter ID to Remove: ");
            String input = scanner.nextLine();
            try {
                deletedId = intValidation(input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        todoservice.removeTask(deletedId);
    }
}
