package com.user.stake.serviceImp;

import com.user.stake.models.T_user;
import com.user.stake.repository.T_userRepo;
import com.user.stake.service.T_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class T_userServiceImpo implements T_userService {
    @Autowired
    private T_userRepo tUserRepo;
    @Override
    public List<T_user> findAll() {
        return (List<T_user>) tUserRepo.findAll();
    }

    @Override
    public Optional<T_user> findById(int id) {
        return tUserRepo.findById(id);
    }

    @Override
    public void deleteById(int id) {
        tUserRepo.deleteById(id);

    }

    @Override
    public T_user create(T_user t_user) {
        return tUserRepo.save(t_user);
    }

    @Override
    public T_user update(T_user t_user) {
        return tUserRepo.save(t_user);
    }
}
