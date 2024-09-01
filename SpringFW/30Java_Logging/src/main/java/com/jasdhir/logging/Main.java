package com.jasdhir.logging;

import java.util.logging.Logger;

public class Main {
public static void main(String[] args) {
	final Logger LOGGER = Logger.getLogger(Main.class.getName());

	AccountDAO dao=new AccountDAO();
	LOGGER.info("Calling Account DAO  add Account Method");
	dao.addAccount();
	LOGGER.info("Calling Account DAO  add Account Method Finished");
}
}
