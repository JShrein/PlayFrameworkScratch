package controllers;

import play.Play;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by John on 3/9/2015.
 */
public class HelloWorld extends Controller{
    public static Result index(String name, Integer age)
    {
        return ok(views.html.hello.render(name, age));
    }
}
