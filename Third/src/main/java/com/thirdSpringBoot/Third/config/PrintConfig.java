package com.thirdSpringBoot.Third.config;


import com.thirdSpringBoot.Third.services.ColourPrinter;
import com.thirdSpringBoot.Third.services.GreyPrinter;
import com.thirdSpringBoot.Third.services.OrangePrinter;
import com.thirdSpringBoot.Third.services.PurplePrinter;
import com.thirdSpringBoot.Third.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintConfig {

    @Bean
    public GreyPrinter greyPrinter(){
        return new HindiGreyPrinter();
    }
    @Bean
    public OrangePrinter orangePrinter(){
        return new HindiOrangePrinter();
    }
    @Bean
    public PurplePrinter purplePrinter(){
        return new HindiPurplePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(GreyPrinter greyPrinter, OrangePrinter orangePrinter, PurplePrinter purplePrinter){
        return new ColourPrinterImpl(greyPrinter, orangePrinter,purplePrinter);
    }
}
