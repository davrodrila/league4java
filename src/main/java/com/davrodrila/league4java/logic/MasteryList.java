package com.davrodrila.league4java.logic;

import java.util.ArrayList;

public class MasteryList
{
    private long summonerId;
    private ArrayList<MasteryPage> pages;

    public MasteryList(long summonerId, ArrayList<MasteryPage> pages)
    {
        this.summonerId = summonerId;
        this.pages = pages;
    }

    public long getSummonerId()
    {
        return summonerId;
    }

    public void setSummonerId(long summonerId)
    {
        this.summonerId = summonerId;
    }

    public ArrayList<MasteryPage> getPages()
    {
        return pages;
    }

    public void setPages(ArrayList<MasteryPage> pages)
    {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "MasteryList{" +
                "pages=" + pages +
                ", summonerId=" + summonerId +
                '}';
    }
}
