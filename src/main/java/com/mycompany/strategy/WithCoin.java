/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author erik
 */
public class WithCoin implements IState {

    @Override
    public IState insertCoin(IState[] allStates) {
        System.out.println("Já tem moeda");
        return allStates[StateEnum.WithCoin.ordinal()];
    }

    @Override
    public IState ejectCoin(IState[] allStates) {
        return allStates[StateEnum.WithoutCoin.ordinal()];
    }

    @Override
    public IState rotateLever(IState[] allStates) {
        return allStates[StateEnum.buy.ordinal()];
    }

    @Override
    public IState getCandy(IState[] allStates, int candyConter) {
        return allStates[StateEnum.WithCoin.ordinal()];
    }

    @Override
    public int setCandys(int candy) {
        return candy;
    }
    
}
