package com.planner.user.model.vo;

public class User {

	
	private int userNo;
	private String id;
	private String userKey;
	private String name;
	private String nickname;
	private String gender;
	private String birth;
	private String grade;
	private String status;
	private String enterDate;
	private String modifyDate;
	
	public User() {
		
	}
	
	public User(int userNo, String id, String userKey, String name, String nickname, String gender, String birth,
			String grade, String status, String enterDate, String modifyDate) {
		super();
		this.userNo = userNo;
		this.id = id;
		this.userKey = userKey;
		this.name = name;
		this.nickname = nickname;
		this.gender = gender;
		this.birth = birth;
		this.grade = grade;
		this.status = status;
		this.enterDate = enterDate;
		this.modifyDate = modifyDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
	
	
	
	
	
	
	
	
}
