package xyd.programming.service;

import org.springframework.stereotype.Component;
import xyd.programming.domain.Child;
import xyd.programming.domain.FamilyTitle;
import xyd.programming.domain.Gender;
import xyd.programming.domain.Parent;

import java.util.List;

@Component
public class FamilyTreeService {

    public Parent createParent (String name, FamilyTitle title) {
        Parent parent = new Parent(name, title );
        return parent;
    }

    public void createChild(String childName, Gender gender, Parent forParent) {
        Child child = new Child(childName, gender, forParent);
        addChildToParent(forParent, child);
    }

    private void addChildToParent(Parent parent, Child child) {
        parent.getChildren().add(child);
    }

}
