package com.nyota.terminal.model;

public abstract class  TerminalTypeAbstract {

    private String name;
    private String cacheSize;
    private String displayPortType;
    private int displayPorts;
    private String formFactor;   
    private String friendlyName;
    private boolean lanCard;
    private int numLanCards;
    private String numOfCores;
    private int numWifiCards;
    private String powerConnector;
    private String processorName;
    private String processorType;
    private String ramManufacturer;
    private String ramSize;
    private String storageManufacturer;
    private int storageSize;
    private String storageType;
    private int usb2Ports;
    private int usb3Ports;
    private String vendor;
    private boolean wifiCard;
    //private String terminalType;

    public abstract String getTerminalType();

    //public abstract void setTerminalType(String terminalType);
    
    public String getCacheSize() {
        return cacheSize;
    }
    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }
    public String getDisplayPortType() {
        return displayPortType;
    }
    public void setDisplayPortType(String displayPortType) {
        this.displayPortType = displayPortType;
    }
    public int getDisplayPorts() {
        return displayPorts;
    }
    public void setDisplayPorts(int displayPorts) {
        this.displayPorts = displayPorts;
    }
    public String getFormFactor() {
        return formFactor;
    }
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
    public String getFriendlyName() {
        return friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }
    public boolean isLanCard() {
        return lanCard;
    }
    public void setLanCard(boolean lanCard) {
        this.lanCard = lanCard;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumLanCards() {
        return numLanCards;
    }
    public void setNumLanCards(int numLanCards) {
        this.numLanCards = numLanCards;
    }
    public String getNumOfCores() {
        return numOfCores;
    }
    public void setNumOfCores(String numOfCores) {
        this.numOfCores = numOfCores;
    }
    public int getNumWifiCards() {
        return numWifiCards;
    }
    public void setNumWifiCards(int numWifiCards) {
        this.numWifiCards = numWifiCards;
    }
    public String getPowerConnector() {
        return powerConnector;
    }
    public void setPowerConnector(String powerConnector) {
        this.powerConnector = powerConnector;
    }
    public String getProcessorName() {
        return processorName;
    }
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }
    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
    public String getRamManufacturer() {
        return ramManufacturer;
    }
    public void setRamManufacturer(String ramManufacturer) {
        this.ramManufacturer = ramManufacturer;
    }
    public String getRamSize() {
        return ramSize;
    }
    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }
    public String getStorageManufacturer() {
        return storageManufacturer;
    }
    public void setStorageManufacturer(String storageManufacturer) {
        this.storageManufacturer = storageManufacturer;
    }
    public int getStorageSize() {
        return storageSize;
    }
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    public String getStorageType() {
        return storageType;
    }
    public void setStorageType(String storageType) {
        this.storageType = storageType;
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
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public boolean isWifiCard() {
        return wifiCard;
    }
    public void setWifiCard(boolean wifiCard) {
        this.wifiCard = wifiCard;
    }


    
    
}
