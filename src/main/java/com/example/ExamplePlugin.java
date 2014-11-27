package com.example;

import org.qiweb.api.Application;
import org.qiweb.api.Plugin;
import org.qiweb.api.exceptions.ActivationException;

// This is the ExamplePlugin, it manage the lifecycle of the API it exposes to the application code
public class ExamplePlugin
    implements Plugin<Example>
{
    private Example example;

    @Override
    public Class<Example> apiType()
    {
        return Example.class;
    }

    @Override
    public Example api()
    {
        return example;
    }

    @Override
    public void onActivate( Application application )
        throws ActivationException
    {
        String greeting = application.config().string( "example.greeting" );
        String farewell = application.config().string( "example.farewell" );
        example = new Example( greeting, farewell );
        System.out.println( "Example Plugin Activated" );
    }

    @Override
    public void onPassivate( Application application )
    {
        example = null;
        System.out.println( "Example Plugin Passivated" );
    }
}
