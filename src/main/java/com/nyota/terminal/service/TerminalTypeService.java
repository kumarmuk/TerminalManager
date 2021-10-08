package com.nyota.terminal.service;

import java.util.List;

import com.nyota.terminal.dao.TerminalTypeDAO;
import com.nyota.terminal.data.TerminalTypeData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@ComponentScan("com.nyota.terminal.dao")
public class TerminalTypeService {

	@Autowired
	TerminalTypeDAO terminalTypeDAO;

	private static final Logger logger = LogManager.getLogger(TerminalTypeService.class);

	@GetMapping("/terminaltype")
	@ResponseBody
	public List<TerminalTypeData> getTermnalType() {
		logger.info ("GET request to list all the terminal types");
		List<TerminalTypeData> list = terminalTypeDAO.getAllTerminalTypeDTO();
		return list;
	}

	@PostMapping("/terminaltype")
	@ResponseBody
	public String posterminalType (TerminalTypeData ttd) {
		return terminalTypeDAO.saveTerminalypeData(ttd);
	}
}
