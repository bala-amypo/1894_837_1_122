package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.DiscountCodeService;
import com.example.demo.model.DiscountCode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountCodeServiceImpl implements DiscountCodeService {

    @Override
    public DiscountCode createDiscountCode(DiscountCode discountCode) {
        return discountCode;
    }

    @Override
    public List<DiscountCode> getAllDiscountCodes() {
        return new ArrayList<>();
    }
}
