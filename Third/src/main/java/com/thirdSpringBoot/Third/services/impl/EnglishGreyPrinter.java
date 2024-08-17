package com.thirdSpringBoot.Third.services.impl;

import com.thirdSpringBoot.Third.services.GreyPrinter;
import org.springframework.stereotype.Component;


@Component
public class EnglishGreyPrinter implements GreyPrinter {
    public String print(){
        return "Grey";
    }
}
