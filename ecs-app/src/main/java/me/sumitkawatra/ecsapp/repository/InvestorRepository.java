package me.sumitkawatra.ecsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.ecsapp.entity.Investor;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {

}
