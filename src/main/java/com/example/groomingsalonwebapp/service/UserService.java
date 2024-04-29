package com.example.groomingsalonwebapp.service;

import com.example.groomingsalonwebapp.model.User;

import java.util.List;

public interface UserService {

    /***
     * Метод регистрации пользователя
     * @param user
     */
    void register(User user);

    /***
     * Получение пользователя, который авторизован в приложение
     * @return
     */
    User getAuthUser();

    /***
     * Редактирование информации пользователя
     * @param userOld
     * @param userUpdate
     */
    void updateUser(User userOld, User userUpdate);

    /***
     * Получение всех пользователей
     * @return
     */
    List<User> getAllUsers();

    /***
     * Получение пользователя по ID
     * @param id
     * @return
     */
    User getUserById(Long id);

}
