package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BannerController {
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/banners")
    public HashMap getBanner(@RequestParam(value = "src") String src) {
        HashMap res = new HashMap();
        ArrayList<Banner> list = new ArrayList<Banner>();
        list.add(new Banner(counter.incrementAndGet(), src));

        res.put("code", 0);
        res.put("data", list);
        res.put("msg", "ok");
        return res;
    }
}
