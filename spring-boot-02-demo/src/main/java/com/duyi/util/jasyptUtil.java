package com.duyi.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class jasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}
