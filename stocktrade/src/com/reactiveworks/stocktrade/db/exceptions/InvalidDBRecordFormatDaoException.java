package com.reactiveworks.stocktrade.db.exceptions;

/**
 * Represents the exceptions related to invalid stockTrade information.
 */
public class InvalidDBRecordFormatDaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "invalid format";
	}

	public InvalidDBRecordFormatDaoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDBRecordFormatDaoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidDBRecordFormatDaoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDBRecordFormatDaoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidDBRecordFormatDaoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDBRecordFormatDaoException(String message, Exception e) {
		super(message, e);
		// TODO Auto-generated constructor stub
	}

}
