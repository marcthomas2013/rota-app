package rota.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rota.services.PeopleService;

@Transactional
@Service
public class PeopleServiceImpl implements PeopleService {
	/**
	 * {@inheritDoc}
	 */
	public void createTestData() {
		System.out.println("Test");
	}
	
}
