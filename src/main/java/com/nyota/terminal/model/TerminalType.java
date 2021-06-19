package com.nyota.terminal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public abstract class TerminalType {


	private String name;
	private String vendor;
	@Indexed(unique = true)
	private String serialNumber;
	private String macAddress;
	private String powerConnector;

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


	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getPowerConnector() {
		return powerConnector;
	}

	public void setPowerConnector(String powerConnector) {
		this.powerConnector = powerConnector;
	}

}
