package com.nyota.terminal;

import com.nyota.terminal.repo.TerminalTypeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TerminalManagerApplication implements CommandLineRunner {

	@Autowired
	TerminalTypeRepo trr;

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
/* 		BoardTerminalType btt = new BoardTerminalType();
		btt.setFriendlyName("Raspberry Pi 2");
		btt.setName("Raspberry9087");
		System.out.println("Trying to save the BTT");
		btRepo.save(btt); */

	

		// TerminalTypeDTO ttDTO = new TerminalTypeDTO(btt);
		// ttRepo.save(ttDTO);

		// DesktopTerminalType dt = new DesktopTerminalType();
		// dt.setFriendlyName("Lenovo Desktop");
		// dt.setWeight(24);

		/* ServerTerminalTypeData std = new ServerTerminalTypeData();
		std.setRackType("HP");

		// TerminalTypeDTO ttDTO1 = new TerminalTypeDTO(dt);
		// ttRepo.save(ttDTO1);

		TerminalTypeProperties dt = btd;
		
		TerminalTypeData ttd = new TerminalTypeData();
		ttd.setDt(dt);
		trr.save(ttd);

		TerminalTypeProperties dt1 = std;

		TerminalTypeData ttd1 = new TerminalTypeData();
		ttd1.setDt(dt1);
		trr.save(ttd1); */
	}
}