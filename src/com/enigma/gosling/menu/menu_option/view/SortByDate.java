package com.enigma.gosling.menu.menu_option.view;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.impl.ToDoServiceImpl;
import com.enigma.gosling.util.SortByDateOption;


import static com.enigma.gosling.menu.MenuHandler.scanner;
import static com.enigma.gosling.util.SortByDateOption.*;
import static com.enigma.gosling.validation.InputValidation.intValidation;

public class SortByDate {

    public static void sortByDate(){

        ToDoService todoservice = new ToDoServiceImpl();

        System.out.println("Enter Type Of Sort Date (ASC '1' or DESC '2'): ");
        int date = intValidation(scanner.nextLine());

        SortByDateOption option = SortByDateOption.fromValue(date);

        if (option == ASC) {
            todoservice.sortByDate(ASC.name());
        } else if (option == DESC) {
            todoservice.sortByDate(SortByDateOption.DESC.name());
        }
    }
}
