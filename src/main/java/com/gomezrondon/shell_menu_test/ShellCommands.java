package com.gomezrondon.shell_menu_test;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCommands {

    @ShellMethod(key = "1", value = "Logging - Demonstrates logging functionality")
    public String logging() {
        return "Logging functionality executed successfully!";
    }

    @ShellMethod(key = "2", value = "Printing - Demonstrates printing functionality")
    public String printing() {
        return "Printing functionality executed successfully!";
    }

    @ShellMethod(key = "3", value = "Saving - Demonstrates saving functionality")
    public String saving() {
        return "Saving functionality executed successfully!";
    }

    @ShellMethod(key = "4", value = "Loading - Demonstrates loading functionality")
    public String loading() {
        return "Loading functionality executed successfully!";
    }

    @ShellMethod(key = "5", value = "Search - Demonstrates search functionality")
    public String search() {
        return "Search functionality executed successfully!";
    }

    @ShellMethod(key = "menu", value = "Display available menu options")
    public String menu() {
        StringBuilder menu = new StringBuilder();
        menu.append("\n=== MENU OPTIONS ===\n");
        menu.append("1) Logging - Demonstrates logging functionality\n");
        menu.append("2) Printing - Demonstrates printing functionality\n");
        menu.append("3) Saving - Demonstrates saving functionality\n");
        menu.append("4) Loading - Demonstrates loading functionality\n");
        menu.append("5) Search - Demonstrates search functionality\n");
        menu.append("menu) Display this menu\n");
        menu.append("cls) Clear the terminal screen\n");
        menu.append("exit) Exit the application\n");
        return menu.toString();
    }

    @ShellMethod(key = "cls", value = "Clear the terminal screen")
    public String clearScreen() {
        // ANSI escape sequence to clear the screen and move cursor to home position
        return "\033[H\033[2J";
    }
}
