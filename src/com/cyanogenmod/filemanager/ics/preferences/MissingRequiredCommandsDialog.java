package com.cyanogenmod.filemanager.ics.preferences;

import java.util.ArrayList;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;

import com.cyanogenmod.filemanager.ics.FileManagerApplication;

public class MissingRequiredCommandsDialog extends DialogPreference  {
    public MissingRequiredCommandsDialog(Context oContext, AttributeSet attrs) {
        super(oContext, attrs);
        
        // Get list of missing required commands
        ArrayList<String> missingRequiredCommands = ((FileManagerApplication)oContext.getApplicationContext()).missingRequiredShellCommands();
        
        if (missingRequiredCommands.size() <= 0) {
        	super.setDialogMessage("No missing commands found");
        }
        else {
	        // Build the list into a usable string
	        StringBuilder sb = new StringBuilder();
	        for (String command: missingRequiredCommands) {
	        	sb.append(command);
	        	sb.append("\n");
	        }
	        
	        // Set the dialog to the built string
	        super.setDialogMessage(sb.toString());
	    }
    }
}