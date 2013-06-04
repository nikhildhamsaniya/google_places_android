package com.urieljuliatti.googleplaces.query;

import com.urieljuliatti.googleplaces.query.SearchQuery;

public class TextSearchQuery extends SearchQuery {

	public TextSearchQuery(String query) {
		setQuery(query);
	}
	
	public void setQuery(String query) {
		mQueryBuilder.addParameter("query", query);
	}

	@Override
	public String getUrl() {
		return "https://maps.googleapis.com/maps/api/place/textsearch/json";
	}
}
