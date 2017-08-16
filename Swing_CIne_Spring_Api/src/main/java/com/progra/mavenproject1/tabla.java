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
import com.progra.mavenproject1.NewClass;
import com.progra.mavenproject1.pelicula;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class tabla{

   NewClass dao = null;


    public void visualizar(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("idpresentacion");
        dt.addColumn("nombre");
        dt.addColumn("categoria");
        dt.addColumn("idioma");
        dt.addColumn("hora");
        dt.addColumn("sala");
        dt.addColumn("imagen");

        dao = new NewClass();
        pelicula vo = new pelicula();
        ArrayList<pelicula> list = dao.obtenerPeliculas();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getId_presentacion();
                fila[1] = vo.getNombre();
                fila[2] = vo.getCategoria();
                fila[3] = vo.getIdioma();
                fila[4] = vo.getHora();
                fila[5] = vo.getNum_sala();
                try{
                     base64 e= new base64();
        
       BufferedImage image=null;
        try {
            image=e.decodeFileToBase64Binary(vo.getIma());
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
                    
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[6] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
    }
}

