/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.mavenproject1;

/**
 *
 * @author ADRIA
 */


import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.File;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;


public class base64 {
    
    public String encodeFileToBase64Binary(File file){
            String encodedfile = null;
            try {
                FileInputStream fileInputStreamReader = new FileInputStream(file);
                byte[] bytes = new byte[(int)file.length()];
                fileInputStreamReader.read(bytes);
                 encodedfile = Base64.getEncoder().encodeToString(bytes);
            }catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        // TODO Auto-generated catch block

            return encodedfile;
    }
    
    public BufferedImage decodeFileToBase64Binary(String encode) throws IOException{

            String base64Image = encode;
           byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Image);
           BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageBytes));
                 //ImageIcon icon= new ImageIcon(img);

        return img;
    }
    
}
