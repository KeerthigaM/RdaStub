package com.mns.service.impl;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Random;

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

@Service
public class RdaStubServiceImpl {
	private static final Logger LOGGER = LoggerFactory.getLogger(RdaStubServiceImpl.class.getName());

	public List<Product> getProducts(final String vendorNo, final String categories) {
		LOGGER.info("getProducts");
		Reader reader = null;
		List<Product> productList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\products.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(categories);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("F33");
			}
			TypeToken<List<Product>> token = new TypeToken<List<Product>>(){};
			productList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	public List<Upt> getUpt(String articleNo, String vendorNo, String orderUnit, String validFrom) {
		LOGGER.info("getUpt");
		Reader reader = null;
		List<Upt> uptList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\upt.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("000000000060051267");
			}
			TypeToken<List<Upt>> token = new TypeToken<List<Upt>>(){};
			uptList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uptList;
	}

	public List<Category> getCategories(String grp_category) {
		LOGGER.info("getCategories");
		Reader reader = null;
		List<Category> categoryList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\categories.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(grp_category);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("FOOD");
			}
			TypeToken<List<Category>> token = new TypeToken<List<Category>>(){};
			categoryList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categoryList;
	}

	public List<Product> getProduct(String articleNo, String categories) {
		LOGGER.info("getProduct");
		Reader reader = null;
		List<Product> productList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\product.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("000000000060010994");
			}
			TypeToken<List<Product>> token = new TypeToken<List<Product>>(){};
			productList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	public List<SiteGroup> getSiteGroups(String classType) {
		LOGGER.info("getSiteGroups");
		Reader reader = null;
		List<SiteGroup> SiteGroupList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\siteGroups.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(classType);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ZFC");
			}
			TypeToken<List<SiteGroup>> token = new TypeToken<List<SiteGroup>>(){};
			SiteGroupList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SiteGroupList;
	}

	public List<SupplyChain> getSupplyChainData(String articleNo, String sitegroup, String classType,String validFrom) {
		LOGGER.info("getSupplyChainData");
		Reader reader = null;
		List<SupplyChain> supplyChainList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\supplyChain.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("000000000060028909");
			}
			TypeToken<List<SupplyChain>> token = new TypeToken<List<SupplyChain>>(){};
			supplyChainList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return supplyChainList;
	}

	public WorkflowCreationMessage triggerWorkflowData(MuleWorkflowRequest wfr) {
		LOGGER.info("triggerWorkflowData");
		WorkflowCreationMessage wcm = new WorkflowCreationMessage();
		wcm.setCreatedBy(wfr.getRequestor());
		wcm.setWorkflowId("0000"+String.valueOf(new Random().nextInt(99999999)));
		wcm.setWorkflowMessage("Workflow Created Successfully");
		return wcm;
	}

	public List<Workflow> getPendingWorkflows(String categories) {
		LOGGER.info("getPendingWorkflows");
		Reader reader = null;
		List<Workflow> workflowList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\pendingWorkflows.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(categories);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("F22");
			}
			TypeToken<List<Workflow>> token = new TypeToken<List<Workflow>>(){};
			workflowList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return workflowList;
	}

	public WorkflowApprovalMessage approveWorkflowData(MuleWorkflowApproval wfa) {
		LOGGER.info("approveWorkflowData");
		WorkflowApprovalMessage wam = new WorkflowApprovalMessage();
		wam.setWorkflowId(wfa.getWorkflowId());
		wam.setWorkflowMessage("Successful Update");
		wam.setWorkflowStatus("Closed");
		return wam;
	}

	public List<Report> getWorkflowReport(String upc, String categories, String vendorNo, String reasonCode,
			String workflowStatus, String backendStatus, String ragStatus, String actionDateFrom, String actionDateTo,
			String actionTimeFrom, String actionTimeTo, String roleCode) {
		LOGGER.info("getWorkflowReport");
		Reader reader = null;
		List<Report> reportList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\report.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(upc);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("117968");
			}
			TypeToken<List<Report>> token = new TypeToken<List<Report>>(){};
			reportList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reportList;
	}

	public List<Vendor> getVendors(String account_grp) {
		LOGGER.info("getVendors");
		Reader reader = null;
		List<Vendor> VendorList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\vendors.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(account_grp);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("FOOD");
			}
			TypeToken<List<Vendor>> token = new TypeToken<List<Vendor>>(){};
			VendorList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return VendorList;
	}

	public List<Equipment> getEquipment() {
		LOGGER.info("getEquipment");
		Reader reader = null;
		List<Equipment> equipmentList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\equipment.json"));
			TypeToken<List<Equipment>> token = new TypeToken<List<Equipment>>(){};
			equipmentList = new Gson().fromJson(reader, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return equipmentList;
	}

	public List<EquipmentDetails> getEquipmentDetails(String articleNo, String vendorNo, String validFrom, String orderUnit) {
		LOGGER.info("getEquipmentDetails");
		Reader reader = null;
		List<EquipmentDetails> equipmentDetailsList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\equipmentDetails.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("000000000060121523");
			}
			TypeToken<List<EquipmentDetails>> token = new TypeToken<List<EquipmentDetails>>(){};
			equipmentDetailsList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return equipmentDetailsList;
	}

	public List<ProductWeights> getProductsWeights(String articleNo, String vendorNo, String validFrom) {
		LOGGER.info("getProductsWeights");
		Reader reader = null;
		List<ProductWeights> ProductWeightsList = null;
		try {
			reader = new FileReader(ResourceUtils.getFile("classpath:json\\productWeights.json"));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("000000000060121523");
			}
			TypeToken<List<ProductWeights>> token = new TypeToken<List<ProductWeights>>(){};
			ProductWeightsList = new Gson().fromJson(jsonArr, token.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ProductWeightsList;
	}

	public String sendEmail(String emailIds, String emailBody, String emailSubject) {
		return "Mail Sent!!";
	}
}