package org.patterns.factory;

public class AndroidFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
