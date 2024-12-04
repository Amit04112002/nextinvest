package com.nextinvest.service.service;

import com.nextinvest.service.dto.UsersDTO;
import com.nextinvest.service.models.Users;
import com.nextinvest.service.repo.UsersRepository;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    private ModelMapper mapper;

    public void saveUsers(Users users){
        usersRepository.save(users);
    }

    @SneakyThrows
    public UsersDTO validateUser(String email, String password){
        Users users = usersRepository.findByEmailAndPassword(email, password);
        if(users == null)
            throw new Exception("User not found.");
        return mapper.map(users, UsersDTO.class);
    }
}
