package com.thirdSpringBoot.Third.services.impl;

import com.thirdSpringBoot.Third.services.OrangePrinter;
import org.springframework.stereotype.Service;


@Service
public class HindiOrangePrinter implements OrangePrinter {
    public String print(){
        return "नारंगी";
    }
}
