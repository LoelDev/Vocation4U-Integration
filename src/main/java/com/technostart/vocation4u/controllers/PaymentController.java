package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Payment;
import com.technostart.vocation4u.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping()
    public ArrayList<Payment> getPayments(){
        return paymentService.getPayments();
    }

    @GetMapping(path ="/{id}")
    public Optional<Payment> getPaymentById(@PathVariable("id") Long id){
        return this.paymentService.getById(id);
    }

    @PostMapping()
    public Payment postPayment(@RequestBody Payment payment){
        return this.paymentService.postPayment(payment
        );
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.paymentService.deletePayment(id);
        if(ok){
            return "Se elimino el metodo de pago con id " + id;
        }else{
            return "No se pudo eliminar el metodo de pago con id " + id;
        }
    }
}
