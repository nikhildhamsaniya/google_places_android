package com.urieljuliatti.googleplaces.query;

import com.urieljuliatti.googleplaces.query.QueryBuilder;

public abstract class Query {

	protected QueryBuilder mQueryBuilder = new QueryBuilder();
	
	public Query() {
		setSensor(false); // Sensor defined as default
	}
	
	public void setSensor(boolean sensor) {
		mQueryBuilder.addParameter("sensor", Boolean.toString(sensor));
	}
	
	public void setLanguage(String language) {
		mQueryBuilder.addParameter("language", language);
	}
	
	public abstract String getUrl();
	
	@Override
	public String toString() {
		return (getUrl() + mQueryBuilder.toString());
	}
}
