package project15;

import java.util.LinkedList;

public class Operacion {

    public double seleccionarOperacion(int operacion, double operandoUno, double operandoDos) {
        double resultado = 0;
        switch (operacion) {
            case 0:
                resultado = operandoUno + operandoDos;
                break;
            case 1:
                resultado = operandoUno - operandoDos;
                break;

            case 2:
                resultado = operandoUno * operandoDos;
                break;

        }
        return resultado;
    }

    public LinkedList operarSecuencias(LinkedList l1, LinkedList l2, int i1, int i2, int operacion) {
        LinkedList lista = new LinkedList<>();
        int t1 = l1.size();
        int t2 = l2.size();
        int origenFinal = 0;
        //Lista uno mayor a lista dos
        if (i1 > i2) {
            int dif = i1 - i2;
            int aux = 0;
            int aux2 = 0;
            //Valores antes de que se emparejen las listas
            while (aux < dif) {
                if (operacion != 2) {
                    lista.add(Double.parseDouble(l1.get(aux).toString()));
                } else {
                    lista.add(0);
                }
                aux = aux + 1;
            }
            //Listas emparejadas
            while (aux <= (t1 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux2 = aux2 + 1;
                aux = aux + 1;
                lista.add(seleccionarOperacion(operacion, e1, e2));
            }
            //Sobrante de la lista
            while (aux2 <= (t2 - 1)) {
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                if (operacion != 2) {
                    lista.add(e2);

                } else {
                    lista.add(0);
                }
                aux2 = aux2 + 1;
            }
            origenFinal = i1;
        } else if (i2 > i1) {
            int dif = i2 - i1;
            int aux = 0;
            int aux2 = 0;
            //Valores antes de que se emparejen las listas
            while (aux2 < dif) {
                if (operacion != 2) {
                    lista.add(Double.parseDouble(l2.get(aux2).toString()));
                } else {
                    lista.add(0);
                }
                aux2 = aux2 + 1;
            }
            //Listas emparejadas
            while (aux2 <= (t2 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux = aux + 1;
                aux2 = aux2 + 1;
                lista.add(seleccionarOperacion(operacion, e1, e2));
            }
            //Sobrante de la lista
            while (aux <= (t1 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                if (operacion != 2) {
                    lista.add(e1);
                } else {
                    lista.add(0);
                }
                aux = aux + 1;
            }
            origenFinal = i2;
        } else {
            int aux = 0;
            int aux2 = 0;
            //Como los índices son iguales, están emparejados desde el inicio
            while (aux <= (t1 - 1) && aux2 <= (t2 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux = aux + 1;
                aux2 = aux2 + 1;
                lista.add(seleccionarOperacion(operacion, e1, e2));
            }
            //Sobrantes
            if (aux > (t1 - 1)) {
                while (aux2 <= (t2 - 1)) {
                    double e2 = Double.parseDouble(l2.get(aux).toString());
                    lista.add(e2);
                    aux2 = aux2 + 1;
                }
            } else {
                while (aux <= (t1 - 1)) {
                    double e1 = Double.parseDouble(l1.get(aux).toString());
                    lista.add(e1);
                    aux = aux + 1;
                }
            }
            origenFinal = i1;
        }
        lista.add(origenFinal);
        return lista;
    }

    public LinkedList multiplicacionDeSecuencias(LinkedList l1, LinkedList l2, int i1, int i2) {
        LinkedList mult = new LinkedList<>();
        int t1 = l1.size();
        int t2 = l2.size();
        //Indice Lista uno mayor a indice lista dos
        if (i1 > i2) {
            int dif = i1 - i2;
            int aux = 0;
            int aux2 = 0;
            //Valores antes de que se emparejen las listas
            while (aux < dif) {
                aux = aux + 1;
            }
            //Listas emparejadas
            while (aux <= (t1 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux2 = aux2 + 1;
                aux = aux + 1;
                mult.add(e1 * e2);
            }
            //Indice Lista dos mayor a indice lista uno
        } else if (i2 > i1) {
            int dif = i2 - i1;
            int aux = 0;
            int aux2 = 0;
            //Valores antes de que se emparejen las listas
            while (aux2 < dif) {
                aux2 = aux2 + 1;
            }
            //Listas emparejadas
            while (aux2 <= (t2 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux = aux + 1;
                aux2 = aux2 + 1;
                mult.add(e1 * e2);
            }
            //Indices iguales
        } else {
            int aux = 0;
            int aux2 = 0;
            //Como los índices son iguales, están emparejados desde el inicio
            while (aux <= (t1 - 1) && aux2 <= (t2 - 1)) {
                double e1 = Double.parseDouble(l1.get(aux).toString());
                double e2 = Double.parseDouble(l2.get(aux2).toString());
                aux = aux + 1;
                aux2 = aux2 + 1;
                mult.add(e1 * e2);
            }
        }
        return mult;
    }

    public LinkedList reflejarEnTiempoDiscreto(LinkedList l1) {
        LinkedList inv = new LinkedList<>();
        int x = l1.size();
        //Obtenemos el último valor de la lista y lo ponemos como primer elemento en la nueva lista
        for (int i = 0; i < x; i++) {
            double o = Double.parseDouble(l1.removeLast().toString());
            inv.add(o);
        }
        return inv;
    }
    
     public LinkedList diezmacion(LinkedList l1,double k, int origen) {
        LinkedList diez1 = new LinkedList<>();
        LinkedList diez2 = new LinkedList<>();
        int x = l1.size();
        
            //Obtiene valores hacia adelante
        for (int i = origen; i < x; i+=k) {
            double o = Double.parseDouble(l1.get(i).toString());
            diez1.add(o);
        }
        //Obtiene valores hacia atras
        for (int i = origen-(int)k ; i >= 0 ; i-=k) {
            double o = Double.parseDouble(l1.get(i).toString());
            diez2.addFirst(o);
        }
       
        
        //concatena completo
        int t = diez2.size();
        diez2.addAll(diez1);
        diez2.add(t);
        return diez2;
    }
    
    public LinkedList interpolacion(LinkedList l1,double k, int origen){
        LinkedList inter = new LinkedList<>();
        double inicio;
        double fin;
        int x = l1.size();
        int origenSalida =  (origen)*((int)k-1)+(origen); //calcula origen 
        //interpolacion para todos menos el final
        for(int i = 0 ; i < x ; i++){
            inicio = Double.parseDouble(l1.get(i).toString());
            if( i+1 == x){
                 break;
            }
            else{
                fin = Double.parseDouble(l1.get(i+1).toString());
            }
            if(i==0) inter.add(inicio);
            for(int j = 0 ; j < k-1 ; j++){
                double nuevo = (double)(inicio + ((fin - inicio) / (int)(k-j)));
                inter.add(nuevo);
                inicio = (double)inter.getLast();
            }
            inter.add(fin);
        }
        //hace interpolacion con punto final igual a 0
        fin = 0;
        inicio = Double.parseDouble(l1.getLast().toString());
        for(int l = 0 ; l < k-1; l++){
             double nuevo = (double)(inicio + ((fin - inicio) / (int)(k-l)));
             inter.add(nuevo);
             inicio = nuevo;
            }
        inter.addLast(origenSalida); //agrego al final el punto de origen
        //System.out.println(inter.toString());
        return inter;
    }

    public LinkedList amplificarSecuencia(LinkedList l1, double con) {
        LinkedList a = new LinkedList<>();
        int x = l1.size();
        //Obtenemos el valor de la lista y lo multiplicamos por el elemento i y lo ponemos en la nueva lista
        for (int i = 0; i < x; i++) {
            double o = Double.parseDouble(l1.get(i).toString()) * con;
            a.add(o);
        }
        return a;
    }
    
     public static LinkedList convolucionDiscreta(LinkedList xn, LinkedList hn, int origenUno, int origenDos) {
        int nx = xn.size();
        int ny = hn.size();
        int rowMatriz = nx + ny -1;
        int colMatriz = ny + 1;
        double[][] matriz = new double[colMatriz][rowMatriz];

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        int filas = 0;
        int columnas = 0;
        for (int i = 0; i < hn.size(); i++) {
            double elementoActual = Double.parseDouble(hn.get(i).toString());
            
            for (int j = 0,k=columnas; j < xn.size(); j++,k++) {
                double operandoB = Double.parseDouble(xn.get(j).toString());
                matriz[filas][k] = operandoB * elementoActual; 
                
            }
            filas++;
            columnas++;
        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("[" + matriz[x][y] + "]");
            }
            System.out.println("\n");
        }
        LinkedList conv = new LinkedList<>();
        for(int w = 0 ; w < rowMatriz ; w++){
            double res = 0;
            for(int z = 0 ; z < colMatriz ; z++){
                res += matriz[z][w];
            }
            conv.add(res);
        }
        System.out.println(conv.toString());
        return conv;
    }

    
}
