package org.patterns;



public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;

    public NetworkConnection(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public NetworkConnection() {

    }


    public String getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData() throws InterruptedException {
        this.data = "very very important data";
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return this.ip + " "+ this.data;
    }
}
