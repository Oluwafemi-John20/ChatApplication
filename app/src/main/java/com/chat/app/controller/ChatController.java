package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMesage(@Payload ChatMessage message){
        System.out.println("Received message: " + message); // Debugging
        return message;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
