package by.itstep.javalesson.task001.controller;

import by.itstep.javalesson.task001.model.logic.NumberLogic;
import by.itstep.javalesson.task001.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        ConsolePrinter.print(NumberLogic.sum(5,6) + "\n");
        ConsolePrinter.print(NumberLogic.sub(6,5) + "\n");
        ConsolePrinter.print(NumberLogic.mul(2,2) + "\n");
        ConsolePrinter.print(NumberLogic.div(2,2) + "\n");
    }
}
