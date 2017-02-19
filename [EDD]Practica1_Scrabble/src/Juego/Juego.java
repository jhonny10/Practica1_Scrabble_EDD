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
        
        for(int i = 0; i < listado.length; i++){
            fichas.encolar(new Ficha(listado[i], punteo[i]));
        }
        
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, l = 0, m = 0, n = 0, ñ = 0, o = 0, pe = 0, q = 0, r = 0, s = 0, t = 0, u = 0,v = 0,x = 0, y = 0, z = 0;
        Random aleatorio = new Random();
        boolean ingresado = false;
        
        while(!ingresado){
            int num = 0 ;//aleatorio.nextInt(fichas.getSize());
            try{
                num = aleatorio.nextInt(fichas.getSize());
            }catch(Exception ex){
                //JOptionPane.showMessageDialog(null, "Error num: " + fichas.getSize());
            }
            Ficha comparacion = (Ficha) fichas.get(num);
            
            String letra = comparacion.getFicha();
            int punteletra = comparacion.getPunteo();
            
            if(a >= 12 && e >= 12 && o >= 9 && i >= 6 && s >= 6 && n >= 5 && l >= 4 && r >= 5 && u >= 5
                    && t >= 4 && d >= 5 && g >= 2 && c >= 4 && b >= 2 && m >= 2 && pe >= 2 && h >= 2 && f >= 1
                    && v >= 1 && y >= 1 && q >= 1 && j >= 1 && ñ >= 1 && x >= 1 && z >= 1){
                ingresado = true;
            }
            
            switch(letra){
                case "A":
                    if(a < 12){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        a++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "B":
                    if(b < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        b++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "C":
                    if(c < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        c++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "D":
                    if(d < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        d++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "E":
                    if(e < 12){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        e++;
                    }else{
                       Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "F":
                    if(f < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        f++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "G":
                    if(g < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        g++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "H":
                    if(h < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        h++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "I":
                    if(i < 6){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        i++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "J":
                    if(j < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        j++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "L":
                    if(l < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        l++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "M":
                    if(m < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        m++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "N":
                    if(n < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        n++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Ñ":
                    if(ñ < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        ñ++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "O":
                    if(o < 9){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        o++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "P":
                    if(pe < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        pe++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Q":
                    if(q < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        q++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "R":
                    if(r < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        r++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;    
                case "S":
                    if(s < 6){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        s++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "T":
                    if(t < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        t++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "U":
                    if(u < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        u++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "V":
                    if(v < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        v++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "X":
                    if(x < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        x++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Y":
                    if(y < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        y++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Z":
                    if(z < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        z++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Hecho");
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
