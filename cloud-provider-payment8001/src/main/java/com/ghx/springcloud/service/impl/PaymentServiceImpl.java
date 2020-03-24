package com.ghx.springcloud.service.impl;

//PaymentServiceImpl
import com.ghx.springcloud.dao.PaymentDao;
import com.ghx.springcloud.entities.Payment;
import com.ghx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
