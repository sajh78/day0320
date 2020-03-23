package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ScheduleVo;
import com.google.gson.Gson;

@RestController
public class ScheduleController {
	
	@RequestMapping("/insertSchedule")
	public String insertSchedule(ScheduleVo s) {
		String str="OK";
		DBManager.insertSchedule(s);
		System.out.println("일정등록: " + str);
		return str;
	}

	@RequestMapping(value = "/listSchedule", produces = "application/json;charset=UTF-8")
	public String listSchedule() {
		return (new Gson()).toJson(DBManager.listSchedule());
	}
	
}
