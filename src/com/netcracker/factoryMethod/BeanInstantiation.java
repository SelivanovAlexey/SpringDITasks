package com.netcracker.factoryMethod;

import com.netcracker.beanClasses.ActionGenre;
import com.netcracker.beanClasses.ComedyGenre;
import com.netcracker.beanClasses.DocumentaryGenre;
import com.netcracker.beanClasses.IGenre;

public class BeanInstantiation {

    private static IGenre actionGenre = new ActionGenre();
    private static IGenre comedyGenre = new ComedyGenre();
    private static IGenre documentaryGenre = new DocumentaryGenre();

    public IGenre createActionGenreInstance(){
        return actionGenre;
    }

    public IGenre createComedyGenreInstance(){
        return comedyGenre;
    }

    public IGenre createDocumentaryGenreInstance(){
        return documentaryGenre;
    }
}
