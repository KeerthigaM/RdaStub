package com.mns.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mns.domain.Category;
import com.mns.domain.Product;
import com.mns.domain.Upt;
import com.mns.service.impl.RdaStubServiceImpl;

@RestController
public class RdaStubController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RdaStubController.class.getName());

	@Resource
	private RdaStubServiceImpl serviceImpl;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String home(@RequestParam(value = "vendorNo", required = true) final String vendorNo, @RequestParam(value = "categories", required = true) final String categories){
		return vendorNo+categories;
	}
	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> search(@RequestParam(value = "vendorNo", required = true) final String vendorNo, @RequestParam(value = "categories", required = true) final String categories){
		LOGGER.info("/products for vendor {} for categories {}", vendorNo, categories);
		final List<Product> productList = serviceImpl.fetchProducts(vendorNo, categories);
		LOGGER.info("/products for vendor {} for categories {} found {}", vendorNo, categories, productList.size());
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}	
	@RequestMapping(value = "/product/{articleNo}/vendor/{vendorNo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Upt>> getCostPrice(@PathVariable("articleNo") final String articleNo, @PathVariable("vendorNo") final String vendorNo, @RequestParam(value = "orderUnit", required = false) final String
			orderUnit, @RequestParam(value = "validFrom", required = true) final String validFrom){
		LOGGER.info("/product/{}/vendor/{}", articleNo, vendorNo);
		final List<Upt> uptList = serviceImpl.getUpt(articleNo, vendorNo, orderUnit, validFrom);
		LOGGER.info("/product/{}/vendor/{} found {}", articleNo, vendorNo, uptList.size());
		return new ResponseEntity<List<Upt>>(uptList, HttpStatus.OK);
	}	
	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> getCategories(@RequestParam(value = "grp_category", required = true) final String grp_category){
		LOGGER.info("/categories?grp_category={}", grp_category);
		final List<Category> categoryList = serviceImpl.getCategories(grp_category);
		LOGGER.info("/categories?grp_category={} found {}", grp_category, categoryList.size());
		return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
	}
}