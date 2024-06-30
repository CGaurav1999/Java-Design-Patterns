package org.patterns.factory;

public class WebFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
