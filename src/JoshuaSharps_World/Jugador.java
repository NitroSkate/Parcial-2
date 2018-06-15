/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoshuaSharps_World;

import java.util.ArrayList;
import java.util.Scanner;
import Paises.*;

/**
 *
 * @author Joshua
 */
public class Jugador {
    public double Mad, Pie, Met;
    public int  Nivel;
    private String nombre;
    
    private ArrayList<Base> baseC = new ArrayList<>();
    private ArrayList<Sourcerer> EdificiosR = new ArrayList<>();
    private ArrayList<EAtaque> EdificiosA = new ArrayList<>();
    
    public void setMad(int Mad){
        this.Mad=Mad;
    }
    
    public int getMad(){
        return (int) Mad;
    }
    
    public void setPie(int Pie){
        this.Pie=Pie;
    }
    
    public int getPie(){
        return (int) Pie;
    }
    
    public void setMet(int Met){
        this.Met=Met;
    }
    
    public int getMet(){
        return (int) Met;
    }
    
    public void setNivel(int Nivel){
        this.Nivel = Nivel;
    }
    
    public int getNivel(){
        return Nivel;
    }
    
    Scanner in = new Scanner(System.in);
    private int pai;
    
    public Jugador(){
    }
    
    public void ElegirPais(){
        System.out.println("Elija una de los 3 paises");
        System.out.println("1. Estados Unidos");
        System.out.println("2. Japon");
        System.out.println("3. Rusia");
        int opc;
        String n;
        Scanner e = new Scanner(System.in);
        opc = in.nextInt();
        boolean f = true;
        while(f){
            switch(opc){
                case 1:
                    pai=1;
                    System.out.println("Eligio a los Gringos.");
                    EeuuFact base = new EeuuFact();
                    System.out.println("Elija el nombre del centro de mando");
                    n=e.nextLine();
                    base.getEeuu("cmusa").build(n);
                    Base c = base.getEeuu("cmusa").getBase();
                    setMad(c.getCantRecurso1());
                    System.out.println("Inicias con: "+getMad()+ " de madera");
                    setPie(c.getCantRecurso2());
                    System.out.println("Inicias con: "+getPie()+ " de piedra");
                    setMet(c.getCantRecurso3());
                    System.out.println("Inicias con: "+getMet()+ " de metal");
                    baseC.add(c);
                    System.out.println("");
                    System.out.println(baseC.get(0).getNombre()+ " es ahora el centro de mando");
                    f=false;
                    break;
                case 2: 
                    pai=2;
                    System.out.println("Eligio a los Nipones.");
                    JaponFact base2 = new JaponFact();
                    System.out.println("Elija el nombre del centro de mando");
                    n=e.nextLine();
                    base2.getJapon("cmjap").build(n);
                    Base c2 = base2.getJapon("cmjap").getBase();
                    setMad(c2.getCantRecurso1());
                    System.out.println("Inicias con: "+getMad()+ " de madera");
                    setPie(c2.getCantRecurso2());
                    System.out.println("Inicias con: "+getPie()+ " de piedra");
                    setMet(c2.getCantRecurso3());
                    System.out.println("Inicias con: "+getMet()+ " de metal");
                    baseC.add(c2);
                    System.out.println("");
                    System.out.println(baseC.get(0).getNombre()+ " es ahora el centro de mando");
                    f=false;
                    break;
                case 3:
                    pai=3;
                    System.out.println("Eligio a la Madre Rusia.");
                    RusiaFact base3 = new RusiaFact();
                    System.out.println("Elija el nombre del centro de mando");
                    n=e.nextLine();
                    base3.getRusia("cmrus").build(n);
                    Base c3 = base3.getRusia("cmrus").getBase();
                    setMad(c3.getCantRecurso1());
                    System.out.println("Inicias con: "+getMad()+ " de madera");
                    setPie(c3.getCantRecurso2());
                    System.out.println("Inicias con: "+getPie()+ " de piedra");
                    setMet(c3.getCantRecurso3());
                    System.out.println("Inicias con: "+getMet()+ " de metal");
                    baseC.add(c3);
                    System.out.println("");
                    System.out.println(baseC.get(0).getNombre()+ " es ahora el centro de mando");
                    f=false;
                    break;
                default:
                    System.out.println("No existe ese pais. Intentelo de nuevo");
                    break;
            }
        }      
    }
    
    public void MenuConstruir(){
        boolean oc = true;
        int Nivel = 0;
        setNivel(Nivel);
        String n;
        while(oc){
            int a;
            Scanner b = new Scanner(System.in);
            System.out.println("");
            System.out.println("1.Construir un edificio");
            System.out.println("2.Mejorar centro de mando");
            System.out.println("3.Recolectar recursos");
            System.out.println("4. Mostrar edificaciones");
            System.out.println("5.Regresar");
            a=b.nextInt();
            switch(a){
                case 1:
                    System.out.println("Edificios posibles a crear ");
                    System.out.println("1. Edificio Recolector de Madera");
                    System.out.println("2. Edificio Recolector de Piedra");
                    System.out.println("3. Edificio Recolector de Metal");
                    System.out.println("4. Barracas de Soldados");
                    System.out.println("5. Fabrica de Tanques");
                    System.out.println("6. Aeropuerto");
                    System.out.println("");
                    System.out.println("Ingrese una opcion: ");
                    int c;
                    c=b.nextInt();
                    if(pai == 1){
                        switch(c){
                            case 1:
                                Scanner v = new Scanner(System.in);
                                EeuuFact aserradero = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v.nextLine();
                                aserradero.getEeuu("aserradero").build(n);
                                Sourcerer as = aserradero.getEeuu("aserradero").getSource();
                                if(getMad()>=as.getCosto1() && getPie()>=as.getCosto2()){
                                    EdificiosR.add(as);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-as.getCosto1());
                                    setPie(getPie()-as.getCosto2());
                                    setMet(getMet()-as.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 2:
                                Scanner v1 = new Scanner(System.in);
                                EeuuFact fabrica = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v1.nextLine();
                                fabrica.getEeuu("fabrica").build(n);
                                Sourcerer fa = fabrica.getEeuu("fabrica").getSource();
                                if(getMad()>=fa.getCosto1() && getPie()>=fa.getCosto2()){
                                    EdificiosR.add(fa);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-fa.getCosto1());
                                    setPie(getPie()-fa.getCosto2());
                                    setMet(getMet()-fa.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 3:
                                Scanner v2 = new Scanner(System.in);
                                EeuuFact fundidora = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v2.nextLine();
                                fundidora.getEeuu("fundidora").build(n);
                                Sourcerer fu = fundidora.getEeuu("fundidora").getSource();
                                if(getMad()>=fu.getCosto1() && getPie()>=fu.getCosto2() && getMet()>=fu.getCosto3()){
                                    EdificiosR.add(fu);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-fu.getCosto1());
                                    setPie(getPie()-fu.getCosto2());
                                    setMet(getMet()-fu.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 4:
                                Scanner v3 = new Scanner(System.in);
                                EeuuFact hqusa = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v3.nextLine();
                                hqusa.getEeuu("hqusa").build(n);
                                EAtaque hq = hqusa.getEeuu("hqusa").getEAtaque();
                                if(getMad()>=hq.getCosto1() && getPie()>=hq.getCosto2() && getMet()>=hq.getCosto3()){
                                    EdificiosA.add(hq);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-hq.getCosto1());
                                    setPie(getPie()-hq.getCosto2());
                                    setMet(getMet()-hq.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 5:
                                Scanner v4 = new Scanner(System.in);
                                EeuuFact fabricatusa = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v4.nextLine();
                                fabricatusa.getEeuu("fabricatusa").build(n);
                                EAtaque fat = fabricatusa.getEeuu("fabricatusa").getEAtaque();
                                if(getMad()>=fat.getCosto1() && getPie()>=fat.getCosto2() && getMet()>=fat.getCosto3()){
                                    EdificiosA.add(fat);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-fat.getCosto1());
                                    setPie(getPie()-fat.getCosto2());
                                    setMet(getMet()-fat.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 6:
                                Scanner v5 = new Scanner(System.in);
                                EeuuFact aeropuertousa = new EeuuFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v5.nextLine();
                                aeropuertousa.getEeuu("aeropuertousa").build(n);
                                EAtaque ae = aeropuertousa.getEeuu("aeropuertousa").getEAtaque();
                                if(getMad()>=ae.getCosto1() && getPie()>=ae.getCosto2() && getMet()>=ae.getCosto3()){
                                    EdificiosA.add(ae);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-ae.getCosto1());
                                    setPie(getPie()-ae.getCosto2());
                                    setMet(getMet()-ae.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                        }   
                    }
                    else if(pai == 2){
                        switch(c){
                            case 1:
                                Scanner v = new Scanner(System.in);
                                JaponFact taladero = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v.nextLine();
                                taladero.getJapon("taladero").build(n);
                                Sourcerer ta = taladero.getJapon("taladero").getSource();
                                if(getMad()>=ta.getCosto1() && getPie()>=ta.getCosto2()){
                                    EdificiosR.add(ta);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-ta.getCosto1());
                                    setPie(getPie()-ta.getCosto2());
                                    setMet(getMet()-ta.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 2:
                                Scanner v1 = new Scanner(System.in);
                                JaponFact maquila = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v1.nextLine();
                                maquila.getJapon("maquila").build(n);
                                Sourcerer ma = maquila.getJapon("maquila").getSource();
                                if(getMad()>=ma.getCosto1() && getPie()>=ma.getCosto2()){
                                    EdificiosR.add(ma);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-ma.getCosto1());
                                    setPie(getPie()-ma.getCosto2());
                                    setMet(getMet()-ma.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 3:
                                Scanner v2 = new Scanner(System.in);
                                JaponFact herradero = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v2.nextLine();
                                herradero.getJapon("herradero").build(n);
                                Sourcerer he = herradero.getJapon("herradero").getSource();
                                if(getMad()>=he.getCosto1() && getPie()>=he.getCosto2() && getMet()>=he.getCosto3()){
                                    EdificiosR.add(he);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-he.getCosto1());
                                    setPie(getPie()-he.getCosto2());
                                    setMet(getMet()-he.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 4:
                                Scanner v3 = new Scanner(System.in);
                                JaponFact hqjap = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v3.nextLine();
                                hqjap.getJapon("hqjap").build(n);
                                EAtaque hq = hqjap.getJapon("hqjap").getEAtaque();
                                if(getMad()>=hq.getCosto1() && getPie()>=hq.getCosto2() && getMet()>=hq.getCosto3()){
                                    EdificiosA.add(hq);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-hq.getCosto1());
                                    setPie(getPie()-hq.getCosto2());
                                    setMet(getMet()-hq.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 5:
                                Scanner v4 = new Scanner(System.in);
                                JaponFact fabricatjap = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v4.nextLine();
                                fabricatjap.getJapon("fabricatjap").build(n);
                                EAtaque fat = fabricatjap.getJapon("fabricatjap").getEAtaque();
                                if(getMad()>=fat.getCosto1() && getPie()>=fat.getCosto2() && getMet()>=fat.getCosto3()){
                                    EdificiosA.add(fat);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-fat.getCosto1());
                                    setPie(getPie()-fat.getCosto2());
                                    setMet(getMet()-fat.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 6:
                                Scanner v5 = new Scanner(System.in);
                                JaponFact aeropuertojap = new JaponFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v5.nextLine();
                                aeropuertojap.getJapon("aeropuertojap").build(n);
                                EAtaque ae = aeropuertojap.getJapon("aeropuertojap").getEAtaque();
                                if(getMad()>=ae.getCosto1() && getPie()>=ae.getCosto2() && getMet()>=ae.getCosto3()){
                                    EdificiosA.add(ae);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-ae.getCosto1());
                                    setPie(getPie()-ae.getCosto2());
                                    setMet(getMet()-ae.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                        }   
                    }
                    
                    else{
                        switch(c){
                            case 1:
                                Scanner v = new Scanner(System.in);
                                RusiaFact bosque = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v.nextLine();
                                bosque.getRusia("bosque").build(n);
                                Sourcerer bo = bosque.getRusia("bosque").getSource();
                                if(getMad()>=bo.getCosto1() && getPie()>=bo.getCosto2()){
                                    EdificiosR.add(bo);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-bo.getCosto1());
                                    setPie(getPie()-bo.getCosto2());
                                    setMet(getMet()-bo.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 2:
                                Scanner v1 = new Scanner(System.in);
                                RusiaFact mezclador = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v1.nextLine();
                                mezclador.getRusia("mezclador").build(n);
                                Sourcerer me = mezclador.getRusia("mezclador").getSource();
                                if(getMad()>=me.getCosto1() && getPie()>=me.getCosto2()){
                                    EdificiosR.add(me);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-me.getCosto1());
                                    setPie(getPie()-me.getCosto2());
                                    setMet(getMet()-me.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 3:
                                Scanner v2 = new Scanner(System.in);
                                RusiaFact metfact = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v2.nextLine();
                                metfact.getRusia("metfact").build(n);
                                Sourcerer met = metfact.getRusia("metfact").getSource();
                                if(getMad()>=met.getCosto1() && getPie()>=met.getCosto2() && getMet()>=met.getCosto3()){
                                    EdificiosR.add(met);
                                    System.out.println(EdificiosR.get(0).getNombre());
                                    setMad(getMad()-met.getCosto1());
                                    setPie(getPie()-met.getCosto2());
                                    setMet(getMet()-met.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 4:
                                Scanner v3 = new Scanner(System.in);
                                RusiaFact hqrus = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v3.nextLine();
                                hqrus.getRusia("hqrus").build(n);
                                EAtaque hq = hqrus.getRusia("hqrus").getEAtaque();
                                if(getMad()>=hq.getCosto1() && getPie()>=hq.getCosto2() && getMet()>=hq.getCosto3()){
                                    EdificiosA.add(hq);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-hq.getCosto1());
                                    setPie(getPie()-hq.getCosto2());
                                    setMet(getMet()-hq.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 5:
                                Scanner v4 = new Scanner(System.in);
                                RusiaFact fabricatrus = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v4.nextLine();
                                fabricatrus.getRusia("fabricatrus").build(n);
                                EAtaque fat = fabricatrus.getRusia("fabricatrus").getEAtaque();
                                if(getMad()>=fat.getCosto1() && getPie()>=fat.getCosto2() && getMet()>=fat.getCosto3()){
                                    EdificiosA.add(fat);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-fat.getCosto1());
                                    setPie(getPie()-fat.getCosto2());
                                    setMet(getMet()-fat.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                            case 6:
                                Scanner v5 = new Scanner(System.in);
                                RusiaFact aeropuertorus = new RusiaFact();
                                System.out.println("Coloque un nombre al edificio: ");
                                n=v5.nextLine();
                                aeropuertorus.getRusia("aeropuertorus").build(n);
                                EAtaque ae = aeropuertorus.getRusia("aeropuertorus").getEAtaque();
                                if(getMad()>=ae.getCosto1() && getPie()>=ae.getCosto2() && getMet()>=ae.getCosto3()){
                                    EdificiosA.add(ae);
                                    System.out.println(EdificiosA.get(0).getNombre());
                                    setMad(getMad()-ae.getCosto1());
                                    setPie(getPie()-ae.getCosto2());
                                    setMet(getMet()-ae.getCosto3());
                                    System.out.println(" Esto te queda de madera: " +getMad());
                                    System.out.println(" Esto te queda de piedra: " +getPie());
                                    System.out.println(" Esto te queda de metal: " +getMet());
                                }
                                else{
                                    System.out.println("No se puede construir el edificio");
                                }
                                break;
                        }
                    }
                    break;
                case 2:
                    MejorarCM();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Seleccione que tipo de edificios");
                    System.out.println("quiere visualizar");
                    System.out.println("1. Recursos");
                    System.out.println("2. Ataque");
                    System.out.println("3. Centro de mando");
                    int e;
                    Scanner en = new Scanner(System.in);
                    e=en.nextInt();
                    switch(e){
                        case 1:
                            if(!EdificiosR.isEmpty()){
                                for(int x=0; x<EdificiosR.size();x++){
                                    System.out.println((x+1)+". "+EdificiosR.get(x).getNombre());
                                }
                            }
                            else{
                                System.out.println("No hay edificios que generan recursos");
                            }
                            break;
                        case 2:
                            if(!EdificiosA.isEmpty()){
                                for(int x=0; x<EdificiosA.size();x++){
                                    System.out.println((x+1)+". "+EdificiosA.get(x).getNombre());
                                }
                            }
                            else{
                                System.out.println("No hay edificios que generan recursos");
                            }
                            break;
                        case 3:
                            for(int x=0; x<baseC.size();x++){
                                    System.out.println((x+1)+". "+baseC.get(x).getNombre());
                                }
                            break;
                    }
                break;
                case 5:
                    oc=false;
                    break;
                }
            }
        }
    
    
    public void MejorarCM(){
        double costo;
        costo = 0.25*(baseC.get(0).getCapRecurso1()+baseC.get(0).getCapRecurso2()+baseC.get(0).getCapRecurso3());
        if(getNivel()==0 && costo/3<=getMad() && costo/3<=getPie() && costo/3<=getMet()){
            setNivel(1);
            setMad((int) (getMad()-costo/3));
            setPie((int) (getPie()-costo/3));
            setMet((int) (getMet()-costo/3));
            baseC.get(0).setCapRecurso1(1.10*baseC.get(0).getCapRecurso1());
            baseC.get(0).setCapRecurso2(1.10*baseC.get(0).getCapRecurso2());
            baseC.get(0).setCapRecurso3(1.10*baseC.get(0).getCapRecurso3());
            System.out.println("La capacidad de madera es ahora de: "+baseC.get(0).getCapRecurso1());
            System.out.println("La capacidad de piedra es ahora de: "+baseC.get(0).getCapRecurso2());
            System.out.println("La capacidad de metal es ahora de: "+baseC.get(0).getCapRecurso3());
            System.out.println("");
            System.out.println("Tu madera actual es de: "+getMad());
            System.out.println("Tu piedra actual es de: "+getPie());
            System.out.println("Tu metal actual es de: "+getMet());
            System.out.println("");
            System.out.println("El centro de mando ahora es Nivel 1");
        }
        else if(getNivel()==1 && costo/3<=getMad() && costo/3<=getPie() && costo/3<=getMet()){
            setNivel(2);
            setMad((int) (getMad()-costo/3));
            setPie((int) (getPie()-costo/3));
            setMet((int) (getMet()-costo/3));
            baseC.get(0).setCapRecurso1(1.30*baseC.get(0).getCapRecurso1());
            baseC.get(0).setCapRecurso2(1.30*baseC.get(0).getCapRecurso2());
            baseC.get(0).setCapRecurso3(1.30*baseC.get(0).getCapRecurso3());
            System.out.println("La capacidad de madera es ahora de: "+baseC.get(0).getCapRecurso1());
            System.out.println("La capacidad de piedra es ahora de: "+baseC.get(0).getCapRecurso2());
            System.out.println("La capacidad de metal es ahora de: "+baseC.get(0).getCapRecurso3());
            System.out.println("");
            System.out.println("Tu madera actual es de: "+getMad());
            System.out.println("Tu piedra actual es de: "+getPie());
            System.out.println("Tu metal actual es de: "+getMet());
            System.out.println("");
            System.out.println("El centro de mando ahora es Nivel 2");
        }
        else if(getNivel()==2 && costo/3<=getMad() && costo/3<=getPie() && costo/3<=getMet()){
            setNivel(3);
            setMad((int) (getMad()-costo/3));
            setPie((int) (getPie()-costo/3));
            setMet((int) (getMet()-costo/3));
            baseC.get(0).setCapRecurso1(1.50*baseC.get(0).getCapRecurso1());
            baseC.get(0).setCapRecurso2(1.50*baseC.get(0).getCapRecurso2());
            baseC.get(0).setCapRecurso3(1.50*baseC.get(0).getCapRecurso3());
            System.out.println("La capacidad de madera es ahora de: "+baseC.get(0).getCapRecurso1());
            System.out.println("La capacidad de piedra es ahora de: "+baseC.get(0).getCapRecurso2());
            System.out.println("La capacidad de metal es ahora de: "+baseC.get(0).getCapRecurso3());
            System.out.println("");
            System.out.println("Tu madera actual es de: "+getMad());
            System.out.println("Tu piedra actual es de: "+getPie());
            System.out.println("Tu metal actual es de: "+getMet());
            System.out.println("");
            System.out.println("El centro de mando ahora es Nivel 3");
        }
        else if(getNivel()>=3){
            System.out.println("El nivel del centro de mando ya esta en el maximo");
        }
        else{
            System.out.println("No tiene los recursos suficientes para subir de nivel");
        }
    }
    
    public boolean Game(){
        if(baseC.isEmpty())
            return true;
        return false;
    }
}
