package com.tuanlq.service;

import com.tuanlq.model.Smartphone;
import com.tuanlq.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {
	
	@Autowired
	private SmartphoneRepository smartphoneRepository;

	@Override
	public Smartphone create(Smartphone sp) {
		return smartphoneRepository.save(sp);
	}

	@Override
	public Smartphone get(Integer id) {
		Smartphone sp = null;
		if (id instanceof Integer)
			sp = smartphoneRepository.findOne(id);
		return sp;
	}

	@Override
	public List<Smartphone> getAll() {
		return smartphoneRepository.findAll();
	}

	@Override
	public Smartphone save(Smartphone sp) {
		return smartphoneRepository.save(sp);
	}

	@Override
	public Smartphone delete(Integer id) {
		Smartphone sPhone = get(id);
		smartphoneRepository.delete(id);
		return sPhone;
	}

}
