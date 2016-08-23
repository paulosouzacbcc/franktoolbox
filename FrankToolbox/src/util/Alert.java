/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author maverick
 */
public class Alert {

    ImageIcon icon = new ImageIcon("/img/sucesso02.png");

    public static void message(String mensagem, String titulo) {

        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    public static void information(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void warning(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public static void error(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void sucess(String mensagem, String titulo) {

        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Alert.class.getResource("/img/sucesso4.png")));
    }

    public static int question(String pergunta, String titulo) {

        return JOptionPane.showConfirmDialog(null,
                pergunta,
                titulo,
                JOptionPane.YES_NO_OPTION);

    }

}
