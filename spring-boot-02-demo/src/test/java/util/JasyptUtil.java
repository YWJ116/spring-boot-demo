package util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
//        /meRJbsKr9IzC43ky3QjWw==
//        Dfpko2NvFqS+jlGk7kKbvw==
////
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("123456!@#");
        String username = basicTextEncryptor.encrypt("root");
        String password = basicTextEncryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}
