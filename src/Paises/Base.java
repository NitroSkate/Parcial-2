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
public class Base implements BasePlan {
    private String nombre;
    private int vida; 
    private double crec1, crec2, crec3, cprec1, cprec2, cprec3;
    
    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public void setVida(int vida){
        this.vida=vida;
    }

    @Override
    public void setCantRecurso1(double crec1) {
        this.crec1=crec1;
    }

    @Override
    public void setCantRecurso2(double crec2) {
        this.crec2=crec2;
    }

    @Override
    public void setCantRecurso3(double crec3) {
        this.crec3=crec3;
    }

    @Override 
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getCantRecurso1() {
        return (int) crec1;
    }
    @Override
    public int getCantRecurso2() {
        return (int) crec2;
    }

    @Override
    public int getCantRecurso3() {
        return (int) crec3;
    }

    @Override
    public void setCapRecurso1(double cprec1) {
        this.cprec1=cprec1;
    }

    @Override
    public void setCapRecurso2(double cprec2) {
        this.cprec2=cprec2;
    }

    @Override
    public void setCapRecurso3(double cprec3) {
        this.cprec3=cprec3;
    }

    @Override
    public int getCapRecurso1() {
        return (int) cprec1;
    }

    @Override
    public int getCapRecurso2() {
        return (int) cprec2;
    }

    @Override
    public int getCapRecurso3() {
        return (int) cprec3;
    }
            
}
