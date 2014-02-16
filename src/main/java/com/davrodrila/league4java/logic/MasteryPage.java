package com.davrodrila.league4java.logic;

import java.util.ArrayList;

public class MasteryPage
{
    private boolean current;
    private long id;
    private String name;
    private ArrayList<Talent> talents;

    public MasteryPage(boolean current, long id, String name, ArrayList<Talent> talents)
    {
        this.current = current;
        this.id = id;
        this.name = name;
        this.talents = talents;
    }

    public boolean isCurrent()
    {
        return current;
    }

    public void setCurrent(boolean current)
    {
        this.current = current;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Talent> getTalents()
    {
        return talents;
    }

    public void setTalents(ArrayList<Talent> talents)
    {
        this.talents = talents;
    }

    @Override
    public String toString()
    {
        return "MasteryPage{" +
                "current=" + current +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", talents=" + talents +
                '}';
    }
}

