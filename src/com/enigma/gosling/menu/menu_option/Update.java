package com.enigma.gosling.menu.menu_option;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;
import com.enigma.gosling.util.StatusOption;


import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.util.StatusOption.COMPLETED;
import static com.enigma.gosling.util.StatusOption.PENDING;
import static com.enigma.gosling.validation.InputValidation.intValidation;

public class Update {
    public static void update() {

        ToDoService todoservice = new ToDoServiceImpl();

        System.out.println("Enter Your Task Id to Update: ");
        int id = intValidation(scanner.nextLine());
        System.out.println("Update the Task's Status 1-2 (Pending/Completed): ");
        int status = intValidation(scanner.nextLine());

        StatusOption statusOption = StatusOption.fromValue(status);

        if (statusOption == PENDING) {
            todoservice.updateTask(id, PENDING.name());
        } else if (statusOption == COMPLETED) {
            todoservice.updateTask(id, COMPLETED.name());
        }

    }
}
