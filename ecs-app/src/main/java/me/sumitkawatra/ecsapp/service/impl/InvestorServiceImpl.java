package me.sumitkawatra.ecsapp.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import me.sumitkawatra.ecsapp.dto.InvestorDTO;
import me.sumitkawatra.ecsapp.entity.Investor;
import me.sumitkawatra.ecsapp.repository.InvestorRepository;
import me.sumitkawatra.ecsapp.service.InvestorService;

@Service
public class InvestorServiceImpl implements InvestorService {

	@Autowired
	private InvestorRepository investorRepository;
	
	@Override
	public InvestorDTO save(InvestorDTO investorDTO) {
		Investor investor = new Investor();
		BeanUtils.copyProperties(investorDTO, investor);
		investor = investorRepository.save(investor);
		investorDTO.setId(investor.getId());
		return investorDTO;
	}
	
	@Override
	public List<InvestorDTO> listAllInvestors(){
		List<Investor> investors = investorRepository.findAll();
		List<InvestorDTO> investorDTOs = Collections.emptyList();
		if(!CollectionUtils.isEmpty(investors)) {
			investorDTOs = investors.stream().map( investor -> {
				InvestorDTO dto = new InvestorDTO();
				BeanUtils.copyProperties(investor, dto);
				return dto;
			}).collect(Collectors.toList());
		}
		return investorDTOs;
	}
}
