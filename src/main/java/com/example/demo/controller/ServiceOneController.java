package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ManagerId;
import com.example.demo.dto.ManagerName;
import com.example.demo.service.ServiceOneService;

@RestController
@RequestMapping("/api")
@Validated
public class ServiceOneController {

	@Autowired
	private ServiceOneService service;

	@PostMapping(path = "/manager", consumes = "application/json", produces = "application/json")
	public ResponseEntity<ManagerName> getManagerName(@RequestBody @Valid  ManagerId id) {
		return new ResponseEntity<>(service.getName(), HttpStatus.CREATED);
	}
}
