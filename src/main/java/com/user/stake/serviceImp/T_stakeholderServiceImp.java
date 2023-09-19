package com.user.stake.serviceImp;

import com.user.stake.models.T_stakeholder;
import com.user.stake.repository.T_stakeholderRepo;
import com.user.stake.service.T_stakeholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class T_stakeholderServiceImp implements T_stakeholderService {

    @Autowired
    private T_stakeholderRepo tStakeholderRepo;

    @Override
    public List<T_stakeholder> findAll() {
        return (List<T_stakeholder>) tStakeholderRepo.findAll();
    }

    @Override
    public Optional<T_stakeholder> findById(int id) {
        return tStakeholderRepo.findById(id);
    }

    @Override
    public void deleteById(int id) {
        tStakeholderRepo.deleteById(id);
    }

    @Override
    public T_stakeholder create(T_stakeholder t_stakeholder) {
        return tStakeholderRepo.save(t_stakeholder);
    }

    @Override
    public T_stakeholder update(T_stakeholder t_stakeholder) {
        return tStakeholderRepo.save(t_stakeholder);
    }
}
