package com.user.stake.service;

import com.user.stake.models.T_stakeholder;

import java.util.List;
import java.util.Optional;

public interface T_stakeholderService {
    public List<T_stakeholder> findAll();

    public Optional<T_stakeholder> findById(int id);

    public void deleteById(int id);

    public T_stakeholder create(T_stakeholder t_stakeholder);

    public T_stakeholder update(T_stakeholder t_stakeholder);
}
