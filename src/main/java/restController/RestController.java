package restController;

import domain.User_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repo.UserRepo;

import java.util.List;

@RestController
class UserController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public List<User_> users(){
        return userRepo.findAll();
    }
    @PostMapping("/new-user")
    public User_ user(@RequestBody User_ user){
        return userRepo.save(user);}
}
