package ru.sorokinschool.basics.util;

import ru.sorokinschool.basics.constants.Constants;

import java.util.Scanner;

import static ru.sorokinschool.basics.util.RequestHandlerUtils.*;


public class StringUtils {

    private static final Scanner scanner = new Scanner(System.in);

    private StringUtils() {
    }

    public static void init() {
        while (!Constants.EXIT) {
            if (unavailableSpace()) unavailableSpaceEvent();
            else availableSpaceEvent();

        }
    }

    private static void unavailableSpaceEvent() {
        writeUnavailableSpaceEvent();
        String option = scanner.nextLine();

        switch (option) {
            case "2":
                show();
                break;

            case "3":
                System.out.println(Constants.NAME);
                String nameShow = scanner.nextLine();
                showByName(nameShow);
                break;

            case "4":
                System.out.println(Constants.NAME);
                String nameDelete = scanner.nextLine();
                deleteContact(nameDelete);
                break;

            case "5":
                Constants.EXIT = true;
                break;
        }
    }

    private static void availableSpaceEvent() {
        writeGreetingEvent();
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println(Constants.NAME);
                String nameSave = scanner.nextLine();
                System.out.println(Constants.NUMBER);
                String numberSave = scanner.nextLine();
                saveContact(nameSave, numberSave);
                break;

            case "2":
                show();
                break;

            case "3":
                System.out.println(Constants.NAME);
                String nameShow = scanner.nextLine();
                showByName(nameShow);
                break;

            case "4":
                System.out.println(Constants.NAME);
                String nameDelete = scanner.nextLine();
                deleteContact(nameDelete);
                break;

            case "5":
                Constants.EXIT = true;
                break;
        }
    }

    private static void writeGreetingEvent() {
        System.out.println(Constants.FILLER);
        System.out.println(Constants.GREETING);
        System.out.println(Constants.OPTION_ONE);
        System.out.println(Constants.OPTION_TWO);
        System.out.println(Constants.OPTION_THREE);
        System.out.println(Constants.OPTION_FOUR);
        System.out.println(Constants.OPTION_FIVE);
        System.out.println(Constants.FILLER);
    }

    private static void writeUnavailableSpaceEvent() {
        System.out.println(Constants.FILLER);
        System.out.println(Constants.IS_FOOL);
        System.out.println(Constants.OPTION_TWO);
        System.out.println(Constants.OPTION_THREE);
        System.out.println(Constants.OPTION_FOUR);
        System.out.println(Constants.OPTION_FIVE);
        System.out.println(Constants.FILLER);
    }
}
