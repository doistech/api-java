package br.com.doistech.api.Services.Impl;

import br.com.doistech.api.Repositories.UserRepository;
import br.com.doistech.api.Services.UserService;
import br.com.doistech.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> _user = repository.findById(id);
        return _user.orElse(null);
    }
}
