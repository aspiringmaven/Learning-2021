package me.sumitkawatra.ecsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import me.sumitkawatra.ecsapp.dto.InvestorDTO;
import me.sumitkawatra.ecsapp.service.InvestorService;

@RestController
@RequestMapping("/investors")
@Slf4j
public class InvestorController {
	
	@Autowired
	private InvestorService investorService;

	@GetMapping
	public List<InvestorDTO> getAllInvestors() {
		log.info("Request getAllInvestors ");
		return investorService.listAllInvestors();
	}
	
	@PostMapping
	public InvestorDTO save(@RequestBody InvestorDTO investorDTO) {
		log.info("Request save investorDTO: {} ", investorDTO);
		return investorService.save(investorDTO);
	}
	
	@GetMapping("/test")
	public List<InvestorDTO> test(){
		log.info("Seeding...");
		investorService.save( new InvestorDTO(null,"Investor-1", 1));
		investorService.save( new InvestorDTO(null,"Investor-2", 2));
		investorService.save( new InvestorDTO(null,"Investor-3", 3));
		investorService.save( new InvestorDTO(null,"Investor-4", 4));
		return investorService.listAllInvestors();
	}
	
}
