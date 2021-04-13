/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OMS.Employee;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/12/2021            @author palak       Added Employee
 * 
 */

public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }    
}
