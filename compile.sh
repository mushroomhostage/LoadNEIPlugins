#!/bin/sh
javac -cp minecraftforge-client-3.3.8.152.zip:NEI_ForestryPlugin\ 1.0.5.17.zip:NEI_RailCraftPlugin\ 1.2.2.1.zip:NEI_RedPowerPlugin\ 1.2.2.3.zip:CodeChickenCore-Client\ 0.5.3.zip:NotEnoughItems-Client\ 1.2.2.4.zip mod_LoadNEIPlugins.java
zip -r LoadNEIPlugins.zip *.class

