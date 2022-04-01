package com.duyi.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter@Setter
@AllArgsConstructor
public class Food {

    private String meat;

    private String rice;

    private String[] sauce;


}
