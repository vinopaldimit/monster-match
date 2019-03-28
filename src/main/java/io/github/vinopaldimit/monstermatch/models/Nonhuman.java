package io.github.vinopaldimit.monstermatch.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

abstract class Nonhuman extends Profile{

	@Id
	@GeneratedValue
	private Long id;
	
	
}
