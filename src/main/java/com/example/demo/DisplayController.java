package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/display")
public class DisplayController {
    @GetMapping("/name")
    public Map<String, String> getName(){
        Map<String, String> res = new HashMap<>();
        res.put("ngan", "Ngân");
        res.put("ngannguyen", "Ngân Nguyễn");
        res.put("ngan_nguyen", "Ngân Nguyễn");
        res.put("lan", "Lan");
        res.put("lannguyen", "Lan Nguyễn");
        res.put("lan_nguyen", "Lan Nguyễn");
        res.put("ngoclan", "Ngọc Lan");
        res.put("nguyenngan", "Nguyễn Ngân");
        res.put("nga", "Nga");
        res.put("quynhNga", "Quỳnh Nga");
        res.put("nguyenquynhnga", "Nguyễn Quỳnh Nga");
        res.put("thao", "Thảo");
        res.put("thaothao", "Thảo Thảo");
        res.put("khai", "Khải");
        res.put("truong", "Trường");
        res.put("tuyet", "Tuyết");
        res.put("maituyet", "Mai Tuyết");
        res.put("mai", "Mai");
        res.put("phuongmai", "Phương Mai");
        res.put("huyen", "Huyền");
        res.put("khanhhuyen", "Khánh Huyền");
        res.put("hue", "Huệ");
        res.put("duong", "Dương");
        res.put("thuyduong", "Thùy Dương");
        res.put("khanh", "Khánh");
        res.put("vankhanh", "Vân Khánh");
        res.put("van_khanh", "Vân Khánh");

        res.put("quynhanh", "Quỳnh Anh");
        res.put("quynh_anh", "Quỳnh Anh");

        return res;
    }
    @GetMapping("/image")
    public Map<String, String> getImage(){
        Map<String, String> res = new HashMap<>();
        res.put("ngan", "Ngân");
        res.put("ngannguyen", "https://i.imgur.com/s4a6j3S.jpg");
        res.put("ngan_nguyen", "https://i.imgur.com/s4a6j3S.jpg");
        res.put("lan", "Lan");
        res.put("lannguyen", "Lan Nguyễn");
        res.put("lan_nguyen", "Lan Nguyễn");
        res.put("ngoclan", "Ngọc Lan");
        res.put("nguyenngan", "Nguyễn Ngân");
        res.put("nga", "Nga");
        res.put("quynhNga", "Quỳnh Nga");
        res.put("nguyenquynhnga", "Nguyễn Quỳnh Nga");
        res.put("thao", "Thảo");
        res.put("thaothao", "Thảo Thảo");
        res.put("khai", "Khải");
        res.put("truong", "https://i.imgur.com/HGQ9bWS.jpg");
        res.put("tuyet", "Tuyết");
        res.put("maituyet", "https://i.imgur.com/2SFh57t.jpg");
        res.put("mai", "Mai");
        res.put("phuongmai", "https://i.imgur.com/bWGzz0d.jpg");
        res.put("huyen", "Huyền");
        res.put("khanhhuyen", "Khánh Huyền");
        res.put("hue", "Huệ");
        res.put("duong", "Dương");
        res.put("thuyduong", "https://i.imgur.com/FGqbKPU.jpg");
        res.put("khanh", "Khánh");
        res.put("vankhanh", "https://i.imgur.com/cQtbP8c.jpg");
        res.put("van_khanh", "https://i.imgur.com/cQtbP8c.jpg");

        res.put("quynhanh", "Quỳnh Anh");
        res.put("quynh_anh", "Quỳnh Anh");

        return res;
    }
}
