package br.com.doistech.api.Services;

import br.com.doistech.api.domain.User;

public interface UserService{

    User findById(Integer id);
}
