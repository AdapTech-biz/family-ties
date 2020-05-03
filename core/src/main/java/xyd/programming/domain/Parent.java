package xyd.programming.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Parent extends FamilyMember {
    private FamilyTitle familyTitle;
    private Account account;
    private List<Child> children;
    private Parent partner;

    public Parent(String name, FamilyTitle familyTitle) {
        super(name, Role.Parent);
        this.familyTitle = familyTitle;
        this.children = new ArrayList<>();
        this.account = new Account(this);

    }
}
