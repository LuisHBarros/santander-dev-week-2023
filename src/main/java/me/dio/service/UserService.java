package me.dio.service;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;

public interface UserService {


    User findById(Long id);

    User create(User userToCreate);
}
