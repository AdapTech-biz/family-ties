package xyd.programming.domain;

import lombok.Data;

import java.util.Collections;
import java.util.LinkedList;

@Data
public class Child extends FamilyMember {

    private Gender gender;
    private Account account;
    private LinkedList<Parent> parents;

    public Child(String name, Gender gender, Parent ...parents) {
        super(name, Role.Child);
        this.gender = gender;
        this.parents = new LinkedList<>();
        addParents(parents);
        account = new Account(this);
    }

    private void addParents(Parent ...parents){
        Collections.addAll(this.parents, parents);
    }
}
