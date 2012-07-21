#!/bin/sh
javac -cp minecraftforge-client-3.3.8.152.zip mod_LoadNEIPlugins.java
zip -r LoadNEIPlugins.zip *.class

