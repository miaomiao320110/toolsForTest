package com.github.rdagent.transformer.intercepter.vo;

import java.util.ArrayList;
import java.util.List;

import com.github.rdagent.annontation.BothUsing;

@BothUsing
public class TraceVo {
	
	private String method = null;
	private String[] parameters = null;
	private String returnValue = null;
	private int deep;
	private long startTime = 0;
	private long endTime = 0;
	private boolean[] coverage = null;
	private List<String> sqlList = new ArrayList<String>();
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getReturnValue() {
		return returnValue;
	}
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
	public String[] getParameters() {
		return parameters;
	}
	public void setParameters(String[] parameters) {
		this.parameters = parameters;
	}
	public int getDeep() {
		return deep;
	}
	public void setDeep(int deep) {
		this.deep = deep;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public boolean[] getCoverage() {
		return coverage;
	}
	public void setCoverage(boolean[] coverage) {
		this.coverage = new boolean[coverage.length];
		for(int i=0;i<coverage.length;i++) {
			this.coverage[i] = coverage[i];
		}
	}
	public List<String> getSqlList() {
		return sqlList;
	}

}
