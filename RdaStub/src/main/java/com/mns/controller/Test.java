package com.mns.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.mns.domain.Upt;

public class Test {

	public static void main(String[] args) {
		Reader reader = null;
		List<Upt> uptList = null;
		try{
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\upt.json"));
			JsonParser jsonParser = new JsonParser();
            JsonObject jsonObj = (JsonObject)jsonParser.parse(reader);
            JsonArray jsonArr = jsonObj.getAsJsonArray("871794714719741974");	
            if(jsonArr==null) {
            	jsonArr = jsonObj.getAsJsonArray("871794714719741974");
            }
			TypeToken<List<Upt>> token = new TypeToken<List<Upt>>(){};
			uptList = new Gson().fromJson(reader, token.getType());
			System.out.println(uptList.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
