/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c3
 */
public class BankingException extends Exception{
    String message;

    public BankingException(String message) {
        this.message = message;
    }
}
