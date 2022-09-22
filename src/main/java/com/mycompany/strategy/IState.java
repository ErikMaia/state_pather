/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author erik
 */
public interface IState {
    IState insertCoin(IState[] allStates);
    IState ejectCoin(IState[] allStates);
    IState rotateLever(IState[] allStates);
    IState getCandy(IState[] allStates, int candyConter);
    int setCandys(int candy);
}
