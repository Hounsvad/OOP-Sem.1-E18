/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_sem1_project.domain;

import oop_sem1_project.domain.popups.Popup;

/**
 *
 * @author Benjamin Staugaard | Benz56
 */
public interface InteractionHandler {

    void keyEvent(String keyPressed);

    void mouseClick(String clickedNode, int[] position);

    Popup getPopup();

    void setPopup(Popup popup);
}
