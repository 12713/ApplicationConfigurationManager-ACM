package com.alibaba.demo.microsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.demo.microsvc.dao.MovieRepository;
import com.alibaba.demo.microsvc.model.Movie;


@RestController
public class MovieController {

	@Autowired
	MovieRepository movieRepository;

	@RequestMapping("/list-movies")
	public @ResponseBody Iterable<Movie> listMovies() {
        return movieRepository.findAll();
	}
	

}
