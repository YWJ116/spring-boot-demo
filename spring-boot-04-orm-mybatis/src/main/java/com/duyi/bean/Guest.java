package com.duyi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类 代表嘉宾
 */
@Data @AllArgsConstructor@NoArgsConstructor

public class Guest implements Serializable {

    private Long id;

    private String name;

    private String role;


}
