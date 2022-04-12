/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */


package org.demo.orders.application.exception;

import org.demo.orders.application.common.GenericException;

/**
 * Error code
 *
 * @author Telosys
 *
 */
public class CatalogException extends GenericException {

    public CatalogException(ErrorCode errorCode) {
        super(errorCode);
    }

    public CatalogException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}