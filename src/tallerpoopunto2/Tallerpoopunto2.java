package tallerpoopunto2;

import javax.swing.JOptionPane;

public class Tallerpoopunto2 {

    Tiquetes ticket1,ticket2,ticket3;
    float costtot;
    
    public static void main(String[] args) {
        
        Tallerpoopunto2 t1 = new Tallerpoopunto2();
        t1.imprimir();
        
    }

    public Tallerpoopunto2() {
        
        ticket1 = new Tiquetes("A 0137",2400000,"07/05/2020","kristtian",1300);
        ticket2 = new Tiquetes("B 0138",2300000,"07/05/2020","Sofia",1300);
        ticket3 = new Tiquetes("C 0138",2100000,"07/05/2020","andres",1300);
        
    }
    
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null,"costo: "+ ticket1.getCost()+"\n"+"Nombre:"+ticket1.getNameP()+"\n"+"Fecha de viaje:"+ticket1.getDate()+"\n"+"numero del viaje:"+ticket1.getNumTravel());
        JOptionPane.showMessageDialog(null,"costo: "+ ticket2.getCost()+"\n"+"Nombre:"+ticket2.getNameP()+"\n"+"Fecha de viaje:"+ticket2.getDate()+"\n"+"numero del viaje:"+ticket2.getNumTravel());
        JOptionPane.showMessageDialog(null,"costo: "+ ticket3.getCost()+"\n"+"Nombre:"+ticket3.getNameP()+"\n"+"Fecha de viaje:"+ticket3.getDate()+"\n"+"numero del viaje:"+ticket3.getNumTravel());
        
        costtot = ((ticket1.getCost()+ticket2.getCost()+ticket3.getCost()));
        
        JOptionPane.showMessageDialog(null,"el total de los viajes vendidos es:"+costtot);
        
    } 
    
    
}
