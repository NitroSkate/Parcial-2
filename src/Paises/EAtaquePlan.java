/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public interface EAtaquePlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCosto1(int c1);
    public void setCosto2(int c2);
    public void setCosto3(int c3);
    public void setTiempoC(int Tiempo);
    
    public String getNombre();
    public int getVida();
    public int getCosto1();
    public int getCosto2();
    public int getCosto3();
    public int getTiempoC();
    
}
