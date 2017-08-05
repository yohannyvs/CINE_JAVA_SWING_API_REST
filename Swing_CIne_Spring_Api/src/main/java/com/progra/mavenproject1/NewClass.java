
package com.progra.mavenproject1;

import java.util.Arrays;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

public class NewClass 
{
    private static final String api = "http://localhost:8080/Cine_api_rest_spring/";
    public static RestTemplate restTemplate = new RestTemplate();
    
    public static void main(String args[])
    {
        //hola();
        NewApplication f = new NewApplication();
        //NewJFrame f = new NewJFrame();
        f.show();
        inicio("rt","890");
    }
    
    /*public static void hola() 
    {
        ResponseEntity<prueba[]> response;
        response = restTemplate.getForEntity(api, prueba[].class);

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        
        Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p.getNombre()));
        
    }*/
    
    public static String inicio( String id, String pass) 
    {
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(api+"login?user="+id+"&pass="+pass+"", String.class);

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        String p=response.getBody();
        System.out.println(p);
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p));
         
       return p; 
    }
}
