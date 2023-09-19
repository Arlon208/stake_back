package com.user.stake.service;

import com.user.stake.models.T_user;

import java.util.List;
import java.util.Optional;

public interface T_userService {
    public List<T_user> findAll();

    public Optional<T_user> findById(int id);

    public void deleteById(int id);

    public T_user create(T_user t_user);

    public T_user update(T_user t_user);
}
