package com.user.stake.controller;

import com.user.stake.models.T_stakeholder;
import com.user.stake.service.T_stakeholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stake")
public class T_stakeholderController {
    @Autowired
    private T_stakeholderService tStakeholderService;

    @GetMapping("/all")
    public ResponseEntity<List<T_stakeholder>> getStakes() {
        return ResponseEntity.status(HttpStatus.OK).body(tStakeholderService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStake(@PathVariable("id") int id) {
        Optional<T_stakeholder> stakeOptional;
        stakeOptional = tStakeholderService.findById(id);

        if (stakeOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(stakeOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el Stakeholder");
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStake(@PathVariable("id") int id) {
        tStakeholderService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<T_stakeholder> addStake(@RequestBody T_stakeholder t_stakeholder) {
        return ResponseEntity.status(HttpStatus.OK).body(tStakeholderService.create(t_stakeholder));
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> putStake(@RequestBody T_stakeholder t_stakeholder,
                                                  @PathVariable("id") int id){

        Optional<T_stakeholder> stakeOptional = tStakeholderService.findById(id);

        if(stakeOptional.isPresent()){
            T_stakeholder stakeUpdate = stakeOptional.get();
            stakeUpdate.setB_document_type(t_stakeholder.getB_document_type());
            stakeUpdate.setB_document_number(t_stakeholder.getB_document_number());
            stakeUpdate.setV_first_name(t_stakeholder.getV_first_name());
            stakeUpdate.setV_second_name(t_stakeholder.getV_second_name());
            stakeUpdate.setV_fisrt_surname(t_stakeholder.getV_fisrt_surname());
            stakeUpdate.setV_second_surname(t_stakeholder.getV_second_surname());
            stakeUpdate.setV_full_name(t_stakeholder.getV_full_name());
            stakeUpdate.setD_date_birth(t_stakeholder.getD_date_birth());
            stakeUpdate.setV_city(t_stakeholder.getV_city());
            stakeUpdate.setI_sex(t_stakeholder.getI_sex());
            stakeUpdate.setI_enabled(t_stakeholder.getI_enabled());
            stakeUpdate.setI_creation_user(t_stakeholder.getI_creation_user());
            stakeUpdate.setT_creation_date(t_stakeholder.getT_creation_date());

            return ResponseEntity.status(HttpStatus.OK).body(tStakeholderService.update( stakeUpdate));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Stake no existente");
        }

    }

}