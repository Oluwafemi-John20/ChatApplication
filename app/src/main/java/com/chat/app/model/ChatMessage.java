package com.chat.app.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
//@NoArgsConstructor
//@Getter
//@Setter
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
//}

    // Default constructor (Required for Jackson)
    public ChatMessage() {
    }

    public ChatMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}