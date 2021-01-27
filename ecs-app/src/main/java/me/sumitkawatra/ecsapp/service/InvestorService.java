package me.sumitkawatra.ecsapp.service;

import java.util.List;

import me.sumitkawatra.ecsapp.dto.InvestorDTO;

public interface InvestorService {

	InvestorDTO save(InvestorDTO investorDTO);

	List<InvestorDTO> listAllInvestors();

}
