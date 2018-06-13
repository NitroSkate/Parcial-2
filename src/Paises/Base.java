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
    private int vida;
    private int crec1, crec2, crec3, cprec1, cprec2, cprec3;
    
    @Override
    public void setVida(int vida){
        this.vida=vida;
    }

    @Override
    public void setCantRecurso1(int crec1) {
        this.crec1=crec1;
    }

    @Override
    public void setCantRecurso2(int crec2) {
        this.crec2=crec2;
    }

    @Override
    public void setCantRecurso3(int crec3) {
        this.crec3=crec3;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getCantRecurso1() {
        return crec1;
    }
    @Override
    public int getCantRecurso2() {
        return crec2;
    }

    @Override
    public int getCantRecurso3() {
        return crec3;
    }

    @Override
    public void setCapRecurso1(int cprec1) {
        this.cprec1=cprec1;
    }

    @Override
    public void setCapRecurso2(int cprec2) {
        this.cprec2=cprec2;
    }

    @Override
    public void setCapRecurso3(int cprec3) {
        this.cprec3=cprec3;
    }

    @Override
    public int getCapRecurso1() {
        return cprec1;
    }

    @Override
    public int getCapRecurso2() {
        return cprec2;
    }

    @Override
    public int getCapRecurso3() {
        return cprec3;
    }
            
}
