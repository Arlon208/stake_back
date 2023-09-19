package com.user.stake.repository;

import com.user.stake.models.T_user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_userRepo extends CrudRepository<T_user,Integer> {
}
