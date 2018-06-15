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
public interface BasePlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCantRecurso1(double crec1);
    public void setCantRecurso2(double crec2);
    public void setCantRecurso3(double crec3);
    public void setCapRecurso1(double cprec1);
    public void setCapRecurso2(double cprec2);
    public void setCapRecurso3(double cprec3);
    
    public String getNombre();
    public int getVida();
    public int getCantRecurso1();
    public int getCantRecurso2();
    public int getCantRecurso3();
    public int getCapRecurso1();
    public int getCapRecurso2();
    public int getCapRecurso3();
}
