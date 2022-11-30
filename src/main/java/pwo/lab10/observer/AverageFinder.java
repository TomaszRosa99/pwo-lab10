/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;
/**
 *
 * @author student
 */
public class AverageFinder implements Subscriber {
    Integer sum = 0;
    Integer length = 0;
    Integer average = 1;
    
    @Override
    public void action(int x) {
        length++;
        sum += x;
        
        average = average == null ? x : sum / length;
    }

    public double getAvg() {
        return average;
    }
}
