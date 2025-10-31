package com.jsy.lease.serviceImpl;

import com.jsy.lease.entity.PaymentType;
import com.jsy.lease.mapper.PaymentTypeMapper;
import com.jsy.lease.service.PaymentTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付方式表 服务实现类
 * </p>
 *
 * @author jsy
 * @since 2025-10-31
 */
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType> implements PaymentTypeService {

}
