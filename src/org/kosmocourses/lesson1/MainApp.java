package org.kosmocourses.lesson1;

public class MainApp {
    public static String runProgramLogic(String name) {
        return ("Я - " + name +" обязуюсь:\n"
                + "\t- прилежно комментировать свой код,\n"
                + "\t- не использовать goto,\n"
                + "\t- следить за состоянием своих программ\n"
                + "\t- контролировать выделение памяти.\n"
                + "\n"
                + "Я обязуюсь не оставлять мусора в системе\n"
                + "и избегать однобуквенныъ переменных.\n"
        +"\t \t \t \t \t \t \t \t \t Ресет.");
    }

    public static void main(String[] args) {
        String name ="Алексей";
        System.out.println(runProgramLogic(name));
    }
}
