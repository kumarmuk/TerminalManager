package com.nyota.terminal.model;

public interface TerminalTypeInt {

	public String getName();
	public void setName(String name);
	public String getFriendlyName(); 
	public void setFriendlyName(String friendlyName);
	public String getFormFactor(); 
	public void setFormFactor(String formFactor); 
	public String getVendor();
	public void setVendor(String vendor);
	public String getPowerConnector();
	public void setPowerConnector(String powerConnector);
	public String getProcessorType();
	public void setProcessorType(String processorType);
	public String getProcessorName();
	public void setProcessorName(String processorName); 
	public String getNumOfCores();
	public void setNumOfCores(String numOfCores); 
	public String getCacheSize();
	public void setCacheSize(String cacheSize); 
	public String getRamSize(); 
	public void setRamSize(String ramSize); 
	public String getRamManufacturer(); 
	public void setRamManufacturer(String ramManufacturer); 
	public String getStorageType(); 
	public void setStorageType(String storageType); 
	public int getStorageSize(); 
	public void setStorageSize(int storageSize); 
	public String getStorageManufacturer(); 
	public void setStorageManufacturer(String storageManufacturer);
	public int getUsb2Ports();
	public void setUsb2Ports(int usb2Ports); 
	public int getUsb3Ports();
	public void setUsb3Ports(int usb3Ports); 
	public int getDisplayPorts();
	public void setDisplayPorts(int displayPorts); 
	public String getDisplayPortType(); 
	public void setDisplayPortType(String displayPortType); 
	public boolean isWifiCard(); 
	public void setWifiCard(boolean wifiCard); 
	public int getNumWifiCards(); 
	public void setNumWifiCards(int numWifiCards); 
	public boolean isLanCard(); 
	public void setLanCard(boolean lanCard); 
	public int getNumLanCards(); 
	public void setNumLanCards(int numLanCards); 

}
