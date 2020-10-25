package com.marceloSantosC.services.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Number id) {
		super("Resource with id " + id + " not found.");
	}
}
