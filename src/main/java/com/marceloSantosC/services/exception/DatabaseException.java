package com.marceloSantosC.services.exception;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseException (Long id) {
		super("Não foi possível excluir o usuário de id" + id + ", porque ele está associado a pedidos.");
	}
}
