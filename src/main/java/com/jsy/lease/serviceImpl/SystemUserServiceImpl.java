package com.jsy.lease.serviceImpl;

import com.jsy.lease.entity.SystemUser;
import com.jsy.lease.mapper.SystemUserMapper;
import com.jsy.lease.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author jsy
 * @since 2025-10-31
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser> implements SystemUserService {

}
