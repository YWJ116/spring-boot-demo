package com.duyi.dao;

import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestDao {
    @Update("")
    public void update();
}
