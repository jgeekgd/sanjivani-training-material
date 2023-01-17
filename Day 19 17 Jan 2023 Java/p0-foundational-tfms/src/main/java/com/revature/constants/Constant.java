package com.revature.constants;

public class Constant{
	public static final String SELECT_ALL_QUERY="SELECT `LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED` FROM `gd`.`authentication` ";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED` FROM `gd`.`authentication` WHERE `LOGIN_ID`=? ";
	public static final String INSERT_QUERY="INSERT INTO `gd`.`authentication` (`LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED`) VALUES (?,?,?) ";
	public static final String UPDATE_QUERY="UPDATE `gd`.`authentication` SET `PASSWORD`=? , `LAST_MODIFIED`=? WHERE `LOGIN_ID`=? ";
	public static final String DELETE_QUERY="DELETE FROM `gd`.`authentication` WHERE `LOGIN_ID`=? ";
	private Constant() {}
}
