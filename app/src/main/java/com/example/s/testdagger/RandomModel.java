package com.example.s.testdagger;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RandomModel {
	
	@Inject
	RandomModel() {
	
	}
	
	
	public int getRandomNumberFromModel() {
		return new Random().nextInt();
	}
}
