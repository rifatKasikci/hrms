package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateAbilityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateAbility;

@RestController
@RequestMapping("/api/candidateAbilities")
public class CandidateAbilitiesController {

	private CandidateAbilityService candidateAbilityService;

	public CandidateAbilitiesController(CandidateAbilityService candidateAbilityService) {
		super();
		this.candidateAbilityService = candidateAbilityService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<CandidateAbility>> getAll() {
		return this.candidateAbilityService.getAll();
				
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CandidateAbility candidateAbility) {
		return this.candidateAbilityService.add(candidateAbility);
	}
}
