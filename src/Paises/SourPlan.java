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
public interface SourPlan {
    public void setVida(int vida);
    public void setFasesT(int fasest);
    public void setCosto1(int costo1);
    public void setCosto2(int costo2);
    public void setRecurso1(int rec1);
    public void setRecurso2(int rec2);
    public void setRecurso3(int rec3);
    
    public int getVida();
    public int getFasesT();
    public int getCosto1();
    public int getCosto2();
    public int getRecurso1();
    public int getRecurso2();
    public int getRecurso3();
}
