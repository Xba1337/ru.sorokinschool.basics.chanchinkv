package ru.sorokinschool.basics.util;

import ru.sorokinschool.basics.constants.Constants;
import ru.sorokinschool.basics.contacts.ContactsRepository;

import java.util.Objects;

public class RequestHandlerUtils {

    private static final ContactsRepository contactsRepository = ContactsRepository.getInstance();

    private RequestHandlerUtils() {
    }

    public static boolean unavailableSpace() {
        String[] namesArray = contactsRepository.getNames();
        boolean fool = true;
        for (String name : namesArray) {
            fool = (name != null);
        }
        return fool;
    }

    public static void show() {
        String[] names = contactsRepository.getNames();
        String[] numbers = contactsRepository.getPhoneNumbers();

        System.out.println(Constants.LIST);
        for (int i = 0; i < Constants.ARRAY_SIZE; i++) {
            if (names[0] == null) {
                System.out.println(Constants.EMPTY_ARRAY);
                break;
            }
            if (numbers[i] == null) {
                break;
            }
            System.out.println(names[i] + " - " + numbers[i]);
        }
    }

    public static void showByName(String name) {
        String[] names = contactsRepository.getNames();
        String[] numbers = contactsRepository.getPhoneNumbers();
        int counter = 0;
        boolean isRunning = true;


        while (isRunning && counter < Constants.ARRAY_SIZE) {
            if (!Objects.equals(names[counter], name)) {
                if (names[0] == null) {
                    System.out.println(Constants.EMPTY_ARRAY);
                }
                if (counter == Constants.ARRAY_SIZE - 1) {
                    System.out.println(Constants.NOT_FOUND);
                }
            } else {
                System.out.println(names[counter] + " - " + numbers[counter]);
                isRunning = false;
            }
            counter++;
        }
    }

    public static void deleteContact(String nameToDelete) {
        String[] names = contactsRepository.getNames();
        String[] numbers = contactsRepository.getPhoneNumbers();

        if (names[0] != null) {
            int deleteIndex = searchEquals(names, nameToDelete);
            names[deleteIndex] = null;
            numbers[deleteIndex] = null;

            contactsRepository.setNames(sort(names));
            contactsRepository.setPhoneNumbers(sort(numbers));
        } else {
            System.out.println(Constants.NOT_FOUND);
        }
    }

    public static void saveContact(String name, String number) {
        String[] names = contactsRepository.getNames();
        String[] numbers = contactsRepository.getPhoneNumbers();

        int saveIndex = searchEquals(names, null);

        if (saveIndex != -1) {
            names[saveIndex] = name;
            numbers[saveIndex] = number;
        }
    }

    public static String[] sort(String[] array) {
        for (int i = 0; i < Constants.ARRAY_SIZE - 1; i++) {
            if (array[i] == null) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
        }
        return array;
    }

    public static int searchEquals(String[] array, String comparedValue) {
        int value = -1;
        for (int i = 0; i < Constants.ARRAY_SIZE; i++) {
            if (Objects.equals(array[i], comparedValue)) {
                return i;
            }
        }
        return value;
    }
}
