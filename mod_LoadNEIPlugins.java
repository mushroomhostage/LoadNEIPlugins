
import codechicken.nei.IConfigureNEI;

public class mod_LoadNEIPlugins extends BaseMod {
    public String getVersion() {
        return "1.2.5r3";
    }

    public void load() {
    }
    
    @Override
    public void modsLoaded() {
        System.out.println("Loading NEI plugins");

        // TODO: configurable

        try {
            (new mistaqur.nei.forestry.NEIForestryConfig()).loadConfig();
            System.out.println("Loaded mistaqur.nei.forestry.NEIForestryConfig()");
        } catch (Exception e) {
            System.out.println("Not loading mistaqur.nei.forestry.NEIForestryConfig(): "+e);
        }


        try {
            (new mistaqur.nei.railcraft.NEIRailCraftConfig()).loadConfig();
            System.out.println("Loaded mistaqur.nei.railcraft.NEIRailCraftConfig");
        } catch (Exception e) {
            System.out.println("Not loading mistaqur.nei.railcraft.NEIRailCraftConfig: "+e);
        }

        try {
            (new mistaqur.nei.thermalexpansion.NEIthermalexpansionConfig()).loadConfig();
            System.out.println("Loaded mistaqur.nei.thermalexpansion.NEIthermalexpansionConfig");
        } catch (Exception e) {
            System.out.println("Not loading mistaqur.nei.thermalexpansion.NEIthermalexpansionConfig: "+e);
        }

        try {
            (new mistaqur.nei.ic2.NEI_IC2_Config()).loadConfig();
            System.out.println("Loaded mistaqur.nei.ic2.NEI_IC2_Config");
        } catch (Exception e) {
            System.out.println("Not loading mistaqur.nei.ic2.NEI_IC2_Config: "+e);
        }

        try {
            (new codechicken.nei.plugins.redpower.NEIRedPowerConfig()).loadConfig();
            System.out.println("Loaded codechicken.nei.plugins.redpower.NEIRedPowerConfig");
        } catch (Exception e) {
            System.out.println("Not loading codechicken.nei.plugins.redpower.NEIRedPowerConfig: "+e);
        }

        System.out.println("Finished loading NEI plugins");
   }

    public String getPriorities() {
        return "after:*";
    }

    /* see NEIConfig
   public static void loadConfig() {
      if(!configLoaded) {
         loadSavedConfig();
         vishash = new ItemVisibilityHash();
         LayoutManager.searchField.text = getSearchExpression();
         ItemInfo.load();
         configLoaded = true;
         ArrayList configclasses = CommonUtils.findClasses(new IStringMatcher() {
            public boolean matches(String test) {
               return test.startsWith("NEI") && test.endsWith("Config.class");
            }
         }, new Class[]{IConfigureNEI.class});
         Iterator var2 = configclasses.iterator();

         while(var2.hasNext()) {
            Class class1 = (Class)var2.next();

            try {
               IConfigureNEI e = (IConfigureNEI)class1.newInstance();
               e.loadConfig();
               System.out.println("Loaded " + class1.getName());
            } catch (Exception var4) {
               System.out.println("Failed to Load " + class1.getName());
               var4.printStackTrace();
            }
         }

      }
    }
  */

}
