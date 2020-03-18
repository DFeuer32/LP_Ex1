
package com.mycompany.ldp;
import java.util.*;

public class Porto {
    private float cargaMax;
    private ArrayList<Navio> Navios;
    
    public Porto(){
        Navios =new ArrayList<Navio>();
        this.cargaMax = 10000;
    }
}
