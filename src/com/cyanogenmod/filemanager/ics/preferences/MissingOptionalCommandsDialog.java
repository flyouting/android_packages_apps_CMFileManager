package com.cyanogenmod.filemanager.ics.preferences;

import java.util.ArrayList;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;

import com.cyanogenmod.filemanager.ics.FileManagerApplication;

public class MissingOptionalCommandsDialog extends DialogPreference  {
    public MissingOptionalCommandsDialog(Context oContext, AttributeSet attrs) {
        super(oContext, attrs);
        
        // Get list of missing optional commands
        ArrayList<String> missingOptionalCommands = ((FileManagerApplication)oContext.getApplicationContext()).missingOptionalShellCommands();
        
        if (missingOptionalCommands.size() <= 0) {
        	super.setDialogMessage("No missing commands found");
        }
        else {
	        // Build the list into a usable string
	        StringBuilder sb = new StringBuilder();
	        for (String command: missingOptionalCommands) {
	        	sb.append(command);
	        	sb.append("\n");
	        }
	        
	        // Set the dialog to the built string
	        super.setDialogMessage(sb.toString());
	    }
    }
}