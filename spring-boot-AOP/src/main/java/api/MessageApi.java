package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MessageService;
@RestController
@RequestMapping("/mesajver")
public class MessageApi {
    @Autowired
    private MessageService messageService;


    public ResponseEntity<String> ordekMethod(@RequestBody String message){
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}
