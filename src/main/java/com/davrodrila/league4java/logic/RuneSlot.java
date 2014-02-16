package com.davrodrila.league4java.logic;

public class RuneSlot
{
    private Rune rune;
    private int slotId;

    public RuneSlot(Rune rune, int slotId)
    {
        this.rune = rune;
        this.slotId = slotId;
    }

    public Rune getRune()
    {
        return rune;
    }

    public void setRune(Rune rune)
    {
        this.rune = rune;
    }

    public int getSlotId()
    {
        return slotId;
    }

    public void setSlotId(int slotId)
    {
        this.slotId = slotId;
    }

    @Override
    public String toString()
    {
        return "RuneSlot [" +
                "rune=" + rune +
                ", slotId=" + slotId +
                ']';
    }
}
