package com.nyota.terminal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nyota.terminal.model.impl.BoardTerminalType;
import com.nyota.terminal.repo.BoardTerminalTypeRepo;

@SpringBootApplication
public class TerminalManagerApplication implements CommandLineRunner {

	@Autowired
	BoardTerminalTypeRepo btRepo;

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		BoardTerminalType btt = new BoardTerminalType();
		btt.setFriendlyName("Raspberry Pi 2");
		btt.setName("Raspberry9087");
		System.out.println ("Trying to save the BTT");
		btRepo.save(btt);
		//btRepo.insert(btt);
	}
}
