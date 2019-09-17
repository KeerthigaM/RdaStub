package com.mns.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

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
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\products.json"));
			resource = new ClassPathResource("json/products.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(categories);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<Product>> token = new TypeToken<List<Product>>(){};
			productList = new Gson().fromJson(jsonArr, token.getType());
			String category = getSingleData(categories);
			String vendor = getSingleData(vendorNo);
			for(Product p: productList){
				p.setCategories(category);
				p.setVendorNo(vendor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public List<Upt> getUpt(String articleNo, String vendorNo, String orderUnit, String validFrom) {
		LOGGER.info("getUpt");
		Reader reader = null;
		List<Upt> uptList = null;
		Resource resource = null;
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\upt.json"));
			resource = new ClassPathResource("json/upt.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<Upt>> token = new TypeToken<List<Upt>>(){};
			uptList = new Gson().fromJson(jsonArr, token.getType());
			String vendor = getSingleData(vendorNo);
			for(Upt u: uptList){
				u.setArticleNo(articleNo);
				u.setVendorNo(vendor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uptList;
	}

	public List<Category> getCategories(String grp_category) {
		LOGGER.info("getCategories");
		Reader reader = null;
		List<Category> categoryList = null;
		Resource resource = null; 
		try{
		//	reader = new FileReader(ResourceUtils.getFile("classpath:json\\categories.json"));
			resource = new ClassPathResource("json/categories.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
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
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\product.json"));
			resource = new ClassPathResource("json/product.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(categories);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");				
			}
			TypeToken<List<Product>> token = new TypeToken<List<Product>>(){};
			productList = new Gson().fromJson(jsonArr, token.getType());
			String category = getSingleData(categories);
			for(Product p: productList){
				p.setCategories(category);
				p.setArticleNo(articleNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	public List<SiteGroup> getSiteGroups(String classType) {
		LOGGER.info("getSiteGroups");
		Reader reader = null;
		List<SiteGroup> SiteGroupList = null;
		Resource resource = null;
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\siteGroups.json"));
			resource = new ClassPathResource("json/siteGroups.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
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
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\supplyChain.json"));
			resource = new ClassPathResource("json/supplyChain.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
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
		Resource resource = null;
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\pendingWorkflows.json"));
			resource = new ClassPathResource("json/pendingWorkflows.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(categories);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<Workflow>> token = new TypeToken<List<Workflow>>(){};
			workflowList = new Gson().fromJson(jsonArr, token.getType());
			String category = getSingleData(categories);
			for(Workflow w: workflowList){
				w.setCategories(category);
			}
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
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\report.json"));
			resource = new ClassPathResource("json/report.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(upc);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<Report>> token = new TypeToken<List<Report>>(){};
			reportList = new Gson().fromJson(jsonArr, token.getType());
			String category = getSingleData(categories);
			String vendor = getSingleData(vendorNo);
			for(Report r: reportList){
				r.setCategories(category);
				r.setVendorNo(vendor);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reportList;
	}

	public List<Vendor> getVendors(String account_grp) {
		LOGGER.info("getVendors");
		Reader reader = null;
		List<Vendor> VendorList = null;
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\vendors.json"));
			resource = new ClassPathResource("json/vendors.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
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
		Resource resource = null;
		try{		
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\equipment.json"));
			resource = new ClassPathResource("json/equipment.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
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
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\equipmentDetails.json"));
			resource = new ClassPathResource("json/equipmentDetails.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<EquipmentDetails>> token = new TypeToken<List<EquipmentDetails>>(){};
			equipmentDetailsList = new Gson().fromJson(jsonArr, token.getType());
			String vendor = getSingleData(vendorNo);
			for(EquipmentDetails e: equipmentDetailsList){
				e.setVendorNo(vendor);
				e.setArticleNo(articleNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return equipmentDetailsList;
	}

	public List<ProductWeights> getProductsWeights(String articleNo, String vendorNo, String validFrom) {
		LOGGER.info("getProductsWeights");
		Reader reader = null;
		List<ProductWeights> ProductWeightsList = null;
		Resource resource = null; 
		try{
			//reader = new FileReader(ResourceUtils.getFile("classpath:json\\productWeights.json"));
			resource = new ClassPathResource("json/productWeights.json");
			reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObj = (JsonObject) jsonParser.parse(reader);
			JsonArray jsonArr = jsonObj.getAsJsonArray(articleNo);
			if (jsonArr == null) {
				jsonArr = jsonObj.getAsJsonArray("ALL");
			}
			TypeToken<List<ProductWeights>> token = new TypeToken<List<ProductWeights>>(){};
			ProductWeightsList = new Gson().fromJson(jsonArr, token.getType());
			String vendor = getSingleData(vendorNo);
			for(ProductWeights p: ProductWeightsList){
				p.setVendorNo(vendor);
				p.setArticleNo(articleNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ProductWeightsList;
	}
	
	private String getSingleData(String data) {
		if(data !=null) {
			if(data.contains(","))
				return data.split(",")[0];
			else 
				return data;
		}else {
			return "";
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream o = new PrintStream(new File("D:\\Users\\886758\\Desktop\\Dummy.txt"));
		String data="553186,553223,553230,553247,553254,553261,553322,553452,553544,553568,553605,553612,553650,553667,553735,553759,553834,553896,556453,556514,545143,553018,553148,553162,553407,553438,553025,553445,553469,553483";
		getData(data,o);
	}

	private static void getData(String data,PrintStream o) throws FileNotFoundException {
		String[] catArr=data.split(",");
			for(int i=0;i<catArr.length;i++){
				System.setErr(o);
				System.out.println("{\"categories\":\"F09\",\"articleNo\":\"000000000020059481\",\"articleDescription\":\"FTO DP WHITE MADEIRA\",\"unitDescription\":\"FTO DP WHITE MADEIRA\",\"upc\":\""+catArr[i]+"\",\"multiSupply\":\"N\",\"vendorName\":\"Avana Bakeries\",\"ragStatus\":\"G\",\"vendorNo\":\"F01501\",\"currency\":\"GBP\",\"workflowStatus\":\"N\",\"requestor\":\"T00S0002\",\"creationDate\":\"2019/09/16\",\"creationTime\":\"21:35:33\",\"workflowId\":\"000017139103\",\"workflowTitle\":\"Equipment Mode Update\",\"reasonCode\":\"UPD\",\"role\":\"BYR\",\"multistage\":\"1\",\"deliveryMethod\":\"R\",\"costPrice\":[{\"fromDate\":\"2019/09/30\",\"endDate\":\"9999/12/31\",\"newCostPrice\":\"10.160\",\"currentCostPrice\":\"0.000\",\"upt\":\"13\",\"orderUnit\":\"O03\"}],\"supplyChain\":[{\"depots\":[{\"siteName\":\"BARNSLEY GIST DEPOT\",\"storeCode\":\"6567\"},{\"siteName\":\"HEMEL GIST DEPOT\",\"storeCode\":\"5966\"},{\"siteName\":\"THATCHAM GIST DEPOT\",\"storeCode\":\"5908\"},{\"siteName\":\"EIRE GIST DEPOT\",\"storeCode\":\"5898\"},{\"siteName\":\"FAVERSHAM GIST DEPOT\",\"storeCode\":\"5652\"},{\"siteName\":\"BRISTOL GIST DEPOT\",\"storeCode\":\"5380\"},{\"siteName\":\"CREWE GIST DEPOT\",\"storeCode\":\"5212\"},{\"siteName\":\"CUMBERNAULD GIST DEPOT\",\"storeCode\":\"5173\"}],\"currentOrderUnit\":\"O02\",\"newOrderUnit\":\"O03\",\"currentUPT\":\"12\",\"newUPT\":\"13\",\"fromDate\":\"2019/09/30\",\"endDate\":\"9999/12/31\",\"siteGroup\":\"ZRDARDC\"}],\"equipment\":[{\"orderUnit\":\"O03\",\"upt\":\"13\",\"fromDate\":\"2019/09/30\",\"endDate\":\"9999/12/31\",\"newEquipmentType\":\"HALF TRAY\",\"newEquipmentSetting\":\"LOW\",\"currentEquipmentType\":\"\",\"currentEquipmentSetting\":\"\"}],\"unitWeight\":[],\"trayWeight\":[]},");
			}
	}
}