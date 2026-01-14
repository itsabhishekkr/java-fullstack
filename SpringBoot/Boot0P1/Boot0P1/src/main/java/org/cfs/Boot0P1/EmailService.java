package org.cfs.Boot0P1;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "this is email service";
    }
}

