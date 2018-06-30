package com.challenger.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boost.bean.DataContainer;
import com.google.gson.Gson;

@RestController
@RequestMapping("/packing")
public class PackingController 
{
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/dashbord", method = RequestMethod.POST, headers = "Accept=application/json", consumes = {
			"application/json" })
	public String  getDiversionReport(@RequestBody DataContainer reportInfo) 
	{
		reportInfo.setStatus("Success");
		
		
		
		Gson gson = new Gson();
		String json = gson.toJson(reportInfo);
		return json;
	}
	
}
