package com.nyota.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nyota.terminal.data.TerminalTypeRepository;
import com.nyota.terminal.model.BoardTerminal;
import com.nyota.terminal.model.DesktopTerminal;

@SpringBootApplication
public class TerminalManagerApplication implements CommandLineRunner {

	@Autowired
	private TerminalTypeRepository terminalTypeRepo;

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Will save the board now");
		BoardTerminal boardTerminal = new BoardTerminal();
		boardTerminal.setVendor("Acer");
		boardTerminal.setSolarPowered(true);
		boardTerminal.setSerialNumber("6758333214");

		DesktopTerminal dd = new DesktopTerminal();
		dd.setFormFactor("Tower");
		dd.setSerialNumber("6758333214");

		terminalTypeRepo.save(boardTerminal);
		terminalTypeRepo.save(dd);
	}

}
