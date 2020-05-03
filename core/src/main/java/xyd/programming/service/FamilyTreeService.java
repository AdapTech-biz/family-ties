package xyd.programming.service;

import xyd.programming.domain.Child;
import xyd.programming.domain.FamilyTitle;
import xyd.programming.domain.Gender;
import xyd.programming.domain.Parent;

public interface FamilyTreeService {
    Parent createParent (String name, FamilyTitle title);

    void createChild(String childName, Gender gender, Parent... forParents);

    void setParentPartner(Parent parent1, Parent parent2);

    default void addChildToParent(Child child, Parent... parents) {
        for (Parent parent: parents) {
            parent.getChildren().add(child);
        }

    }
}
