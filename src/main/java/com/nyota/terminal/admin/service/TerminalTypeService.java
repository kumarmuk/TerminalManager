package com.nyota.terminal.admin.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerminalTypeService {

	@GetMapping("/terminaltype/")
	public void getTermnalType() {

	}

	@GetMapping("/terminaltype/{name}")
	public void getTermnalTypeByName() {

	}

	@PostMapping("/terminaltyp/admin/")
	public void saveUpdateTerminalType() {

	}

	@DeleteMapping("terminaltype/admin/{id}")
	public void deleteTerminalType() {

	}

}
