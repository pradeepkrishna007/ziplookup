package com.starter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starter.model.ZipModel;

@Controller

public class ZipController {
	
	@RequestMapping("/")
    public String home() {
	 return "index";
    }
	
	@RequestMapping(value= "/zipLookup", method=RequestMethod.POST)
	public @ResponseBody List<ZipModel> greeting(@RequestBody String zip) {
		Map<Integer, ZipModel> map = new HashMap<>();
		System.out.println("Zipcode received ::" + zip);
		map.put(0, new ZipModel("01234", "Hyderabad", "AP"));
		map.put(1, new ZipModel("01235", "Hyderabad", "TS"));
		map.put(2, new ZipModel("01236", "Hyderabad", "HP"));
		map.put(3, new ZipModel("01237", "Hyderabad", "UP"));
		map.put(4, new ZipModel("01238", "Hyderabad", "BH"));
		map.put(5, new ZipModel("01230", "Hyderabad", "JH"));
		map.put(6, new ZipModel("01233", "Hyderabad", "AS"));
		map.put(7, new ZipModel("01232", "Hyderabad", "PU"));
		map.put(7, new ZipModel("01231", "Hyderabad", "KA"));
		map.put(8, new ZipModel("01229", "Hyderabad", "KL"));
		map.put(9, new ZipModel("01228", "Hyderabad", "TL"));
		map.put(10, new ZipModel("01227", "Hyderabad", "OS"));
		return map.values().stream().collect(Collectors.toList());
	}
}
