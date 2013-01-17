package com.june.app.service.account.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.june.app.common.CRUDServiceImpl;
import com.june.app.mapper.account.AccountMapper;
import com.june.app.service.account.AccountService;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountServiceImpl.
 */
public class AccountServiceImpl extends CRUDServiceImpl implements AccountService{
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory
			.getLogger(AccountServiceImpl.class);
	
	/** The account mapper. */
	private AccountMapper accountMapper;

	/**
	 * Sets the account mapper.
	 *
	 * @param accountMapper the new account mapper
	 */
	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}
	
}
