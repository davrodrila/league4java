package com.davrodrila.league4java.logic;

import java.util.ArrayList;

public class RunesList
{
    private ArrayList<RunePage> pages;
    private long summonerId;

    public RunesList(ArrayList<RunePage> pages, long id)
    {
        this.pages = pages;
        this.summonerId = id;
    }

    public long getId()
    {
        return summonerId;
    }

    public void setId(long id)
    {
        this.summonerId = id;
    }

    public ArrayList<RunePage> getPages()
    {
        return pages;
    }

    public void setPages(ArrayList<RunePage> pages)
    {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "RunesList [" +
                "summonerId=" + summonerId +
                ", pages=" + pages +
                ']';
    }
}
