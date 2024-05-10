package ro.linic.cloud.notifications.entity;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.databind.JsonNode;

import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	@NotBlank
	private String title;
	
	@Column(columnDefinition = "text")
	private String message;
	
	@Type(JsonBinaryType.class)
	@Column(columnDefinition = "jsonb")
	private JsonNode actions;
}
