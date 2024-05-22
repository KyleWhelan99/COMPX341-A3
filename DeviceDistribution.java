package org.sample.COMPX341_A3;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class DeviceDistribution
{
    private Graph graph;

    //Our constructer to set up the graph reference
    public DeviceDistribution(Graph graph) 
    {
        this.graph = graph;
    }

    //Gets the count for each of our different device categories
    public int countByCategory(DeviceCategory category) 
    {
        int count = 0;
        for (Node node : graph) {
            if (((String) node.getAttribute("deviceType")).equalsIgnoreCase(category.name())) 
            {
                count++;
            }
        }
        
        //Return our count
        return count;
    }
}

