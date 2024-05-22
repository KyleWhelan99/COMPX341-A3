package org.sample.COMPX341_A3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DataSet {
    private File datasetFile;

    //Gets the path for our dataset, takes in the file path as the argument
    public void setDataSet(String filePath) 
    {
    	//Creates our file object from the provided path
        File file = new File(filePath);
        
        //Checks if the file exists or if its even a file
        if (!file.exists() || !file.isFile()) 
        {
            throw new RuntimeException("Unable to find dataset at " + filePath);
        }
        
        //Sets the file we loaded in to be the main dataset file, if all goes well
        this.datasetFile = file;
    }

    //Used to retrieve our file from other classes, returns the file
    public File getDataSet() {
        return this.datasetFile;
    }

    //Makes sure our dataset is in the correct format
    public void checkFormat() 
    {
    	//Immediately errors if there is no file
        if (this.datasetFile == null) 
        {
            throw new RuntimeException("No dataset file set.");
        }
        
        try 
        {
        	//Reads our files lines
            List<String> lines = Files.readAllLines(this.datasetFile.toPath());

            //Makes sure our file actually has content in it
            if (lines.isEmpty()) 
            {
                throw new RuntimeException("The dataset is empty.");
            }
            
            //Goes through all the lines in our file
            for (String line : lines) 
            {
            	//Makes sure our file doesn't have any missing data
                if (line.trim().isEmpty()) 
                {
                    throw new RuntimeException("The dataset contains missing data.");
                }
                
                //Checks to make sure our data has 10 columns, errors as corrupted if not
                String[] columns = line.split(",");
                if (columns.length != 10) 
                {
                    throw new RuntimeException("Corrupted data: incorrect amount of columns found in the dataset.");
                }
            }
        } 
        //Any other stray issues are caught with this
        catch (IOException e) 
        {
            throw new RuntimeException("Error reading the dataset file: " + e.getMessage());
        }
    }
}

