package com.mns.service.impl;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.mns.domain.Category;
import com.mns.domain.Product;
import com.mns.domain.Upt;

@Service
public class RdaStubServiceImpl {
private static final Logger LOGGER = LoggerFactory.getLogger(RdaStubServiceImpl.class.getName());
	
	public List<Product> fetchProducts(final String vendorNo, final String categories){
		LOGGER.info("fetchProducts");
		Reader reader = null;
		List<Product> productList = null; 
		try{
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\product.json"));
			TypeToken<List<Product>> token = new TypeToken<List<Product>>() {};
			productList = new Gson().fromJson(reader, token.getType());
			System.out.println(productList.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	public List<Upt> getUpt(String articleNo, String vendorNo, String orderUnit, String validFrom) {
		LOGGER.info("getUpt");
		Reader reader = null;
		List<Upt> uptList = null;
		try{
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\upt.json"));
			JsonParser jsonParser = new JsonParser();
            JsonObject jsonObj = (JsonObject)jsonParser.parse(reader);
            JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);	
            if(jsonArr==null) {
            	jsonArr = jsonObj.getAsJsonArray("FOOD");
            }
			TypeToken<List<Upt>> token = new TypeToken<List<Upt>>() {};
			uptList = new Gson().fromJson(reader, token.getType());
			System.out.println(uptList.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return uptList;
	}

	public List<Category> getCategories(String grp_category) {
		LOGGER.info("getCategories");
		Reader reader = null;
		List<Category> categoryList = null;
		try{
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\categories.json"));
			JsonParser jsonParser = new JsonParser();
            JsonObject jsonObj = (JsonObject)jsonParser.parse(reader);
            JsonArray jsonArr = jsonObj.getAsJsonArray(grp_category);	
            if(jsonArr==null) {
            	jsonArr = jsonObj.getAsJsonArray("FOOD");
            }
			TypeToken<List<Category>> token = new TypeToken<List<Category>>(){};
			categoryList = new Gson().fromJson(jsonArr, token.getType());
		}catch(Exception e) {
			e.printStackTrace();
		}			
		return categoryList;
	}	
}