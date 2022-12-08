package com.example.concalendar.user.service;

import com.example.concalendar.user.dto.UserDto;
import com.example.concalendar.user.entity.User;
import com.example.concalendar.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService{

    public Integer join(UserDto userDto);

    public String login(UserDto userDto);

}
