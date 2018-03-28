package com.alibaba.demo.microsvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.alibaba.demo.microsvc.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{
	
}
