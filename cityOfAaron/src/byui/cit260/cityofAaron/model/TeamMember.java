/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofAaron.model;

/**
 *
 * @author jackmcbride
 */
public enum TeamMember {
    
    Member1("Jack", "the dude who lives in Houston"),
    Member2("Chuck", "the dude who doesn't live in Houston"),
    Member3("Laura", "the girl who lives in Iowa");
    
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", description=" + description + '}';
    }
    
    

    TeamMember(String name, String title){
        this.name = name;
        this.description = title;
    }
}
