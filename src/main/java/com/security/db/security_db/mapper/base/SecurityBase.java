/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5e55338952a8e9561a0d078c
*
* You will get 10% discount for each one of your friends
* 
*/
package com.security.db.security_db.mapper.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;
import com.security.db.security_db.mapper.Security;

public class SecurityBase implements RowMapper<Security>{
	
	private Long _id;
	
	// Attributes
	private Number Distance;
	private String Name;
	private String Place;
	
	
	// Relations Security
	private String Security;
	
	
	
	// Relations m:m Search
	private ArrayList<Long> Search;
	
	
	@Override
	public Security mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Security obj = new Security();
		try {
			obj.set_id(rs.getLong("id"));
			
			obj.setDistance(rs.getDouble("Distance"));
			obj.setName(rs.getString("Name"));
			obj.setPlace(rs.getString("Place"));
			
        	
        	// Relations 1:m Security
			obj.setSecurity(rs.getString("Security"));
        	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}


	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}


	public Number getDistance() {
		return Distance;
	}


	public void setDistance(Number Distance) {
		this.Distance = Distance;
	}
	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}
	public String getPlace() {
		return Place;
	}


	public void setPlace(String Place) {
		this.Place = Place;
	}

	
    
    // Relations 1:m Security
	public String getSecurity() {
		return Security;
	}

	public void setSecurity(String Security) {
		this.Security = Security;
	}
    
    
    
    
    // Relations m:m Search
	public ArrayList<Long> getSearch() {
		return Search;
	}

	public void setSearch(ArrayList<Long> Search) {
		this.Search = Search;
	}
	
	
	public static class Security_Search implements RowMapper<Security_Search>{
		
		private Long _id;
		
		// Relations
	
		private Long id_Security;
		private Long id_Security;
				
		
		@Override
		public Security_Search mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Security_Search obj = new Security_Search();
			try {
				obj.set_id(rs.getLong("id"));
				obj.setId_Security(rs.getLong("id_Security"));
				obj.setId_Security(rs.getLong("id_Security"));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
	
	
		public Long get_id() {
			return _id;
		}
	
		public void set_id(Long _id) {
			this._id = _id;
		}
	
		public Long getId_Security() {
			return id_Security;
		}
	
	
		public void setId_Security(Long id_Security) {
			this.id_Security = id_Security;
		}
	
	
		public Long getId_Security() {
			return id_Security;
		}
	
	
		public void setId_Security(Long id_Security) {
			this.id_Security = id_Security;
		}
		
		
	}
    
    
}