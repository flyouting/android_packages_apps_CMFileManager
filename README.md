CyanogenMod File Manager
========================

A file manager for AOSP, focused on rooted devices and specially designed
for the CyanogenMod Project.

This source was released under the terms of
[Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) license.

Visit [CyanogenMod Github](https://github.com/CyanogenMod) and [CyanogenMod
Code Review](http://review.cyanogenmod.com/) to get the source and patches.

This application uses also third party libraries. Checkout the license individual
license of every library in libs folder.

Copyright © 2012 The CyanogenMod Project

CyanogenMod File Manager Themes
===============================

A package that contains extra themes for the CMFileManager application.

This package brings with the next themes:

 - Dark theme

For build new themes, developers should:

 - Create a new package that contains an activity with:
       * Permission: com.cyanogenmod.filemanager.ics.permissions.READ_THEME
       * Action: com.cyanogenmod.filemanager.ics.actions.MAIN_THEME
       * Category: com.cyanogenmod.filemanager.ics.categories.THEME
 - Define the themes_ids, themes_names and themes_descriptions arrays-strings
   definitions for the themes that the package support.
 - Create a xxx_theme.xml for every theme that the package support, where the
   xxx is the id of the theme. Put your resources in this file, prefixing the
   resource with the id of the theme (xxx_). For a list of all supported
   resources see theme.xml in res/values of CMFileManager project.


This source was released under the terms of
[Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) license.

Visit [CyanogenMod Github](https://github.com/CyanogenMod) and [CyanogenMod
Code Review](http://review.cyanogenmod.com/) to get the source and patches.

Copyright © 2012 The CyanogenMod Project
