package com.hackathon.enums;

import java.util.Arrays;

public enum AssociateDetailsEnum {

	PRITHWISH(1, "Prithwish Ghosh", "ASID1", "pg", "123", 1), //
	NAUSHAD(2, "MD Naushad Alam", "ASID2", "mna", "123", 2), //
	MANDEEP(3, "Mandeep Ajmani", "ASID3", "ma", "123", 2), //
	SUVADIP(4, "Suvadip Roy Chowdhury", "ASID4", "src", "123", 2), //
	PRITHWIRAJ(5, "Prithwiraj Dey Sikder", "ASID5", "pds", "123", 2);

	private int associateId;
	private String name;
	private String asid;
	private String userID;
	private String userPw;
	private int rollID;

	private AssociateDetailsEnum(int associateId, String name, String asid, String userID, String userPw, int rollID) {
		this.associateId = associateId;
		this.name = name;
		this.asid = asid;
		this.userID = userID;
		this.userPw = userPw;
		this.rollID = rollID;
	}

	public int getAssociateId() {
		return associateId;
	}

	public String getName() {
		return name;
	}

	public String getAsid() {
		return asid;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getRollID() {
		return rollID;
	}

	public void setRollID(int rollID) {
		this.rollID = rollID;
	}

	public static boolean checkByASID(String asid) {
		return Arrays.stream(AssociateDetailsEnum.values()).anyMatch((t) -> t.getAsid().equals(asid));
	}

	public static AssociateDetailsEnum findAssociateByASID(String asid) {

		System.out.println("asid =" + asid);
		return Arrays.stream(AssociateDetailsEnum.values()).filter(obj -> asid.equals(obj.getAsid())).findFirst()
				.orElse(null);
	}

	public static AssociateDetailsEnum findAssociateByAssociateId(int id) {
		return Arrays.stream(AssociateDetailsEnum.values()).filter(obj -> id == obj.getAssociateId()).findFirst()
				.orElse(null);
	}

}
