package com.canbe.chatapp.notification;

import com.canbe.chatapp.message.MessageType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {

    private String chatId;
    private String content;
    private String senderId;
    private String receiverId;
    private String chatName;
    private MessageType messageType;
    private NotificationType type;
    private byte[] media;
}