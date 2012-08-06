#!/bin/sh
javac -cp minecraftforge-client-3.3.8.164.zip:NEI_ForestryPlugin\ 1.1.1.20.zip:NEI_RailCraftPlugin\ 1.3.1.2.zip:NEI_RedPowerPlugin\ 1.3.zip:NEI_IC2Plugin\ 1.0.2.9.zip:NEI_thermalexpansion_1.0.0.0.zip:CodeChickenCore-Client\ 0.5.5.zip:NotEnoughItems-Client\ 1.3.0.1.zip mod_LoadNEIPlugins.java
zip -r LoadNEIPlugins-1.2.5r3.zip *.class

