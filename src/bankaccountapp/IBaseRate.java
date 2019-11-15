/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Patrick
 */
public interface IBaseRate {
    //Write a method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
