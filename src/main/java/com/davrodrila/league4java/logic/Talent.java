package com.davrodrila.league4java.logic;

public class Talent
{
    private int id;
    private String name;
    private int rank;

    public Talent(int id, String name, int rank)
    {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return "Talent{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
