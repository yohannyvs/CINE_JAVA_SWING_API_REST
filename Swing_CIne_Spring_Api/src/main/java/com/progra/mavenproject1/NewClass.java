
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
    private static final String api = "http://localhost:8080/Cine_api_rest_spring/";
    public static RestTemplate restTemplate = new RestTemplate();
    
    public static void main(String args[])
    {
        
        NewJFrame f = new NewJFrame();
        
        f.show();
       
        //inicio("rt","890");
    }
    
    public ArrayList<pelicula> obtenerPeliculas() 
    {
        ResponseEntity<pelicula[]> response;
        response = restTemplate.getForEntity(api+"pelicula/", pelicula[].class);
        ArrayList<pelicula> list = new ArrayList<>();

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
                    p.getNum_sala(),
                    p.getIma()
            )));
        
        System.out.println(list.get(0).getNombre());
        System.out.println(list.get(0).getIma());
        
        return list;
        
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
    
    
    public ArrayList<String> obtenerAsientos(String idpresentacion) 
    {
        ResponseEntity<String[]> response;
        response = restTemplate.getForEntity(api+"acientos?presentacion="+idpresentacion+"", String[].class);
        ArrayList<String> list = new ArrayList<>();

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p.getNombre()));

        Arrays.asList(response.getBody())
            .forEach(n -> list.add(n));
        

        
        return list;
    }
    public static String agregarPeli(String nom, String cate, String idi, String ima) 
    {
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(api+"add_pelicula?nombre="+nom+"&categoria="+cate+"&idioma="+idi+"&img="+ima+"", String.class);

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        String p=response.getBody();
        System.out.println(p);
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p));
         
       return p; 
    }
    
     public static String agregarPresentacion(int id, String hora, String sala) 
    {
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(api+"add_presentacion?pelicula="+id+"&hora="+hora+"&sala="+sala+"", String.class);

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        String p=response.getBody();
        System.out.println(p);
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p));
         
       return p; 
    }
     
      public String compra(String admin, int id_presen, int acient,String cedula) 
    {
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(api+"compra?admin="+admin+"&id_present="+id_presen+"&aciento="+acient+"&cedula"+cedula+"", String.class);

        System.out.println();
        System.out.println("GET All StatusCode = " + response.getStatusCode());
        System.out.println("GET All Headers = " + response.getHeaders());
        System.out.println("GET Body (object list): ");
        String p=response.getBody();
        System.out.println(p);
        //Arrays.asList(response.getBody()).forEach(p -> System.out.println("--> " + p));
         
       return p; 
    }
      
      public String pago(int num_fact, int num_tar, String fecha,String num_seg) 
    {
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(api+"pago?num_fact="+num_fact+"&num_tar="+num_tar+"&fecha="+fecha+"&num_seg"+num_seg+"", String.class);

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
