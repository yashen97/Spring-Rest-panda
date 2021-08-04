package com.coop.soloapp.controllers;


import com.coop.soloapp.models.Employee;
import com.coop.soloapp.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/emp")
public class Controller {

    @Autowired
    private Repository jpaRepository;

    @PostMapping(path="/add")
    public String addNewEmployee(@RequestParam String name,@RequestParam String position,@RequestParam String email,@RequestParam String branch){
        Employee e=new Employee();
        e.setName(name);
        e.setPosition(position);
        e.setEmail(email);
        e.setBranch(branch);
        jpaRepository.save(e);
        return "Recorded";
    }


}
