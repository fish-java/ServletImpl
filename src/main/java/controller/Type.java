package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/type")
public class Type {
    @GetMapping("/int")
    public String intType(@RequestParam(required = false) int id){
        return "id: " + id;
    }

    @GetMapping("/integer")
    public String integerType(@RequestParam(required = false) Integer id){
        return "id: " + id;
    }

    @GetMapping("/array")
    public String arrayType(@RequestParam(value = "name") String[] names){
        StringBuffer stringBuffer = new StringBuffer();
        for(String name : names){
            stringBuffer.append(name);
        }
        return "names: " + stringBuffer;
    }
}
