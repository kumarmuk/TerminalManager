package com.nyota.terminal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nyota.terminal.data.model.BoardTerminal;
import com.nyota.terminal.data.model.DesktopTerminal;
import com.nyota.terminal.data.obj.TerminalDAO;
import com.nyota.terminal.data.repo.TerminalDAORepo;

@SpringBootApplication
public class TerminalManagerApplication {

	@Autowired
	private TerminalDAORepo termRepo;

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);

	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * BoardTerminal boardTerminal = new BoardTerminal();
	 * boardTerminal.setName("RaspberryPi"); boardTerminal.setUsb2Ports(2);
	 * 
	 * TerminalDAO termDAO = new TerminalDAO();
	 * termDAO.setTerminalName(boardTerminal.getName());
	 * termDAO.setTerminalType("BOARD");
	 * 
	 * Map propertiesMap = new HashMap(); propertiesMap.put("USB2Ports",
	 * boardTerminal.getUsb2Ports()); termDAO.setTerminalProperties(propertiesMap);
	 * termRepo.save(termDAO);
	 * 
	 * }
	 */
}
