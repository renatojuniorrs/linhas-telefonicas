/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

/**
 *
 * @author RGrupos
 */
public class Phone {
    private String phone;
    private Integer phoneDDD;
    private Coordinates coordinate;
    private Date waitingSince;
    
    public Phone(String p){
        DDD ddd = new DDD();
        waitingSince = new Date();
        phone = p;
        try{
            phoneDDD = Integer.parseInt(p.substring(0, 2));
            coordinate = ddd.getCoordinate(phoneDDD);
        }catch(Exception ex){}
    }
    
    // função que calcula o custo da ligação a partir da distância.
    public double getCost(){
        // Considerando R$1,05 por minuto por KM 
        double costPerKMPerMin = 0.00031992687;
        // Tempo de espera no telefone
        double waiting = new Date().getTime()/1000;
        waiting = waiting - (waitingSince.getTime()/1000);
        waiting = waiting/60;
        DDD ddd = new DDD();
        // Distancia da ligação do DDD 19
        double distantce = coordinate.distance(ddd.getCoordinate(19));
        // Custo total da ligação
        double cost = ((costPerKMPerMin * distantce + 0.01) * waiting);
        
        return cost;
    }
    
    public String getFormatedPhone(){
        return phone;
    }
    
    public String getDDD(){
        return phone.substring(0, 2);
    }
    
    @Override
    public String toString(){
        return phone;
    }
}
