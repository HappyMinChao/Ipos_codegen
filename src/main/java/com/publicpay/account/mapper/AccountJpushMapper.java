package com.publicpay.account.mapper;

import com.publicpay.account.beans.bo.AccountJpush;

public interface AccountJpushMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccountJpush record);

    int insertSelective(AccountJpush record);

    AccountJpush selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccountJpush record);

    int updateByPrimaryKey(AccountJpush record);
}