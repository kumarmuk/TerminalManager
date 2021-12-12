package com.nyota.terminal;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyota.terminal.dao.TerminalTypeDAO;
import com.nyota.terminal.data.BoardTerminalTypeData;
import com.nyota.terminal.data.DesktopTerminalTypeData;
import com.nyota.terminal.data.ServerTerminalTypeData;
import com.nyota.terminal.data.TerminalTypeData;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TerminalManagerApplication implements CommandLineRunner {

	@Autowired
	TerminalTypeDAO terminalTypeDAO;

	private static final Logger logger = LoggerFactory.getLogger(TerminalManagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(logger.getName());
		this.saveTestData();
		logger.info("The Spring Appliction has started up");
	}

	public void saveTestData() {

		/*
		TerminalTypeData ttd = new TerminalTypeData();

		BoardTerminalTypeData bbt = new BoardTerminalTypeData();
		bbt.setDisplayPortType("HDMI");
		bbt.setCacheSize("120");
		bbt.setDisplayPorts(2);
		bbt.setFormFactor("board");
		bbt.setFriendlyName("ARM Board");
		bbt.setName("Raspberry Pi");
		ttd.setTerminalTypeProperties(bbt);
		// terminalTypeDAO.saveTerminalypeData(ttd);
		ObjectMapper objMapper = new ObjectMapper();

		try {
			String objJson = objMapper.writeValueAsString(ttd);
			System.out.println (objJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		DesktopTerminalTypeData ddt = new DesktopTerminalTypeData();

		ServerTerminalTypeData stt = new ServerTerminalTypeData();
*/
	




}

}