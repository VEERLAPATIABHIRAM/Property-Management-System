package com.klu.PropertyMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public String insert(User user) {
        userRepository.save(user);
        return "User inserted successfully";
    }
    
    // You can add other service methods here
    
}
