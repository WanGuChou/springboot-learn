package com;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.properties")
public class MyProperties {
	/**
	 * 后置
	 */
	private String  suffix="后缀";
	/**
	 * 前缀
	 */
	private String  prefix="前缀";

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
