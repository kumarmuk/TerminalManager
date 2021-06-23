package com.nyota.terminal.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyota.terminal.data.obj.TerminalDAO;

public abstract class TerminalType {

	private String name;
	private String vendor;
	private String powerConnector;
	private String processorType; // Intel, AMD, ARM
	private String processorName;
	private String numOfCores;
	private String cacheSize;
	private String ramSize;
	private String ramManufacturer;
	private String storageType; // HDD or SDD
	private int storageSize;
	private String storageManufacturer;
	private int usb2Ports;
	private int usb3Ports;
	private int displayPorts;
	private String displayPortType; // HDMI / Serial
	private boolean wifiCard;
	private int numWifiCards;
	private boolean lanCard;
	private int numLanCards;

	/*
	 * public String getTtId() { return ttId; } public void setTtId(String ttId) {
	 * this.ttId = ttId; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getPowerConnector() {
		return powerConnector;
	}

	public void setPowerConnector(String powerConnector) {
		this.powerConnector = powerConnector;
	}

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getNumOfCores() {
		return numOfCores;
	}

	public void setNumOfCores(String numOfCores) {
		this.numOfCores = numOfCores;
	}

	public String getCacheSize() {
		return cacheSize;
	}

	public void setCacheSize(String cacheSize) {
		this.cacheSize = cacheSize;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getRamManufacturer() {
		return ramManufacturer;
	}

	public void setRamManufacturer(String ramManufacturer) {
		this.ramManufacturer = ramManufacturer;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	public String getStorageManufacturer() {
		return storageManufacturer;
	}

	public void setStorageManufacturer(String storageManufacturer) {
		this.storageManufacturer = storageManufacturer;
	}

	public int getUsb2Ports() {
		return usb2Ports;
	}

	public void setUsb2Ports(int usb2Ports) {
		this.usb2Ports = usb2Ports;
	}

	public int getUsb3Ports() {
		return usb3Ports;
	}

	public void setUsb3Ports(int usb3Ports) {
		this.usb3Ports = usb3Ports;
	}

	public int getDisplayPorts() {
		return displayPorts;
	}

	public void setDisplayPorts(int displayPorts) {
		this.displayPorts = displayPorts;
	}

	public String getDisplayPortType() {
		return displayPortType;
	}

	public void setDisplayPortType(String displayPortType) {
		this.displayPortType = displayPortType;
	}

	public boolean isWifiCard() {
		return wifiCard;
	}

	public void setWifiCard(boolean wifiCard) {
		this.wifiCard = wifiCard;
	}

	public int getNumWifiCards() {
		return numWifiCards;
	}

	public void setNumWifiCards(int numWifiCards) {
		this.numWifiCards = numWifiCards;
	}

	public boolean isLanCard() {
		return lanCard;
	}

	public void setLanCard(boolean lanCard) {
		this.lanCard = lanCard;
	}

	public int getNumLanCards() {
		return numLanCards;
	}

	public void setNumLanCards(int numLanCards) {
		this.numLanCards = numLanCards;
	}

	public String toJsonString() throws JsonProcessingException {
		ObjectMapper objMapper = new ObjectMapper();
		String jsonInString = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
		return jsonInString;
	}

	public abstract TerminalDAO toTerminalDAO();

}
