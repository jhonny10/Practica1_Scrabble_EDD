/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Listas.Circular.Lista_Circular;
import Listas.Cola.Cola;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonny
 */
public class Juego extends javax.swing.JFrame {

    private Principal p;
    private Lista_Circular jugador;
    private Cola fichas;
    private Cola ficha_aleatorio;
    private String[] listado = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
    private int[] punteo = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 1, 3, 1, 8, 1, 3, 5, 1, 1, 1, 1, 4, 8, 4, 10};
    /**
     * Creates new form Juego
     */
    public Juego() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        fichas = new Cola();
        ficha_aleatorio = new Cola();
        initComponents();
    }
    
    public void inicializarFichas(){ //pendiente
        
        for(int i = 0; i < fichas.getSize(); i++){
            fichas.encolar(new Ficha(listado[i], punteo[i]));
        }
        
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, l = 0, m = 0, n = 0, ñ = 0, o = 0, pe = 0, q = 0, r = 0, s = 0, t = 0, u = 0,v = 0,x = 0, y = 0, z = 0;
        Random aleatorio = new Random();
        boolean ingresado = false;
        
        while(!ingresado){
            
            Ficha comparacion = (Ficha) fichas.get(aleatorio.nextInt(fichas.getSize()));
            
            int num = aleatorio.nextInt(listado.length);
            String letra = listado[num];
            int punteletra = punteo[num];
            
            if(a > 12 && e > 12 && o > 9 && i > 6 && s > 6 && n > 5 && l > 4 && r > 5 && u > 5
                    && t > 4 && d > 5 && g > 2 && c > 4 && b > 2 && m > 2 && pe > 2 && h > 2 && f > 1
                    && v > 1 && y > 1 && q > 1 && j > 1 && ñ > 1 && x > 1 && z > 1){
                ingresado = true;
            }
            
            switch(letra){
                case "A":
                    ficha_seleccion(a, 12, letra, punteletra);
                    break;
                case "B":
                    ficha_seleccion(b, 2, letra, punteletra);
                    break;
                case "C":
                    ficha_seleccion(c, 4, letra, punteletra);
                    break;
                case "D":
                    ficha_seleccion(d, 5, letra, punteletra);
                    break;
                case "E":
                    ficha_seleccion(e, 12, letra, punteletra);
                    break;
                case "F":
                    ficha_seleccion(f, 1, letra, punteletra);
                    break;
                case "G":
                    ficha_seleccion(g, 2, letra, punteletra);
                    break;
                case "H":
                    ficha_seleccion(h, 2, letra, punteletra);
                    break;
                case "I":
                    ficha_seleccion(i, 6, letra, punteletra);
                    break;
                case "J":
                    ficha_seleccion(j, 1, letra, punteletra);
                    break;
                case "L":
                    ficha_seleccion(l, 4, letra, punteletra);
                    break;
                case "M":
                    ficha_seleccion(m, 2, letra, punteletra);
                case "N":
                    ficha_seleccion(n, 5, letra, punteletra);
                    break;
                case "Ñ":
                    ficha_seleccion(ñ, 1, letra, punteletra);
                    break;
                case "O":
                    ficha_seleccion(o, 9, letra, punteletra);
                    break;
                case "P":
                    ficha_seleccion(pe, 2, letra, punteletra);
                    break;
                case "Q":
                    ficha_seleccion(q, 1, letra, punteletra);
                    break;
                case "R":
                    ficha_seleccion(r, 5, letra, punteletra);
                    break;    
                case "S":
                    ficha_seleccion(s, 6, letra, punteletra);
                    break;
                case "T":
                    ficha_seleccion(t, 4, letra, punteletra);
                    break;
                case "U":
                    ficha_seleccion(u, 5, letra, punteletra);
                    break;
                case "V":
                    ficha_seleccion(v, 1, letra, punteletra);
                    break;
                case "X":
                    ficha_seleccion(x, 1, letra, punteletra);
                    break;
                case "Y":
                    ficha_seleccion(y, 1, letra, punteletra);
                    break;
                case "Z":
                    ficha_seleccion(z, 1, letra, punteletra);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Hecho");
    }
    
    public void ficha_seleccion(int contador, int max, String letra, int punteoLetra){
        if(contador <= max){
            ficha_aleatorio.encolar(new Ficha(letra, punteoLetra));
            contador++;
        }else{
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.setVisible(false);
        if(p != null){
            p.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * @param p the p to set
     */
    public void setP(Principal p) {
        this.p = p;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Lista_Circular jugador) {
        this.jugador = jugador;
    }
}
