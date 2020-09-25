package com.example.demo.controller;

import com.example.demo.CommonPath;
import com.example.demo.model.Field2Value;
import com.example.demo.model.ModelV1;
import com.example.demo.model.VersionedModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("api/")
public class QueryApi {

    private final CommonPath service;

    public QueryApi(CommonPath service) {
        this.service = service;
    }

    @PostMapping("/v1/{ignoredForDemo}")
    public void query(@RequestParam("param") String field1,
                      @RequestParam("param2")Field2Value field2Value) {
        // do v1 specific things
        processCommon(new ModelV1(field1, field2Value));
    }

    @PostMapping("/v2/{ignoredForDemo}")
    public void queryV2(@RequestParam("param") String field1) {
        // do v2 specific things
        processCommon(new ModelV2(field1));
    }

    private void processCommon(VersionedModel model) {
        service.process(model);
    }


}
