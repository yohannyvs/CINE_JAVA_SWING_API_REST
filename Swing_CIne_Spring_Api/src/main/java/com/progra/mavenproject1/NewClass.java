
package com.progra.mavenproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

public class NewClass 
{
    private static final String api = "http://localhost:53344/Cine_api_rest_spring/";
    public static RestTemplate restTemplate = new RestTemplate();
    
    public static void main(String args[])
    {
        hola();
        NewJFrame f = new NewJFrame();
        //NewJFrame f = new NewJFrame();
        f.show();
        //inicio("rt","890");
    }
    
    public static void hola() 
    {
        ResponseEntity<pelicula[]> response;
        response = restTemplate.getForEntity(api+"pelicula/", pelicula[].class);
        List<pelicula> list = new ArrayList<>();

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p.getNombre()));
        
        Arrays.asList(response.getBody()).forEach(p -> list.add( new pelicula(
                    p.getId_presentacion(),
                    p.getNombre(),
                    p.getCategoria(),
                    p.getIdioma(),
                    p.getHora(),
                    p.getNum_sala()
            )));
        
        System.out.println(list.get(0).getNombre());
        System.out.println(list.get(0).getIdioma());
        /*for(pelicula p : response.getBody())
        {
            list.add( new pelicula(
                    p.getId_presentacion(),
                    p.getNombre(),
                    p.getCategoria(),
                    p.getIdioma(),
                    p.getHora(),
                    p.getNum_sala()
            ));
            
            System.out.println(list);
        }*/
        
    }
    
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
