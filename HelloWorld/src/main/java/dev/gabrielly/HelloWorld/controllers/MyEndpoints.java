package dev.gabrielly.HelloWorld.controllers;

import dev.gabrielly.HelloWorld.models.Device;
import dev.gabrielly.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyEndpoints
{
    @Autowired
    private MyService myService;

    @GetMapping //http://localhost:8080/test
    public String myFirstGet()
    {
        return "Hello World!";
    }
    @GetMapping("/{myId}")//http://localhost:8080/test/<id>
    public String endpointWithParameter(@PathVariable Integer myId)
    {
        System.out.println(myId);
        return  "HelloWorld" + myId;
    }

    @GetMapping("/v1")//http://localhost:8080/test/v1?value=<?>
    public String endpointWithQuery(@RequestParam Integer value)
    {
        System.out.println(value);
        return "Hello World" + value;
    }
    @PostMapping//http://localhost:8080/test
    public Device myFirstPost(@RequestBody Device device)
    {
        return myService.save(device);
    }
}
