package com.thirdSpringBoot.Third.services.impl;

import com.thirdSpringBoot.Third.services.PurplePrinter;
import org.springframework.stereotype.Component;

@Component
public class HindiPurplePrinter implements PurplePrinter {
    public String print(){
        return "बैंगनी";
    }
}
