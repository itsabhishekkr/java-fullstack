package org.cfs.Boot0P1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot0P1Application implements CommandLineRunner {

	private final Notification notification;

	@Autowired
	public Boot0P1Application(Notification notification) {
		this.notification = notification;
	}

	public static void main(String[] args) {
		SpringApplication.run(Boot0P1Application.class, args);
	}

	@Override
	public void run(String... args) {
		notification.notifyUser();
	}
}


