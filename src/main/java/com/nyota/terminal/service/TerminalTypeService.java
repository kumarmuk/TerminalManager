package com.nyota.terminal.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyota.terminal.dao.TerminalTypeDAO;
import com.nyota.terminal.data.TerminalTypeData;
import com.nyota.terminal.data.TerminalTypeProperties;
import com.nyota.terminal.data.TerminalTypePropertiesImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.nyota.terminal.dao")
public class TerminalTypeService {

	@Autowired
	TerminalTypeDAO terminalTypeDAO;

	private static final Logger logger = LoggerFactory.getLogger(TerminalTypeService.class);

	@GetMapping("/terminaltype")
	@ResponseBody
	public List<TerminalTypeData> getTermnalType() {
		logger.info ("GET request to list all the terminal types");
		List<TerminalTypeData> list = terminalTypeDAO.getAllTerminalTypeDTO();
		System.out.println ("Size of the return list is "  + list.size());
		return list;
	}

	@PostMapping("/terminaltype")
	@ResponseBody
	public String posterminalType (@RequestBody String ttpInput) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objMapper = new ObjectMapper();
		//TerminalTypePropertiesImpl ttplImpl = objMapper.readValue(ttpInput, TerminalTypePropertiesImpl.class);
		TerminalTypeProperties ttp = objMapper.readValue(ttpInput, new TypeReference<TerminalTypeProperties>(){});
		
		TerminalTypeData ttd = new TerminalTypeData();
		ttd.setTerminalTypeProperties(ttp);
		return terminalTypeDAO.saveTerminalypeData(ttd);
	}
}
