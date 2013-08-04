package br.com.tutorial.controller;
 
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {
     
    @PostConstruct
    public void init(){
        System.out.println(" Bean executado! ");
    }
     
    public String getMessage(){
        return "Hello World JSF!";
    }
 
}
