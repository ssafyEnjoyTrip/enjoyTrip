package com.example.enjoyTrip.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
	private String id;
	private String email;
	private String name;
	private String password;
	private String phoneNum;
	private LocalDateTime register_time;
	private String role;
	
}
