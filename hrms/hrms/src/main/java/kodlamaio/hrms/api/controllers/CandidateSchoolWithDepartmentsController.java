package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateSchoolWithDepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateSchoolWithDepartment;

@RestController
@RequestMapping("/api/candidateSchoolWithDepartments/")
public class CandidateSchoolWithDepartmentsController {

	private CandidateSchoolWithDepartmentService candidateSchoolWithDepartmentService;

	public CandidateSchoolWithDepartmentsController(
			CandidateSchoolWithDepartmentService candidateSchoolWithDepartmentService) {
		super();
		this.candidateSchoolWithDepartmentService = candidateSchoolWithDepartmentService;
	}
	
	@GetMapping("getall")
	public DataResult<List<CandidateSchoolWithDepartment>> getAll(){
		return this.candidateSchoolWithDepartmentService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CandidateSchoolWithDepartment candidateSchoolWithDepartment){
		return this.candidateSchoolWithDepartmentService.add(candidateSchoolWithDepartment);
	}
	
	@GetMapping("getallbycandidateidorderbyendingdatedesc")
	public DataResult<List<CandidateSchoolWithDepartment>> getAllByCandidateIdOrderByEndingDateDesc(int candidateId){
		return this.candidateSchoolWithDepartmentService.getAllByCandidateIdOrderByEndingDateDesc(candidateId);
	}
	
	@GetMapping("getallbyorderbyendingdatedesc")
	public DataResult<List<CandidateSchoolWithDepartment>> getAllByOrderByEndingDateDesc(){
		return this.candidateSchoolWithDepartmentService.getAllByOrderByEndingDateDesc();
	}
}
