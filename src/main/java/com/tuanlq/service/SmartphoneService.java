package com.tuanlq.service;


import com.tuanlq.model.Smartphone;

import java.util.List;

public interface SmartphoneService {
	
	public Smartphone create(Smartphone sp);
	public Smartphone get(Integer id);
	public List<Smartphone> getAll();
	public Smartphone save(Smartphone sp);
	public Smartphone delete(Integer id);

}
