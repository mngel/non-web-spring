package com.junit.mocking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bastet
 */
@Service
public class NonWebService {
    
    @Autowired
    MegaTool mega;
    
    public void printMessage(String[] arguments) {
        System.out.println("Hallo Welt, Spring ohne Web laeuft: " + mega.Add(5, 45));
    }
}