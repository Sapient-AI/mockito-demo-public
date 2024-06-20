package demo.mockito;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody
    String greeting() {
        return null;
    }

    @RequestMapping("/findById/{id}")
    public @ResponseBody
    User findById(@PathVariable("id") String id) {
        User user = service.findById(id);
        return null;
    }

    public Integer bhuvanTest(Integer a, Integer b, Integer c) {
        /*if (a<b) {
            return a;
        } else if (a > b || c == b) {
            return b;
        } else if (a == 0) {
            return a;
        } else {
            return null;
        }*/
        return null;
    }

    public double add2dasda(double a, double b) {
        return a * b;
    }

    public double testregeneratenewpath(double a, double b) {
        return a + b;
    }

    public double testrfsdegeneratenewpath(double a, double b) {
        return a + b;
    }

    public double add1(double a, double b) {
        return a + b;
    }

    public double add2(double a, double b) {
        return a * b * a;
    }

    public double add3(double a, double b) {
        if(a > b)
            return a + b;
        else
            return 0;
    }

    public double bhuvanadd(double a, double b) {
        if(a > b)
            return a + b;
        else
            return 0;
    }

    public double add4(double a, double b) {
            return 0;
    }

    public Object bhuvanFinalTest(double a, double b) {
        if (a < b) {
            return a;
        } else if ( b > a) {
            return b;
        }
        else {
            return a+b;
        }
    }

    public double bhuvanNewTest(double a, double b) {
        return 0;
    }

    @RequestMapping("/throwsNotTreatedException")
    public void throwsNotTreatedException() {
        throw new IllegalArgumentException("Illegal Argument", new Exception("Not Treated Exception"));
    }

    @SuppressWarnings("SameReturnValue")
    @RequestMapping("/findById2/{id1}/{id3}")
    public @ResponseBody
    User findByIdWithMoreParameters(@PathVariable("id1") String id1, String id2, @PathVariable("id3") String id3) {
        return null;
    }

    @RequestMapping("/all")
    public @ResponseBody
    List<User> findAll() {
        return null;
    }

    @RequestMapping("/allIds")
    public @ResponseBody
    List<String> findAllIds() {
        return service.findAllIds();
    }

    @PostMapping("/create")
    public void create(@RequestBody User userCreate) {
        service.create(userCreate);
    }

    @PostMapping("/update")
    public void update(@RequestBody User userUpdate) {
        service.update(userUpdate);
    }

}

