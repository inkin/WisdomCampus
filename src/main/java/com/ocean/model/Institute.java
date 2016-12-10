package com.ocean.model;

/**
 * 学院及专业实体类
 */
public class Institute {
	private String instituteNo;
	private String instituteName;
	private String profession;

	public String getInstituteNo() {
		return instituteNo;
	}

	public void setInstituteNo(String instituteNo) {
		this.instituteNo = instituteNo;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Institute [instituteNo=" + instituteNo + ", instituteName=" + instituteName + ", profession="
				+ profession + "]";
	}

	public Institute(String instituteNo, String instituteName, String profession) {
		this.instituteNo = instituteNo;
		this.instituteName = instituteName;
		this.profession = profession;
	}

	public Institute() {

	}

}
