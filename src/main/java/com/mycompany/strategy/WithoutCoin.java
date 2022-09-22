/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author erik
 */
public class WithoutCoin implements IState {

    @Override
    public IState insertCoin(IState[] allStates) {
        System.err.println("Moeda adiciona:");
        return allStates[StateEnum.WithCoin.ordinal()];
    }

    @Override
    public IState ejectCoin(IState[] allStates) {
        return allStates[StateEnum.WithoutCoin.ordinal()];
    }

    @Override
    public IState rotateLever(IState[] allStates) {
        return allStates[StateEnum.WithoutCoin.ordinal()];    }

    @Override
    public IState getCandy(IState[] allStates, int candyConter) {
        return allStates[StateEnum.WithoutCoin.ordinal()];
    }

    @Override
    public int setCandys(int candy) {
        return candy;
    }
    
}
