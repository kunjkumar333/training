package com.coforge.training.mockitodemo;

public class RecordService {
	
	DatabaseDao database;
	NetworkDao network;
	public DatabaseDao getDatabsedao() {
		return database;
	}
	public void setDatabsedao(DatabaseDao database) {
		this.database = database;
	}
	public NetworkDao getNetworkdao() {
		return network;
	}
	public void setNetworkdao(NetworkDao network) {
		this.network = network;
	}
	public boolean save(String fileName)
	{
	database.save(fileName);
	System.out.println("Saved in database in Main class");

	network.save(fileName);
	System.out.println("Saved in network in Main class");

	return true;
	}

}
