package com.automobile.experience.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.automobile.experience.main.model.entities.SafetyData;

@CrossOrigin
@RestController
@RequestMapping("/safetyconcerns")
public class SafetyConcernsController {

    @GetMapping
    public List<SafetyData> getSafetyConcerns() {
        List<SafetyData> customerDataList = new ArrayList<>();

        // Adding customer data
        customerDataList.add(new SafetyData("cust000001", 0, 3, 3, 5, 1, "medium"));
        customerDataList.add(new SafetyData("cust000002", 1, 5, 3, 4, 3, "high"));
        customerDataList.add(new SafetyData("cust000003", 0, 5, 10, 9, 2, "medium"));
        customerDataList.add(new SafetyData("cust000004", 0, 5, 2, 0, 3, "medium"));
        customerDataList.add(new SafetyData("cust000005", 0, 5, 2, 7, 0, "medium"));
        customerDataList.add(new SafetyData("cust000006", 0, 4, 8, 5, 1, "low"));
        customerDataList.add(new SafetyData("cust000007", 1, 4, 2, 5, 3, "low"));
        customerDataList.add(new SafetyData("cust000008", 0, 4, 5, 3, 3, "medium"));
        customerDataList.add(new SafetyData("cust000009", 0, 3, 6, 4, 3, "medium"));
        customerDataList.add(new SafetyData("cust000010", 0, 5, 10, 5, 5, "medium"));

        return customerDataList;
    }
}
