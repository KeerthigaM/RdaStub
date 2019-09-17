package com.mns.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mns.domain.Category;
import com.mns.domain.Equipment;
import com.mns.domain.EquipmentDetails;
import com.mns.domain.MuleWorkflowApproval;
import com.mns.domain.MuleWorkflowRequest;
import com.mns.domain.Product;
import com.mns.domain.ProductWeights;
import com.mns.domain.Report;
import com.mns.domain.SiteGroup;
import com.mns.domain.SupplyChain;
import com.mns.domain.Upt;
import com.mns.domain.Vendor;
import com.mns.domain.Workflow;
import com.mns.domain.message.WorkflowApprovalMessage;
import com.mns.domain.message.WorkflowCreationMessage;
import com.mns.service.impl.RdaStubServiceImpl;

@RestController
public class RdaStubController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RdaStubController.class.getName());

	@Resource
	private RdaStubServiceImpl serviceImpl;
	
	@RequestMapping(value = "/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> status(){
		return new ResponseEntity<String>("UP", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProducts(
			@RequestParam(value = "vendorNo", required = true) final String vendorNo, 
			@RequestParam(value = "categories", required = true) final String categories){
		LOGGER.info("/products for vendor {} for categories {}", vendorNo, categories);
		final List<Product> productList = serviceImpl.getProducts(vendorNo, categories);
		LOGGER.info("/products?vendor={}&categories={} found {}", vendorNo, categories, productList.size());
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	@RequestMapping(value = "/product/{articleNo}/vendor/{vendorNo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Upt>> getUpt(
			@PathVariable("articleNo") final String articleNo, 
			@PathVariable("vendorNo") final String vendorNo, 
			@RequestParam(value = "orderUnit", required = false) final String orderUnit, 
			@RequestParam(value = "validFrom", required = true) final String validFrom){
		LOGGER.info("/product/{}/vendor/{}", articleNo, vendorNo);
		final List<Upt> uptList = serviceImpl.getUpt(articleNo, vendorNo, orderUnit, validFrom);
		LOGGER.info("/product/{}/vendor/{} found {}", articleNo, vendorNo, uptList.size());
		return new ResponseEntity<List<Upt>>(uptList, HttpStatus.OK);
	}	
	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> getCategories(
			@RequestParam(value = "grp_category", required = true) final String grp_category){
		LOGGER.info("/categories?grp_category={}", grp_category);
		final List<Category> categoryList = serviceImpl.getCategories(grp_category);
		LOGGER.info("/categories?grp_category={} found {}", grp_category, categoryList.size());
		return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
	}	
	@RequestMapping(value = "/product/{articleNo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProduct(
			@PathVariable("articleNo") final String articleNo, 
			@RequestParam(value = "categories", required = true) final String categories){
		LOGGER.info("AMLServiceImpl:getProduct for [articleNo: {}] and [categories : {}]", articleNo, categories);
		final List<Product> productList = serviceImpl.getProduct(articleNo,categories);
		LOGGER.info("/product/{}?categories={} found {}", articleNo,categories, productList.size());
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	@RequestMapping(value = "/sitegroups", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SiteGroup>> getSiteGroups(
			@RequestParam(value = "classType", required = true) final String classType){
		LOGGER.info("getSiteGroups for [classType: {}]", classType);
		final List<SiteGroup> siteGroupList = serviceImpl.getSiteGroups(classType);
		LOGGER.info("/sitegroups?classType={} found {}", classType, siteGroupList.size());
		return new ResponseEntity<List<SiteGroup>>(siteGroupList, HttpStatus.OK);
	}	
	@RequestMapping(value = "/product/{articleNo}/sitegroup/{sitegroup}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SupplyChain>> getSupplyChainData(
			@PathVariable("articleNo") final String articleNo,
			@PathVariable("sitegroup") final String sitegroup,
			@RequestParam(value = "validFrom", required = true) final String validFrom,
			@RequestParam(value = "classType", required = true) final String classType){
		LOGGER.info("getSupplyChainData for [classType: {}][validFrom: {}]", classType, validFrom);
		final List<SupplyChain> SupplyChainList = serviceImpl.getSupplyChainData(articleNo, sitegroup, classType, validFrom);
		LOGGER.info("/product/{}/sitegroup/{}?classType={}&validFrom={} found {}", articleNo, sitegroup, classType, validFrom, SupplyChainList.size());
		return new ResponseEntity<List<SupplyChain>>(SupplyChainList, HttpStatus.OK);
	}
	@RequestMapping(value = "/workflow/trigger", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WorkflowCreationMessage> triggerWorkflowData(@RequestBody final MuleWorkflowRequest wfr){
		LOGGER.info("triggerWorkflowData");
		final WorkflowCreationMessage workflowCreationMessage = serviceImpl.triggerWorkflowData(wfr);
		return new ResponseEntity<WorkflowCreationMessage>(workflowCreationMessage, HttpStatus.OK);
	}
	@RequestMapping(value = "/workflows", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Workflow>> getPendingWorkflows(
			@RequestParam(value = "categories", required = true) final String categories){
		LOGGER.info("getPendingWorkflows for [categories: {}]", categories);
		final List<Workflow> workflowList = serviceImpl.getPendingWorkflows(categories);
		LOGGER.info("/workflows?categories={} found {}", categories, workflowList.size());
		return new ResponseEntity<List<Workflow>>(workflowList, HttpStatus.OK);
	}
	@RequestMapping(value = "/workflow/approve", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WorkflowApprovalMessage> approveWorkflowData(@RequestBody final MuleWorkflowApproval wfa){
		LOGGER.info("approveWorkflowData");
		final WorkflowApprovalMessage wam = serviceImpl.approveWorkflowData(wfa);
		LOGGER.info("approveWorkflowData for workflowId {}", wam.getWorkflowId());
		return new ResponseEntity<WorkflowApprovalMessage>(wam, HttpStatus.OK);
	}
	@RequestMapping(value = "/report", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Report>> getWorkflowReport(
			@RequestParam(value = "upc", required = false) final String upc, 
			@RequestParam(value = "categories", required = true) final String categories,
			@RequestParam(value = "vendorNo", required = false) final String vendorNo,
			@RequestParam(value = "reasonCode", required = false) final String reasonCode,
			@RequestParam(value = "workflowStatus", required = false) final String workflowStatus,
			@RequestParam(value = "backendStatus", required = false) final String backendStatus,
			@RequestParam(value = "ragStatus", required = false) final String ragStatus,
			@RequestParam(value = "actionDateFrom", required = false) final String actionDateFrom,
			@RequestParam(value = "actionDateTo", required = false) final String actionDateTo,
			@RequestParam(value = "actionTimeFrom", required = false) final String actionTimeFrom, 
			@RequestParam(value = "actionTimeTo", required = false) final String actionTimeTo,
			@RequestParam(value = "roleCode", required = false) final String roleCode){
		LOGGER.info("getWorkflowReport for [categories: {}]", categories);
		final List<Report> reportList = serviceImpl.getWorkflowReport(upc,categories ,vendorNo ,reasonCode ,workflowStatus ,backendStatus ,ragStatus ,actionDateFrom ,actionDateTo ,actionTimeFrom ,actionTimeTo,roleCode);
		LOGGER.info("/report found {}", categories, reportList.size());
		return new ResponseEntity<List<Report>>(reportList, HttpStatus.OK);
	}
	@RequestMapping(value = "/vendors", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vendor>> getVendors(
			@RequestParam(value = "account_grp", required = false) final String account_grp){
		LOGGER.info("getVendors for [account_grp: {}]", account_grp);
		final List<Vendor> vendorList = serviceImpl.getVendors(account_grp);
		LOGGER.info("/vendors?account_grp={} found {}", account_grp, vendorList.size());
		return new ResponseEntity<List<Vendor>>(vendorList, HttpStatus.OK);
	}
	@RequestMapping(value = "/equipment", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Equipment>> getEquipment(){
		LOGGER.info("getEquipment");
		final List<Equipment> equipmentList = serviceImpl.getEquipment();
		LOGGER.info("/equipment found {}", equipmentList.size());
		return new ResponseEntity<List<Equipment>>(equipmentList, HttpStatus.OK);
	}
	@RequestMapping(value = "/product/{articleNo}/vendor/{vendorNo}/equipment", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EquipmentDetails>> getEquipmentDetails(
			@PathVariable("articleNo") final String articleNo,
			@PathVariable("vendorNo") final String vendorNo,
			@RequestParam(value = "validFrom", required = true) final String validFrom, 
			@RequestParam(value = "orderUnit", required = false) final String orderUnit){
		LOGGER.info("getEquipmentDetails for[vendorNo: {}] and [articleNo : {}] and [orderUnit:{}] and [validFrom:{}]", vendorNo, articleNo, orderUnit, validFrom);
		final List<EquipmentDetails> equipmentDetailsList = serviceImpl.getEquipmentDetails(articleNo,vendorNo,validFrom,orderUnit);
		LOGGER.info("/product/{}/vendor/{}/equipment?validFrom={} found {}", articleNo,vendorNo,validFrom,equipmentDetailsList.size());
		return new ResponseEntity<List<EquipmentDetails>>(equipmentDetailsList, HttpStatus.OK);
	}
	@RequestMapping(value = "/product/{articleNo}/vendor/{vendorNo}/weight", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProductWeights>> getProductsWeights(
			@PathVariable("articleNo") final String articleNo,
			@PathVariable("vendorNo") final String vendorNo,
			@RequestParam(value = "validFrom", required = true) final String validFrom){
		LOGGER.info("getProductsWeights for[vendorNo: {}] and [articleNo : {}] and [validFrom:{}]", vendorNo, articleNo, validFrom);
		final List<ProductWeights> productWeightsList = serviceImpl.getProductsWeights(articleNo,vendorNo,validFrom);
		LOGGER.info("/product/{}/vendor/{}/weight?validFrom={} found {}", articleNo,vendorNo,validFrom,productWeightsList.size());
		return new ResponseEntity<List<ProductWeights>>(productWeightsList, HttpStatus.OK);
	}
	@RequestMapping(value = "/email", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> sendEmail(
			@RequestParam(value = "emailIds", required = true) final List<String> emailIds,
			@RequestParam(value = "emailBody", required = true) final String emailBody,
			@RequestParam(value = "emailSubject", required = true) final String emailSubject){
		LOGGER.info("sendEmail for [emailAddresses: {}]", emailIds);
		final String status = serviceImpl.sendEmail(emailIds,emailBody,emailSubject);
		LOGGER.info("/email {}" ,status);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}	
	//addParamRoleForDualStageWorkflowRequest(roleCode)	
}