package controllers;

import model.Program;
import model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repositories.ProgramRepository;
import services.ProgramService;

import java.util.List;

@Controller
@RequestMapping(value = "/programs")
public class ProgramController {

    @Autowired
    ProgramRepository repository;
    @Autowired
    ProgramService service;

    @GetMapping(produces = "application/json")
    public @ResponseBody
    List<Program> findAll(){
        return service.findAll();
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    Program findById(@PathVariable("id") int id, Model model){
        Program program = service.findById(id);
        System.out.println(program);
        model.addAttribute("program", program);
        return program;
    }
}
