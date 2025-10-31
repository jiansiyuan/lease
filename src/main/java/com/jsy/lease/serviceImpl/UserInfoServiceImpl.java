package com.jsy.lease.serviceImpl;

import com.jsy.lease.entity.UserInfo;
import com.jsy.lease.mapper.UserInfoMapper;
import com.jsy.lease.service.UserInfoService;
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
