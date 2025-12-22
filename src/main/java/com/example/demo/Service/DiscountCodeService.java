package com.example.demo.Service;

import com.example.demo.model.DiscountCode;
import java.util.List;

public interface DiscountCodeService {

    DiscountCode createDiscountCode(DiscountCode discountCode);

    List<DiscountCode> getAllDiscountCodes();
}
