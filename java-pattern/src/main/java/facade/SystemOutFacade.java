/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import facade.model.Person;
import java.util.List;

/**
 *
 * @author eko
 */
public class SystemOutFacade extends CAbstractFacade<Person> {

    @Override
    public void saveOrUpdate(Person t) {
        System.out.println("check hak akses");
        System.out.println("begin transaction ...");
        System.out.println("check whether model is in new or edit mode");
        System.out.println("saving " + t + " ...");
        System.out.println("if any error rollbacking ...");
        System.out.println("if not, commiting ...");
    }

    @Override
    public void delete(Person t) {
        System.out.println("begin transaction ...");
        System.out.println("delete " + t + " ...");
        System.out.println("if any error rollbacking ...");
        System.out.println("if not, commiting ...");
    }

    @Override
    public List<Person> findAll() {
        System.out.println("return all person data");

        return null;
    }

}
