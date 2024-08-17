package com.thirdSpringBoot.Third.services.impl;

import com.thirdSpringBoot.Third.services.ColourPrinter;
import com.thirdSpringBoot.Third.services.GreyPrinter;
import com.thirdSpringBoot.Third.services.OrangePrinter;
import com.thirdSpringBoot.Third.services.PurplePrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private GreyPrinter greyPrinter;
    private OrangePrinter orangePrinter;
    private PurplePrinter purplePrinter;
    public ColourPrinterImpl(GreyPrinter greyPrinter, OrangePrinter orangePrinter, PurplePrinter purplePrinter){
        this.greyPrinter = greyPrinter;
        this.orangePrinter = orangePrinter;
        this.purplePrinter = purplePrinter;
    }

    public String print(){
        return String.join(", ",greyPrinter.print(), orangePrinter.print(),purplePrinter.print());
    }
}
