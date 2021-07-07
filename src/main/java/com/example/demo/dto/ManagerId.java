package com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Validated
public class ManagerId {
	
	@Pattern(regexp = "[^0-9]*", message = "no")
	private String id;

}
