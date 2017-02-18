/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas.Cola;

import Nodo_Listas.Nodo;

/**
 *
 * @author jhonny
 */
public class Cola {
    private Nodo first;//primero
    private Nodo last;//ultimo
    private int size;
   //push despues del 4          cola 1, 2, 3, 4 
    //pop el 1 extraccion
    public Cola(){
        first = last = null;
        size = 0;
    }
    // null <-- raiz --> nodo5 --> null         cont 0...index =1
    public Object remover(int index){
        int cont = 0;
        Nodo temp = first;
        Nodo aux = null;
        while(cont < index && temp != null){
            aux = temp;
            temp = temp.getSiguiente();
            cont ++;
        }
        if(aux != null){
            Nodo sig = aux.getSiguiente();
            Nodo anterior = aux.getAnterior();
            if(sig != null){
                sig.setAnterior(anterior);
            }
            if(anterior != null){
                anterior.setSiguiente(sig);
            }
            if(anterior == null && sig == null){
                first = last = null;
            }
            size--;
            return aux;
        }
        
        return null;
    }
    
    public void encolar(Object dato){
        if(first == null){
            first = last = new Nodo(null, null, dato);
            size ++;
        }else{
            last.setSiguiente(new Nodo(last, null, dato));
            last = last.getSiguiente();
            size ++;
        }
    }
    
    public void desencolar(){
        if(first != null){
            first = first.getSiguiente();
            first.setAnterior(null);
            size --;
        }
    }
    
    public Object get(int index){
        int cont = 0;
        Nodo temp = first;
        
        while(cont < index){
            if(temp == null){
                return null;
            }
            temp = temp.getSiguiente();
            cont ++;
        }
        
        return temp.getDato();
    }
    
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        if(first == null)
            return true;
        return false;
    }
    
    public void printList(){
        Nodo temp = first;
        while(temp != null){
            System.out.print(temp.getDato().toString() + "--->");
            temp = temp.getSiguiente();
        }
    }
    
    public Object getFront(){
        return first;        
    }
    
    public Object getBack(){
        return last;
    }

    /**
     * @return the first
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public Nodo getLast() {
        return last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
