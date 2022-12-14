package com.excercise.springmicroervice.currencyconversionservice.proxy;

import com.excercise.springmicroervice.currencyconversionservice.dto.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion calculateConversion(@PathVariable String from, @PathVariable String to);
}
