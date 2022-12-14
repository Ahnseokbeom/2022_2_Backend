package net.skhu.model;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import lombok.Data;

@Data
public class Pagination {
	int pg = 1;
	int sz = 15;
	int si = 0;
	int od = 0;
	int bd = 0;
	String st = "";
	int recordCount;
	
	public String getQueryString() {
		try {
			return String.format("pg=%d&sz=%d&si=%d&od=%d&bd=%d&st=%s", pg, sz, si, od, bd,
					URLEncoder.encode(st, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
