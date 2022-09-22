/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author erik
 */
public class Buy implements IState {

    @Override
    public IState insertCoin(IState[] allStates) {
        return allStates[StateEnum.buy.ordinal()];
    }

    @Override
    public IState ejectCoin(IState[] allStates) {
        return allStates[StateEnum.buy.ordinal()];
    }

    @Override
    public IState rotateLever(IState[] allStates) {
        return allStates[StateEnum.buy.ordinal()];
    }

    @Override
    public IState getCandy(IState[] allStates, int candyConter) {
        if(candyConter!=0){
            return allStates[StateEnum.WithoutCoin.ordinal()];
        }
        System.err.println("Docê comprado");
        return allStates[StateEnum.WithoutCandy.ordinal()];
    }

    @Override
    public int setCandys(int candy) {
        System.err.println("Restam: "+ (candy-1));
        return candy-1;
    }
    
}
