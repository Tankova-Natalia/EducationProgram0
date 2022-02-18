package services;

import model.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProgramRepository;

import java.util.List;

@Service
public class ProgramService {
    @Autowired
    ProgramRepository repository;
    public List<Program> findAll(){
        return repository.findAll();
    }
    public Program findById(int id){
        return repository.findById(id);
    }
}
