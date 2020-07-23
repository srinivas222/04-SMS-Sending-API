package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Service
public class SMSServiceImpl implements SMSService{
	
	public static final String ACCOUNT_SID = "AC20e95b5ffeb7d5f104fe049e8e4f413e";
    public static final String AUTH_TOKEN = "e62f40e59787aa3e84c87efca492da91";

	@Override
	public Message sendSMS() {
		String messagetext = "Please use this password to login into your account";
		Long number = 8186990003l;
		String num = number.toString();
		System.out.println("Before substring" + num);
		
		System.out.println("after substring " + num.substring(7, 10));
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		PhoneNumber sendingPhNum = new PhoneNumber("+918186990003");
		PhoneNumber twilioPhNum = new PhoneNumber("+12029725987");
		Message message = Message.creator(sendingPhNum, twilioPhNum, messagetext).create();
				  
				  return message;
		/*
		 * Message message = Message.creator( new
		 * com.twilio.type.PhoneNumber("+918186990003"),//The phone number you are
		 * sending text to new com.twilio.type.PhoneNumber("+12029725987"),//The Twilio
		 * phone number "This message is from SpringBoot Application") .create();
		 * 
		 * return message;
		 */
	}

}
