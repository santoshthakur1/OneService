package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ManagerName;

@Service
public class ServiceOneService {

	public ManagerName getName() {
		ManagerName dto = new ManagerName();
		dto.setName("santosh");
		return dto;
	}
}
