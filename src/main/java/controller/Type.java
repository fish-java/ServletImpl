package controller;

import entities.Monkey;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping(value = "/json",consumes = "application/json")
    public String jsonType(@RequestBody(required = false) Monkey monkey){
        return "master name: " + monkey.getName();
    }

    @GetMapping("/map")
    public Map<String, String> mapType(){
        Map map = new HashMap<String, String>();
        map.put("name", "Jon Snow");
        return map;
    }
}
