package com.app.servicecurrency;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/** before ribbon
@FeignClient(name = "forex-service", url = "localhost:8000")
**/
/**using with ribbon **/
@FeignClient(name = "forex-service")
@RibbonClient(name = "forex-service")
public interface CurrencyExchangeServiceProxy {

    @GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveValue(@PathVariable("from") String from, @PathVariable("to") String to);


}
