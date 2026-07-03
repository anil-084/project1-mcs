package VariablesTypes;

public class InstanceVariable {

    int i=10;
    static void main() {
        InstanceVariable instanceVariable  =new InstanceVariable();
        System.out.println(instanceVariable.i);
        instanceVariable.getData();
    }
    void getData(){
        System.out.println(i);
    }
}
