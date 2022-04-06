package com.duyi.service;

import com.duyi.bean.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
//    Mybatis
    @Override
    public List<Guest> list() {
        return null;
    }
//    JPA
//    @Autowired
//    private GuestRepository repository;
//    @Override
//    public List<Guest> list() {
//        return repository.findAll();
//    }


}
