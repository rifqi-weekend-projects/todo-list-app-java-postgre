package com.enigma.gosling.menu.menu_option.view;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;
import com.enigma.gosling.util.StatusOption;

import java.util.Scanner;

import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.util.StatusOption.*;
import static com.enigma.gosling.validation.InputValidation.intValidation;

public class FilterByStatus {

    public static void filterByStatus() {

        ToDoService todoservice = new ToDoServiceImpl();

        System.out.print("Filter By Status ");
        System.out.println("Enter by number 1-2 (Pending/Completed):");

        int status = intValidation(scanner.nextLine());

        StatusOption statusOption = StatusOption.fromValue(status);

        if (statusOption == PENDING) {
            todoservice.filterByStatus(PENDING.name());
        } else if (statusOption == COMPLETED) {
            todoservice.filterByStatus(COMPLETED.name());
        }

    }
}
