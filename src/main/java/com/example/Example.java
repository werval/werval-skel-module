package com.example;

// This is the API the ExamplePlugin expose to application code
public class Example
{
    private final String greeting;
    private final String farewell;

    Example( String greeting, String farewell )
    {
        this.greeting = greeting;
        this.farewell = farewell;
    }

    public String greeting( String name )
    {
        return greeting + " " + name + '!';
    }

    public String farewell( String name )
    {
        return farewell + " " + name + '!';
    }
}
