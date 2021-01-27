package me.sumitkawatra.ecsapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "INVESTOR")
@Getter
@Setter
@ToString
public class Investor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVESTOR_SEQ_GEN")
	@SequenceGenerator(name = "INVESTOR_SEQ_GEN", sequenceName = "INVESTOR_SEQ")
	private Long id;
	private String name;
	private int age;
}
