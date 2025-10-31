package com.jsy.lease.web.admin.service.impl;

import com.jsy.lease.model.entity.UserInfo;
import com.jsy.lease.web.admin.mapper.UserInfoMapper;
import com.jsy.lease.web.admin.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author jsy
 * @since 2025-10-31
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
