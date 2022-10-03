package com.example.hoangspring.service.Iplm;

import com.example.hoangspring.entity.User;
import com.example.hoangspring.entity.UserParam;
import com.example.hoangspring.repository.IUserRepository;
import com.example.hoangspring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> list = userRepository.findAll();
        return list;
    }

    @Override
    public User create(UserParam user) {
        User usercreate = new User();
        usercreate.setId(user.getId());
        usercreate.setName(user.getName());
        userRepository.save(usercreate);
        return usercreate;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
