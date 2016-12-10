package com.ocean.model;

/**
 * 成绩实体类
 * 
 * @author Ocean
 *
 */
public class Core {
	private String coreId;
	private String coreName;
	private String core;
	private String studentNo;

	public String getCoreId() {
		return coreId;
	}

	public void setCoreId(String coreId) {
		this.coreId = coreId;
	}

	public String getCoreName() {
		return coreName;
	}

	public void setCoreName(String coreName) {
		this.coreName = coreName;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Core [coreId=" + coreId + ", coreName=" + coreName + ", core=" + core + ", studentNo=" + studentNo
				+ "]";
	}

	public Core(String coreId, String coreName, String core, String studentNo) {
		this.coreId = coreId;
		this.coreName = coreName;
		this.core = core;
		this.studentNo = studentNo;
	}

	public Core() {
		
	}

}
