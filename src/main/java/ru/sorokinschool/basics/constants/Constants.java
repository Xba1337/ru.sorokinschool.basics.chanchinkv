package ru.sorokinschool.basics.constants;

public class Constants {
    public static boolean EXIT = false;

    public static final int ARRAY_SIZE = 4;

    public static final String FILLER = "|" + ("=").repeat(24) + "|";

    public static final String GREETING = "Вас привествует система учета контактов, " +
            "выберите № опции из предложенного меню (введите число): ";

    public static final String OPTION_ONE = "1. Добавление нового контакта;";
    public static final String OPTION_TWO = "2. Вывод списка всех имеющихся контактов;";
    public static final String OPTION_THREE = "3. Поиск по имени контакта;";
    public static final String OPTION_FOUR = "4. Удаление контакта;";
    public static final String OPTION_FIVE = "5. Выход.";

    public static final String NUMBER = "Введите номер телефона.";
    public static final String NAME = "Введите имя.";

    public static final String EMPTY_ARRAY = "Список пуст.";

    public static final String LIST = "Список контактов:";
    public static final String IS_FOOL = "Список контактов полон. Для возможности сохранения новых контактов, необходима очистка списка " +
            "Выберите № опции из предложенного меню (введите число):";
    public static final String NOT_FOUND = "Контакт с данным именем не найден.";
}
