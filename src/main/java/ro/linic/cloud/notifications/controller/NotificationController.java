package ro.linic.cloud.notifications.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.linic.cloud.notifications.entity.Notification;
import ro.linic.cloud.notifications.repository.NotificationRepository;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	@Autowired private NotificationRepository notificationRepo;
	
	@GetMapping
    public List<Notification> getNotifications() {
//		final Notification notif = new Notification();
//		notif.setTitle("auto");
//		notif.setMessage(LocalDateTime.now().toString());
//		notificationRepo.save(notif);
        return notificationRepo.findAll();
    }
}
