package com.nyota.terminal.data.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nyota.terminal.data.obj.TerminalDAO;

public interface TerminalDAORepo extends MongoRepository<TerminalDAO, String> {

	@Override
	default <S extends TerminalDAO> S save(S entity) {
		if (entity != null)
			if (entity.getName() == null) {
				return entity;
			}
		return null;
	}

}
