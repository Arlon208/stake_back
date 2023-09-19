package com.user.stake.controller;

import com.user.stake.models.T_user;
import com.user.stake.service.T_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class T_userController {
    @Autowired
    private T_userService t_userService;

    @GetMapping("/all")
    public ResponseEntity<List<T_user>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(t_userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") int id){
        Optional<T_user> userOptional = t_userService.findById(id);

        if(userOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(userOptional.get());
        }

        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el Usuario");
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id){
        try {
            t_userService.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo eliminar porque está en uso");
        }
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<T_user> addUser(@RequestBody T_user t_user){
        return ResponseEntity.status(HttpStatus.OK).body(t_userService.create(t_user));
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> putUser(@PathVariable("id") int id ,@RequestBody T_user t_user){
        Optional<T_user> userOptional = t_userService.findById(id);

        if(userOptional.isPresent()){
            T_user userUpadte = userOptional.get();
            userUpadte.setV_user(t_user.getV_user());
            userUpadte.setV_name(t_user.getV_name());
            userUpadte.setV_pass(t_user.getV_pass());
            userUpadte.setI_enabled(t_user.getI_enabled());
            userUpadte.setV_email(t_user.getV_email());
            userUpadte.setI_profile(t_user.getI_profile());
            userUpadte.setT_creation_date(t_user.getT_creation_date());
            return ResponseEntity.status(HttpStatus.OK).body(t_userService.update(userUpadte));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no existente");
        }
    }
}
