package com.bahrini.user.service;

import com.bahrini.user.ValueObject.Department;
import com.bahrini.user.ValueObject.RespanseTempleteVO;
import com.bahrini.user.model.User;
import com.bahrini.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository  userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        return  userRepository.save(user);
    }

    public RespanseTempleteVO getUserWithDepartment(Long userId) {
    RespanseTempleteVO vo = new RespanseTempleteVO();
    User  user = userRepository.findByUserId(userId);


    Department department =
            restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId() ,Department.class);
vo.setUser(user);
    vo.setDepartment(department);
    return  vo;

    }}
