package com.emobileconnect.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emobileconnect.dto.PlanResponsedto;
import com.emobileconnect.exception.TalktimePlanNotFoundException;
import com.emobileconnect.service.RequestTalktimePlanService;
import com.emobileconnect.entity.TalktimePlan;


@RestController
public class TalktimePlanController {

	@Autowired
	TalktimePlan plan;
	
	// This method will return the available Talktime Plan
	
	@GetMapping("/talktimeplan")
	public ResponseEntity<PlanResponsedto> getTalktimeplan(@PathVariable("talktimeplan") Integer talktimePlanId) throws TalktimePlanNotFoundException {
		
		PlanResponsedto response = requestTalktimePlanService.getplan(talktimePlanId);
		return new ResponseEntity<PlanResponsedto>(response, HttpStatus.OK);

	}

}