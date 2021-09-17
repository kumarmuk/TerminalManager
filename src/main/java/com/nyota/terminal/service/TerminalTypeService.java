package com.nyota.terminal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nyota.terminal.data.obj.TerminalDAO;
import com.nyota.terminal.data.repo.TerminalDAORepo;
import com.nyota.terminal.model.BoardTerminal;
import com.nyota.terminal.model.TerminalType;

@RestController
public class TerminalTypeService {

	@Autowired
	TerminalDAORepo terminalDAORepo;

	@GetMapping("/terminaltype")
	@ResponseBody
	public List<TerminalDAO> getTermnalType() {
		List<TerminalDAO> list = terminalDAORepo.findAll();
		return list;
	}

	@GetMapping("/terminaltype/{name}")
	@ResponseBody
	public TerminalDAO getTermnalTypeByName(String terminalName) {
		terminalDAORepo.findById(terminalName);
		
		return null;
	}

	@PostMapping("/terminaltyp/admin/")
	public void saveUpdateTerminalType() {

	}

	@DeleteMapping("terminaltype/admin/{id}")
	public void deleteTerminalType() {

	}

}
