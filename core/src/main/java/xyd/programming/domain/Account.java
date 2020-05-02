package xyd.programming.domain;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class Account {
    private FamilyMember owner;
    private double balance;
    private List<Chore> transactions;

    public Account(FamilyMember owner) {
        this.owner = owner;
        this.balance = 0.0;
        this.transactions = new LinkedList<>();
    }
}
