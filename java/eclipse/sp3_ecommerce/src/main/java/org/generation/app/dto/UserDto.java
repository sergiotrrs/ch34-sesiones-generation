package org.generation.app.dto;

import java.sql.Timestamp;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {
	
	private Long id;


	private String firstName;

	private String lastName;

	private String email;

	private Timestamp birthdate;

}
