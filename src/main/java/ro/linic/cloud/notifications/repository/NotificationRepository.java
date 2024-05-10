package ro.linic.cloud.notifications.repository;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;

import ro.linic.cloud.notifications.entity.Notification;

@JaversSpringDataAuditable
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}