package com.cfs.Weather_App.dto;

public class Root{
    public Location location;
    public Current current;

    public Root(Location location, Current current) {
        this.location = location;
        this.current = current;
    }

    public Root() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
