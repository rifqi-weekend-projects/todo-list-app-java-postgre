package com.enigma.gosling.menu.menu_option;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;


import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.validation.InputValidation.stringValidation;

public class SearchByTitle {

    public static void searchByTitle() {

        ToDoService todoservice = new ToDoServiceImpl();

        String title;
        while (true) {
            System.out.println("Enter the title to search: ");
            title = scanner.nextLine();
            try {
                title = stringValidation(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        todoservice.searchByTitle(title);
    }
}
