package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Negozio
{
    private ArrayList<Videogame> catalogue = new ArrayList<>();
    public void addGame(Videogame...games)
    {
        for(Videogame v : games)
        {
            catalogue.add(v);
        }
    }
    public void Buy(User u)
    {
        ArrayList<Videogame> toRemove = new ArrayList<>();
        for(Videogame v : u.GetCart().GetCarrello())
        {
            for(Videogame vg : catalogue)
            {
                if(v.equals(vg)&&u.getCredit()>u.GetCart().GetAmount())
                {
                    toRemove.add(vg);
                    u.SetCredit(u.getCredit()-u.GetCart().GetAmount());
                }
            }
        }
        for(Videogame game: toRemove)
        {
            catalogue.remove(game);
        }

    }
    public void ShowCatalogue()
    {
        for(Videogame v:catalogue)
        {
            System.out.println(v.getId()+" "+v.getTitle()+" "+v.getCategory()+" "+v.getPrice());
        }
    }

}
