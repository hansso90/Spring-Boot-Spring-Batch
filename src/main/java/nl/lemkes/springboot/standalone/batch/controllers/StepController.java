package nl.lemkes.springboot.standalone.batch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hans on 6-9-2016.
 */
@Controller
@RequestMapping("/step")
public class StepController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public void status()
    {

    }
}
