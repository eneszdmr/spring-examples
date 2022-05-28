package service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String mesajVer(String message){
        System.out.println(message);
        return message;
    }
}
