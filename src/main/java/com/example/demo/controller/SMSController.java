package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.SMSService;
import com.twilio.rest.api.v2010.account.Message;

@Controller
public class SMSController {
	
	@Autowired
	private SMSService smsService;

	@RequestMapping(value = "/sendSMS", method = RequestMethod.GET)
	public @ResponseBody Message sendSMS() {
		return smsService.sendSMS();
	}

}
