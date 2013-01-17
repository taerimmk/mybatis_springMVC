package com.june.app.service.contact.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.june.app.common.CRUDServiceImpl;
import com.june.app.mapper.contact.ContactMapper;
import com.june.app.service.contact.ContactService;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountServiceImpl.
 */
public class ContactServiceImpl extends CRUDServiceImpl implements ContactService{
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory
			.getLogger(ContactServiceImpl.class);
	
	/** The account mapper. */
	private ContactMapper contactMapper;

	/**
	 * Sets the account mapper.
	 *
	 * @param accountMapper the new account mapper
	 */
	public void setContactMapper(ContactMapper contactMapper) {
		this.contactMapper = contactMapper;
	}
	
}
