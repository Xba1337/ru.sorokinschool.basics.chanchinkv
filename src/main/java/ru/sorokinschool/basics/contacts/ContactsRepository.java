package ru.sorokinschool.basics.contacts;

import ru.sorokinschool.basics.constants.Constants;

public class ContactsRepository {

    private static ContactsRepository instance;

    private static String[] names;

    private static String[] phoneNumbers;

    private ContactsRepository(int size) {
        names = new String[size];
        phoneNumbers = new String[size];
    }

    public static ContactsRepository getInstance() {
        if (instance == null) {
            instance = new ContactsRepository(Constants.ARRAY_SIZE);
        }
        return instance;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        ContactsRepository.names = names;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        ContactsRepository.phoneNumbers = phoneNumbers;
    }
}
