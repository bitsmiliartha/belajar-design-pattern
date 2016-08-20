/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import facade.model.Person;

/**
 *
 * @author eko
 */
public class FacadeTest {

    public static void main(String[] args) {
        IAbstractFacade systemOutFacade = new SystemOutFacade();

        systemOutFacade.saveOrUpdate(new Person("Eko Suhariyadi", 29));
        System.out.println("=========================================");
        systemOutFacade.delete(new Person("Wisnu Wew", 100));
    }
}
