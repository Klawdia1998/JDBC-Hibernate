package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Maria", "Sidorova", (byte) 23);
        userService.saveUser("Petr", "Rutov", (byte) 35);
        userService.saveUser("Ivan", "Petrov", (byte) 26);
        userService.saveUser("Elena", "Ivanova", (byte) 31);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
