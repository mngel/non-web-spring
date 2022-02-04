package com.junit.mocking;

import org.springframework.stereotype.Component;

/**
 *
 * @author Bastet
 */
@Component
public class MegaToolImpl implements MegaTool {
    
    @Override
    public int Add(int a, int b){
        return a + b;
    }
}
