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
    public void setCantRecurso1(int crec1);
    public void setCantRecurso2(int crec2);
    public void setCantRecurso3(int crec3);
    public void setCapRecurso1(int cprec1);
    public void setCapRecurso2(int cprec2);
    public void setCapRecurso3(int cprec3);
    
    public String getNombre();
    public int getVida();
    public int getCantRecurso1();
    public int getCantRecurso2();
    public int getCantRecurso3();
    public int getCapRecurso1();
    public int getCapRecurso2();
    public int getCapRecurso3();
}
