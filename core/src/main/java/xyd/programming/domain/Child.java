package xyd.programming.domain;

import lombok.Data;

@Data
public class Child extends FamilyMember {

    private Gender gender;
    private Account account;
    private Parent parent;

    public Child(String name, Gender gender, Parent parent) {
        super(name, Role.Child);
        this.gender = gender;
        this.parent = parent;
        account = new Account(this);
    }
}
