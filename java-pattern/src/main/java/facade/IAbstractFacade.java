/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;

/**
 *
 * @author eko
 * @param <T>
 */
public interface IAbstractFacade<T> {

    public void saveOrUpdate(T t);

    public void delete(T t, boolean ok);

    public List<T> findAll();
}
