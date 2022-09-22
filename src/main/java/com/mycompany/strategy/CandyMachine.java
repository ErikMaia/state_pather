/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author erik
 */
public class CandyMachine {

    public CandyMachine(int _candy) {
        this._candy = _candy;
        if(_candy!=0){
            this._state = _allState[StateEnum.WithoutCoin.ordinal()];    
        }
        else{
            this._state = _allState[StateEnum.WithoutCandy.ordinal()];
        }
                
    }
    
    private int _candy;
    
    private IState _state;
    
    private IState[] _allState = {
        new WithCoin(),
        new WithoutCoin(),
        new Buy(),
        new WithoutCandy()
    };
    
    public void insertCoin() {
        _state = _state.insertCoin(_allState);
    }

    public void ejectCoin() {
        _state = _state.ejectCoin(_allState);
    }

    public void rotateLever() {
        _state = _state.rotateLever(_allState);
    }

    public void getCandy() {
        _candy = _state.setCandys(_candy);
        _state = _state.getCandy(_allState,_candy);
    }    
}
