package org.cfs.Boot0P1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private MessageService messageService;

    @Autowired
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser() {
        System.out.println(messageService.getMessage());
    }
}


