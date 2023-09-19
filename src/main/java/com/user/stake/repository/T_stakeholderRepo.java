package com.user.stake.repository;

import com.user.stake.models.T_stakeholder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_stakeholderRepo extends CrudRepository<T_stakeholder, Integer> {
}
