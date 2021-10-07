package com.nyota.terminal.service;

import java.util.List;

import com.nyota.terminal.dao.TerminalTypeDAO;
import com.nyota.terminal.data.TerminalTypeData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.nyota.terminal.dao")
public class TerminalTypeService {

	@Autowired
	TerminalTypeDAO terminalTypeDAO;

	@GetMapping("/terminaltype")
	@ResponseBody
	public List<TerminalTypeData> getTermnalType() {
		System.out.println("Trying to get all terminal types");
		List<TerminalTypeData> list = terminalTypeDAO.getAllTerminalTypeDTO();
		// list.iterator();

		return list;
	}
}
