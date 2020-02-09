package spring_lab.service;

import org.springframework.stereotype.Service;
import spring_lab.model.User;
import spring_lab.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }
}
