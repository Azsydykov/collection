package kg.megacom;

import kg.megacom.service.Operation;
import kg.megacom.service.impl.OperationImpl;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) throws Exception {

        Operation operation = new OperationImpl();

        operation.creatRandomList();
        operation.getMaxNum();
        operation.getMinNum();
        operation.getRepeatingNumber();
        operation.sortList();
        operation.findNumbers57();
        operation.creatListOf5elements();
        operation.listsWithUniqueValue();

    }

}


