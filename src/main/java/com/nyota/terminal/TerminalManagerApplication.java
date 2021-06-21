package com.nyota.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nyota.terminal.data.model.BoardTerminal;
import com.nyota.terminal.data.model.DesktopTerminal;
import com.nyota.terminal.data.repo.TerminalTypeRepository;

@SpringBootApplication
public class TerminalManagerApplication implements CommandLineRunner {

	@Autowired
	private TerminalTypeRepository terminalTypeRepo;

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		BoardTerminal boardTerminal = new BoardTerminal();
		boardTerminal.setName("RaspberryPi");

		DesktopTerminal deskTerm = new DesktopTerminal();
		deskTerm.setFormFactor("Tower");
		deskTerm.setDisplayPortType("HDMI");

		BoardTerminal bt = terminalTypeRepo.save(boardTerminal);
		if (bt == null) {
			System.out.println("Board terminal counld not be saved");
		} else {
			System.out.println("Board terminal - saved");
		}

		DesktopTerminal dt = terminalTypeRepo.save(deskTerm);
		if (dt != null) {
			System.out.println("Desktop terminal - saved");
		} else {
			System.out.println("Desktop terminal - not saved");
		}
		
	}

}
