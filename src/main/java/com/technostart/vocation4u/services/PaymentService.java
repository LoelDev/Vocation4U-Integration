package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Payment;
import com.technostart.vocation4u.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public ArrayList<Payment> getPayments (){
        return (ArrayList<Payment>) paymentRepository.findAll();
    }

    public Payment postPayment (Payment payment){
        return paymentRepository.save(payment);
    }

    public Optional<Payment> getById(Long id){
        return paymentRepository.findById(id);
    }

    public boolean deletePayment(Long id){
        try {
            paymentRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
