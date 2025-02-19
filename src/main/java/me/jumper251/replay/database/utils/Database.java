package me.jumper251.replay.database.utils;

import java.sql.PreparedStatement;

public abstract class Database {

    protected String host;
    protected int port;
    protected String database;
    protected String user;
    protected String password;
    
    public Database(String host, int port, String database, String user, String password) {
    		this.host = host;
            this.port = port;
    		this.database = database;
    		this.user = user;
    		this.password = password;
    		
    		connect();
    }
    
    public abstract void connect(); 
    
    public abstract void disconnect();
    
    public abstract DatabaseService getService();

    public abstract String getDataSourceName();

    public abstract void update(PreparedStatement pst);
	
	public abstract void update(String qry);

    public String getDatabase() {
        return this.database;
    }
}
