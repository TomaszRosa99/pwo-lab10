/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author student
 */
public class TxtProcDown extends TxtProc {
    public static String ACTION = "DOWN";
    
    @Override
    public String processRequest(Request request){
        if(request.action.toUpperCase().equals(ACTION)){
            return request.text.toLowerCase();
        }
        else return next(request);
    }
}
