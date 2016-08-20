/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author eko
 * @param <T>
 */
public abstract class CAbstractFacade<T> implements IAbstractFacade<T> {

    public abstract void delete(T t);

    @Override
    public void delete(T t, boolean ok) {
        
    }
}
