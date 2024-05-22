package org.sample.COMPX341_A3;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GraphBuilder 
{
    private Graph graph;

    //Takes in the dataset, and attempts to read it
    public void readDataset(File file) 
    {
        graph = new SingleGraph("Network");

        //Reads the dataset
        try (BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
        	System.out.println("Successfully read our dataset");
        } 
        //Errors if it can't read it
        catch (IOException e) 
        {
            throw new RuntimeException("Failed to read the dataset", e);
        }
    }

    //Used to retrieve our graph from other classes, returns the graph
    public Graph getGraph() 
    {
        return graph;
    }
}

