package xyd.programming.service;


import org.springframework.stereotype.Service;
import xyd.programming.domain.Child;
import xyd.programming.domain.FamilyTitle;
import xyd.programming.domain.Gender;
import xyd.programming.domain.Parent;

import java.util.List;

@Service
public class FamilyTreeServiceImpl implements FamilyTreeService {

    @Override
    public Parent createParent(String name, FamilyTitle title) {
        Parent parent = new Parent(name, title );
        return parent;
    }

    @Override
    public void createChild(String childName, Gender gender, Parent... forParents) {
        Child child = new Child(childName, gender, forParents);
        addChildToParent(child, forParents);
    }

    @Override
    public void setParentPartner(Parent parent1, Parent parent2) {
        parent1.setPartner(parent2);
        parent2.setPartner(parent1);
    }

}
