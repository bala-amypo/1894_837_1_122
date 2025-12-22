package com.example.demo.Service.ServiceImplementation;

import com.example.demo.Service.RoiService;
import com.example.demo.model.RoiReport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoiServiceImpl implements RoiService {

    @Override
    public List<RoiReport> getAllReports() {
        return new ArrayList<>();
    }
}
